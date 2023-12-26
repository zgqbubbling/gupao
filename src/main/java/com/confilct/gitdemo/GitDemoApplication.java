package com.confilct.gitdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitDemoApplication.class, args);
        System.out.println("hello 我要改一次试试看看冲不冲突");
    }

}
