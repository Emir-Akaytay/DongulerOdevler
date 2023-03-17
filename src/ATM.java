
 import java.util.Scanner;
 public class ATM {
     public static void main(String[] args) {

         String name,password;
         int balance = 1500;
         int rights = 3;
         int selection;
         int money;
         Scanner input = new Scanner(System.in);

         System.out.println("Merhabalar TayBank'a Hoş Geldiniz !!! İsminizi ve Şifrenizi Yazıp Sisteme Giriş Yapabilirsiniz !!!");
         while (rights > 0) {
             System.out.print("İsminizi Giriniz: ");
             name = input.nextLine();
             System.out.print("Şifrenizi Giriniz: ");
             password = input.nextLine();

             if (name.equals("Java") && password.equals("12345")) {
                 System.out.println("Sisteme Başarıyla Giriş Yaptınız !!!!");
                 do {
                     System.out.println("""
                            \nYapabileceğiniz İşlemler:\s
                            1-Para Çekme\s
                            2-Para Yatırma\s
                            3-Bakiye Sorgulama\s
                            4-Çıkış Yap""");
                     System.out.print("\nİşleminizi Seçiniz: ");
                     selection = input.nextInt();

                     switch (selection) {
                         case 1 -> {
                             System.out.print("\nHesabınızdaki Tutar: " + balance + " \nÇekmek İstediğiniz Tutar: ");
                             money = input.nextInt();
                             if (balance < money) {
                                 System.out.println("Hesabınızda Bu Kadar Tutar Yok !!!");
                             } else {
                                 balance -= money;
                                 System.out.println("Çekilen Tutar: " + money + " \nKalan Tutar: " + balance);
                             }
                         }
                         case 2 -> {
                             System.out.print("\nHesabınızdaki Tutar: " + balance + " \nYatırmak İstediğiniz Tutar: ");
                             money = input.nextInt();
                             balance += money;
                             System.out.println("Hesabınızdaki Yeni Tutar: " + balance);
                         }
                         case 3 -> System.out.println("\nBakiyeniz: " + balance);
                         case 4 -> {
                             System.out.println("\nTeşekkürler,İyi Günler Dileriz !!!!");
                             System.exit(0);
                         }
                     }

                 } while( 1 <= selection && selection <= 4 ) ;

             } else {
                 rights--;
                 if (rights == 0) {
                     System.out.println("Hesabınız Bloke Olmuştur !!! Lütfen Bankayla İletişime Geçiniz !!!");
                     System.exit(0);
                 }
                 System.out.println("Yanlış Giriş Yaptınız !!! Kalan Hakkınız: "+ rights);
             }
         }
     }
 }
