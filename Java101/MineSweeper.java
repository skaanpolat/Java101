package Java101;

import java.util.Random;
import java.util.Scanner;

/*
Java dilinde Mayın Tarlası oyunu yapmanızı bekliyoruz.

Oyun Kuralları :
Oyun metin tabanlıdır.
Çift boyutlu diziler üzerinden oynanmalı ve MineSweeper sınıfı içerisinde tasarlanmalı.
Matris boyutunu yani satır ve sütun sayısını kullanıcı belirlemeli.
Diziye ait eleman sayısının çeyreği (elemanSayisi / 4) kadar rastgele mayın yerleştirilmeli.
Örneğin dizi 4x3 boyutunda ise eleman sayısı (satırSayısı * sütunSayısı) formülü ile hesaplanmalı ve boyutu 12 olmalı.
Bu durumda mayın sayısı 12 / 4 = 3 adet olmalıdır. (ipucu : bu mayınların konumlarını tutacak ikinci bir dizi oluşturabilirsiniz.)
Kullanıcı matris üzerinden bir nokta seçmeli. Nokta seçimi için satır ve sütun değerlerini girmeli.
Seçilen noktanın dizinin sınırları içerisinde olup olmadığını kontrol edilmeli ve koşul sağlanmazsa tekrar nokta istenmeli.
Kullanıcının girdiği noktada mayın var ise oyunu kaybetmeli.
Mayın yok ise, ilgili noktaya değen tüm konumlarına bakılmalı
(sağı, solu, yukarısı, aşağısı, sol üst çapraz, sağ üst çapraz, sağ alt çapraz, sol alt çapraz)
ve etrafındaki mayınların sayısının toplamı ilgili noktaya yazılmalı.
Noktaya değen herhangi bir mayın yok ise "0" değeri atanmalı.
Kullanıcı hiç bir mayına basmadan tüm noktaları seçebilirse oyunu kazanmalı.

 */


public class MineSweeper {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean isOver = false;
        int userRow, userCol;


        System.out.print("MAYIN TARLASI\n\nOynanacak tarlanın boyutunu belirleyin.\nSatır sayısı : ");
        int row = scanner.nextInt();
        System.out.print("Sütun sayısı : ");
        int col = scanner.nextInt();
//        scanner.nextLine();
        int mineFreeCellCounter;
        int mineCount = ((row * col) / 4);

        String[][] userPlayground = new String[row][col];
        String[][] hiddenPlayground = new String[row][col];
        System.out.println("Oyundaki mayın sayısı : " + mineCount);

        // Kullanıcının göreceği oyun alanını tirelerden oluştur
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                userPlayground[i][j] = "-";

            }
        }

        // Kullanıcının göreceği oyun alanını ekrana bas
        for (String[] boy : userPlayground) {
            for (String en : boy) {
                System.out.print(en + " ");
            }
            System.out.println();
        }

        // Yapılan hamlelerin işleneceği oyun alanını oluştur
        for (int i = 0; i < row; i++) { //deneme atışıı
            for (int j = 0; j < col; j++) {
                hiddenPlayground[i][j] = "o";

            }
        }

//        // Yapılan hamlelerin işleneceği oyun alanını ekrana bas
//        for (String[] boy : hiddenPlayground) {
//            for (String en : boy) {
//                System.out.print(en + " ");
//            }
//            System.out.println();
//        }

        String mayin = "*";



        // Yapılan hamlelerin işleneceği oyun alanını
        // Satır ve sütun sayısına göre oluşan tüm mayınları rastgele yerleştirebilmek için
        // mayın sayısı kez dönerek oluştur
        for (int i = mineCount; i > 0; i--) {

            // Boş alanlar için sıfır (0) atanmıştı.


            // Mayın yerleştirilecek indeksleri max. satır ve sütün büyüklüğü olacak şekilde random belirle
            int mineRow = random.nextInt(row);
            int mineCol = random.nextInt(col);

            // Gelinen indekste daha önce yerleştirilmiş mayın yoksa
            if (!mayin.equals(hiddenPlayground[mineRow][mineCol])) {

                // Mayın yerleştirilen satırlar için bir (1) ata
                hiddenPlayground[mineRow][mineCol] = mayin;
            }

            // Gelinen indekste, daha önce yerleştirilmiş bir mayın var ise, döngüyü +1 bir kez daha uygula
            // Böylece, oyun alanı üzerinde aynı yere 2 kere mayın ataması yapıp, hesaplanan mayın sayısından düşmenin
            // ve oyun alanına eksik mayın atamanın önüne geçmiş ol.

            else {
                i++;

            }


            // Aynı kontrolü sütunlar için de uygula
            for (int j = mineCount; j > 0; j--) {


                if (!mayin.equals(hiddenPlayground[mineRow][mineCol])) {

                    // Mayın yerleştirilen satırlar için bir (1) ata
                    hiddenPlayground[mineRow][mineCol] = mayin;
                } else {
                    break;
                }
            }
        }

