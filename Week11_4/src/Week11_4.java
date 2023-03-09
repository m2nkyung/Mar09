import java.util.*;

class Array {
	public <T> void displayyArray(T[] a) {
		System.out.println(Arrays.toString(a));
	}
}

public class Week11_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Integer[] ia = new Integer[5];
		
		System.out.print("5개의 정수를 입력하세요 : ");
		for(int i = 0; i < 5; i++) {
			ia[i] = input.nextInt();
		}
		
		Array a = new Array();
		a.displayyArray(ia);
	}
}