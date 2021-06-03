import java.util.Scanner;

import org.graalvm.compiler.nodes.java.MethodCallTargetNode;

import sun.reflect.generics.scope.MethodScope;

import java.lang.reflect.*;

/*
 *Given an array of integers nums and an integer target, 
 * return indices of the two numbers such that they add up to target.
 *Assume that each input would have exactly one solution, 
 * and may not use the same element twice.
 *Return the answer in any order.
 */
public class Two_Sum{
	
	public int[] twoSumBrute(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1 ; j < nums.length; j++){
                if ((target - nums[i]) == nums[j])
                    return new int[] {i,j};   
            }
        }
        return null;
    }
	
	public boolean test1() {
	    int[] sol = this.twoSumBrute(new int[] {2, 4, 5, 8, 11, 4}, 9);
	    if (sol == null)
	    	return false;
	    if (sol.length != 2)
	    	return false;
	    if ((sol[0] == 1) && sol[1] == 2)
	    	return true;
	    return false;
	}
	
	public boolean test2() {
	    int[] sol = this.twoSumBrute(new int[] {9, 9, 9, 9, 9}, 9);
	    if (sol == null)
	    	return true;
	    return false;
	}

	//MAIN
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Two_Sum twoSum = new Two_Sum();
		
		Class twoSumClass = Two_Sum.class;
		Method[] twoSumMethods = twoSumClass.getDeclaredMethods();
		
		for(Method method : twoSumMethods) {
			String methodName = method.getName();
			if (methodName.startsWith("test")) {
				Object answerObject = method.invoke(twoSum);
				boolean answer = (boolean)answerObject;
				System.out.println("Method " + methodName + " " +(answer ? "Passed" : "Failed" ));
			}
		}
	}
	
}
