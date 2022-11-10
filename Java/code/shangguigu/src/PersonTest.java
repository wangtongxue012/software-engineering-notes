/*
* 一、设计类，其实就是设计类的成员
*
* 属性=成员变量=field=域、字段
* 方法=成员方法=函数=method
*
*
*创建对象=类的实例化=实例化类
*
* 二、类和对象的使用(面向对象思想落地的实现)
* 1.创建类，设计类的成员
* 2.创建类的对象
* 3.通过"对象.属性"或"对象.方法"调用对象的结构
*
* 三、如果创建了一个类的多个对象，则每个对象都独立的拥有一套类的属性。（非static）
* 意味着：如果我们修改了对象的属性a,则不影响另外一个对象属性a的值
*
* 四、对象的内存解析
* */
//测试类
public class PersonTest {
    public static void main(String[] args) {
        //创建Person类的对象
        Person person = new Person();
        //Scanner scan=new Scanner(System.in);

        //调用对象的结构：属性、方法
        //调用属性："对象.属性"
        person.name="Tom";
        person.isMale=true;
        System.out.println(person.name);

        //调用方法："对象.方法"
        person.eat();
        person.sleep();
        person.talk("Chinese");


        Person p=new Person();
        System.out.println(p.name);//null 可以理解为入职表，表的内容是一样的，但是填表人不同，填完后信息不同
        System.out.println(p.isMale);//false

        //将person变量保存的对象地址值赋值给p1，导致person和p1指向了堆空间中的同一个对象实体。
        Person p1=person;
        System.out.println(p1.name);//Tom
        p1.age=10;
        System.out.println(person.age);
    }
}
//1.创建类，设计类的成员
class Person{
    //属性
    String name;
    int age=1;
    boolean isMale;
    //方法
    public void eat(){
        System.out.println("人可以吃饭");
    }
    public void sleep(){
        System.out.println("人可以睡觉");
    }
    public void talk(String language){
        System.out.println("人可以说话，使用的是："+language);
    }
}
