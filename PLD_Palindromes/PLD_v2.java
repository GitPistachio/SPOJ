/* TLE */

import java.util.Scanner;

class PLD_v2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    sc.nextLine();

    char[] txt = sc.nextLine().toCharArray();
    int no_of_pld = 0;
    boolean is_pld;
    for (int i=0; i <= txt.length - K; i++){
      is_pld = true;
      for (int k=0; k <= K/2; k++){
        if (txt[i + k] != txt[i + K - k - 1]){
          is_pld = false;
          break;
        }
      }
      if (is_pld){
          no_of_pld++;
      }
    }
    System.out.println(no_of_pld);
  }
}