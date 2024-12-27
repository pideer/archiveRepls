package archiveRepls;
/*
 * 
 */

import java.util.Arrays;
import java.util.Scanner;

class encodeHA {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int flen, llen, f, l;

    System.out.println();
    System.out.print("Name:");
    String str = input.nextLine();


    String strArray[] = str.split(" ");
    String fn[] = strArray[0].split("");
    String ln[] = strArray[1].split("");
    flen = fn.length;
    llen = ln.length;
 

    f = flen - 1;
    l = llen - 1;
    System.out.print(fn[f] + ln[l]);


    int t = 64 + ln.length;
    char cap = (char)t;
    System.out.print(cap);

    int c = 0;
    int i = 1;
    for(;llen > i;){
      if(c==3)
        break;
      System.out.print(ln[i]);
      i = i + 3;
      c++;
    }
    c = 0;
    i = 1;
    for(;flen > i;){
      if(c==4)
        break;
      System.out.print(fn[i]);
      i = i + 3;
    }


    String lasf = ln[0];
    char nu= lasf.charAt(0);
    int num = nu - 64;
    if(num<10)
      System.out.println("0"+num);
    else
      System.out.println(num);
  }
}