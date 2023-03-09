//p576 #3. 제네릭을 사용하여 똑같은 타입의 객체 두개를 저장하는 MyPair 클래스를 작성하여 결과와 같이 출력하세요.

class MyPair<T> {
	T data1;
	T data2;
	
	MyPair(T data1, T data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
	void setD1(T data1) {
		this.data1 = data1;
	}
	
	void setD2(T data2) {
		this.data2 = data2;
	}
	
	T getD1() {
		return data1;
	}
	
	T getD2() {
		return data2;
	}
	
	public String toString() {
		return ("str1 : " + getD1() + ", str2 : " + getD2());
	}
	
}
public class Assignment11_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyPair<String> fruit = new MyPair<String> ("사과", "포도");
		System.out.println(fruit.toString());
		

	}

}
