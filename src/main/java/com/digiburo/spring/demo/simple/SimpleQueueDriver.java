package com.digiburo.spring.demo.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;

/**
 * Exercise a simple "point to point" queue.
 * Unidirectional message flow w/no response from client.
 * A message w/a single String is produced in SimpleQueueDriver and converted to TextMessage by SimpleMessageConverter.
 * SimpleListener will process message by logging message content and some header values.
 * Note there are two SimpleListeners but only one will respond (because this is a queue)
 * Errors at client end will be managed by SimpleErrorHandler.
 *
 * @author gsc
 */
public class SimpleQueueDriver {

  /**
   *
   */
  private void execute(ApplicationContext context) throws Exception {
    LOGGER.debug("entering execute");

    JmsTemplate jmsTemplate = (JmsTemplate) context.getBean("jmsTemplate");
    jmsTemplate.convertAndSend("simple text message");
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

    SimpleQueueDriver driver = new SimpleQueueDriver();
    driver.logTest();
    driver.execute(context);

    System.out.println("end");
  }

  //
  public static final String CONTEXT_NAME = "simple-queue-configuration.xml";

  //
  public static final Logger LOGGER = LoggerFactory.getLogger(SimpleQueueDriver.class);
}

/*
 * Copyright 2013 Digital Burro, INC
 * Created on December 20, 2013 by gsc
 */