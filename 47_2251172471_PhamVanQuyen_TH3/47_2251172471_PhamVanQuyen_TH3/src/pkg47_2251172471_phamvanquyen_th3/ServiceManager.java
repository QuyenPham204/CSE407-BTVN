/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg47_2251172471_phamvanquyen_th3;

/**
 *
 * @author Admin
 */
public class ServiceManager implements Logging, Notifying {
    @Override
    public void log(String message) {
        System.out.println("Service log: " + message);
    }

    @Override
    public void notify(String message) {
        System.out.println("Service notify: " + message);
    }
}
