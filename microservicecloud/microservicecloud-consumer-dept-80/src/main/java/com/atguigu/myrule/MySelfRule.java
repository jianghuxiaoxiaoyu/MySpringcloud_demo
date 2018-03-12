package com.atguigu.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.atguigu.springcloud.cfgbeans.RandomRule_LAX;
import com.netflix.loadbalancer.IRule;

@Configuration
public class MySelfRule {
	
	@Bean
	public IRule myRule() {
		
		return new RandomRule_LAX();
		
	}

}
