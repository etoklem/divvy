package com.etoklem.divvy.model;

import java.util.List;

/**
 * @author melkkri 
 * Created on 27 Mar 2013 16:48:15 2013
 * Using Eclipse Juno	
 *
 */
public interface IExpenseContext {

	public IExpense getExpense();
	
	public List<IMember> getMembers();
	
	public List<IMember> getBackedOutMembers();
	
	public List<IMember> getFinalMembers();
	
	public List<IItem> getExpenseItems();
	
	public void addExpenseItem(IItem item);
	
	public void addMember(IMember member);
	
	public void removeMember(IMember member);
	
	public void discountMember(IMember member); 
	
	public boolean hasMemberPaid(IMember member);
}
