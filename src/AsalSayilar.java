
 import java.util.Scanner;
 public class AsalSayilar {
     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);
         int number;
         int counter = 0;

         System.out.print("SAYI GİRİNİZ: ");
         number = input.nextInt();
         for (int i=1 ; i <= number ; i++) {
             for (int j=1 ; j < i ; j++) {
                 if (i % j == 0)
                     counter++;
             }
             if (counter == 1 ) {
                 System.out.print(i+" ");
             }
             counter = 0;
         }
     }
 }
