package model;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Tim
 */
public class WelcomeService {

    private Calendar date = Calendar.getInstance();
    
    public String welcomeMessage(String name) {
        String message = getTimeInterval() + ", " + name + ". " 
                + "Welcome!";
        return message;
    }
    
    private String getTimeInterval() {
        String timeInterval = "Hello";
        
        Calendar midnight = Calendar.getInstance();
        midnight.set(Calendar.HOUR_OF_DAY, 0);
        
        Calendar noon = Calendar.getInstance();
        noon.set(Calendar.HOUR_OF_DAY, 12);
        
        Calendar midDay = Calendar.getInstance();
        midDay.set(Calendar.HOUR_OF_DAY, 18);
                
        if (date.before(noon) && date.after(midnight)
                || date.equals(midnight)) {
            timeInterval = "Morning";
        } else if (date.before(midDay) && date.after(noon)
                || date.equals(noon)) {
            timeInterval = "Afternoon";
        } else if (date.after(midDay) || date.equals(midDay)) {
            timeInterval = "Evening";
        } 
        return timeInterval;
    }

}
