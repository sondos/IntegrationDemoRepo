package edu.esprit.integration.demo.services;

import javax.ejb.Local;

import edu.esprit.integration.demo.beans.CalculatorManageBean;

@Local
public interface CalculatorServiceI {

	
	public void add( CalculatorManageBean c);
	public void soustract( CalculatorManageBean c); 
	
}
