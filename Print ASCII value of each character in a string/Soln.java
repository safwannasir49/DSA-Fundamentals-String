import java.util.Scanner;
import java.util.*;
class Main
{
  public static void main(String[]args)
  {
      Scanner sc = new Scanner(System.in);
      String s;
      System.out.println("Enter the String: ");
      s = sc.nextLine();
      System.out.println("The ASCII value of each Character in a String: ");
      for(char ch: s.toCharArray())
      {
          if (ch != ' ') {
                System.out.println(ch + " : " + (int) ch);
            }
      }
  }
}
