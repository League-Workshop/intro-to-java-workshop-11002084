package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score=0;
		JOptionPane.showMessageDialog(null, "Welcome to the quiz!");
		JOptionPane.showMessageDialog(null, "No answers have capital letters, ending punctuation, or commas.");
		JOptionPane.showMessageDialog(null, "Disclaimer: This test may cause extreme rage.");
		// 2.  Ask the user a question 
		String val=JOptionPane.showInputDialog(null, "1. What is 100x100?");		// 3.  Use an if statement to check if their answer is correct
		// 4.  if the user's answer is correct
		if(val.equals("10000")){
		// -- add one to their score 
		score+=1;
		}
		JOptionPane.showMessageDialog(null, "Answer=10000");
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		// 2.  Ask the user a question 
		val=JOptionPane.showInputDialog(null, "2. What color is made by mixing red and yellow?");		// 3.  Use an if statement to check if their answer is correct
		// 4.  if the user's answer is correct
		if(val.equals("orange")){
		// -- add one to their score 
		score+=1;
		}
		JOptionPane.showMessageDialog(null, "Answer=orange");
		// 2.  Ask the user a question 
		val=JOptionPane.showInputDialog(null, "3. Type a word that starts with f and ends with uck. No cuss words allowed.");		// 3.  Use an if statement to check if their answer is correct
		// 4.  if the user's answer is correct
		if(val.equals("firetruck")){
		// -- add one to their score 
		score+=1;
		}
		JOptionPane.showMessageDialog(null, "Answer=firetruck");
		// 2.  Ask the user a question 
		val=JOptionPane.showInputDialog(null, "4. Joe walks out of a bar drunk. Minutes later, he is in heaven. What happened?");		// 3.  Use an if statement to check if their answer is correct
		// 4.  if the user's answer is correct
		if(val.equals("he drove a car")){
		// -- add one to their score 
		score+=1;
		}
		JOptionPane.showMessageDialog(null, "Answer=he drove a car");
		// 2.  Ask the user a question 
		val=JOptionPane.showInputDialog(null, "5. How many metric tons does a Boeing 747-8 weigh?");		// 3.  Use an if statement to check if their answer is correct
		// 4.  if the user's answer is correct
		if(val.equals("306.175")){
		// -- add one to their score 
		score+=1;	
		}
		JOptionPane.showMessageDialog(null, "Answer=306.175");
		// 2.  Ask the user a question 
		val=JOptionPane.showInputDialog(null, "6. Where did you hide the bodies?");		// 3.  Use an if statement to check if their answer is correct
		// 4.  if the user's answer is correct
		if(val.equals("what bodies?")){
		// -- add one to their score 
		score+=1;	
		}
		JOptionPane.showMessageDialog(null, "Answer=what bodies?");
		// 2.  Ask the user a question 
		JOptionPane.showInputDialog(null, "7. Draw a smiley face.");		// 3.  Use an if statement to check if their answer is correct
		// 4.  if the user's answer is correct
		if(val.equals(":)")){
		// -- add one to their score 
		score+=1;	
		}
		JOptionPane.showMessageDialog(null, "Answer=:)");
		// 2.  Ask the user a question 
		val=JOptionPane.showInputDialog(null, "8. Are you going to fail the test?");		// 3.  Use an if statement to check if their answer is correct
		// 4.  if the user's answer is correct
		if(val.equals("yes")){
		// -- add one to their score 
		score+=1;	
		}
		JOptionPane.showMessageDialog(null, "Answer=yes");
		// 2.  Ask the user a question 
		val=JOptionPane.showInputDialog(null, "9. What was the answer to question 2?");		// 3.  Use an if statement to check if their answer is correct
		// 4.  if the user's answer is correct
		if(val.equals("orange")){
		// -- add one to their score 
		score+=1;	
		}
		JOptionPane.showMessageDialog(null, "Answer=orange");
		// 2.  Ask the user a question 
		val=JOptionPane.showInputDialog(null, "10. How many holes in a polo?");		// 3.  Use an if statement to check if their answer is correct
		// 4.  if the user's answer is correct
		if(val.equals("4")){
		// -- add one to their score 
		score+=1;	
		}
		JOptionPane.showMessageDialog(null, "Answer=4");
		// 2.  Ask the user a question 
		val=JOptionPane.showInputDialog(null, "11. How many desktop computers are in this classroom?");		// 3.  Use an if statement to check if their answer is correct
		// 4.  if the user's answer is correct
		if(val.equals("28")){
		// -- add one to their score 
		score+=1;	
		}
		JOptionPane.showMessageDialog(null, "Answer=28");
		// 2.  Ask the user a question 
		val=JOptionPane.showInputDialog(null, "12. What is your IQ?");		// 3.  Use an if statement to check if their answer is correct
		// 4.  if the user's answer is correct
		if(val.equals("0")){
		// -- add one to their score 
		score+=1;	
		}
		JOptionPane.showMessageDialog(null, "Answer=0");
		// 2.  Ask the user a question 
		val=JOptionPane.showInputDialog(null, "13. what are the first 45 digits of pi?");		// 3.  Use an if statement to check if their answer is correct
		// 4.  if the user's answer is correct
		if(val.equals("13. 3.14159265358979323846264338327950288417916939")){
		// -- add one to their score 
		score+=1;	
		}
		JOptionPane.showMessageDialog(null, "Answer=3.14159265358979323846264338327950288419716939");
		// 2.  Ask the user a question 
		val=JOptionPane.showInputDialog(null, "14. How many US dollars does McDonalds make everyday?");		// 3.  Use an if statement to check if their answer is correct
		// 4.  if the user's answer is correct
		if(val.equals("$75.18 million")){
		// -- add one to their score 
		score+=1;	
		}
		JOptionPane.showMessageDialog(null, "Answer=$75.18 million");
		// 2.  Ask the user a question 
		val=JOptionPane.showInputDialog(null, "15. How much wood could a woodchuck chuck if a woodchuck could chuck wood?");		// 3.  Use an if statement to check if their answer is correct
		// 4.  if the user's answer is correct
		if(val.equals("as much wood as a woodchuck could chuck if a woodchuck could chuck wood")){
		// -- add one to their score 
		score+=1;	
		}
		JOptionPane.showMessageDialog(null, "Answer=as much wood as a woodchuck could chuck if a woodchuck could chuck wood");
		// 2.  Ask the user a question 
		val=JOptionPane.showInputDialog(null, "16. What was Notch, the developer of Mincraft, trying to make when he accidentally made the creeper?");		// 3.  Use an if statement to check if their answer is correct
		// 4.  if the user's answer is correct
		if(val.equals("pig")){
		// -- add one to their score 
		score+=1;	
		}
		JOptionPane.showMessageDialog(null, "Answer=pig");
		// 2.  Ask the user a question 
		val=JOptionPane.showInputDialog(null, "17. What two basic elements make up salt?");		// 3.  Use an if statement to check if their answer is correct
		// 4.  if the user's answer is correct
		if(val.equals("sodium and chlorine")){
		// -- add one to their score 
		score+=1;	
		}
		JOptionPane.showMessageDialog(null, "Answer=sodium and chlorine");
		// 2.  Ask the user a question 
		val=JOptionPane.showInputDialog(null, "18. If 6 equals 3 and 12 equals 6, what does 8 equal? ");		// 3.  Use an if statement to check if their answer is correct
		// 4.  if the user's answer is correct
		if(val.equals("5")){
		// -- add one to their score 
		score+=1;	
		}
		JOptionPane.showMessageDialog(null, "Answer=5");
		// 2.  Ask the user a question 
		val=JOptionPane.showInputDialog(null, "19. How many questions are in this quiz?");		// 3.  Use an if statement to check if their answer is correct
		// 4.  if the user's answer is correct
		if(val.equals("25")){
		// -- add one to their score 
		score+=1;	
		}
		JOptionPane.showMessageDialog(null, "Answer=25");
		// 2.  Ask the user a question 
		val=JOptionPane.showInputDialog(null, "20. What color are watermelons?");		// 3.  Use an if statement to check if their answer is correct
		// 4.  if the user's answer is correct
		if(val.equals("red and green and black")){
		// -- add one to their score 
		score+=1;	
		}
		JOptionPane.showMessageDialog(null, "Answer=red and green and black");
		// 2.  Ask the user a question 
		val=JOptionPane.showInputDialog(null, "21. What is the most northern US state (not including Alaska and Hawaii)?");		// 3.  Use an if statement to check if their answer is correct
		// 4.  if the user's answer is correct
		if(val.equals("minnesota")){
		// -- add one to their score 
		score+=1;	
		}
		JOptionPane.showMessageDialog(null, "Answer=minnesota");
		val=JOptionPane.showInputDialog(null, "22. How many DUIs do you have?");		// 3.  Use an if statement to check if their answer is correct
		// 4.  if the user's answer is correct
		if(val.equals("not telling")){
		// -- add one to their score 
		score+=1;	
		}
		JOptionPane.showMessageDialog(null, "Answer=not telling");
		val=JOptionPane.showInputDialog(null, "23. How much money are you losing because you bet you could pass this quiz?");		// 3.  Use an if statement to check if their answer is correct
		// 4.  if the user's answer is correct
		if(val.equals("a lot")){
		// -- add one to their score 
		score+=1;	
		}
		JOptionPane.showMessageDialog(null, "Answer=a lot");
		val=JOptionPane.showInputDialog(null, "24. How much does it cost to mint a nickel?");		// 3.  Use an if statement to check if their answer is correct
		// 4.  if the user's answer is correct
		if(val.equals("6 cents")){
		// -- add one to their score 
		score+=1;	
		}
		JOptionPane.showMessageDialog(null, "Answer=6 cents");
		val=JOptionPane.showInputDialog(null, "25. Is this the last question of the quiz?");		// 3.  Use an if statement to check if their answer is correct
		// 4.  if the user's answer is correct
		if(val.equals("no")){
		// -- add one to their score 
		score+=1;	
		}
		JOptionPane.showMessageDialog(null, "Answer=no");
		val=JOptionPane.showInputDialog(null, "26. What is 6+6+6");		// 3.  Use an if statement to check if their answer is correct
		// 4.  if the user's answer is correct
		if(val.equals("6x3")){
		// -- add one to their score 
		score+=1;	
		}
		JOptionPane.showMessageDialog(null, "Answer=6x3");
		val=JOptionPane.showInputDialog(null, "27. Is the lightning blaster an actual gun in Fortnite?");		// 3.  Use an if statement to check if their answer is correct
		// 4.  if the user's answer is correct
		if(val.equals("no")){
		// -- add one to their score 
		score+=1;	
		}
		JOptionPane.showMessageDialog(null, "Answer=no");
		val=JOptionPane.showInputDialog(null, "28. Define computer.");		// 3.  Use an if statement to check if their answer is correct
		// 4.  if the user's answer is correct
		if(val.equals("an electronic device for storing and processing data, typically in binary form, according to instructions given to it in a variable program")){
		// -- add one to their score 
		score+=1;	
		}
		JOptionPane.showMessageDialog(null, "Answer=an electronic device for storing and processing data, typically in binary form, according to instructions given to it in a variable program.");
		val=JOptionPane.showInputDialog(null, "29. What song did I play on my computer last class?");		// 3.  Use an if statement to check if their answer is correct
		// 4.  if the user's answer is correct
		if(val.equals("hello")){
		// -- add one to their score 
		score+=1;	
		}
		JOptionPane.showMessageDialog(null, "Answer=hello");
		val=JOptionPane.showInputDialog(null, "30. Do you like Justin Bieber");		// 3.  Use an if statement to check if their answer is correct
		// 4.  if the user's answer is correct
		if(val.equals("yes is it too late to say sorry for that")){
		// -- add one to their score 
		score+=1;	
		}
		JOptionPane.showMessageDialog(null, "Answer=yes is it too later to say sorry for that");
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, "You score is"+score);
		JOptionPane.showMessageDialog(null, "You failed! You failed! You failed! You failed! You failed! You failed! You failed! You failed! You failed! You failed! You failed! You failed! You failed! LOL LOL LOL LOL LOL LOL LOL LOL.");
	}
}
