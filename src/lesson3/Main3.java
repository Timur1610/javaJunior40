package lesson3;

public class Main3 {
    public static void main(String[] args) throws InterruptedException {
        for (int years = 0; years < 5; years++ ){
            for (int days = 0; days < 365; days++) {
                for (int hours = 0; hours < 24; hours++){
                    for (int min = 0; min < 60; min++){
                        for (int sec = 0; sec < 60; sec++){
                            System.out.printf("Со старата прошло %d года, %d дней, %d часов, %d минут, %d секунд \n", years, days, hours, min, sec);
                            Thread.sleep(1000);
                        }
                    }
                }
            }
        }

    }


}
