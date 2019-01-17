package org.microservicecloud.consumer.hystrix.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer_DashBoard_9001_App {
	
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer_DashBoard_9001_App.class, args);
	}
}
