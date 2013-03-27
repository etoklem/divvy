package com.etoklem.divvy.model;

/**
 * @author melkkri 
 * Created on 27 Mar 2013 16:20:26 2013
 * Using Eclipse Juno	
 *
 */
public interface IPaymentProvider {

	public String getProviderName();
	
	public boolean makeImmediatePayment(IMember toMember, double paymentAmount);
	
	public boolean acceptImmediatePayment(IMember fromMember, double paymentAmount);
	
	public boolean makeDeferredPayment(IMember toMember, double paymentAmount, IDate dateOfPayment);
	
	public boolean acceptDeferredPayment(IMember fromMember, double paymentAmount, IDate dateOfPayment);
	
}
