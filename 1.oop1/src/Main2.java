public class Main2 {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "LZQ";
        person.speak();

    }
}

class Person{
    String name;
    void speak(){
        System.out.println("我的名字叫"+name);
    }
}
