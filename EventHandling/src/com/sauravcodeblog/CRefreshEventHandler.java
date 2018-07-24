package com.sauravcodeblog;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class CRefreshEventHandler implements ApplicationListener<ContextRefreshedEvent>{
@Override
public void onApplicationEvent(ContextRefreshedEvent event) {
	// TODO Auto-generated method stub
	System.out.println("ContextRefreshedEvent Received");
    System.out.println(event);
}
}