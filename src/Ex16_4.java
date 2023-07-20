//16장.상속.pdf 파일의 No.23~25쪽의 3번 문제
class Animal{
	protected String kind;
	protected int leg;
	
	public Animal() {}
	
	public Animal(String kind, int leg) {
		this.kind = kind;
		this.leg = leg;
	}
	
	public void getKind() {
		if(kind.equals("강아지")) {//equals()메서드는 문자열 내용만 같은면 참
			System.out.println(kind+"는 동물이다");
		}else {
			System.out.println(kind+"는 동물이다");
		}
		
	}
	
	public void walk() {
		if(leg == 4) {
			System.out.println("강아지는 "+leg+"발로 걷는다");
		}else {
			System.out.println("사람은 "+leg+"발로 걷는다");
		}
		
//		if(kind.equals("강아지")) {
//			System.out.println(kind+"는 "+leg+"발로 걷는다");	
//		}else {
//			System.out.println(kind+"는 "+leg+"발로 걷는다");
//		}
		
	}
	
}//Animal class

class Dog extends Animal{
	
	public Dog() {}
		
	public Dog(String kind,int leg) {
		super(kind,leg);
	}
}// Dog class

class Human extends Animal{
	
	public Human() {}
	
	public Human(String kind,int leg) {
		super(kind,leg);//부모 Animal클래스의 오버로딩 된 생성자를 호출
	}
}// Human class

public class Ex16_4 {
	public static void main(String[] args) {
		Dog d = new Dog("강아지", 4);
		Human h = new Human("소녀", 2);
		
		d.getKind();
		d.walk();
		h.getKind();
		h.walk();
	}
}
