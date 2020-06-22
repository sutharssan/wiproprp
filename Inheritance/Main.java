package Inheritance;
public class Main
{
public static void main(String[] args) 
{
    System.out.println("birds");
	  Bird b=new Bird();
          b.eat();
	  b.fly();
	  b.sleep();
    System.out.println("animals");
	 Animal a=new Animal();
	 a.eat();
	 a.sleep();
}
}
