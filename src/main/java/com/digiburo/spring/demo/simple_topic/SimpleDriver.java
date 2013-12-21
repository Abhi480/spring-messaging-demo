package com.digiburo.spring.demo.simple_topic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;

/**
 * simple_queue topic writer
 *
 * @author gsc
 */
public class SimpleDriver {

  /**
   *
   */
  private void execute(ApplicationContext context) throws Exception {
    LOGGER.debug("entering execute");

    JmsTemplate jmsTemplate = (JmsTemplate) context.getBean("jmsTemplate");
    jmsTemplate.convertAndSend("simple queue text message");
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

    SimpleDriver dw = new SimpleDriver();
    dw.logTest();
    dw.execute(context);

//    Thread.sleep(10000L);

    System.out.println("end");
  }

  //
  public static final String CONTEXT_NAME = "simple-queue-configuration.xml";

  //
  public static final Logger LOGGER = LoggerFactory.getLogger(SimpleDriver.class);
}

/*
 * Copyright 2013 Digital Burro, INC
 * Created on December 20, 2013 by gsc
 */