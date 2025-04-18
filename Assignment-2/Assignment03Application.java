package com.sunbeam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Assignment03Application implements CommandLineRunner{
	
	@Autowired
	ApplicationContext ctx;
	
	@Autowired(required = false)
	private Sender sender;

	public static void main(String[] args) {
		SpringApplication.run(Assignment03Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		Sender sb = (Sender)ctx.getBean("b1");
//		sb.send(1234.56);
		
//		Sender ts = ctx.getBean(HttpSender.class);
//		ts.send(110.43);
		
		
		Sender s = ctx.getBean(Sender.class);
		s.send(110.43);
		
	}
}
