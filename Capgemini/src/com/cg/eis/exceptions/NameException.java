package com.cg.eis.exceptions;


public class NameException extends Exception {
	
	String msg;
	public NameException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "NameException [msg=" + msg + "]";
	}
	

}
