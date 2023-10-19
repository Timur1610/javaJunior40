package lesson3;

public class Main4 {
    public static void main(String[] args) {

        int znam1 = 2;
        int znam2 = 4;

        int bigestZnam = znam1;

        if (znam2 > bigestZnam){
            bigestZnam = znam2;
        }

        for (int i = bigestZnam; i <= znam1 * znam2; i++){
            if (i % znam1 == 0 && i % znam2 == 0){
                System.out.println(i);
                break;
            }
        }

    }
}
