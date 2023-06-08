package com.mycompany.lab.exercise1;

public interface MyfirstInterface {
    
    final int x = 5;
    int y = 10;
    // In an interface declaring a variable without using public static void keywords will not make any difference.
    // The interface will automatically takes the variable as public static final.
    
    // abstract method
    public void display();
    // an interface declaring a method without using abstract keyword will not make any differnce.
    // The interface will automatically takes the method as a abstract method.  
    
    
}
