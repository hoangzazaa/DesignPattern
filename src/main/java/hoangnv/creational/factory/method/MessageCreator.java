package hoangnv.creational.factory.method;

/**
 * This is our abstract "creator"
 * The abstract method createMessage() has to be implemented by its subclasses
 */
public abstract class MessageCreator {

    public Message getMessage() {
        Message msg = createMessage();
        msg.addDefaultHeaders();
        msg.encrypt();
        return msg;
    }

    /**
     * Factory method
     * @return
     */
    public abstract Message createMessage();
}
