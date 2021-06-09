import java.util.Scanner;

public class Question_Main {

	public static void main(String[] args) {
		String q1 = "What colours are apples?\n" +
					"(a) Red\n(b) Yellow\n(c) Blue\n";
		String q2 = "What colours are apples?\n" +
					"(a) Red\n(b) Yellow\n(c) Blue\n";
		Question[] questions = {new Question(q1, "a"), new Question(q2, "b")};
		takeTest(questions);
		
	}
	
	public static void takeTest(Question[] questions) {
		byte score = 0;
		Scanner keyboardInput= new Scanner(System.in);
		for(byte i = 0; i < questions.length; i++) {
			System.out.println(questions[i].prompt);
			String answer = keyboardInput.nextLine();
			if(answer.equals(questions[i].answer)) 
				score++;
			}
		System.out.println("You got " + score + "/" + questions.length);
	}
}
