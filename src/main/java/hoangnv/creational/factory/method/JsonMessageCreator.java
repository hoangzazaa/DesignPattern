package hoangnv.creational.factory.method;

/**
 * provides implementation for creating Json messages
 */
public class JsonMessageCreator extends MessageCreator {
    @Override
    public Message createMessage() {
        return new JsonMessage();
    }
}
