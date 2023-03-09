//p576 #2. Number의 자손들만 대입 가능한 MyMath클래스를 선언

class MyMath <T extends Number> {
	public <T> double getAverage(T[] arr) {
		double sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += (double)((Number) arr[i]).intValue();
		}
		
		return (sum /6);
	}
}

public class Assignment11_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] iArr = new Integer[6];
		for(int i = 0; i < 6; i++) {
			iArr[i] = (Integer)(i+1);
		}
		
		MyMath<Integer> m = new MyMath<Integer>();
		
		System.out.println("배열의 평균 : " + m.getAverage(iArr));
	}
}