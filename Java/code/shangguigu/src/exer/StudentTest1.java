package exer;
/*
 * 4.对象数组题目：
 * 定义类Student，包含三个属性：学号number(int)，年级state(int),成绩score(int)。
 * 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
 * 问题一：打印出3年级（state值为3）的学生信息。
 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息。
 * 
 * 提示：
 * （1）生成随机数：Math.random()，返回值类型double;
 * （2）四舍五入取整：Math.round(double d)，返回类型long。
 * 
 * 
 * 此代码是对StudentTest.java的改进：将操作数组的功能封装到方法中
 * */

public class StudentTest1 {
	public static void main(String[] args) {
		// 声明一个student类型的数组
		Student1[] stus = new Student1[20];

		for (int i = 0; i < stus.length; i++) {
			stus[i] = new Student1();
			// 给Student对象属性赋值
			stus[i].number = (i + 1);
			// 年级：[1,6]
			stus[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);
			// 成绩：[0,100]
			stus[i].score = (int) (Math.random() * (100 - 0 + 1));
		}

		StudentTest1 test = new StudentTest1();
		test.print(stus);
		System.out.println("*******************************");
		test.searchState(stus, 3);
		System.out.println("*******************************");
		test.sort(stus);
		// 遍历学生数组

		
		// 问题一：打印3年级（state值为3）的学生信息。
		// 遍历学生数组
		for (int i = 0; i < stus.length; i++) {
			System.out.println(stus[i].info());
		}
	}

	// 遍历Student1[]数组的操作
	public void print(Student1[] stus) {
		for (int i = 0; i < stus.length; i++) {
			System.out.println(stus[i].info());
		}
	}

	/**
	 * 
	 * @param stus  要查找的数组
	 * @param state 要查找的年级
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
					// 如果需要换序，交换的是数组的元素：Student对象！！！
					Student1 temp = stus[j];
					stus[j] = stus[j + 1];
					stus[j + 1] = temp;
				}
			}
		}
	}
}

class Student1 {
	int number;// 学号
	int state;// 年级
	int score;// 成绩

	public String info() {
		return "学号：" + number + ",年级：" + state + ",成绩：" + score;
	}
}
