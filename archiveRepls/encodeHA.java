package archiveRepls;
/*
 * created:		11/6/2020??
 * modified:	12/27/2024 - added comments and format
 * description:	encodes first and last name to be used as a password. this fits
 * 				Heritage Academy's password model until it was phased out in 2019.
 * 				the algorithm is kinda explained through the code.
 */

import java.util.Arrays;
import java.util.Scanner;

class encodeHA {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int flen, llen, f, l;

    // input first and last name
    System.out.println();
    System.out.print("Name:");
    String str = input.nextLine();

    // split into first and last name
    String strArray[] = str.split(" ");
    String fn[] = strArray[0].split("");
    String ln[] = strArray[1].split("");
    flen = fn.length;
    llen = ln.length;
 

    f = flen - 1;
    l = llen - 1;
    System.out.print(fn[f] + ln[l]); // first two are last char of first and last name

    // next letter is capital A1 cypher of the length of the last name
    int t = 64 + ln.length;
    char cap = (char)t;
    System.out.print(cap);

    int c = 0;
    int i = 1;
    for(;llen > i;){ // loop through first name. print every 3rd char. start from 2nd char
      if(c==3)		// max is 3 letters
        break;
      System.out.print(ln[i]);
      i = i + 3;
      c++;
    }
    c = 0;
    i = 1;
    for(;flen > i;){ // loop through last name. print every 3rd char. start from 2nd char
      if(c==4)		// max is 4 letters? not incremented
        break;
      System.out.print(fn[i]);
      i = i + 3;
    }

    // number is reverse A1 cypher of first letter of the last name
    String lasf = ln[0];
    char nu= lasf.charAt(0);
    int num = nu - 64;
    if(num<10)		// single digit case
      System.out.println("0"+num);
    else
      System.out.println(num);
  }
}