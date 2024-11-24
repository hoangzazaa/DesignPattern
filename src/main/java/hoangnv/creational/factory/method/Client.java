package hoangnv.creational.factory.method;

public class Client {
    public static void main(String[] args) {
//        using creator to create a product
//        choice of creator determines type of product created
        printMessage(new JsonMessageCreator());
        printMessage(new TextMessageCreator());
    }

    public static void printMessage(MessageCreator creator) {
        Message msg = creator.getMessage();
        System.out.println(msg);
    }
}
