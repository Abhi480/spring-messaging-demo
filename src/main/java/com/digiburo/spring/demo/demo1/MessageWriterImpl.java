package com.digiburo.spring.demo.demo1;

import com.digiburo.spring.demo.common.CommonMessagePayload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.core.support.JmsGatewaySupport;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by gsc on 12/13/13.
 */
public class MessageWriterImpl extends JmsGatewaySupport implements MessageWriter {

  @Transactional
  public void writePayload(CommonMessagePayload arg) {
    LOGGER.info("write message:" + arg.toString());
    getJmsTemplate().convertAndSend(arg);
  }

  //
  public static final Logger LOGGER = LoggerFactory.getLogger(MessageWriterImpl.class);
}
