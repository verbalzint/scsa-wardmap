package info.wardmap.www.vo;

import java.sql.Date;

public class Warder {
	private int user_id;
	private int emailverification;
	private String id;
	private String password;
	private Date registerdate;
	
	public Warder(int user_id, int emailverification, String id, String password, Date registerdate) {
		super();
		this.user_id = user_id;
		this.emailverification = emailverification;
		this.id = id;
		this.password = password;
		this.registerdate = registerdate;
	}
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int isEmailverification() {
		return emailverification;
	}
	public void setEmailverification(int emailverification) {
		this.emailverification = emailverification;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getRegisterdate() {
		return registerdate;
	}
	public void setRegisterdate(Date registerdate) {
		this.registerdate = registerdate;
	}
}
