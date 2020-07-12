package unit.test.legacy.code.user;

public class UserSession {

    private static final UserSession userSession = new UserSession();

    private UserSession() {
    }

    public static UserSession getInstance() {
        return userSession;
    }

    public boolean isUserLoggedIn(User user) {
        throw new WebContainerInitializationError(
                "Something wrong when start web container");
    }

    public User getLoggedUser() {
        throw new WebContainerInitializationError(
                "Something wrong when start web container");
    }

}
