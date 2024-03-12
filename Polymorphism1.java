class Animal{
	public void makeSound(){
		System.out.print(" Animals sound");
	}
}
class Dog extends Animal{
	public void makeSound(){
		System.out.print("Barks");
	}
}
class Cat extends Animal{
	public void makeSound(){
		System.out.print("Meow");
	}
}
public class Polymorphism1{
	public sttic void main(String args[]){
		Animal dog= new Dog();
		Animal cat=new Cat();

		dog.makeSound();
		cat.makeSound();
	}
}