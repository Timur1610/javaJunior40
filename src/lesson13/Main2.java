package lesson13;

public class Main2 {
    public static void main(String[] args) {
        String text = null;
        //АВТОМАТИЧЕСКАЯ ГЕНЕРАЦИЯ ИСКЛЮЧИТЕЛЬНОЙ СИТУАЦИИ:
        // 1) Создает объект класса ... Exception (Прога создает объект одного из класса Exception, определяя по названию
        //   в названии вшита причина почему это произошло) в данном случае выдает - NullPointerException
        //   Null - наш случай, Pointer - обращение к пустому месту

        // 2) У этого объекта вызывается метод printStackTrace (Этот метод печатает красное на консоль)
        //   Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "text" is null
        //	at lesson13.Main2.main(Main2.java:8)

        // 3) System.exit(); (После выполнения этого метода прога не работает: в тех местах, где программа словила затык
        //   дальше мы не увидим выполнение проги, так как она остановилась на том месте, где есть ошибка, и она выполняет этот метод)

        System.out.println(text.length());//обратись к ссылке-текст (к объекту), на которую ссылается объект и возьми у нее длинну
                                        // но здесь это никак не получится сделать потому, что объекта нет - объект NULL
        System.out.println("Hello!");

        //ПРОГРАММНАЯ ГЕНЕРАЦИЯ ИСКЛЮЧИТЕЛЬНОЙ СИТУАЦИИ (те же самые действия, но делает это не программа, а программист)
        NullPointerException exception = new NullPointerException(); //создаем NullPointerException и дальше что то с ним делаем
    }
}
