package samplesbapp.sbappdemo.exception;

import java.time.LocalTime;

public class ErrorResponse {
	private int eid;
	private String msg;
	private LocalTime timestamp;
	public ErrorResponse(int eid, String msg, LocalTime timestamp) {
		super();
		this.eid = eid;
		this.msg = msg;
		this.timestamp=timestamp;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public LocalTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalTime timestamp) {
		this.timestamp = timestamp;
	}
	
	
	

}
