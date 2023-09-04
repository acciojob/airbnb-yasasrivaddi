import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private Map<String, UserModel> users = new HashMap<>();

    public UserModel getUserById(String userId) {
        return users.get(userId);
    }

    public void addUser(UserModel user) {
        users.put(user.getUserId(), user);
    }
}
