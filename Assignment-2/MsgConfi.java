package com.sunbeam;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MsgConfi {
	
	@Primary
	@Bean
	public Sender b1() {
		Sender obj = new HTTPSender();
		return obj;
	}
	
	@Bean
	public Sender b2() {
		Sender obj = new TCPSender();
		return obj;
	}
	
	@Bean
	public Sender b3() {
		Sender obj = new UDPSender();
		return obj;
	}
}
