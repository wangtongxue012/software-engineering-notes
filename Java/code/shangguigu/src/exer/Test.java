package exer;

/**
 * ÏîÄ¿Ãû : shangguigu
 * ÃèÊö :
 *
 * @author : wangli
 * @date : 2022-11-05 21:23
 **/
public class Test {
    public static void main(String[] args) {
        TestExtend test=new TestExtend();
        test.setAge(18);
    }
}
class TestExtend{
    private int age;
    private String name;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
