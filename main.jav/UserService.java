public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserModel getUserById(String userId) {
        return userRepository.getUserById(userId);
    }

    public void addUser(UserModel user) {
        userRepository.addUser(user);
    }
}
