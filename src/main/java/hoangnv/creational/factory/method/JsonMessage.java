package hoangnv.creational.factory.method;

public class JsonMessage extends Message {
    @Override
    public String getContent() {
        return "{\"JSON\" ; []}";
    }
}
