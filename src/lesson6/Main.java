package lesson6;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в игру!");

        int[][] arr = new int[9][9];
        boolean[][] mask = new boolean[9][9];

        mask[3][4]=true;
        mask[3][5]=true;
        mask[4][4]=true;
        mask[1][3]=true;
        mask[2][0]=true;
        mask[6][8]=true;
        SaperUtils.fillMines(arr);
        SaperUtils.insertNumsAroundMines(arr);
        SaperUtils.printArr(arr,mask);
    }
}
