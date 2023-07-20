//16장.상속.pdf 파일의 No.31쪽의 8번 문제

class A{
	public A() {
		System.out.println("hello from a");
	}
}

class B extends A{
	public B() {
		super();//부모의 기본생성자 호출은 생략해도 자바컴파일러가 묵시적 제공한다.
		System.out.println("hello frmo b");
		//super();//항상 첫줄에 와야 한다.다른줄에 있으면 컴파일 에러 남.
	}
}
public class Ex16_9 {
	public static void main(String[] args) {
		A a = new B();//업캐스팅 
	}
}
