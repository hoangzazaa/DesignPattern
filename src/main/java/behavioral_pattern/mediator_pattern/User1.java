package behavioral_pattern.mediator_pattern;

public class User1 extends Participant {
	
	private String name;
	private ApnaChatRoom chat;
	
	public User1(ApnaChatRoom chat){
		this.chat=chat;
	}
	
	void sendMsg(String msg) {
		chat.showMsg(msg, this);
	}
	
	void setname(String name) {
		this.name=name;
	}
	
	String getName() {
		return this.name;
	}
}
