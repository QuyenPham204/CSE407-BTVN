/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg47_2251172471_phamvanquyen_th3;

/**
 *
 * @author Admin
 */
public class EmailNotifier implements Notifying {
    @Override
    public void notify(String message) {
        System.out.println("Gửi thông báo email: " + message);
    }
}
