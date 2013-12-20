package com.digiburo.spring.demo.messaging;

/**
 * Created by gsc on 12/12/13.
 */
public interface MessageWriter {

  void writePayload(MessagePayload arg);
}
