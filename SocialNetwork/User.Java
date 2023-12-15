import java.util.List;

public class User{
    int userId;
    String userName;
    String email;
    List<Post> posts;

    User(int userId, String userName, String email, List<Post> posts) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.posts = posts;
    }
}