package com.demo.herokudemo.cucumber;

import com.demo.herokudemo.HerokudemoApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = HerokudemoApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
