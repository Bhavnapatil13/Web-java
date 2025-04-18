package com.sunbeam;

import org.springframework.stereotype.Component;

public class HTTPSender implements Sender {

	public void send(double value) {
		System.out.println("HTTP Sender" + value);
		
	}
}
