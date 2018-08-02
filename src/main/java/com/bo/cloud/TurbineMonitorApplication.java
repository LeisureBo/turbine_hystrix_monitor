package com.bo.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableDiscoveryClient // 注册到服务中心
@EnableHystrixDashboard //开启断路器仪表盘
@EnableTurbine // 开启turbine
public class TurbineMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(TurbineMonitorApplication.class, args);
	}
}
