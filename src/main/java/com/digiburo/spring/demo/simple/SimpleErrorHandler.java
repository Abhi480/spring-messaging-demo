package com.digiburo.spring.demo.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ErrorHandler;

/**
 * simple error handler
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