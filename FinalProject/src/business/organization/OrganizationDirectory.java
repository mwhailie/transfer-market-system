/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author mwhai_000
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;
        if (type.getValue().equals(Type.Manager.getValue())) {
            organization = new ManagerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Coach.getValue())) {
            organization = new CoachOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Boss.getValue())) {
            organization = new BossOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Player.getValue())) {
            organization = new PlayerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Scout.getValue())) {
            organization = new ScoutOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Fans.getValue())) {
            organization = new FansOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.MarketingPerson.getValue())) {
            organization = new MarketingPersonOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Physio.getValue())) {
            organization = new PhysioOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}
