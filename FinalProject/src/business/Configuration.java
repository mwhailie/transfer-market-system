/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.employee.Employee;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.role.BossRole;
import business.role.CoachRole;
import business.role.FansRole;
import business.role.ManagerRole;
import business.role.MarketingPersonRole;
import business.role.PhysioRole;
import business.role.PlayerRole;
import business.role.ScoutRole;
import business.role.SystemAdminRole;
import business.useraccount.UserAccount;
import business.workqueue.BossToManagerWorkRequest;
import business.workqueue.ReportWorkRequest;
import java.util.Date;

/**
 *
 * @author mwhai_000
 */
public class Configuration {
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        Date day = new Date();
        
        Employee employee = system.getEmployeeDirectory().createEmployee("Wenhe Ma");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        
        Network network = system.createAndAddNetwork();
        network.setName("England");
        
       Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise("Arsenal", Enterprise.EnterpriseType.PrimerLeague);
                
        Organization o = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.Coach);
        employee = o.getEmployeeDirectory().createEmployee("A Coach");
        ua = o.getUserAccountDirectory().createUserAccount("coach", "coach", employee, new CoachRole());
                
        Organization managerOrganization1 = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.Manager);
        employee = managerOrganization1.getEmployeeDirectory().createEmployee("A Manager");
        ua = managerOrganization1.getUserAccountDirectory().createUserAccount("manager", "manager", employee, new ManagerRole());
  
        o = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.Player);
        employee = o.getEmployeeDirectory().createEmployee("ozil");
        ua = o.getUserAccountDirectory().createUserAccount("ozil", "ozil", employee, new PlayerRole());
        PlayerRole playerRole = (PlayerRole)ua.getRole();
        playerRole.setDefence((int)(Math.random()*100));
        playerRole.setDribbble((int)(Math.random()*100));
        playerRole.setPhysical((int)(Math.random()*100));
        playerRole.setPassing((int)(Math.random()*100));
        playerRole.setSpeed((int)(Math.random()*100));
        playerRole.setShoot((int)(Math.random()*100));
        playerRole.setCommercialValue(3);
//        playerRole.getContractHistory().getContractList().get(0).setContractEndDate(new Date((day.getTime()+3)));
        playerRole.setBirthDate(new Date((day.getTime()-3)));
        playerRole.setPosition("Midfielder");
        
        

        employee = o.getEmployeeDirectory().createEmployee("scoltt");
        ua = o.getUserAccountDirectory().createUserAccount("scoltt", "scoltt", employee, new PlayerRole());
        playerRole = (PlayerRole)ua.getRole();
        playerRole.setDefence((int)(Math.random()*100));
        playerRole.setDribbble((int)(Math.random()*100));
        playerRole.setPhysical((int)(Math.random()*100));
        playerRole.setPassing((int)(Math.random()*100));
        playerRole.setSpeed((int)(Math.random()*100));
        playerRole.setShoot((int)(Math.random()*100));
        playerRole.setCommercialValue(2);
//        playerRole.getContractHistory().getContractList().get(0).setContractEndDate(new Date((day.getTime()+2)));
        playerRole.setBirthDate(new Date((day.getTime()-2)));
        playerRole.setPosition("Forward");
        
        

        employee = o.getEmployeeDirectory().createEmployee("Cesc");
        ua = o.getUserAccountDirectory().createUserAccount("cesc", "cesc", employee, new PlayerRole());
        playerRole = (PlayerRole)ua.getRole();
        playerRole.setDefence((int)(Math.random()*100));
        playerRole.setDribbble((int)(Math.random()*100));
        playerRole.setPhysical((int)(Math.random()*100));
        playerRole.setPassing((int)(Math.random()*100));
        playerRole.setSpeed((int)(Math.random()*100));
        playerRole.setShoot((int)(Math.random()*100));
        playerRole.setCommercialValue(2);
        playerRole.setBirthDate(new Date((day.getTime()-1)));
        playerRole.setPosition("Midfielder");
        
        
        employee = o.getEmployeeDirectory().createEmployee("ramsey");
        ua = o.getUserAccountDirectory().createUserAccount("ramsey", "ramsey", employee, new PlayerRole());
        playerRole = (PlayerRole)ua.getRole();
        playerRole = (PlayerRole)ua.getRole();
        playerRole.setDefence((int)(Math.random()*100));
        playerRole.setDribbble((int)(Math.random()*100));
        playerRole.setPhysical((int)(Math.random()*100));
        playerRole.setPassing((int)(Math.random()*100));
        playerRole.setSpeed((int)(Math.random()*100));
        playerRole.setShoot((int)(Math.random()*100));
        playerRole.setCommercialValue(1);
