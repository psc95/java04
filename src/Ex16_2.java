//16장.상속.pdf 파일의 No.20쪽의 1번 문제
class Parent16{
	private int a;
			int b;
	protected int c;
	public int d;
	
	public Parent16(int a){
		this.a = a;
		System.out.println(a);
	}
}
class Child16 extends Parent16{
	public Child16(int a,int b,int c,int d) {
//		this.a = a;//a멤버변수는 부모클래스에서 private으로 정의되어서 접근 불가
		/* 생성자도 메서드의 일종이어서 생성자 중괄호 블록{}내에서 메서드 호출해도 된다. 하지만 객체지향 언어(OOP) 
		 * 에서는 많이 하지 않는 코드이다. 이것 보다는 생성자{}내에서 super(),this()에서 의해서 생성자 호출쪽으로 해결하는게
		 * 더 합리적이다.
		 */
		super(a);
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	void func() {
//		System.out.println(a);//11번째줄과 동일 이유로 컴파일 에러가 난다.
		System.out.println(b);//상속받아서 출력
		System.out.println(c);
		System.out.println(d);
	}
}
public class Ex16_2 {
	public static void main(String[] args) {
		Child16 one = new Child16(1, 2, 3, 4);
		one.func();
		/* 문제)부모클래스에 private으로 선언된 a멤버변수는 수정하지 말고,추가코드를 통해서
		 * 컴파일 에러가 나지 않게 하고 a~d멤버변수값을 출력되게 하시오.*/
	}
}
