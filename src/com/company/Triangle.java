package com.company;

import java.util.Scanner;

public class Triangle {
       int a ;
       int b ;
       int c ;
   void area(){
       int s = (a+b+c)/2;
       int ar =(int)Math.sqrt(s*(s-a)*(s-b)*(s-c));

       System.out.println("Result of area: " +ar);
   }

}
