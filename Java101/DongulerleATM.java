package Java101;

import java.util.Scanner;

public class DongulerlerATM {
    public static void main(String[] args) {
        String userID, userPassword;
        double bakiye = 0, islemTutari;
        int incorrectCounter = 3, userChoice = 0;
        String user = "S.Kaan", password = "123456", userInputUser, userInputPass;
        boolean hasQuit = false;

        Scanner scanner = new Scanner(System.in);


        while (!hasQuit) {
            System.out.println("***************PTK BANK***************\n" +
                    "*************Hoş Geldiniz*************\n");
            System.out.println("Kullanıcı adı girin : ");
            userInputUser = scanner.nextLine();
            System.out.println("Şifre girin: ");
            userInputPass = scanner.nextLine();

            if (user.equals(userInputUser) && (password.equals(userInputPass))) {
                hasQuit = false;
                while (!hasQuit) {


                    System.out.println("Yapılacak işlemi seçiniz\n" +
                            "1) Bakiye sorgula\n" +
                            "2) Para yatır\n" +
                            "3) Para çek\n" +
                            "4) Çıkış");
                    userChoice = scanner.nextInt();
                    scanner.nextLine();

                    switch (userChoice) {

                        case 1:
                            System.out.println("Bakiyeniz : " + bakiye + " TL");
                            break;

                        case 2:
                            System.out.println("Yatırmak istediğiniz tutarı giriniz: ");
                            islemTutari = scanner.nextDouble();
                            bakiye += islemTutari;
                            System.out.println("Yeni bakiyeniz: " + bakiye + " TL");
                            break;

                        case 3:
                            System.out.println("Çekmek istediğiniz tutarı giriniz: ");
                            islemTutari = scanner.nextDouble();
                            if (islemTutari > bakiye) {
                                System.out.println("İşlem için yeterli bakiye bulunmamaktadır! ");
                            }
                            if (islemTutari <= bakiye) {

                                bakiye -= islemTutari;
                                System.out.println("Yeni bakiyeniz : " + bakiye + " TL");
                            }

                            break;
                        case 4:
                            hasQuit = true;
                    }

                }

            } else {
                incorrectCounter--;
                System.out.println("Kalan giriş hakkı: " + incorrectCounter);

                if (incorrectCounter == 0) {
                    hasQuit = true;
                    System.out.println("Hatalı giriş sınırı aşıldı. Program durduruldu.");
                }
            }


        }
    }
}