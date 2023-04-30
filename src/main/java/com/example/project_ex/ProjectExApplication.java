package com.example.project_ex;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan
public class ProjectExApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectExApplication.class, args);
    }

}
