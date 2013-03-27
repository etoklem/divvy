package com.etoklem.divvy.model;

/**
 * 
 * @author melkkri
 *
 */

public interface IMember {

	public long getId();
	
	public String getName();
	
	public String getEmail();
	
	public String getUserName();
	
	public String getPassword();
	
	public Sex getSex();
	
	public IDateOfBirth getDateOfBirth();
	
	public IAddress getAddress();
	
	public IMemberWeight getMemberWeight();
	
	public IPaymentProvider getPaymentProvider();
	
	public boolean isActive();
	
	public void createMember(String name, Sex sex, IDateOfBirth dob, IAddress address);
	
	public void deleteMember();
	
}
