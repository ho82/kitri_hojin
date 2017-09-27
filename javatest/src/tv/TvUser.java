package tv;


class SamsungTV{
	public void powerOn(){
		System.out.println("삼성tv:전원켜다");
	}
	public void powerOff(){
		System.out.println("삼성tv:전원끄다");
	}
	public void volumUp(){
		System.out.println("삼성tv:볼륨올리다");
	}
	public void volumDown(){
		System.out.println("삼성tv:볼륨내리다");
	}
}

class LgTV{
	public void turnOn(){
		System.out.println("lgtv:전원켜다");
	}
	public void turnOff(){
		System.out.println("lgtv:전원끄다");
	}
	public void soundUp(){
		System.out.println("lgtv:볼륨올리다");
	}
	public void soundDown(){
		System.out.println("lgtv:볼륨내리다");
	}
}

// 삼성티비, 엘지티비 선택권 존재 경우
// 티비 변경시마다 자바 소스 수정 불가피
// 1개 파일 변경 수정 - 다른 파일 변경 수정
// MAIN - FACTORY 시켜서 결과 리턴 
public class TvUser {
public static void main(String[] args){
	SamsungTV s1 = new SamsungTV();
	s1.powerOn();
	s1.volumUp();
	s1.volumDown();
	s1.powerOff();
	
	
	
	
}
}
