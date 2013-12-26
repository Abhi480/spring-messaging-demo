package com.digiburo.spring.demo.aws_sqs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;

/**
 * Exercise Amazon SQS queue
 *
 * @author gsc
 */
public class SqsQueueDriver {

  /**
   *
   */
  private void execute(ApplicationContext context) throws Exception {
    LOGGER.debug("entering execute");

    JmsTemplate jmsTemplate = (JmsTemplate) context.getBean("jmsTemplate");

    for (int ii = 0; ii < 5; ii++) {
      jmsTemplate.convertAndSend("simple aws_sqs text message:" + ii);
    }
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

  /**
   *
   * @param args
   * @throws Exception
   */
  public static void main(String[] args) throws Exception {
    System.out.println("begin");

    ApplicationContext context = new ClassPathXmlApplicationContext(CONTEXT_NAME);

    SqsQueueDriver driver = new SqsQueueDriver();
    driver.logTest();
    driver.execute(context);

    System.out.println("end");
  }

  //
  public static final String CONTEXT_NAME = "sqs-queue-configuration.xml";

  //
  public static final Logger LOGGER = LoggerFactory.getLogger(SqsQueueDriver.class);
}

/*
 * Copyright 2013 Digital Burro, INC
 * Created on December 25, 2013 by gsc
 */