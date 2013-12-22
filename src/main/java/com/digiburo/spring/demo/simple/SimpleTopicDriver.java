package com.digiburo.spring.demo.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;

/**
 * simple topic writer
 *
 * @author gsc
 */
public class SimpleTopicDriver {

  /**
   *
   */
  private void execute(ApplicationContext context) throws Exception {
    LOGGER.debug("entering execute");

    JmsTemplate jmsTemplate = (JmsTemplate) context.getBean("jmsTemplate");
    jmsTemplate.convertAndSend("simple topic text message");
  }

  /**
   * test log settings
   */
  private void logTest() {
    LOGGER.trace("trace message");
    LOGGER.debug("debug message");
    LOGGER.info("info message");
    LOGGER.warn("warning message");
    LOGGER.error("error message");
  }

  public static void main(String[] args) throws Exception {
    System.out.println("begin");

    ApplicationContext context = new ClassPathXmlApplicationContext(CONTEXT_NAME);

    SimpleTopicDriver driver = new SimpleTopicDriver();
    driver.logTest();
    driver.execute(context);

    System.out.println("end");
  }

  //
  public static final String CONTEXT_NAME = "simple-topic-configuration.xml";

  //
  public static final Logger LOGGER = LoggerFactory.getLogger(SimpleTopicDriver.class);
}

/*
 * Copyright 2013 Digital Burro, INC
 * Created on December 20, 2013 by gsc
 */