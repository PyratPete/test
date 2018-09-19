import java.util.Scanner;

public class IfElseDemoWithUserInput
{
   public static void main(String[] args)
   {
      // create scanner object
      Scanner input = new Scanner(System.in);

      // prompt the user to enter a testScore
      System.out.print("Enter the testscore result: ");
      double testScore = input.nextDouble();

      // Define grade as a character
      char grade;

      // Define result ranges for what testScore equals
      if (testScore >= 90)
      {
         grade = 'A';
      }
      else if (testScore >= 80)
      {
         grade = 'B';
      }
      else if (testScore >= 70)
      {
         grade = 'C';
      }
      else if (testScore >= 60)
      {
         grade = 'D';
      }
      else
      {
         grade = 'F';
      }
      System.out.println("Grade = " + grade);

      input.close(); // this close input is added as the following error occurred
      // "resource leak input is never closed"

   }

}
