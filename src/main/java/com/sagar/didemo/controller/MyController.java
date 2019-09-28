package com.sagar.didemo.controller;

import org.springframework.stereotype.Controller;

import java.util.Scanner;

/**
 * created by sagar on 28-09-2019
 */
@Controller
public class MyController {
    private Scanner scanner=new Scanner(System.in);
  public String hello(){
      String a,b;
       System.out.println("Enter 2 value");
      System.out.println("a:");
       a=scanner.next();
      System.out.println("b:");
      b=scanner.next();
      int sum=Integer.parseInt(a)+Integer.parseInt(b);
      System.out.println(" addition of "+a + " and " +b + " is "+sum);
      return "hello";
    }
}
