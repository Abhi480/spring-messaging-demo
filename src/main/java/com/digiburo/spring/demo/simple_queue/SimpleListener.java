package com.digiburo.spring.demo.simple_queue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;


/**
 * simple_queue message listener
 *
 * @author gsc
 */
public class SimpleListener implements MessageListener {

  /**
   *
   * @param message
   */
  public void onMessage(final Message message) {
    try {
      TextMessage textMessage = (TextMessage) message;
      LOGGER.info("extracted:" + textMessage.getText());

      LOGGER.debug("messageId:" + textMessage.getJMSMessageID());
      LOGGER.debug("timeStamp:" + textMessage.getJMSTimestamp());
      LOGGER.debug("replyTo:" + textMessage.getJMSReplyTo());
    } catch(JMSException exception) {
      exception.printStackTrace();
    }

    throw new IllegalArgumentException("bogus exception");
  }

  /*
  e {commandId = 5, responseRequired = true, messageId = ID:duckman.local-55003-1387008116913-1:1:1:1:1, originalDestination = null,
      originalTransactionId = null, producerId = ID:duckman.local-55003-1387008116913-1:1:1:1, destination = queue://demo.queue,
      // transactionId = null, expiration = 0, timestamp = 1387008117066, arrival = 0, brokerInTime = 1387008117067,
      // brokerOutTime = 1387008117068, correlationId = null, replyTo = null, persistent = true, type = null, priority = 4,
      // groupID = null, groupSequence = 0, targetConsumerId = null, compressed = false, userID = null,
      // content = org.apache.activemq.util.ByteSequence@7c40627c, marshalledProperties = null, dataStructure = null,
      // redeliveryCounter = 0, size = 0, properties = null, readOnlyProperties = true, readOnlyBody = true, droppable = false}
      // ActiveMQMapMessage{ theTable = {KEY_CREATION_TIME=2013-12-14 00:01:55Z, KEY_TEXT=testaroo} }};
      // nested exception is java.lang.NoSuchMethodException: com.digiburo.spring.demo.messaging.SimpleListener.displayMessage(org.apache.activemq.command.ActiveMQMapMessage)
    at org.springframework.jms.listener.adapter.MessageListenerAdapter.invokeListenerMethod(MessageListenerAdapter.java:476)
    at org.springframework.jms.listener.adapter.MessageListenerAdapter.onMessage(MessageListenerAdapter.java:355)
    at org.springframework.jms.listener.AbstractMessageListenerContainer.doInvokeListener(AbstractMessageListenerContainer.java:537)
    */

  //
  public static final Logger LOGGER = LoggerFactory.getLogger(SimpleListener.class);
}

/*
 * Copyright 2013 Digital Burro, INC
 * Created on December 20, 2013 by gsc
 */