package exer;

/*
 * 3.1��д��������һ��method�������ڷ����д�ӡһ��10*8��*���Σ���main�����е��ø÷�����
 * 
 * 3.2�޸���һ��������method�����У�����ӡ10*8��*�;����⣬�ټ���þ���������
 * ��������Ϊ��������ֵ����main�����е��ø÷��������շ��ص����ֵ����ӡ��
 * 
 * 3.3�޸���һ��������method�����ṩ��m��n����������������ӡһ��m*n��*���Σ�������þ��ε������
 * ������Ϊ�þ��ε������������Ϊ��������ֵ����main�����е��ø÷��������շ��ص����ֵ����ӡ��
 * 
 * 
 * 
 * 
 * */
public class Exer3Test {
	public static void main(String[] args) {
		Exer3Test test = new Exer3Test();
		// 3.1
//			test.method();
		// 3.2����
		// ��ʽһ��
//		int area=test.method();
//		System.out.println("���Ϊ��"+area);
		// ��ʽ����
//		System.out.println(test.method());

		// 3.3����
		int area = test.method(12, 10);
		System.out.println("���Ϊ��" + area);

	}

	// 3.1
//		public void method() {
//			for(int i = 0; i <  10; i++) {
//				for(int j = 0;j < 8; j++) {
//					System.out.print(" * ");
//				}
//				System.out.println();
//			}
//			
//		}

	// 3.2
//	public int method() {
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 8; j++) {
//				System.out.print(" * ");
//			}
//			System.out.println();
//		}
//		return 10 * 8;
//	}

	// 3.3
	public int method(int m, int n) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		return m * n;
	}
}
