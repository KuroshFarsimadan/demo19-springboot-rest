package ir.kuroshfarsimadan.springboot.Demo19;

public class User {
	private int Id;
	private String username;

	/**
	 * @param id
	 * @param username
	 */
	public User(int id, String username) {
		super();
		Id = id;
		this.username = username;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return Id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		Id = id;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [Id=" + Id + ", " + (username != null ? "username=" + username : "") + "]";
	}

}
