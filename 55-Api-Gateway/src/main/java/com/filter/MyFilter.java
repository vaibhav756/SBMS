package com.filter;

import java.util.Set;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;
@Component
public class MyFilter implements GlobalFilter{

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//		System.out.println("Filter executed...!!! "+exchange.getApplicationContext().getApplicationName());
//		System.out.println(exchange.getRequest().getLocalAddress());
//		System.out.println(exchange.getRequest().getBody());
		
		HttpHeaders headers = exchange.getRequest().getHeaders();
		Set<String> set = headers.keySet();
		for(String key:set)
		{
			System.out.print(key+"---");
			System.out.println(headers.getValuesAsList(key));
		}
		System.out.println("\n\n\n\n\n");
		
		return chain.filter(exchange);
	}
	
}
