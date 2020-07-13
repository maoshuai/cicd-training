package unit.test.legacy.code.trip;

import org.junit.jupiter.api.Test;
import unit.test.legacy.code.exceptions.UserNotLoggedInException;
import unit.test.legacy.code.user.User;

import static org.junit.jupiter.api.Assertions.*;

class TripServiceTest {
    @Test
    void should_throw_exception_given_not_logged_in_when_get_trips_of_user() {
        TripService notLoggedInTripService = new TripService(){
            @Override
            protected User getLoggedInUser() {
                return null;
            }
        };

        assertThrows(UserNotLoggedInException.class, ()-> notLoggedInTripService.getTripsByUser(new User()));
    }
}