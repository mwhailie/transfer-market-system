/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.employee.EmployeeDirectory;
import business.role.Role;
import business.useraccount.UserAccountDirectory;
import business.workqueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author mwhai_000
 */
public abstract class Organization {
     private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;
    
    
     public enum Type{
        EnterpriseAdmin("EnterpriseAdmin Organization"), 
        Player("Player Organization"), 
        Manager("Manager Organization"),
        Boss("Boss Organization"), 
        Scout("Scout Organization"), 
        Coach("Coach Organization"),
        Fans("Fans Organization"),
        MarketingPerson("MarketingPerson Organization"),
        Physio("Physio Organization");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }

    }
    
    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }
    
        public abstract ArrayList<Role> getSupportedRole();
    
    @Override
    public String toString() {
        return name;
    }
}
