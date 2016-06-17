package com.actionbazaar.logic;

import javax.ejb.Local;

@Local
public interface BidService {

	public void addBid(Bid bid);
	
}
