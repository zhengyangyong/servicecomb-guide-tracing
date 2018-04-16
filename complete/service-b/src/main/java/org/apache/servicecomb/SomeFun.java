package org.apache.servicecomb;

import org.apache.servicecomb.tracing.Span;
import org.springframework.stereotype.Component;

@Component
public class SomeFun {

  @Span(spanName = "doSomething")
  //custom tracing
  public void doSomething() throws InterruptedException {
    Thread.sleep(300);
  }
}
