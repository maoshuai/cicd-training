package unit.test.challenge;

import org.junit.jupiter.api.Test;
import unit.test.challenge.support.User;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {
    private UserService userService = new UserService();

    private static double DISCOUNT = 0.5;
    private static double NO_DISCOUNT=1;

    @Test
    public void should_return_discount_given_age_of_60(){
        User user = getUserOfAge(60);
        double discount = userService.getDiscount(user);

        assertEquals(DISCOUNT,discount);
    }

    @Test
    public void should_return_discount_given_age_older_than_60(){
        User user = getUserOfAge(61);
        double discount = userService.getDiscount(user);
        assertEquals(DISCOUNT,discount);
    }


    private User getUserOfAge(int i) {
        User user = new User();
        user.setAge(i);
        return user;
    }
}