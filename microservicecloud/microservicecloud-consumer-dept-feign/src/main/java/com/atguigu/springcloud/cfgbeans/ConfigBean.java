package com.atguigu.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class ConfigBean {
	
	@Bean
	@LoadBalanced
	public RestTemplate geRestTemplate() {
		
		return new RestTemplate();
	}
	
//	@Bean
//	public IRule myIRule() {
//		
//		return new RandomRule();
//	}
	
	
}
