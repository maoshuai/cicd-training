package unit.test.legacy.code.trip;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import unit.test.legacy.code.exceptions.UserNotLoggedInException;
import unit.test.legacy.code.user.User;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class TripServiceTest {
    @Test
    void should_throw_exception_given_not_logged_in_when_get_trips_of_user() {
        TripService notLoggedInTripService = new TripService(null){
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
        TripService tripService = new TripService(null){
            @Override
            protected User getLoggedInUser() {
                return nonFriendUser;
            }
        };

        List<Trip> tripList = tripService.getTripsByUser(queryUser);
        assertEquals(0, tripList.size());
    }

    @Test
    void should_return_trip_list_given_logged_in_user_is_a_friend_when_get_trips_of_user() throws UserNotLoggedInException {
        User friend = new User();
        User queryUser = new User();
        queryUser.addFriend(friend);

        List<Trip> mockedTripList = new ArrayList<>();
        TripDAO tripDAO = mock(TripDAO.class);
        when(tripDAO.findTripsBy(queryUser)).thenReturn(mockedTripList);

        TripService tripService = new TripService(tripDAO){
            @Override
            protected User getLoggedInUser() {
                return friend;
            }
        };

        List<Trip> tripList = tripService.getTripsByUser(queryUser);
        assertEquals(mockedTripList, tripList);
    }
}