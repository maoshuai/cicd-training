package unit.test.legacy.code.exceptions;

public class DataBaseConnectionError extends RuntimeException {

	private static final long serialVersionUID = -4584041339906109902L;

	public DataBaseConnectionError() {
		super();
	}

	public DataBaseConnectionError(String message,
								   Throwable cause) {
		super(message, cause);
	}

	public DataBaseConnectionError(String message) {
		super(message);
	}

	public DataBaseConnectionError(Throwable cause) {
		super(cause);
	}

	
}
