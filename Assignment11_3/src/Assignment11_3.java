//p576 #4. 클래스안에서 제네릭 메소드a()를 가지는 클래스 Test를 정의하시오.

import java.util.Scanner;
class Test{
	public<T> void obj(T obj) {
		System.out.println(obj.getClass().getName());
	}
}
public class Assignment11_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int i = input.nextInt();
		
		System.out.print("실수를 입력하세요 : ");
		double d = input.nextDouble();
		
		Test t = new Test();
		System.out.print(i + "의 클래스 이름은 ");
		t.<Integer>obj(i);
		System.out.print(d + "의 클래스 이름은 ");
		t.<Double>obj(d);
	}
}