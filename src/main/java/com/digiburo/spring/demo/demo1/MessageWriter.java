package com.digiburo.spring.demo.demo1;

import com.digiburo.spring.demo.common.CommonMessagePayload;

/**
 * Created by gsc on 12/12/13.
 */
public interface MessageWriter {

  void writePayload(CommonMessagePayload arg);
}
