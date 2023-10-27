package com.microsoft.demo;
import com.microsoft.demo.MvnProducer;
/**
 * Some simple add solution to check maven publishing and consuming packages
 */
public class MvnConsumer
{
    public static void main(String args[]){
       System.out.println("Hello World! Sum is: " + new MvnProducer().add(3,5));
    }



}
