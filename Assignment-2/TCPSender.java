package com.sunbeam;

import org.springframework.stereotype.Component;

public class TCPSender implements Sender {

	public void send(double value) {
		System.out.println("TCP Sender"+ value);
		
	}
}
