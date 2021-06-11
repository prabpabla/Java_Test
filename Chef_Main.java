
public class Chef_Main {
	
	/*
	 * It is possible to inherit attributes and methods from one class to another
	 * subclass (child) - the class that inherits from another class
	 * superclass (parent) - the class being inherited from
	 * To inherit from a class, use the 'extends' keyword
	 * class Super {
	 * 	..
	 * }
	 * class Sub extends Super {
	 * ..
	 * }
	 */
	
	/*
	 * The 'super' keyword is similar to 'this' keyword
	 * It is used to differentiate the members of superclass from the members of subclass, 
	 *  if they have same names
	 * It is used to invoke the superclass constructor from subclass.
	 * super.variable
	 * super.method();
	 * super(values)
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chef newChef = new Chef();
        newChef.makeBurger();

        Master_Chef masterChef = new Master_Chef();
        masterChef.makeBurger();
        //The madeBurger method is inherited from the Chef super class, however is overrode
        
        masterChef.makeSalad();
        //The makeSalad method is inherited from Chef master class
	}

}
