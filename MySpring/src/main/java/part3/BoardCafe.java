package part3;

//보드를 상속받는다.
public class BoardCafe implements Board{
	//write 객체 연결 
	private Write write;
	
	//write객체를 생성
	public void setWrite(Write write) {
		this.write = write;
	}

	//보드카페 생성자 
	public BoardCafe() {
		this.setWrite(Factory.getWriteInstance());
	}
	
	//doWrite;
	@Override
	public void boardWrite() {
		write.doWrite();
	}
}
