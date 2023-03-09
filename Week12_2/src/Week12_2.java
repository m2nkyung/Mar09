// p572 의 프로그램을 보고, 다음과 같이 출력하도록 완성하세요.   p564의 Map.Entry를 이용하여 입력한 내용을 출력

import java.util.*;
import java.util.Map.Entry;
public class Week12_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> dic = new HashMap<String, String> ();
		dic.put("java", "자바");
		dic.put("school", "학교");
		dic.put("map", "지도");
		
		Scanner input = new Scanner(System.in);
		String answer = "";
		
		int flag;
		while(true) {
			System.out.print("찾고싶은 단어를 입력하세요 : ");
			answer = input.next();
			flag = 0;
			
			for(Entry m : dic.entrySet()) {
				if(m.getKey().equals(answer)) {
					System.out.println("단어의 의미는 " + m.getValue());
					flag = 1;
				}
			}
			
			if(answer.equals("quit")) {
				System.exit(0);
			}
			
			if(flag == 0) {
				System.out.println("단어의 의미는 null"); 
			}
			

		}
	}
}