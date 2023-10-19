package lesson5;

import java.util.Scanner;

public class ScannerUtil {
    /**
     * 1 - модификатор доступа (public, private, protected, _______)
     * (слово определяющее видимость данного метода)
     * public - видимость внутри всего проекта
     * private - видимость внутри текущего класса
     * protected - видимость внутри текущего класса и его наследником (его дочерним классном)
     * __________ - пакетная видимость (внутри текущей папки)
     * <p>
     * 2 - static (пишется или нет) неважно кто выполнит кусок кода. это метод общий, вызывается у названия классов
     * если static отсутсвует то метод вызывается у определенного объекта
     * <p>
     * 3 - возвращаемый тип(или слово void если такого нет)
     * <p>
     * 4 - название метода с маленькой буквы
     * <p>
     * 5 -  входящие параметры, в круглых скобках через запятую с указанием типа и названия
     * <p>
     * 6 - тело метода (это то, что будет происходить при вызове данного метода)
     */

    public static String getLevel() {

        System.out.println("Выберите уровень ");
        System.out.println("Новичок");
        System.out.println("Любитель");
        System.out.println("Профессионал");
        System.out.println("Особый");

        Scanner scanner = new Scanner(System.in);
        String level = scanner.next();
        return level;
    }

    public static void printField(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

//    ДЗ


    public static void printFigurs() {
        System.out.println("Выберите фигуру:");
        System.out.println("1 - Круг:");
        System.out.println("2 - Овал:");
        System.out.println("3 - Прямоугольник:");
        System.out.println("4 - Треугольник:");
        System.out.println("5 - Квадрат:");
        System.out.println("6 - Трапеция:");
    }

    public static String getInputFigure() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (input.equals("1") || input.equals("2") || input.equals("3") || input.equals("4") ||
                input.equals("5") || input.equals("6") || input.equalsIgnoreCase("Круг") ||
                input.equalsIgnoreCase("Овал") || input.equalsIgnoreCase("Прямоугольник") ||
                input.equalsIgnoreCase("Треугольник") || input.equalsIgnoreCase("Квадрат") ||
                input.equalsIgnoreCase("Трапеция")) {
            return input;
        } else {
            System.out.println("Ввод неверных данных, повторите попытку");
            System.out.print("Выберите фигуру: ");
            return getInputFigure();
        }
    }

    // вывод на консоль (спросить чего хочет пользователдь - периметр или площадь)

    public static String getFormulaFigure() {
        System.out.println("Выберите, периметр или площадь: ");
        System.out.println("1 - Периметр");
        System.out.println("2 - Площадь");
        Scanner scanner = new Scanner(System.in);
        String formula = scanner.next();
        if (formula.equals("1") || formula.equals("2") ||
                formula.equalsIgnoreCase("Периметр") || formula.equalsIgnoreCase("Площадь")) {
            return formula;
        } else {
            System.out.println("Ввод неверных данных, повторите попытку");
            return getFormulaFigure();
        }
    }


    public static int getParametr(String getMessageToUser) {
        System.out.println(getMessageToUser);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (isNumeric(input)) {
            int num = Integer.parseInt(input);
            if (num <= 0){
                System.out.println("Ввод неправильного значения, повторите попытку ");
                getParametr(getMessageToUser);
            } else {
                return num;
            }
        } else {
            System.out.println("Ввод неверных данных, повторите попытку");
            return getParametr(getMessageToUser);
        }
       return 0;
    }

    public static boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }
}
