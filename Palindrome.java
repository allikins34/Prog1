/*Description: A program where a user inputs a word, phrase, or number 
and checks to see if it is the same forward as
backwards. Program also ignores punctuation and spacing and case. 
Name: Aaron Chance Edwards
Feedback: This program honestly kicked my butt for awhile
I figured out the input and how to reverse quickly
but the no space, case or punctuation was tricky for me
But I do feel as though I am improving :)
*/

import java.util.*;

public class Palindrome 
 {
  //
  // method: isPalindrome
  // pre-conditions: a string is passed in
  // post-conditions: return true if the string is a palindrome otherwise 
  //return false
  //
   public static Boolean isPalindrome(String s)
   {
   StringBuilder s1 = new StringBuilder(); // Creates StringBuilder class
   String noSpaces = s.replaceAll("\\s", ""); //ignores spaces
   String noPunctation = noSpaces.replaceAll("\\p{Punct}", ""); //ignores punctuation
   s1.append(noPunctation);
   String reverses = s1.reverse().toString(); //reverses s1 to string
      if(reverses.equalsIgnoreCase(noPunctation)) //ignores case
			  return true;
	  else
		  	  return false;
   }

   public static void main(String[] args) 
       {
   Scanner scan = new Scanner(System.in); // define a scanner object to read from System.in
   String word = scan.nextLine(); // define a string called word and read the first line from the scanner object
     {                              
   // keep reading words until the word QUIT is read in
      while (!word.equals("QUIT")) 
    {
        //
 //       public static void IsPalindrome(word)// call the isPalindrome method passing it the word
        // based on what this method returns (true or false) output a message
        //
        if (isPalindrome(word))
            System.out.println("the string [" + word + "] IS a palindrome.");
        else
         System.out.println("the string [" + word + "] IS not a palindrome."); // provide false branch
           
        
   word = scan.nextLine(); // read the next string
    }
     }
       }
  }
