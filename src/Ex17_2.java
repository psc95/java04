//17장.레퍼런스 형 변환.pdf No 20쪽의 3번문제
//업캐스팅 이후 자손에서 오버라이딩 한 메서드를 호출

class Super { 
	public int getNumber(int a) {
		return a + 1; 
	} 
} 

class CastingEx03 extends Super { 
	public int getNumber (int a) {
		return a + 2; 
	} //메서드 오버라이딩
}

public class Ex17_2 {
	public static void main(String[] args) {
		
		Super s = new CastingEx03 (); //업캐스팅
		/* 메서드가 오버라이딩 된 경우에는 s가 실제 가리키는 클래스 객체 타입이 누군지에 의해서
		 * 호출되는 메서드가 결정된다.여기서 CastingEx03타입을 가리키고 있기 때문에 자손에서
		 * 오버라이딩 한 메서드를 호출.줄여서 표현하면 업캐스팅 이후 오버라이딩 한 메서드 호출
		 */
		System.out.println(s.getNumber(10));//12
	}
}
