 /* static import문을 사용하면 static멤버인 정적변수나 정적메서드를 호출할 때 해당 클래스명을 생략가능하다.*/

import static java.lang.System.out;
import static java.lang.Math.*;
public class StaticImport10 {
	public static void main(String[] args) {
		
		out.println(PI);//정적변수를 호출할 때 System.과 Math.을 생략함.
		out.println(random());//random() 정적메서드를 호출할 때 해당 클래스명 생략
	}
}
