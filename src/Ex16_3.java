//16장.상속.pdf 파일의 No.21~22쪽의 2번 문제
//생성자는 상속되지 안흔 클래스 구성요소이다. 그러므로 상속관계에서 생성자 호출순서에 관한 소스
class Parent2 extends Object{
	protected int a, b, c;
	
	public Parent2() {
		super();//최고 조상 Object클래스의 기본생성자를 호출하면서 끝이 남.
		System.out.println("Parnet2클래스 기본생성자");
	}
	
	public Parent2(int a, int b,int c) {
		super();
		System.out.println("Parent2클래스 전달인자3개짜리 오버로딩 된 생성자");
		this.a = a; this.b = b; this.c = c;
	}//전달인자 개수가 다른 생성자 오버로딩
}//Parent2 class

class Child2 extends Parent2{
	public Child2() {
		super();//부모클래스 기본생성자 호출
		System.out.println("Child2 클래스 기본생성자");
	}
	
	public Child2(int a,int b,int c) {
		super(a,b,c);//부모클래스 오버로딩 된 생성자 호출
		System.out.println("Child2클래스 전달인자 3개 짜리 오버로딩 된 생성자");
	}
}
public class Ex16_3 {
	public static void main(String[] args) {
		Child2 one = new Child2();
		Child2 two = new Child2(10, 20, 30); 
	}
}
