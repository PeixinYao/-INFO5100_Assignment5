package Business;

import Business.Employee.Employee;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        UserAccount ur = system.getUserAccountDirectory().createUserAccount("resadmin", "resadmin", employee, new AdminRole());
        UserAccount uc = system.getUserAccountDirectory().createUserAccount("customer", "customer", employee, new CustomerRole());
        UserAccount ud = system.getUserAccountDirectory().createUserAccount("deliver", "deliver", employee, new DeliverManRole());
        
        return system;
    }
    
}
