package com.java.interfaceInheritance;

class Test implements Showable
{  
public void print()
{
System.out.println("Hello");
}  
public void show()
{
System.out.println("Welcome");
}  
public static void main(String args[])
{  
Test obj = new Test();  
obj.print();  
obj.show();  
}  
} 