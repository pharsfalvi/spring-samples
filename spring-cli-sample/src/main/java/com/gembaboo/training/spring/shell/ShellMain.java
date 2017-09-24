package com.gembaboo.training.spring.shell;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ShellMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ShellMain.class, args);
    }

}
