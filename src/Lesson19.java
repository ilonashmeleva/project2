public class Lesson19 {
    public static void main(String[] args) {
    Humana humana1 = new Humana();
    humana1.setAge(18);
    humana1.setName("Tom");
    humana1.getInfo();
}
    }
            class Humana{
                String name;
                int age;

                public void setName(String name){
                    this.name = name;
                }
                public void setAge(int age){
                    this.age = age;
                }
                public String getName(){
                    return name;
                }
                public int getAge() {
                    return age;
                }
                public void getInfo() {
                    System.out.println(name+","+age);
                }
            }