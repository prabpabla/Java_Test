
public class Animal_Main {
	
	/*
	 * An interface is a reference type, it is a collection of abstract methods 
	 * A class implements an interface, thereby inheriting the abstract methods of the interface
	 * An interface cannot be instantiated, and does not have a constructor
	 * Interface is only implemented by class using keyword 'implements'
	 * Interfaces can extend multiple interfaces
	 * 'interface' keyword is used to declare an interface
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * It is possible to instantiate a Dog object, and access its methods
		 * Dog myDog = new Dog(); //Dog data type reference and object
		 * myDog.eat(); //runs the method in Dog class
		 * 
		 * It is also possible to instantiate the Dog object as such
		 * Animal myDog = new Dog(); //Animal reference but Dog object
		 * myDog.eat(); //runs the method in Dog class
		 * 
		 * Dog, Cat and Bird, all three classes implement Animal interface
		 * Therefore, even though they are different classes, they are of the same type
		 */
		
		/*
		 * Make an array of Animal reference type objects and loop through them
		 * In the array, it is possible to store three different classes, of Animal type
		 */
		Animal [] animals = {new Dog(), new Cat(), new Bird()};
		for(Animal animal : animals) {
			animal.speak(); 
			animal.eat(); 
			animal.legs();
			System.out.println("");
		} 
	}
}
