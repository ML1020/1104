class Student{
    private String name;
    private int age;
    private static int count = 0;//静态成员变量，存于共享区

    //构造函数
    public Student(){
        System.out.println("we are winner");
    }

    //构造代码块(实例代码块)
    {
        this.age = 20;
        this.name = "Run";
        System.out.println("I am the best");
    }

    //静态代码块
    static {
        count = 10;
        System.out.println("I am static and count = " + count);
    }

    public void show(){
        System.out.println("name:" + name + " age:" + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        student1.show();
        student2.show();
    }

}
