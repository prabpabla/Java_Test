
public class Master_Chef extends Chef {

	/*
	 * The Master_Chef class can do everything Chef class can, and more
	 * Using the 'extends', allows Master_Chef to access methods in Chef
	 * The Override keyword, allows the class to override the method being inherited
	 */
	
	@Override
	public void makeBurger(){
		System.out.println("First");
		super.makeBurger();
		//Implements the super class method
		
		System.out.println("Next");
        System.out.println("The master chef makes a Double Cheese Burger");
	}
	
	public void makeCake(){
        System.out.println("The master chef bakes a Triple Chocolate Fudge Cake");
	}
	
	public void makePizza(){
        System.out.println("The master chef bakes a delicious cheesy Pizza");
	}

}
