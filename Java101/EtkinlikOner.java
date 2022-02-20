package Java101;

import java.util.Scanner;

//Koşullar :
//
//        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
//        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
//        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
//        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
//

public class EtkinlikOner {
    public static void main(String[] args) {
        double temperature;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hava sıcaklığı nedir? : ");
        temperature = scanner.nextInt();


        if (temperature < 5){
            System.out.println("Kayağa gitmek için güzel bir gün.");
        }
        else if(temperature >=5 && temperature<=15){
            System.out.println("Sinemaya gidebilirsin.");
        }
        else if (temperature>15 && temperature<25){
            System.out.println("Piknik için güzel bir gün.");
        }
        else {
            System.out.println("Yüzmeye gitmek için daha neyi bekliyorsun?");
        }
    }
}
