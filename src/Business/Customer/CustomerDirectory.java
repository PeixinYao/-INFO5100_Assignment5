/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
   
      private ArrayList<Customer> customerDirectory;
      public CustomerDirectory(){
          customerDirectory=new ArrayList<Customer>();
      }

    public ArrayList<Customer> getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(ArrayList<Customer> customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    public Customer addCustomer(){
         Customer c = new Customer();
        customerDirectory.add(c);
        return c;
    }
    public void removeCustomer(Customer c) {
        customerDirectory.remove(c);
    }
       
}
