package part11;

import javax.annotation.Resource; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//보드를 상속받는다.

@Component("board")
public class BoardCafe implements Board{
	
	//write 객체 연결  xml에서 설정한 write가 자동으로 들어간다. 
	//private Write write = new FreeBoardWrite();랑 똑같은거야 
	//어노테이션에 따라 객체에 정해진 값이 들어간다.
//	@Autowired	
//	@Qualifier("qnaWrite")

	//  위 두 어노테이션을 묶은게 resource
    @Resource(name="qnaWrite")
	private Write write;
	
	//write객체를 생성
	//어노테이션을 면 생성자를 해줄 필요가 없다. 
	//자바빈즈를 설정해서 어떤 객체를 가져올지 아는거야 

	public void setWrite(Write write) {
		this.write = write;
	}
	
	//doWrite;
	@Override
	public void boardWrite() {
		write.doWrite();
	}
}
