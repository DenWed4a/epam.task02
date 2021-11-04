package by.epam.task02.dao.exception;

public class DAOException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public DAOException() {
		super();
	}
	public DAOException(String message) {
		super(message);
	}
	public DAOException(Exception e) {
		super(e);
	}
	public DAOException(String message, Exception e) {
		super(message, e);
	}

}
