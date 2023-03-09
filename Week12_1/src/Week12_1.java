//키보드로 이름을 4개 입력받아 ArrayList에  삽입하고, 리스트를 출력하세요.
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Week12_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		ArrayList al = new ArrayList();
		
		for(int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요 : ");
			al.add(input.next());
		}
		
		Iterator hi = (Iterator)al.iterator();
		
		while(hi.hasNext()) {
			System.out.print(hi.next() + " ");
		}
	}
}