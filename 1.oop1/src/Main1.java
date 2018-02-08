public class Main1 {
    public static void main(String[] args) {
        String catlColor = "白色";
        String catlName = "小白";
        int catlAge = 3;

        Cat catl = new Cat();
        catl.age = 3;
        catl.name = "小白";
        catl.color = "白色";

        Cat catl2 = new Cat();
        catl2.age = 6;
        catl2.name = "小花";
        catl2.color = "花色";
    }
}

/* 定义猫类 */
class Cat{
    String color;
    String name;
    int age;
}
