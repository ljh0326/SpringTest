package part11;

import org.springframework.stereotype.Component;

//write개게 상속 doWrite를 할 수 있다.

//컴포넌트 어노테이션이 인식할 수 있게 
@Component("freeWrite")
public class FreeBoardWrite implements Write{
	//보드 내임 
	private String sBoardName;
	
	//생성자, 초기화해줌
	public FreeBoardWrite() {
		init();
	}
	
	//이름을 초기화 
	private void init() {
		this.setsBoardName("Free Board");
	}
	
	//세터 
	public void setsBoardName(String sBoardName) {
		this.sBoardName = sBoardName;
	}
	
	//개터
	public String getsBoardName() {
		return sBoardName;
	}
	
	@Override
	public void doWrite() {
		System.out.println(this.getsBoardName() + "Write down!!");
	}
}
