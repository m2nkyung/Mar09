//3개의 나라이름과 인구를 입력받아 HashMap에 저장하고. 가장 인구가 많은 나라를 검색하여 출력하는 프로그램을 완성하시오.

import java.util.*;
import java.util.Map.Entry;
public class Week12_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map <String, Integer> con = new HashMap<String, Integer>();
		Scanner input = new Scanner(System.in);
		
		System.out.println("나라와 인구를 3개 입력하세요 : ex) Korea 5000");
		
		for(int i = 0; i < 3; i++) {
			System.out.print((i + 1) + ". 나라이름, 인구 >>> ");
			String s = input.next();
			int n = input.nextInt();
			
			con.put(s, (Integer)n);
		}
		
		Iterator <Map.Entry<String, Integer>>it = con.entrySet().iterator();
		int max = 0;
		String name ="";
		while(it.hasNext()) {
			Entry<String, Integer> element = it.next();
			if(max < element.getValue()) {
				max = element.getValue();
				name = element.getKey();
			}
		}
		
		System.out.println("제일 인구가 많은 나라는 " + name + ", " + max);
	}

}
