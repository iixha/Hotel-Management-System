/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;

/**
 *
 * @author Owner
 */
public interface Hotel {
    public void showWiFi(int numberRoom );
    public void checkout(); 
    public void booking (Guest guestlnfo, int inDay, int outDay);
    public void extensionOfReservation(int numberOfDays);
    public void calculateNumberOfDays();
}
    

