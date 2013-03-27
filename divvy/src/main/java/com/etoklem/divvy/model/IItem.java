package com.etoklem.divvy.model;

/**
 * @author melkkri 
 * Created on 27 Mar 2013 16:37:35 2013
 * Using Eclipse Juno	
 *
 */
public interface IItem {

	public long getId();
	
	public String getName();
	
	public double getCost();
	
	public double setCost();
	
	public double getPaidByMember(IMember member);
	
	public double getPaidByMember(long memberId);
	
	public void contribute(double cost, IMember member);
	
}
