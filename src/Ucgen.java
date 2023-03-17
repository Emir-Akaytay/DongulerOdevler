
 import java.util.Scanner;
 public class  Ucgen {
     public static void main(String[] args) {

         int number;
         int i;
         Scanner input = new Scanner(System.in);
         System.out.print("Sayı Giriniz: ");
         number = input.nextInt();

         for (i = 0; i <= number; i++) {
             for (int j = 0; j < (number - i); j++) {
                 System.out.print(" ");
             }
             for (int k = 0 ; k < (2*i)-1 ; k++) {
                 System.out.print("*");
             }
             System.out.println();
         }
         for (i = number; 0 < i ; i--) {
             for (int k = 1; k <= number - i; k++) {
                 System.out.print(" ");
             }
             for (int j = 1; j <= (2 * i) - 1; j++) {
                 System.out.print("*");
             }
             System.out.println();
         }
     }
 }
