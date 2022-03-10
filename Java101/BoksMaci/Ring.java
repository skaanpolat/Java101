package Java101.BoksMaci;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    Fighter coinWinner;
    Fighter coinLoser;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {

        if (checkWeight()) {
            while (f1.health > 0 && f2.health > 0) {
                flipCoins();
                System.out.println("======== YENİ ROUND ===========");
                coinLoser.health = coinWinner.hit(coinLoser);
                if (isWin()){
                    break;
                }
                coinWinner.health = coinLoser.hit(coinWinner);
                if (isWin()){
                    break;
                }
                printScore();
            }

        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }


    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (coinWinner.health == 0) {
            System.out.println("Maçı Kazanan : " + coinLoser.name);
            return true;
        } else if (coinLoser.health == 0){
            System.out.println("Maçı Kazanan : " + coinWinner.name);
            return true;
        }

        return false;
    }


    public void printScore() {
        System.out.println("------------");
        System.out.println(coinWinner.name + " Kalan Can \t:" + coinWinner.health);
        System.out.println(coinLoser.name + " Kalan Can \t:" + coinLoser.health);
    }

    void flipCoins(){
        int coin= (int) (Math.random()*100);

        if(coin>50){
            coinWinner = f1;
            coinLoser = f2;
        }
        else {
            coinWinner = f2;
            coinLoser = f1;
        }

    }
}


