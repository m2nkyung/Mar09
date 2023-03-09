//p540를 참고해 가장 큰 값을 반환하는 제네릭 메소드를 작성하세요.
import java.util.Scanner;
class Array {
	public static <T extends Comparable> T getMax(T[] a) {
		if (a == null || a.length == 0) {
			return null;
		}
		
		T largest = a[0];
		for(int i = 1; i < a.length; i++) {
			if(largest.compareTo(a[i]) < 0) {
				largest = a[i];
			}
		}
		
		return largest;
	}
}
public class Week11_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Integer[] iArr = new Integer[5];
		
		System.out.print("5개의 정수를 입력하세요 : ");
		for(int i = 0; i < 5; i++) {
			iArr[i] = input.nextInt();
		}
		
		Array ia = new Array();
		System.out.println("최대값 : " + ia.getMax(iArr));
		
		
		String[] sArr = new String[5];
		System.out.print("5개의 문자열을 입력하세요 : ");
		for(int i = 0; i < 5; i++) {
			sArr[i] = input.next();
		}
		
		Array sa = new Array();
		System.out.println("최대값 : " + sa.getMax(sArr));
	}
}
