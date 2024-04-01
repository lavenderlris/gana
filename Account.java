package object_class;

//은행 계좌 클래스(신한은행) => 멤버변수 제한자료 getter, setter 추가하기
public class Account {//소프트웨어 객체개발
	//객체 생성을 위해 필요한것, 클래스
	//1.멤버변수(field)
	static final String BANKNAME = "신한은행"; //상수 / (정적멤버변수)
	String accountNo;//계좌번호 멤버변수('-'는 특수문자여서 문자열 객체변수로 진행)
	String ownerName;//예금주 이름 -> 인스턴스 멤버변수
	int balance; //잔액 멤버변수
	
	
	//2.생성자 -> 클래스이름
	//객체를 초기함과 동시에 생성
	//멤버변수와 매개변수의 이름이 같을때
	public Account (String accountNo, String ownerName, int balance) {// (매개변수) <-
		this.accountNo = accountNo; //계좌번호
		this.ownerName = ownerName; //이름
		this.balance = balance; //금액 
	// this.는 상위변수를 표현하는 그 뭐시기 그거임
	}
	
	/* 멤버변수와 매개변수의 이름이 다를때
	public Account (String accNo, String owName, int bal) {// (매개변수) <-
		accountNo = accNo; //계좌번호
		ownerName = owName; //이름
		balance = bal; //금액
		
	}*/
	
	public Account() {
		// 빈생성자 -> 매개변수로 암것도 안받는거
	}
	
	//3.메소드(method)(기능)
	//입금하는 메소드 생성
	void deposit(int amount) {//함수생성, void -> 리턴값 없음  입력된 기능만 수행한뒤 종료
		balance += amount; //잔액더하기
	}
	
	//인출하는 메소드 생성
	int withdraw(int amount) throws Exception{// 리턴값이 있을때, 리턴할 타입을 앞에작성
		if (balance < amount) {//예외가 생기면 글로 던지기 예외처리 -> 개발자가 임의로 예외를 만드는것 
			throw new Exception("잔액이 부족합니다.");

		}
		
		balance -= amount; //잔액 빼기
		return amount;
	}
	
	

}
