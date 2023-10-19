package lesson5;

public class Main {
    public static void main(String[] args) {
        ScannerUtil.printFigurs();
        String figura = ScannerUtil.getInputFigure();

        if (figura.equals("1") || figura.equalsIgnoreCase("Круг")) {
            String formula = ScannerUtil.getFormulaFigure();
            double radius = ScannerUtil.getParametr("Введите радиус: ");
            if (formula.equalsIgnoreCase("Площадь") || formula.equalsIgnoreCase("2")) {
                System.out.println("Площадь круга = " + (2 * 3.14 * radius));
            } else {
                System.out.println("Периметр круга = " + (3.14 * (radius * radius)));
            }
        }

        if (figura.equals("2") || figura.equalsIgnoreCase("Овал")) {
            String formula = ScannerUtil.getFormulaFigure();
            double a = ScannerUtil.getParametr("Введите сторону a:  ");
            double b = ScannerUtil.getParametr("Введите сторону b:  ");
            if (formula.equalsIgnoreCase("Площадь") || formula.equalsIgnoreCase("2")) {
                System.out.println("Площадь овала = " + 3.14 * a * b);
            } else {
                System.out.println("Периметр овала = " + 4 * (((3.14 * a * b) + ((a - b) * (a - b))) / (a + b)));
            }
        }

        if (figura.equals("3") || figura.equalsIgnoreCase("Прямоугольник")) {
            String formula = ScannerUtil.getFormulaFigure();
            int a = ScannerUtil.getParametr("Введите сторону a:  ");
            int b = ScannerUtil.getParametr("Введите сторону b:  ");
            if (formula.equalsIgnoreCase("Площадь") || formula.equalsIgnoreCase("2")) {
                System.out.println("Площадь прямоугольника = " + (a * b));
            } else {
                System.out.println("Периметр прямоугольника = " + ((a * a) + (b * b)));
            }
        }

        if (figura.equals("4") || figura.equalsIgnoreCase("Треугольник")) {
            String formula = ScannerUtil.getFormulaFigure();
            double a = ScannerUtil.getParametr("Введите сторону a:  ");
            double b = ScannerUtil.getParametr("Введите сторону b:  ");
            double c = ScannerUtil.getParametr("Введите сторону c:  ");
            double p = (a + b + c) / 2;
            if (formula.equalsIgnoreCase("Площадь") || formula.equalsIgnoreCase("2")) {
                System.out.println("Площадь треугольника = " + Math.sqrt(p * (p - a) * (p - b) * (p - c)));
            } else {
                System.out.println("Периметр треугольника = " + (a + b + c));
            }
        }

        if (figura.equals("5") || figura.equalsIgnoreCase("Квадрат")) {
            String formula = ScannerUtil.getFormulaFigure();
            int a = ScannerUtil.getParametr("Введите сторону a:  ");
            if (formula.equalsIgnoreCase("Площадь") || formula.equalsIgnoreCase("2")) {
                System.out.println("Площадь прямоугольника = " + (a * a));
            } else {
                System.out.println("Периметр прямоугольника = " + ((a * a) + (a * a)));
            }
        }

        if (figura.equals("6") || figura.equalsIgnoreCase("Трапеция")) {
            String formula = ScannerUtil.getFormulaFigure();
            if (formula.equalsIgnoreCase("Площадь") || formula.equalsIgnoreCase("2")) {
                double a = ScannerUtil.getParametr("Введите сторону a:  ");
                double b = ScannerUtil.getParametr("Введите сторону b:  ");
                double h = ScannerUtil.getParametr("Введите высоту h:  ");
                System.out.println("Площадь трапеции = " + ((a + b) / 2) * h);
            } else {
                int a = ScannerUtil.getParametr("Введите сторону a:  ");
                int b = ScannerUtil.getParametr("Введите сторону b:  ");
                int c = ScannerUtil.getParametr("Введите высоту c:  ");
                int d = ScannerUtil.getParametr("Введите высоту d:  ");
                System.out.println("Периметр трапеции = " + (a + b + c + d));
            }
        }

    }
}

