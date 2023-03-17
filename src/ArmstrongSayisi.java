
 import java.util.Scanner;
 public class  ArmstrongSayisi {
     public static void main(String[] args) {

         int number;
         Scanner input = new Scanner(System.in);
         System.out.print("Sayı Giriniz: ");
         number = input.nextInt();

         int tempNumber = number;
         int numberCounter = 0;
         while (0 < tempNumber) {
             tempNumber /= 10;
             numberCounter++;
         }

         tempNumber = number;
         int digitOfNumber;
         int multipliedValue = 1;
         int totalValueOfMultipliedValues = 0;
         while (0 < tempNumber) {
             digitOfNumber = tempNumber % 10;
             for (int i = 1 ; i <= numberCounter ; i++) {
                 multipliedValue *= digitOfNumber;
             }
             totalValueOfMultipliedValues += multipliedValue;
             multipliedValue = 1;
             tempNumber /= 10 ;
         }

         if(totalValueOfMultipliedValues == number) {
             System.out.println(number+" Bir Armstrong Sayısıdır !!!");
         } else {
             System.out.println(number+" Bir Armstrong Sayısı Değildir !!!");
         }
     }
 }
