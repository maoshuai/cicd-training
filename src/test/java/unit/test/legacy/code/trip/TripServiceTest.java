package unit.test.legacy.code.trip;

import org.junit.jupiter.api.Test;
import unit.test.legacy.code.exceptions.UserNotLoggedInException;
import unit.test.legacy.code.user.User;

import java.util.List;

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

    @Test
    void should_return_empty_trip_list_given_logged_in_user_not_a_friend_when_get_trips_of_user() throws UserNotLoggedInException {
        User nonFriendUser = new User();
        User queryUser = new User();
        TripService tripService = new TripService(){
            @Override
            protected User getLoggedInUser() {
                return nonFriendUser;
            }
        };

        List<Trip> tripList = tripService.getTripsByUser(queryUser);
        assertEquals(0, tripList.size());
    }
}