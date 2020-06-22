package Overriding;
public class MainClass 
{
public static void main(String[] args) 
{
	Fruit a=new Apple();
	Fruit o=new Orange();
	 a.setName("Apple");
	 a.setTaste("bitter");
	 a.eat();
	    o.setName("Mango");
	    o.setTaste("sweet");
	    o.eat();    
}
}
