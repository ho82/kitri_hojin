package javatest;
//interface 여도 된다.
//추상 클래스
//============================command pattern=========================
abstract class Command {	    //틀 제공
	abstract public void run(); //추상 메소드 2가지 실행의 경우
}

class ACommand extends Command{
	public void run(){
		System.out.println("ACommand 실행");
	}
}

class BCommand extends Command{
	public void run(){
		System.out.println("BCommand 실행");
	}
}

//===================================================================
//======factory method pattern
class CommandFactory {
	public Command getCommand(String name){	
		
		Command c = null; // ACommand , BCommand
		
		if(name.equalsIgnoreCase("a")){
			c = new ACommand();
		}else if(name.equalsIgnoreCase("b")){
			c = new BCommand();
		}
		return c;	
	}
}

//command 패턴 - 
// 입력값 - Command 결정권한 facrory : 세부사항 모른다.
public class CommandTest {
	public static void main(String[] args) {
		
		CommandFactory factory = new CommandFactory();
		Command c = factory.getCommand(args[0]);
		c.run();
		
	}

}
