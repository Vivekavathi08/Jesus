package exercise;
//Jesus Loves All
import java.util.Arrays;

public class Anagram {
	 public static void main(String[] args) {
		    String s1 = "jesus";
		    String s2 = "Care";
		    
		    s1 = s1.toLowerCase();
		    s2 = s2.toLowerCase();

		   
		    if(s1.length() == s2.length()) {

		      char[] ch1 = s1.toCharArray();
		      char[] ch2 = s2.toCharArray();

		      
		      Arrays.sort(ch1);
		      Arrays.sort(ch2);

		      
		      boolean result = Arrays.equals(ch1, ch2);

		      if(result) {
		        System.out.println( "anagram.");
		      }
		      else {
		        System.out.println("Not anagram.");
		      }
		    }
		    else {
		      System.out.println(" Not anagram.");
		    }
		  }
		}

//Just created a new branch 
//Create a new commend from main branch and trying to merge with new branch that i have created

