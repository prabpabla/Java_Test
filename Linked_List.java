import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {

	    LinkedList<String> courseList = new LinkedList<String>();
	    courseList.add("Engineering I");
	    courseList.add("Mathematics");
	    courseList.add("Ethics");
	    courseList.add("Physics");
	    courseList.add("Electronics");

	    //Print linked list
	    System.out.println("Course List: "+courseList);

	    //Adding first and last 
	    courseList.addFirst("Engineering II");
	    courseList.addLast("Electonics II");
	    System.out.println("Updated Course List:  "+courseList);

	    //Getters and setters
	    Object firstCourse = courseList.get(0);
	    System.out.println("First Course in List:  "+firstCourse);
	    courseList.set(0, "Engineering Advanced");
	    Object newFirstCourse = courseList.get(0);
	    System.out.println("New First Course in List:  "+newFirstCourse);
	    System.out.println("Updated Course List: " +courseList);
	    
	    //Remove first and last
	    courseList.removeFirst();
	    courseList.removeLast();
	    System.out.println("Removed & Updated Course List:  "+courseList);

	    //Add at select position
	    courseList.add(0, "Engineering II");
	    courseList.remove(courseList.size()-1);
	    System.out.println("Finalized Course List: " +courseList); 

	}

}
