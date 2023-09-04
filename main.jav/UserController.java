public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public UserModel getUser(String userId) {
        return userService.getUserById(userId);
    }

    public void createUser(UserModel user) {
        userService.addUser(user);
    }
}
