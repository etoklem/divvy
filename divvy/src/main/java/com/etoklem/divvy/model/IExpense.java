package com.etoklem.divvy.model;

import java.util.List;

/**
 * @author melkkri 
 * Created on 27 Mar 2013 16:10:29 2013
 * Using Eclipse Juno	
 *
 */
public interface IExpense {

	public long getId();
	
	public String getName();
	
	public IMember getOwner();
	
	public IDate getStartDate();
	
	public IDate getEndDate();
	
	public boolean isActive();
	
}
