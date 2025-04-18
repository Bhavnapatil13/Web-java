package com.sunbeam;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class UDPSender implements Sender {

	public void send(double value) {
		System.out.println("UDP Sender"+ value);
		
	}
}
