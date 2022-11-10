package exer;
/*
 * 4.����������Ŀ��
 * ������Student�������������ԣ�ѧ��number(int)���꼶state(int),�ɼ�score(int)��
 * ����20��ѧ������ѧ��Ϊ1��20���꼶�ͳɼ����������ȷ����
 * ����һ����ӡ��3�꼶��stateֵΪ3����ѧ����Ϣ��
 * �������ʹ��ð������ѧ���ɼ����򣬲���������ѧ����Ϣ��
 * 
 * ��ʾ��
 * ��1�������������Math.random()������ֵ����double;
 * ��2����������ȡ����Math.round(double d)����������long��
 * 
 * 
 * �˴����Ƕ�StudentTest.java�ĸĽ�������������Ĺ��ܷ�װ��������
 * */

public class StudentTest1 {
	public static void main(String[] args) {
		// ����һ��student���͵�����
		Student1[] stus = new Student1[20];

		for (int i = 0; i < stus.length; i++) {
			stus[i] = new Student1();
			// ��Student�������Ը�ֵ
			stus[i].number = (i + 1);
			// �꼶��[1,6]
			stus[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);
			// �ɼ���[0,100]
			stus[i].score = (int) (Math.random() * (100 - 0 + 1));
		}

		StudentTest1 test = new StudentTest1();
		test.print(stus);
		System.out.println("*******************************");
		test.searchState(stus, 3);
		System.out.println("*******************************");
		test.sort(stus);
		// ����ѧ������

		
		// ����һ����ӡ3�꼶��stateֵΪ3����ѧ����Ϣ��
		// ����ѧ������
		for (int i = 0; i < stus.length; i++) {
			System.out.println(stus[i].info());
		}
	}

	// ����Student1[]����Ĳ���
	public void print(Student1[] stus) {
		for (int i = 0; i < stus.length; i++) {
			System.out.println(stus[i].info());
		}
	}

	/**
	 * 
	 * @param stus  Ҫ���ҵ�����
	 * @param state Ҫ���ҵ��꼶
	 */
	public void searchState(Student1[] stus, int state) {
		for (int i = 0; i < stus.length; i++) {
			if (stus[i].state == 3) {
				System.out.println(stus[i].info());
			}
		}
	}

	public void sort(Student1[] stus) {
		for (int i = 0; i < stus.length - 1; i++) {
			for (int j = 0; j < stus.length - 1 - i; j++) {
				if (stus[j].score > stus[j + 1].score) {
					// �����Ҫ���򣬽������������Ԫ�أ�Student���󣡣���
					Student1 temp = stus[j];
					stus[j] = stus[j + 1];
					stus[j + 1] = temp;
				}
			}
		}
	}
}

class Student1 {
	int number;// ѧ��
	int state;// �꼶
	int score;// �ɼ�

	public String info() {
		return "ѧ�ţ�" + number + ",�꼶��" + state + ",�ɼ���" + score;
	}
}
