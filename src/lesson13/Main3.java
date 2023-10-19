package lesson13;

public class Main3 {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setAge(160);
            // в в блоке try пишем код, который нужно исполнить (ограждаем опасные участки кода),
        }catch (AgeException e){
            System.out.println("Возраст не может быть больше 150");
            //в блоке catch пишем то, что делать в случае ошибки (предусматриваем запасные пути, их может выть несколько)
            //ЧЕМ НИЖЕ КЛАСС ПО ИЕРАРХИИ, ТЕМ ВЫШЕ ОН СТОИТ В БЛОКЕК catch (более дочерние наверху, а ниже родительские)
        }
    }
}
