/*
* Project name : SPOJ: FCTRL - Factorial
* Author       : Wojciech Raszka
* E-mail       : gitpistachio@gmail.com
* Date created : 2019-??-??
* Description  :
* Status       :
* Tags         : java, math,factorial
* Comment      :
*/

import java.util.Scanner;

class FCTRL
{
  public static int Z(int n)
  {
    int d = 5;
    int no_of_zeros = 0;
    while (d <= n){
      no_of_zeros += n/d;
      d *= 5;
    }
    return no_of_zeros;
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int i=0; i<T; i++)
    {
      System.out.println(Z(sc.nextInt()));
    }
  }
}
