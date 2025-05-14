/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg47_2251172471_phamvanquyen_th3;

/**
 *
 * @author Admin
 */
public class ServiceManagerCreator implements LoggerCreator, NotifierCreator {
    
    @Override
    public Notifying createNotifier() {
        return new ServiceManager();
    }

    @Override
    public Logging createLogger() {
        return new ServiceManager();
    }
}
