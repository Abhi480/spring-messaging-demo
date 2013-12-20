package com.digiburo.spring.demo.messaging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.support.converter.MessageConversionException;
import org.springframework.jms.support.converter.MessageConverter;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.Session;

/**
 * Created by gsc on 12/16/13.
 */
public class DemoMessageConverter implements MessageConverter {

  public Object fromMessage(Message message) throws JMSException, MessageConversionException {
    LOGGER.info("fresh fromMessage");

    MapMessage mapMessage = (MapMessage) message;

    MessagePayload messagePayload = new MessagePayload();
    messagePayload.setMessageText(mapMessage.getString(KEY_TEXT));
    return(messagePayload);
  }

  public Message toMessage(Object object, Session session) throws JMSException, MessageConversionException {
    LOGGER.info("fresh toMessage");

    MessagePayload messagePayload = (MessagePayload) object;

    MapMessage message = session.createMapMessage();
    message.setString(KEY_TEXT, messagePayload.getMessageText());
    message.setString(KEY_CREATION_TIME, messagePayload.getCreationTime());
    return(message);
  }

  public static String KEY_TEXT = "KEY_TEXT";
  public static String KEY_CREATION_TIME = "KEY_CREATION_TIME";

  //
  public static final Logger LOGGER = LoggerFactory.getLogger(DemoMessageConverter.class);
}
