package com.ss.jb.four;

public class DoubleCheckedLocking {
  /*
   * Assignment 1 Implement a Singleton with double checked locking.
   */

  // volatile if public
  private static DoubleCheckedLocking instance = null;

  private DoubleCheckedLocking() {

  }

  // this must be public static in order to be accessed from outside of the class
  public static DoubleCheckedLocking getInstance() {
    // by putting synchronized here, it is not blocking the entire method. Only the
    // block

    // like wise, we could block the entire class. but we have a private constructr
    // so we dont need it
    if (instance == null) {
      synchronized(instance) {
        if (instance == null) {
          instance = new DoubleCheckedLocking();
        }
      }  
    }
    return instance;
  }

}
