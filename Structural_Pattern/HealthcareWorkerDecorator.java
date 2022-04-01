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
public abstract  class HealthcareWorkerDecorator extends HealthcareWorker{
    private HealthcareWorker worker = null;

    public HealthcareWorkerDecorator(HealthcareWorker workerName) {
        super(workerName);
        worker = workerName;
    }
    @Override
    public void service() {
        worker.service();
    }
    
    @Override
    public double getPrice() {
        return worker.getPrice();
    }
    
}
