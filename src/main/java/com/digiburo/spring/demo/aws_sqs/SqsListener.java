package com.digiburo.spring.demo.aws_sqs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * aws_sqs message listener
 *
 * @author gsc
 */
public class SqsListener implements MessageListener {

  /**
   *
   * @param message fresh message
   */
  public void onMessage(final Message message) {
    try {
      TextMessage textMessage = (TextMessage) message;
      LOGGER.info("extracted w/ndx:" + listenerNdx + ":" + textMessage.getText());

      LOGGER.debug("messageId:" + textMessage.getJMSMessageID());
      LOGGER.debug("timeStamp:" + textMessage.getJMSTimestamp());
      LOGGER.debug("replyTo:" + textMessage.getJMSReplyTo());
    } catch(JMSException exception) {
      exception.printStackTrace();
    }

    // uncomment to test error handler
    //throw new IllegalArgumentException("bogus exception");
  }

  public void setListenerNdx(Integer arg) {
    listenerNdx = arg;
  }

  //
  private Integer listenerNdx = 0;

  //
  public static final Logger LOGGER = LoggerFactory.getLogger(SqsListener.class);
}

/*
 * Copyright 2013 Digital Burro, INC
 * Created on December 25, 2013 by gsc
 */