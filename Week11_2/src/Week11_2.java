//중간점검 #3. 타입 매개변수 T를 가지는 Point 클래스를 정의하시오.
import java.util.Scanner;
class Point<T, S> {
	T x;
	S y;
	
	void setX(T x) {
		this.x = x;
	}
	
	void setY(S y) {
		this.y = y;
	}
	
	T getX() {
		return x;
	}
	
	S getY() {
		return y;
	}
}

public class Week11_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		 
		System.out.print("X를 입력하세요 : ");
		Integer x = input.nextInt();
		System.out.print("Y를 입력하세요 : ");
		Integer y = input.nextInt();
		
		Point<Integer, Integer> p = new Point<Integer, Integer>();
		p.setX(x);
		p.setY(y);
		
		System.out.println("x : " + p.getX());
		System.out.println("y : " + p.getY());
	}

}
