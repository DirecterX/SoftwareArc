/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Hp
 */
public class TimeLoggingHealthcareWorker extends HealthcareWorkerDecorator{
    
    public TimeLoggingHealthcareWorker(HealthcareWorker workerName) {
        super(workerName);
        System.out.printf("Decorate "+workerName.getName() + " with TimeLogging.\n");
    }
    
    @Override
    public void service(){
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        
        System.out.printf(dateFormat.format(now) + " : ");
        
        super.service();
    }
    
}
