
 import java.util.Scanner;
 public class  FibonacciSerisi {
     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);
         System.out.print("Kaç Elemanlı Bir Fibonacci Serisi Yazdırmak İstiyorsunuz: ");
         int number = input.nextInt();
         int x = 0;
         int y = 1;
         int z ;

         for (int i = 1 ; i <= number ; i++ ) {
             System.out.print(x+",");
             z = x + y ;
             x = y;
             y = z;
         }
     }
 }