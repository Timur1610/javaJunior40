package lesson13;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeException{ //Метка на методе (throws AgeException), которая показывает, что метод МОЖЕТ выбросить Exception
        if (age < 0){
            throw new AgeException("Возраст не может быть меньше 0");//для удобства мы создали свой класс Exception(AgeException) и создали там все конструкторы
            //наш Exception удобен так как в консоли он будет подписан по нашему
            //throw работает также, как и return. Только он работает с Exception
        }
        if (age > 150){
            throw new AgeException("Возраст не может быть больше 150");
        }
        this.age = age;
    }
}
