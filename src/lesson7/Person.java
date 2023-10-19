package lesson7;

public class Person {

    // обявление характериситик (поля класса)
    private int age;
    private String name;

    private String surname;
    private String numPhone;




    // устанавливает метод
    public void setAge(int age){
        this.age = age;
        //this - объект, у которого вызван текущий метод
    }
    public void setName(String name){
        this.name = name;
    }

    // спрашивает метод
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNumPhone() {
        return numPhone;
    }

    public void setNumPhone(String numPhone) {
        this.numPhone = numPhone;
    }
}
