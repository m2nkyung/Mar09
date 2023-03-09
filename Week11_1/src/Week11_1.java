//generic 연습

class MyClass<T> {
	T val;
	void set (T a) { 
		val = a;
	}
	
	T get() { 
		return val;
	}
}

public class Week11_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyClass<String> s = new MyClass<String>();
		s.set("HELLO");
		System.out.println(s.get());
		
		MyClass<Integer> i = new MyClass<Integer>();
		i.set(5);
		System.out.println(i.get());
	}
}