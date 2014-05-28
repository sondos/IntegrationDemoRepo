package edu.esprit.integration.demo.services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import edu.esprit.integration.demo.beans.CalculatorManageBean;

@Stateless
@LocalBean
public class CalculatorService  implements CalculatorServiceI{

	EntityManager m; 
	CalculatorManageBean c = new CalculatorManageBean();
	
	public CalculatorService() {
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void add(CalculatorManageBean c) {
		m.persist(c.getA() + c.getB());
	}

	@Override
	public void soustract(CalculatorManageBean c) {
		m.merge(c.getA() - c.getB());
	}
	
	
}
