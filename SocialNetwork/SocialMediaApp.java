import java.util.List;

public class SocialMediaApp {
    List<User> users;

    SocialMediaApp(List<User> users) {
        this.users = users;
    }

    void addUser(int userId, String userName, String email, List<Post> posts) {
        User newUser = new User(userId, userName, email, posts);
        this.users.add(newUser);
    }



    public static void main(String[] args) {

    }

}