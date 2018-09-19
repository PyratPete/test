import javax.swing.*;
// guide here https://www.youtube.com/watch?v=Z5qkGCgK70g
public class IfStatementStringInput
{

   public static void main(String[] args)
   {
      String input = "";
      input = JOptionPane.showInputDialog("Do you want to run or pass? ");
      if (input.equals("pass")) { //  String condition is tested here
         JOptionPane.showInputDialog("You chose pass ");
   }
      if (input.equals("run")) { //  String condition is tested here
         JOptionPane.showInputDialog("You scored a touchdown ");
   } 

      
   }
}