//
//        // İşlemlerin yapılacağı oyun alanını TEST İÇİN ekrana bas
//        for (String[] boy : hiddenPlayground) {
//            for (String en : boy) {
//                System.out.print(en + " ");
//            }
//            System.out.println();
//        }





        // Kullanıcı herhangi bir mayını patlatana kadar oynatmaya devam et
        while (!isOver) {


            mineFreeCellCounter = 0;
            System.out.println("Satır seçiniz : ");
            userRow = scanner.nextInt();
            System.out.println("Sütun seçiniz : ");
            userCol = scanner.nextInt();


            if (userCol <= col && userRow <= row) {

                // Kullanıcının seçtiği satır ve sütunda mayın olup olmadığını kontrol et.
                // Eğer var ise oyunu bitir, kullanıcıyı bilgilendirecek mesajı ver ve tüm oyun alanını göster
                if (mayin.equals(hiddenPlayground[userRow][userCol])) {
                    System.out.println("\nMayına bastınız! Oyun bitti!\n\nOyun alanı şu şekildeydi :");

                    //Mayınların olduğu gizli tablayı oyuncuya göster.
                    for (String[] boy : hiddenPlayground) {
                        for (String en : boy) {
                            System.out.print(en + " ");
                        }
                        System.out.println();
                    }
                    isOver = true;
                }

                // Eğer yok ise kullanıcının seçtiği satır ve sütun indexlerinin, eğer var ise "+1" ve "-1" lerini kontrol et
                // Bunlar matriste kullanıcının belirlediği hücrelerin "üst alt" , "sağ sol" , "üst çaprazları" ve "alt çaprazları" oluyor
                if (!mayin.equals(hiddenPlayground[userRow][userCol])) {
                    int mineCounter = 0;

                    //Kullanıcı seçimi en üst sol ise
                    if (userRow == 0 && userCol == 0) {


                        if (mayin.equals(hiddenPlayground[userRow + 1][userCol])) mineCounter++;   //altı

                        if (mayin.equals(hiddenPlayground[userRow][userCol + 1])) mineCounter++;   //sağı

                        if (mayin.equals(hiddenPlayground[userRow + 1][userCol + 1])) mineCounter++; //alt sağ çapraz

                    }

                    // Kullanıcı seçimi en üst sağ ise
                    if (userRow == 0 && userCol == col - 1) {
                        if (mayin.equals(hiddenPlayground[userRow + 1][userCol])) mineCounter++;   //altı

                        if (mayin.equals(hiddenPlayground[userRow + 1][userCol - 1])) mineCounter++; //alt sol çapraz

                        if (mayin.equals(hiddenPlayground[userRow][userCol - 1])) mineCounter++;   //solu

                    }

                    // Kullanıcı seçimi en alt sol ise
                    if (userRow == row - 1 && userCol == 0) {

                        if (mayin.equals(hiddenPlayground[userRow - 1][userCol])) mineCounter++;   //üstü

                        if (mayin.equals(hiddenPlayground[userRow - 1][userCol + 1])) mineCounter++; //üst sağ çapraz

                        if (mayin.equals(hiddenPlayground[userRow][userCol + 1])) mineCounter++;   //sağı


                    }

                    // Kullanıcı seçimi en alt sağ ise
                    if (userRow == row - 1 && userCol == col - 1) {

                        if (mayin.equals(hiddenPlayground[userRow - 1][userCol])) mineCounter++;   //üstü

                        if (mayin.equals(hiddenPlayground[userRow - 1][userCol - 1])) mineCounter++; //üst sol çapraz

                        if (mayin.equals(hiddenPlayground[userRow][userCol - 1])) mineCounter++;   //solu
                    }

                    // Kullanıcı seçimi köşeler hariç sol kenarda ise
                    if ((userRow > 0 && userRow < row - 1) && userCol == 0) {

                        if (mayin.equals(hiddenPlayground[userRow - 1][userCol])) mineCounter++;   //üstü

                        if (mayin.equals(hiddenPlayground[userRow + 1][userCol])) mineCounter++;   //altı

                        if (mayin.equals(hiddenPlayground[userRow][userCol + 1])) mineCounter++;   //sağı

                        if (mayin.equals(hiddenPlayground[userRow - 1][userCol + 1])) mineCounter++; //üst sağ çapraz

                        if (mayin.equals(hiddenPlayground[userRow + 1][userCol + 1])) mineCounter++; //alt sağ çapraz
                    }

                    // Kullanıcı seçimi köşeler hariç alt kenarda ise
                    if (userRow == row - 1 && (userCol > 0 && userCol < col - 1)) {

                        if (mayin.equals(hiddenPlayground[userRow - 1][userCol])) mineCounter++;   //üstü

                        if (mayin.equals(hiddenPlayground[userRow][userCol + 1])) mineCounter++;   //sağı

                        if (mayin.equals(hiddenPlayground[userRow][userCol - 1])) mineCounter++;   //solu

                        if (mayin.equals(hiddenPlayground[userRow - 1][userCol - 1])) mineCounter++; //üst sol çapraz

                        if (mayin.equals(hiddenPlayground[userRow - 1][userCol + 1])) mineCounter++; //üst sağ çapraz

                    }

                    // Kullanıcı seçimi köşeler hariç üst kenarda ise
                    if (userRow == 0 && (userCol > 0 && userCol < col - 1)) {

                        if (mayin.equals(hiddenPlayground[userRow + 1][userCol])) mineCounter++;   //altı

                        if (mayin.equals(hiddenPlayground[userRow][userCol + 1])) mineCounter++;   //sağı

                        if (mayin.equals(hiddenPlayground[userRow][userCol - 1])) mineCounter++;   //solu

                        if (mayin.equals(hiddenPlayground[userRow + 1][userCol - 1])) mineCounter++; //alt sol çapraz

                        if (mayin.equals(hiddenPlayground[userRow + 1][userCol + 1])) mineCounter++; //alt sağ çapraz

                    }

                    // Kullanıcı seçimi köşeler hariç sağ kenarda ise
                    if (userCol == col - 1 && (userRow > 0 && userRow < row - 1)) {

                        if (mayin.equals(hiddenPlayground[userRow - 1][userCol])) mineCounter++;   //üstü

                        if (mayin.equals(hiddenPlayground[userRow][userCol - 1])) mineCounter++;   //solu

                        if (mayin.equals(hiddenPlayground[userRow + 1][userCol])) mineCounter++;   //altı

                        if (mayin.equals(hiddenPlayground[userRow - 1][userCol - 1])) mineCounter++; //üst sol çapraz

                        if (mayin.equals(hiddenPlayground[userRow + 1][userCol - 1])) mineCounter++; //alt sol çapraz

                    }

                    // Kullanıcı seçimi matriste köşeler ve kenarlar hariç herhangi bir noktadaysa
                    if ((userRow > 0 && userRow < row - 1) && ((userCol > 0 && userCol < col - 1))) {

                        if (mayin.equals(hiddenPlayground[userRow - 1][userCol])) mineCounter++;   //üstü

                        if (mayin.equals(hiddenPlayground[userRow + 1][userCol])) mineCounter++;   //altı

                        if (mayin.equals(hiddenPlayground[userRow][userCol - 1])) mineCounter++;   //solu

                        if (mayin.equals(hiddenPlayground[userRow][userCol + 1])) mineCounter++;   //sağı

                        if (mayin.equals(hiddenPlayground[userRow - 1][userCol - 1])) mineCounter++; //üst sol çapraz

                        if (mayin.equals(hiddenPlayground[userRow - 1][userCol + 1])) mineCounter++; //üst sağ çapraz

                        if (mayin.equals(hiddenPlayground[userRow + 1][userCol - 1])) mineCounter++; //alt sol çapraz

                        if (mayin.equals(hiddenPlayground[userRow + 1][userCol + 1])) mineCounter++; //alt sağ çapraz

                    }

                    userPlayground[userRow][userCol] = String.valueOf(mineCounter);


                    for (String[] boy : userPlayground) {
                        for (String en : boy) {
                            System.out.print(en + " ");
                        }
                        System.out.println();
                    }

                    for (int i = 0; i < userPlayground.length; i++) {
                        for (int j = 0; j < userPlayground[0].length; j++) {
                            if ("-".equals(userPlayground[i][j])) {
                                mineFreeCellCounter++;

                            }
                        }
                    }

                    if (mineFreeCellCounter == mineCount) {
                        System.out.println("TEBRİKLER!!!\nTüm mayınları kazasız belasız buldunuz!");
                        isOver = true;
                    }

                }
            } else {
                System.out.println("Geçerli bir seçim yapmadınız!!");
            }
        }
    }
}
