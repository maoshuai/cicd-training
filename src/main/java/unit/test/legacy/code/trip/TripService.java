package unit.test.legacy.code.trip;

import unit.test.legacy.code.exceptions.UserNotLoggedInException;
import unit.test.legacy.code.user.User;
import unit.test.legacy.code.user.UserSession;

import java.util.ArrayList;
import java.util.List;


public class TripService {

    private TripDAO tripDAO;
    public TripService(TripDAO tripDAO){
        this.tripDAO = tripDAO;
    }

    public List<Trip> getTripsByUser(User user) throws UserNotLoggedInException {
        List<Trip> tripList = new ArrayList<Trip>();
        User loggedUser = getLoggedInUser();
        if (loggedUser == null) {
            throw new UserNotLoggedInException();
        }
        boolean isFriend = false;
        for (User friends : user.getFriends()) {
            if (friends.equals(loggedUser)) {
                isFriend = true;
                break;
            }
        }
        if (isFriend) {
            tripList = tripDAO.findTripsBy(user);
        }
        return tripList;
    }

    protected User getLoggedInUser() {
        return UserSession.getInstance().getLoggedUser();
    }

}
