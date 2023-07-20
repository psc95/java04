/* 다운캐스팅 특징)
 *  1.사전에 상속관계를 만들어야 다운캐스팅이 된다.
 *  2.부모 조상타입이 자손타입으로 형변환이 이루어 지는 것을 다운캐스팅이라고 한다.
 *  3.사전에 업캐스팅을 한것에 한해서만 다운캐스팅을 허용한다.
 *  4.형변환 연산자 즉 캐스팅 연산자를 사용해서 명시적인 다운캐스팅을 해야 한다.
 */
class Mother12{
	void m12() {
		System.out.println("부모클래스 메서드 m12()");
	}
}

class Child12 extends Mother12{
	void ch12() {
		System.out.println("자손클래스 메서드 ch12()");
	}
}
public class CastingEx12 {
	public static void main(String[] args) {
		//		Mother12 m12 = new Mother12();//사전에 업캐스팅을 하지 않아서 다운캐스팅 불가
		Child12 ch12 = m12;//캐스팅 연산자를 사용하지 않아서 다운캐스팅 할때 컴파일 에러가 난다.
	}
}
