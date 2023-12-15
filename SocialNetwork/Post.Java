
public class Post {
    int postId;
    String content;
    String timestamp;
    int likes;

    Post(int postId, String content, String timestamp, int likes) {
        this.postId = postId;
        this.content = content;
        this.timestamp = timestamp;
        this.likes = likes;
    }
}