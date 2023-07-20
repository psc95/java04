/* 업캐스팅 이후 메서드가 오버라이딩을 한 경우에는 업캐스팅 된 참조변수가 실제 가리키는 객체타입에 의해서 호출되는
 * 메서드가 결정된다. 결국 업캐스팅 이후 자손에서 오버라이딩 한 메서드를 호출한다.이걸 확인하는 실습 예제
 * 업캐스팅 또는 메서드를 오버라이딩을 하려면 사전에 상속관계를 만들어야 한다.
 */

class Mother16{
	void m16( ){
		System.out.println("부모클래스 Mother16 m16() 메서드");
	}
}

class Child16_1 extends Mother16{
	
	@Override
	void m16() {
		System.out.println("오버라이딩 한 메서드 m16()");
	}
	
	void ch16() {
		System.out.println("자손클래스 Child16_1 ch16() 메서드");
	}
}
public class CastingEx16 {
	public static void main(String[] args) {
		Mother16 m = new Mother16();
		m.m16();//부모의 메서드를 호출
		
		Mother16 m2 = new Child16_1();//업캐스팅
		m2.m16();//업캐스팅 이후 오버라이딩 한 메서드를 호출=>m2가 실제 가리키는 객체 타입에 의해서 호출되는 메서드가 결정
		System.out.println("====================================>");
		
		/* 문제) m2를 명시적인 다운캐스팅을 한 다음 자손에서 정의한 메서드와 오버라이딩한 메서드를
		 * 각각 호출해보자 m2가 사전에 미리 업캐스팅을 한적이 있는지 애매모호 해서 형변환 유무 판단해보기 */
		if(m2 instanceof Child16_1) {
			System.out.println("업캐스팅을 사전에 해서 다운캐스팅 가능!!!");
			Child16_1 c16_1 = (Child16_1)m2;
			c16_1.ch16();
			c16_1.m16();
		}else {
			System.out.println("사전에 업캐스팅하지 않아 다운캐스팅 불가!! ");
		}	
		
	}
}
