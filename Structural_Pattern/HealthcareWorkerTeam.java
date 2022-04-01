/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Hp
 */
public class HealthcareWorkerTeam implements HealthcareServiceable{
    private Set<HealthcareServiceable> members = new HashSet<HealthcareServiceable>() ;
    
    public void addMember(HealthcareServiceable memberName){
        members.add(memberName);
    }
    
    public void removeMember(HealthcareServiceable memberName){
        members.remove(memberName);
    }
    
    @Override
    public void service() {
        for (HealthcareServiceable memberName : members){
             memberName.service();
         }
       
    }

    @Override
    public double getPrice() {
        double totalPrice = 0;
        for (HealthcareServiceable memberName : members){
             totalPrice += memberName.getPrice();
        }
        return totalPrice;
    }
    
}
