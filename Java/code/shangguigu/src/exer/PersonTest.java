package exer;

/*
 * Ҫ��
 * ��1������Person��Ķ������øö����name��age��sex���ԣ�����study������
 *  ����ַ�����studying��������showAge()������ʾageֵ��
 *  ����addAge()�����������age����ֵ����2�ꡣ
 *  ��2�������ڶ�������ִ���������������ͬһ����Ĳ�ͬ����֮��Ĺ�ϵ��
 * */
public class PersonTest {
	public static void main(String[] args) {
		Person person = new Person();
		person.name="Tom";
		person.age=18;
		person.sex=1;
		
		person.study();
		
		person.showAge();
		
		int newAge=person.addAge(2);
		System.out.println(person.name+"������Ϊ��"+newAge);
		
		System.out.println(person.age);
	}
}
