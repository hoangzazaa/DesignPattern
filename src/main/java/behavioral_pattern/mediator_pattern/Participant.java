package behavioral_pattern.mediator_pattern;

public abstract class Participant {
	abstract void sendMsg(String msg);
	abstract void setname(String name);
	abstract String getName();
}
