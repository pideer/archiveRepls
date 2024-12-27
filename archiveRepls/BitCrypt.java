package archiveRepls;

import java.util.Random;

public class BitCrypt {
	  public static void main(String[] args) {
		    int n;
		    Random rand = new Random();

		    for(int i =0; i <17; i++){
		      int cha = rand.nextInt(52);
		      if(cha<27){
		        n = cha + 96;
		        char c = (char)n;
		        System.out.print(c);
		      } else{
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
