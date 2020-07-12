package unit.test.legacy.code.trip;

import unit.test.legacy.code.exceptions.DataBaseConnectionError;
import unit.test.legacy.code.user.User;

import java.util.List;


public class TripDAO {

	public static List<Trip> findTripsByUser(User user) {
		throw new DataBaseConnectionError(
				"Can not find database server!");
	}
	
	public List<Trip> findTripsBy(User user) {
		return TripDAO.findTripsByUser(user);
	}
}