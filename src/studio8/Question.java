package studio8;

import java.util.Scanner;

public class Question {
	
	/**
	 * Constructor
	 * @param prompt
	 * @param answer
	 * @param points
	 */
private String prompt;
private String answer;
private int points;

	public Question(String prompt, String answer, int points) {
		this.prompt = prompt;
		this.answer = answer;
		this.points = points;
	}
	
	/**
	 * Prints out the current question's prompt, with a parenthetical 
	 * number of points possible.
	 */
	public void displayPrompt() {
		System.out.println(this.prompt + "(" + this.points + " points)");
	}
	
	/**
	 * Check the answer provided by a user
	 * @param givenAnswer
	 * @return the number of points earned by the givenAnswer
	 */
	public int checkAnswer(String givenAnswer) {
		if(answer.equals(givenAnswer)) { //String comparison
			return this.points;
		} else {
			return 0;
		}
	}
	
	/**
	 * Getter method for the points possible
	 * @return int points
	 */
	public int getPoints() {
		return this.points;
	}
	
	/**
	 * Getter method for the answer to the question
	 * @return String answer
	 */
	public String getAnswer() {
		return this.answer;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// TODO: Create a Question object of your own!
		Question q = new Question("What is 3 times 5?", "15", 100);
		q.displayPrompt();
		String userAnswer = input.nextLine();

		int earnedPoints = q.checkAnswer(userAnswer);

		if(earnedPoints == q.getPoints()){
			System.out.println("Correct! You get " +earnedPoints+ " 15 points.");
		} else {
			System.out.println("Incorrect. You get 0 points"
			);
		}

		System.out.println(q.checkAnswer("15"));
	}
}
