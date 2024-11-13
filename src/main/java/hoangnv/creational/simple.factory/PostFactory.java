package hoangnv.creational.simple.factory;

/**
 *  this class acts as a simple factory for creation of different posts on website
 */
public class PostFactory {

    public static Post createPost(String type) {
        switch (type) {
            case "news":
                return new NewsPost();
            case "blog":
                return new BlogPost();
            case "product":
                return new ProductPost();
            default:
                throw new IllegalArgumentException("post type is invalid");

        }
    }
}
