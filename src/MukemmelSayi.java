
 import java.util.Scanner;
 public class  MukemmelSayi {
     public static void main(String[] args) {

         int isPerfect;
         int total = 0 ;

         Scanner input = new Scanner(System.in);

         while (true) {
             System.out.print("Sayı Giriniz: ");
             isPerfect = input.nextInt();
             for (int i = 1; i < isPerfect; i++) {
                 if (isPerfect % i == 0) {
                     total += i;
                 }
             }
             if (total == isPerfect) {
                 System.out.print(isPerfect + " Bir Mükemmel Sayıdır !!!");
             } else if (isPerfect < 0) {
                 System.out.print("Hatalı Giriş Yaptınız. Negatif Sayı Girmeyiniz !!!");
             } else {
                 System.out.print(isPerfect + " Bir Mükemmel Sayı Değildir !!!");
             }
             total = 0;
             System.out.println();
         }
     }
 }
