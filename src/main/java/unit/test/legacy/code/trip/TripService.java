package unit.test.legacy.code.trip;

import unit.test.legacy.code.exceptions.UserNotLoggedInException;
import unit.test.legacy.code.user.User;
import unit.test.legacy.code.user.UserSession;

import java.util.ArrayList;
import java.util.List;


public class TripService {

    private final TripDAO tripDAO;
    public TripService(TripDAO tripDAO){
        this.tripDAO = tripDAO;
    }

    public List<Trip> getTripsByUser(User user) throws UserNotLoggedInException {
        User loggedUser = getLoggedInUser();
        if (loggedUser == null) {
            throw new UserNotLoggedInException();
        }

        List<Trip> tripList = new ArrayList<>();
        if (user.isMyFriend(loggedUser)) {
            tripList = tripDAO.findTripsBy(user);
        }
        return tripList;
    }

    protected User getLoggedInUser() {
        return UserSession.getInstance().getLoggedUser();
    }

}
