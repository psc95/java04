//17장.레퍼런스 형 변환.pdf No 19쪽의 2번문제
//상속관계에서 레퍼런스간의 형변환인 업캐스팅/다운캐스팅,instanceof 연산자에 관한 실습
class SubClass {//extends Object
	int i = 3; 
}

public class Ex17_1 {
	public static void main(String[] args) {
		Object obj = new SubClass(); //최고 조상 Object타입으로 업캐스팅
		/* 문제)형변환 유무 판단연산자 instanceof를 추가해서 좀더나은 자바 
		 * 문장을 만들어 보자.
		 */
		if(obj instanceof SubClass) {//obj가 다운캐스팅이 가능한가?
			System.out.println("사전에 업캐스팅이 되어서 다운캐스팅 가능!!!");
			SubClass foo = (SubClass)obj; //명시적인 다운캐스팅
			System.out.println("i = " + foo.i);
		}
		
	}
}
