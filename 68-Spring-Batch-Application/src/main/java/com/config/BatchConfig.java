package com.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;

import com.entity.Customer;
import com.repo.CustomerRepository;

@Configuration
@EnableBatchProcessing
public class BatchConfig {

	@Autowired
	private CustomerRepository custrepo;
	
	@Autowired
	private StepBuilderFactory stepfactory;
	
	@Autowired
	private JobBuilderFactory jobfactory;
	
	//Item Reader bean
	@Bean
	public FlatFileItemReader<Customer> customerReaderBean()
	{
		FlatFileItemReader<Customer> itemreader=new FlatFileItemReader<Customer>();
		itemreader.setResource(new FileSystemResource("src/main/resources/customers.csv"));
		itemreader.setName("customer-item-reader");
		itemreader.setLinesToSkip(1);
		itemreader.setLineMapper(lineMapper());
		return itemreader;
	}
	
	private LineMapper<Customer> lineMapper()
	{
		DefaultLineMapper<Customer> linemapper=new DefaultLineMapper<Customer>();
		DelimitedLineTokenizer token=new DelimitedLineTokenizer();
		token.setDelimiter(",");
		token.setStrict(false);
		token.setNames("id","firstName","lastName","email","gender","contactNo","country","dob");
		BeanWrapperFieldSetMapper<Customer> fieldSet=new BeanWrapperFieldSetMapper<Customer>();
		fieldSet.setTargetType(Customer.class);
		linemapper.setFieldSetMapper(fieldSet);
		linemapper.setLineTokenizer(token);
		return linemapper;
	}
	
	//Item Processor bean
	@Bean
	public CustomerProcessor processor()
	{
		return new CustomerProcessor();
	}
	
	//Item Writer bean
	@Bean
	public RepositoryItemWriter<Customer> customerWritter()
	{
		RepositoryItemWriter<Customer> itemwritter=new RepositoryItemWriter<Customer>();
		itemwritter.setRepository(custrepo);
		itemwritter.setMethodName("save");
		return itemwritter;
	}
	
	//Step bean
	@Bean
	public Step step()
	{
		return stepfactory.get("step-1").<Customer,Customer>chunk(10)
				.reader(customerReaderBean())
				.processor(processor())
				.writer(customerWritter()).build();
	}
	
	//Job bean
	@Bean
	public Job job()
	{
		return jobfactory.get("customer-import")
				.flow(step())
				.end()
				.build();
	}
}
