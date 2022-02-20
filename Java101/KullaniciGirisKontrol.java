package Java101;

import java.util.Scanner;

public class KullaniciGirisKontrol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userId, password, registeredUserID, registeredPassword, enteredUserID, enteredPassword = "", newPass;
        registeredUserID = "";
        registeredPassword = "";
        newPass = "";
        userId = "";
        password = "";
        int passRenewalChoice;
        boolean loginIDCheck;
        boolean loginPassCheck = true;
        boolean hasQuit = false;

        while (!hasQuit){
        System.out.print("************** Hoş Geldiniz **************\n" +
                "1) Giriş yap.\n" +
                "2) Kayıt ol.\n" +
                "3) Çıkış\n" +
                "*******************************************\n" +
                "Lütfen seçiminizi belirtin: \n");
        int choice = scanner.nextInt();
        scanner.nextLine();


            switch (choice) {

                case 1:
                    System.out.print("Kullanıcı adınızı giriniz: ");
                    enteredUserID = scanner.nextLine();

                    loginIDCheck = (registeredUserID.equals(enteredUserID));


                    if (!loginIDCheck) System.out.println("Kullanıcı adı kayıtlı değil!!!\n" +
                            "Lütfen kayıt olun!\n");


                    if (loginIDCheck) {
                        System.out.print("Şifrenizi giriniz: ");
                        enteredPassword = scanner.nextLine();
                        loginPassCheck = (registeredPassword.equals(enteredPassword));
                        System.out.println(loginPassCheck ? "Giriş Başarılı :)" : "");
                        if (!loginPassCheck) {
                            System.out.println("Şifre yanlış!!!\n" +
                                    "Şifrenizi sıfırlamak ister misiniz?\n" +
                                    "1) Evet, sıfırla\n" +
                                    "2) Hayır, Yeni kayıt oluştur.");
                            passRenewalChoice = scanner.nextInt();
                            scanner.nextLine();

                            if (passRenewalChoice == 1) {

                                System.out.print("Yeni şifre: ");
                                newPass = scanner.nextLine();


                                if (newPass.equals(registeredPassword)) {
                                    System.out.println("Belirleyeceğiniz şifre önceki şifreniz ile aynı olamaz! Farklı bir şifre belirleyiniz!");

                                    System.out.println("Yeni şifre oluştur: ");
                                    newPass = scanner.nextLine();
                                    System.out.println("Şifre oluşturuldu!");
                                }

                                registeredPassword = newPass;

                            }
                            if (passRenewalChoice == 2) {
                                choice = 2;


                            }
                        }

                    }

                    break;

                case 2:
                    System.out.print("Yeni kayıt için kullanıcı adı belirleyin: ");
                    userId = scanner.nextLine();
                    while (userId == registeredUserID) {
                        System.out.println("Bu kullanıcı adı zaten kayıtlı! Lütfen başka kullanıcı adı deneyin:");
                        userId = scanner.nextLine();
                    }
                    registeredUserID = userId;
                    System.out.println("Yeni Şifre: ");
                    password = scanner.nextLine();
                    System.out.println("Kayıt Başarılı.\n\n");
                    while (password == registeredPassword) {
                        System.out.println("Bu kullanıcı adı zaten kayıtlı! Lütfen başka kullanıcı adı deneyin:");
                        password = scanner.nextLine();
                    }
                    registeredPassword = password;

                    break;

                case 3:
                    hasQuit = true;
            }

        }


    }

}





