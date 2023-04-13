package com.java.multipleInheritanceAchievemntThroughInheritance;

class Test implements Printable, Showable
{  
public void print()
{
System.out.println("Hello");
}  
public static void main(String args[])
{  
Test obj = new Test();  
obj.print();  
}  
}  