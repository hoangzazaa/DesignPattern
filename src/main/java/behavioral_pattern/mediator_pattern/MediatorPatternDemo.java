package behavioral_pattern.mediator_pattern;

public class MediatorPatternDemo {
	public static void main(String[] args) {
		ApnaChatRoom apnaChatRoom = new ApnaChatRoomImpl();
		User1 u1=new User1(apnaChatRoom);
		u1.setname("Ashwani Rajput");
		u1.sendMsg("Hi Ashwani! how are you?");
		
		
		User2 u2=new User2(apnaChatRoom);
		u2.setname("Soono Jaiswal");
		u2.sendMsg("I am Fine ! You tell?");
	}
}
