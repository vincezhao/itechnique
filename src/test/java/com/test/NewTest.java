package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.testng.annotations.Test;


@ContextConfiguration(locations = {"classpath:conf/spring/spring-unit-test.xml"})
@TransactionConfiguration(defaultRollback = false)
public class NewTest  extends AbstractTestNGSpringContextTests{
  
  
  @Test
  public void f() {
     
  }
}
