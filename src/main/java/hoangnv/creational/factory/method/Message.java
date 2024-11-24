package hoangnv.creational.factory.method;

/**
 * This class represents interface for our "Product" which is a message
 * Implementations will be specific to content type
 *
 */
public abstract class Message {
    public abstract String getContent();

    public void addDefaultHeaders() {
//        add some default headers
    }

    public void encrypt() {
//        has some code to encrypt the content
    }
}
