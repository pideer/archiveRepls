/*
 * created: 		8/9/2022???
 * modified:		12/27/2024 - added comments and format
 * description:		randomly generates a 16 character string. it converts a random number
 * 					into a char or to single digit to add to the string.
 */

package archiveRepls;

import java.util.Random;

public class BitCrypt {
	  public static void main(String[] args) {
		    int n;
		    Random rand = new Random();

		    for(int i =0; i <17; i++){ 		// loops for 16 characters
		      int cha = rand.nextInt(52); 	// random integer 0-51
		      
		      if(cha<27){
		        n = cha + 96;				// offset to lowercase letters
		        char c = (char)n;
		        System.out.print(c);
		      } else{						// convert to single digit number
		        if(cha<35){
		          n = cha - 26;
		          System.out.print(n);
		        }else if(cha<44){
		          n = cha - 35;
		          System.out.print(n);
		        }else if(cha<52){
		          n = cha -44;
		          System.out.print(n);
		        }
		      }
		    }
		  }
}
