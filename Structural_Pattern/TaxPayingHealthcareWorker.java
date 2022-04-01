/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural;

/**
 *
 * @author Hp
 */
public class TaxPayingHealthcareWorker extends HealthcareWorkerDecorator{
    
    public TaxPayingHealthcareWorker(HealthcareWorker workerName) {
        super(workerName);
        System.out.printf("Decorate "+workerName.getName()+" with TaxPaying.\n");
    }
    
    @Override
    public double getPrice() {
        return (super.getPrice() * 0.1) + super.getPrice();
    }
}
