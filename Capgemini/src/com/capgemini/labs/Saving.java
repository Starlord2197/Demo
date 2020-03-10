package com.capgemini.labs;

public class Saving extends Account {
	
	private final double minBallance= 1000;
	@Override
	public boolean withdraw(double amount) {
		
		if(super.getBallance() >= minBallance && (super.getBallance()-amount)>=minBallance)
		{
			super.setBallance(super.getBallance()-amount);
			return true;
		}
		else
		 return false;
	}
	
}
