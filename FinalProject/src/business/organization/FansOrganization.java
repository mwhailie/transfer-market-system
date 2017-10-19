/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.FansRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author mwhai_000
 */
public class FansOrganization extends Organization {

    public FansOrganization() {
        super(Organization.Type.Fans.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new FansRole());
        return roles;
    }

}
