package com.example.backend;  // 必ずこのパッケージが存在することを確認

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TecBlogBackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(TecBlogBackendApplication.class, args);
    }
}