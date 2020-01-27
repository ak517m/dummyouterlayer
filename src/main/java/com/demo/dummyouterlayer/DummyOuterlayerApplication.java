package com.demo.dummyouterlayer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import com.demo.dummyouterlayer.controller.EmployeeController;
import com.demo.dummyouterlayer.service.EmployeeService;

@SpringBootApplication
@ComponentScan(basePackageClasses = EmployeeController.class)
@ComponentScan(basePackageClasses = EmployeeService.class)
public class DummyOuterlayerApplication extends SpringBootServletInitializer {

	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(DummyOuterlayerApplication.class);
	    }
	public static void main(String[] args) {
		SpringApplication.run(DummyOuterlayerApplication.class, args);
	}

}
