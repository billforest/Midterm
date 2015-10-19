/*
 * Project: Test.java
 * Description: Test
 * Name: Jaehyung Lim
 * Date: Oct 19, 2015
  */

import java.util.Scanner;

public class Test {
  Scanner s = new Scanner(System.in);
  
  // holds the questions
  private String[] questions = {
    "What is the name of our school?",
    "What color is ocean?",
    "How many days in a year?",
    "How many hours in a day?"
  };
  
  // holds the Correct answers
  private String[] answers = {
    "GPA",
    "Blue",
    "365",
    "24"
  };
  
  // holds the answers from the User
  private String[] answersUser = new String[4]; // number of questions
  
  private int score;    // holds how many points
  
  private double grade; // holds the grade percentage
  
  public void askQuestions() {
    for(int i = 0; i <= 3; i++ ) {
      System.out.println(questions[i]);
      answersUser[i] = s.nextLine();
      if(answersUser[i].equals(answers[i])) {
        System.out.println( "Your answer is RIGHT!" );
        score += 2;
      }
      else if (answersUser[i].equals("gpa") || answersUser[i].equals("blue")) {
        System.out.println( "Your answer is kind of right..." );
        score += 1;
      }
      else {
        System.out.println( "Your answer is WRONG!!" );
      }
    }
  }
}
    
    
    
    