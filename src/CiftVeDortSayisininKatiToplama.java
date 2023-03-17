
 import java.util.Scanner;
 public class CiftVeDortSayisininKatiToplama {
     public static void main(String[] args) {
         int number,total = 0;
         Scanner input = new Scanner(System.in);

         do {
             System.out.print("Sayı Giriniz: ");
             number = input.nextInt();
             if (number % 4 == 0) {
                 total += number;
             }

         } while (number % 2 == 0);

         System.out.print("Toplam: "+total);
     }
 }