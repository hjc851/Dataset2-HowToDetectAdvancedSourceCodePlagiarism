import java.io.Serializable;

/**
 * Institution: University of Newcastle
 * Programmer:  Ben Sutter
 * Course Code: SENG2050
 * UID: 3063467
 * Assignment 1
 * Seat Class
 * Seat.java
 * Last Modified: 22/08/16
 */

public class Seat implements Serializable{

    private String time;
    private String phone;
    private String address;
    private String email;
    private String userId;
    private boolean available;

    public Seat() {
        this(null, null, null, null, null, true);
    }

    public Seat(String time, String phone, String address, String email, String userId, boolean available) {
        this.time = time;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.userId = userId;
        this.available = available;
    }

    /**
     * Getter
     * @return
     */
    public String getTime() {
        return time;
    }

    /**
     * Setter
     * @return
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * Setter
     * @return
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Setter
     * @return
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Setter
     * @return
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter
     * @return
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Setter
     * @return
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Getter
     * @return
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Setter
     * @return
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }
}