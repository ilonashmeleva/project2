public class Lesson20 {
    public static void main(String[] args) {
        Human human1 = new Human("Bob");
    }
}
class Human {
    private String name;
    private int age;

    public Human(){
        System.out.println("Привет из первого конструтора");
    }
    public Human(String name){
        System.out.println("Привет из второго конструтора");
    this.name = name;
    }
    public Human(String name, int ago) {
        System.out.println("Привет из третьего конструтора");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}