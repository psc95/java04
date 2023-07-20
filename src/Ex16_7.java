//16장.상속.pdf 파일의 No.29쪽의 6번 문제

class Base{
	Base(){
		super();//최고 조상 Object클래스의 기본생성자를 호출하면서 끝이남
		System.out.println("Base");
	}
}//Base class

class Alpha extends Base{
	//Alpha 클래스 멤버변수와 메서드 없고,기본생성자만 생략됨.
	/*
	 * Alpha(){
	 * 	super();
	 * }
	 */
}
public class Ex16_7 {
	public static void main(String[] args) {
		new Alpha();
		new Base();
	}
}
