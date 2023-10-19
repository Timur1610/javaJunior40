package lesson6;

import java.util.concurrent.ThreadLocalRandom;

public class SaperUtils {
    public static void fillMines(int[][] arr) {
        for (int mine = 0; mine < 10; mine++) {
            int row = ThreadLocalRandom.current().nextInt(0, 9);
            int col = ThreadLocalRandom.current().nextInt(0, 9);

            if (arr[row][col] == -1) {
                mine--;
            } else {
                arr[row][col] = -1;
            }
        }
    }

    public static void insertNumsAroundMines(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == -1) { //если в клеточке мина
                    if (i == 0 && j == 0) { //если эта мина находится в ЛЕВОМ ВЕРХНЕМ углу
                        if (arr[i][j + 1] != -1) //если не мина, увеличиваем соседа справа
                            arr[i][j + 1] += 1;
                        if (arr[i + 1][j + 1] != -1) //если не мина, увеличиваем соседа справа снизу
                            arr[i + 1][j + 1] += 1;
                        if (arr[i + 1][j] != -1) //если не мина, увеличиваем соседа снизу
                            arr[i + 1][j] += 1;
                    }
                    int lastJ = arr[i].length - 1;
                    if (i == 0 && j == lastJ) { //если эта мина находится в ПРАВОМ ВЕРХНЕМ углу
                        if (arr[i][j - 1] != -1) //если не мина, увеличиваем соседа слева
                            arr[i][j - 1] += 1;
                        if (arr[i - 1][j - 1] != -1) //если не мина, увеличиваем соседа слева снизу
                            arr[i - 1][j - 1] += 1;
                        if (arr[i + 1][j] != -1) //если не мина, увеличиваем соседа справа
                            arr[i + 1][j] += 1;
                    }

                    int lastI = arr.length - 1;
                    if (i == lastI && j == 0) { //если эта мина находится в ЛЕВОМ НИЖНЕМ углу
                        if (arr[i - 1][j] != -1) //если не мина, увеличиваем соседа сверху
                            arr[i - 1][j] += 1;
                        if (arr[i - 1][j + 1] != -1) //если не мина, увеличиваем соседа справа сверху
                            arr[i - 1][j + 1] += 1;
                        if (arr[i][j + 1] != -1) //если не мина, увеличиваем соседа справа
                            arr[i][j + 1] += 1;
                    }
                    if (i == lastI && j == lastJ) { //если эта мина находится в ПРАВОМ НИЖНЕМ углу
                        if (arr[i][j - 1] != -1) //если не мина, увеличиваем соседа слева
                            arr[i][j - 1] += 1;
                        if (arr[i - 1][j - 1] != -1) //если не мина, увеличиваем соседа слева сверху
                            arr[i - 1][j - 1] += 1;
                        if (arr[i - 1][j] != -1) //если не мина, увеличиваем соседа сверху
                            arr[i - 1][j] += 1;
                    }
                    if (i != 0 && j != 0 && i != lastI && j != lastJ) { //если мины находятся в центре
                        if (arr[i - 1][j - 1] != -1) //если не мина, увеличиваем соседа слева сверху
                            arr[i - 1][j - 1] += 1;
                        if (arr[i - 1][j] != -1) //если не мина, увеличиваем соседа сверху
                            arr[i - 1][j] += 1;
                        if (arr[i - 1][j + 1] != -1) //если не мина, увеличиваем соседа справа сверху
                            arr[i - 1][j + 1] += 1;
                        if (arr[i][j - 1] != -1) //если не мина, увеличиваем соседа слева
                            arr[i][j - 1] += 1;
                        if (arr[i][j + 1] != -1) //если не мина, увеличиваем соседа справа
                            arr[i][j + 1] += 1;
                        if (arr[i + 1][j - 1] != -1) //если не мина, увеличиваем соседа слева снизу
                            arr[i + 1][j - 1] += 1;
                        if (arr[i + 1][j] != -1) //если не мина, увеличиваем соседа снизу
                            arr[i + 1][j] += 1;
                        if (arr[i + 1][j + 1] != -1) //если не мина, увеличиваем соседа справа снизу
                            arr[i + 1][j + 1] += 1;
                    }
                    if (i == 0){ //если мины находятся в середине верхней части массива
                        if (arr[i][j + 1] != -1) //если не мина, увеличиваем соседа справа
                            arr[i][j + 1] += 1;
                        if (arr[i + 1][j + 1] != -1) //если не мина, увеличиваем соседа справа снизу
                            arr[i + 1][j + 1] += 1;
                        if (arr[i + 1][j] != -1) //если не мина, увеличиваем соседа снизу
                            arr[i + 1][j] += 1;
                        if (arr[i + 1][j - 1] != -1) //если не мина, увеличиваем соседа слева снизу
                            arr[i + 1][j - 1] += 1;
                        if (arr[i][j - 1] != -1) //если не мина, увеличиваем соседа слева
                            arr[i][j - 1] += 1;
                    }
                    if (i == lastI){ //если мины находятся в середине нижней части массива
                        if (arr[i][j + 1] != -1) //если не мина, увеличиваем соседа справа
                            arr[i][j + 1] += 1;
                        if (arr[i][j - 1] != -1) //если не мина, увеличиваем соседа слева
                            arr[i][j - 1] += 1;
                        if (arr[i - 1][j - 1] != -1) //если не мина, увеличиваем соседа слева сверху
                            arr[i - 1][j - 1] += 1;
                        if (arr[i - 1][j] != -1) //если не мина, увеличиваем соседа сверху
                            arr[i - 1][j] += 1;
                        if (arr[i - 1][j + 1] != -1) //если не мина, увеличиваем соседа справа сверху
                            arr[i - 1][j + 1] += 1;
                    }
                    if (j == 0){ //если мины находятся в середине левой части массива
                        if (arr[i - 1][j] != -1) //если не мина, увеличиваем соседа сверху
                            arr[i - 1][j] += 1;
                        if (arr[i - 1][j + 1] != -1) //если не мина, увеличиваем соседа справа сверху
                            arr[i - 1][j + 1] += 1;
                        if (arr[i][j + 1] != -1) //если не мина, увеличиваем соседа справа
                            arr[i][j + 1] += 1;
                        if (arr[i + 1][j + 1] != -1) //если не мина, увеличиваем соседа справа снизу
                            arr[i + 1][j + 1] += 1;
                        if (arr[i + 1][j] != -1) //если не мина, увеличиваем соседа снизу
                            arr[i + 1][j] += 1;
                    }
                    if (j == lastJ){ //если мины находятся в середине правой части массива
                        if (arr[i - 1][j] != -1) //если не мина, увеличиваем соседа сверху
                            arr[i - 1][j] += 1;
                        if (arr[i + 1][j] != -1) //если не мина, увеличиваем соседа снизу
                            arr[i + 1][j] += 1;
                        if (arr[i + 1][j - 1] != -1) //если не мина, увеличиваем соседа слева снизу
                            arr[i + 1][j - 1] += 1;
                        if (arr[i][j - 1] != -1) //если не мина, увеличиваем соседа слева
                            arr[i][j - 1] += 1;
                        if (arr[i - 1][j - 1] != -1) //если не мина, увеличиваем соседа слева сверху
                            arr[i - 1][j - 1] += 1;
                    }
                }
            }

        }

    }

    public static void printArr(int[][] arr, boolean[][] mask) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++){
                if (mask[i][j]){ //если в массиве mask клеточку true отображать
                    System.out.print(arr[i][j] + " ");
                }else { //если клеточку false отображать
                    System.out.print("X"+" ");
                }
            }
            System.out.println();
        }

    }
}