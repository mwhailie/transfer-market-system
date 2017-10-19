/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.sort;

import business.role.PlayerRole;
import business.useraccount.UserAccount;
import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author mwhai_000
 */
public class SortByContractEndDate implements Comparator<UserAccount> {

    @Override
    public int compare(UserAccount o1, UserAccount o2) {

        Date contractEndDay1 = ((PlayerRole) (o1.getRole())).getLastestContract().getContractEndDate();
        Date contractEndDay2 = ((PlayerRole) (o2.getRole())).getLastestContract().getContractEndDate();
        if (contractEndDay2 == null || contractEndDay1 == null) {
            return 0;
        }
        return (contractEndDay1.compareTo(contractEndDay2));
        //ascending
    }

}
