package fsa.ac.ma.Action;

import fsa.ac.ma.Customer;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CustomerAction extends ActionSupport
	implements ModelDriven{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//have to initialize it
	Customer customer = new Customer();

	public String execute() throws Exception {

		return SUCCESS;

	}

	public Object getModel() {
		return customer;
	}
}