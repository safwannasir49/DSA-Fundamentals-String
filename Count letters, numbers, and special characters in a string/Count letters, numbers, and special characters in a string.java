import java.util.Scanner;
import java.io.*;
class Main
    {
        public static void main(String[]args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the String: ");
            String s = sc.nextLine();
            int lettercount=0,digitcount=0,specialcharacter=0,whitespace=0;
             for (char ch : s.toCharArray()){
                 
                 if(Character.isLetter(ch)){
                     lettercount ++;
                 }
                 else if(Character.isDigit(ch)){
                     digitcount ++;
                 }else if(Character.isWhitespace(ch)){
                     whitespace ++;
                 }
                  else{
                     specialcharacter ++;
                 }
                
         }
            
            System.out.println("Letter Count : "+lettercount);
            System.out.println("Digit Count: "+digitcount);
            System.out.println("White Space: "+whitespace);
            System.out.println("Special character: "+specialcharacter);
        }
    }
