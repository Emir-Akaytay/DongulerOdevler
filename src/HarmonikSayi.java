
 import java.util.Scanner;
 public class HarmonikSayi {
     public static void main(String[] args) {

         int fNumber;
         double total = 0;
         Scanner input = new Scanner(System.in);
         System.out.print("Kesirli Bir Sayı Giriniz: 1/");
         fNumber = input.nextInt();

         for (double i = 1 ; i <= fNumber ; i++ ) {
             total += 1/i;
         }
         System.out.println("Sonuç: "+total);
     }
 }
