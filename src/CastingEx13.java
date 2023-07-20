/* 상속관계의 레퍼런스 간의 형변환에서 업캐스팅,다운캐스팅과 관련된 예제*/

class Mother13{
	void m13() {
		System.out.println("부모클래스 메서드 m13()");
	}
}//부모클래스 Mother13

class Child13 extends Mother13{
	void ch13() {
		System.out.println("자손클래스 메서드 ch13()");
	}
}//자손클래스 Child13

public class CastingEx13 {
	public static void main(String[] args) {
		/* 문제)한줄로 업캐스팅을 해서 메서드를 호출해 보고,명시적인 형변환을 해서 다운캐스팅을 한 다음메서드를 호출해보자.
		 */
		Mother13 m13 = new Child13();//업캐스팅(자동형 변환)
		m13.m13();
		
		Child13 c13 = (Child13)m13;//캐스팅 연산자((Child13)=>형변환 연산자)를 사용해서 명시적인 형변환하는
		//강제 다운캐스팅
		c13.m13();//부모로 부터 상속받아서 호출
		c13.ch13();//자손에서 정의된 메서드를 호출
	}
}