//        playerRole.getContractHistory().getContractList().get(0).setContractEndDate(new Date((day.getTime()+1)));
       
        playerRole.setBirthDate(new Date((day.getTime()-1)));
        playerRole.setPosition("Forward");

        

        
        o = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.Scout);
        employee = o.getEmployeeDirectory().createEmployee("A Scout");
        ua = o.getUserAccountDirectory().createUserAccount("scout", "scout", employee, new ScoutRole());
        
        o = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.Boss);
        employee = o.getEmployeeDirectory().createEmployee("A Boss");
        ua = o.getUserAccountDirectory().createUserAccount("boss", "boss", employee, new BossRole());
        
        o = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.Fans);
        employee = o.getEmployeeDirectory().createEmployee("A Fan");
        ua = o.getUserAccountDirectory().createUserAccount("fan", "fan", employee, new FansRole());
        
        o = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.Physio);
        employee = o.getEmployeeDirectory().createEmployee("A Physio");
        ua = o.getUserAccountDirectory().createUserAccount("physio", "physio", employee, new PhysioRole());
        
        o = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.MarketingPerson);
        employee = o.getEmployeeDirectory().createEmployee("A MarketingPerson");
        ua = o.getUserAccountDirectory().createUserAccount("marketingperson", "marketingperson", employee, new MarketingPersonRole());
        
        Enterprise enterprise2 = network.getEnterpriseDirectory().createAndAddEnterprise("Chelsea", Enterprise.EnterpriseType.PrimerLeague);
        Organization managerOrganization = enterprise2.getOrganizationDirectory().createOrganization(Organization.Type.Manager);
        employee = managerOrganization.getEmployeeDirectory().createEmployee("Chelsea Manager");
        ua = managerOrganization.getUserAccountDirectory().createUserAccount("cmanager", "cmanager", employee, new ManagerRole());

        Organization o2 = enterprise2.getOrganizationDirectory().createOrganization(Organization.Type.Player);
        employee = o2.getEmployeeDirectory().createEmployee("Terry");
        ua = o2.getUserAccountDirectory().createUserAccount("Terry", "Terry", employee, new PlayerRole());
                      
        playerRole = (PlayerRole)ua.getRole();
         playerRole.setDribbble((int)(Math.random()*100));
        playerRole.setDefence((int)(Math.random()*100));
        playerRole.setPhysical((int)(Math.random()*100));
        playerRole.setPassing((int)(Math.random()*100));
        playerRole.setSpeed((int)(Math.random()*100));
        playerRole.setShoot((int)(Math.random()*100));
        playerRole.setCommercialValue(4);
         playerRole.setPosition("Defender");
//        playerRole.getContractHistory().getContractList().get(0).setContractEndDate(day);
        playerRole.setBirthDate(day);
        BossToManagerWorkRequest bossToManagerWorkRequest = new BossToManagerWorkRequest();
        bossToManagerWorkRequest.setCeilingPrice(1);
        bossToManagerWorkRequest.setFloorPrice(2);
        bossToManagerWorkRequest.setTargetPrice(3);
        bossToManagerWorkRequest.setPlayer(ua);
        managerOrganization1.getWorkQueue().getWorkRequestList().add(bossToManagerWorkRequest);
//        
        return system;
    }
}
