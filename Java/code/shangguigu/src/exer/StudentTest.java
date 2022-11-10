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
 * */

public class StudentTest {
	public static void main(String[] args) {
		// ����һ��student���͵�����
		Student[] stus = new Student[20];
		for (int i = 0; i < stus.length; i++) {
			stus[i] = new Student();
			// ��Student�������Ը�ֵ
			stus[i].number = (i + 1);
			// �꼶��[1,6]
			stus[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);
			// �ɼ���[0,100]
			stus[i].score = (int) (Math.random() * (100 - 0 + 1));
		}
		// ����ѧ������
		for (int i = 0; i < stus.length; i++) {
//			System.out.println(stus[i]);
//			System.out.println(stus[i].number + "," + stus[i].state + "," + stus[i].score);
			System.out.println(stus[i].info());
		}
		System.out.println("*******************************");
		// ����һ����ӡ3�꼶��stateֵΪ3����ѧ����Ϣ��
		for (int i = 0; i < stus.length; i++) {
			if (stus[i].state == 3) {
				System.out.println(stus[i].info());
			}
		}
		System.out.println("*******************************");

		// �������ʹ��ð������ѧ���ɼ����򣬲���������ѧ����Ϣ
		for (int i = 0; i < stus.length - 1; i++) {
			for (int j = 0; j < stus.length - 1 - i; j++) {
				if (stus[j].score > stus[j + 1].score) {
					// �����Ҫ���򣬽������������Ԫ�أ�Student���󣡣���
					Student temp = stus[j];
					stus[j] = stus[j + 1];
					stus[j + 1] = temp;
				}
			}
		}
		// ����ѧ������
		for (int i = 0; i < stus.length; i++) {
			System.out.println(stus[i].info());
		}
	}
}

class Student {
	int number;// ѧ��
	int state;// �꼶
	int score;// �ɼ�

	public String info() {
		return "ѧ�ţ�" + number + ",�꼶��" + state + ",�ɼ���" + score;
	}
}
