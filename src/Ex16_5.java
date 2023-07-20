//16장.상속.pdf 파일의 No.26~27쪽의 4번 문제
class HandPhone{
	protected String model;
	protected String number;
	
	public HandPhone() {}
	
	public HandPhone(String model, String number) {
		this.model = model;
		this.number = number;
	}//생성자 주된 기능은 클래스 소속의 인스턴스 변수 초기화
	
	public String getModel() {
		return model;
	}
	
	public void getNumber(String number) {}
}// HandPhone class

class DicaPhone extends HandPhone{
	protected String pixel;
	
	public DicaPhone() {}
	
	public DicaPhone(String model,String number,String pixel) {
		super(model,number);
		this.pixel = pixel;
	}
	
	public void prnDicaPhone() {
		System.out.println("모델명 : "+model+"  번호 : "+number+"  화소수 : "+pixel);
	}
}//DicaPhone class
public class Ex16_5 {
	public static void main(String[] args) {
		DicaPhone dp = new DicaPhone("갤럭시","010","1024");
		dp.prnDicaPhone();
	}
}
