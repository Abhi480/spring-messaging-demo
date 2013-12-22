package com.digiburo.spring.demo.demo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by gsc on 12/13/13.
 */
public class MessageListener {

  /**
   *
   * @param arg
   */
  public void messageDisplay(CommonMessagePayload arg) {
    LOGGER.info("fresh message:" + arg.toString());
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
  public static final Logger LOGGER = LoggerFactory.getLogger(MessageListener.class);
}
