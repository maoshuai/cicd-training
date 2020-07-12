//package unit.test.legacy.code.trip;
//
//import unit.test.legacy.code.exceptions.UserNotLoggedInException;
//import unit.test.legacy.code.user.User;
//import unit.test.legacy.code.user.UserSession;
//
//import java.util.ArrayList;
//import java.util.List;
//
//
//public class TripService {
//
//    public List<Trip> getTripsByUser(User user) throws UserNotLoggedInException {
//        List<Trip> list = new ArrayList<Trip>();
//        User usr = UserSession.getInstance().getLoggedUser();
//        if (usr == null) {
//            throw new UserNotLoggedInException();
//        }
//        boolean flag = false;
//        for (User user1 : user.getFriends()) {
//            if (user1.equals(usr)) {
//                flag = true;
//                break;
//            }
//        }
//        if (flag) {
//            list = TripDAO.findTripsByUser(user);
//        }
//        return list;
//    }
//
//}
