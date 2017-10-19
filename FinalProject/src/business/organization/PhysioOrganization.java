/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.PhysioRole;
import business.role.PlayerRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author mwhai_000
 */
public class PhysioOrganization extends Organization{
    
    public PhysioOrganization() {
        super(Organization.Type.Physio.getValue());
    }
        
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PhysioRole());
        return roles;
    }
}
