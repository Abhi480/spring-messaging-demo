package com.digiburo.spring.demo.simple_aq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ErrorHandler;

/**
 * simple_aq error handler
 *
 * @author gsc
 */
public class SimpleErrorHandler implements ErrorHandler {

  @Override
  public void handleError(Throwable throwable) {
    LOGGER.error("throwable:" + throwable);
  }

  //
  public static final Logger LOGGER = LoggerFactory.getLogger(SimpleErrorHandler.class);
}

/*
 * Copyright 2013 Digital Burro, INC
 * Created on December 20, 2013 by gsc
 */