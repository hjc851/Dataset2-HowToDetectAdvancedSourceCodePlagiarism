import java.io.Serializable;

public class Stern implements Serializable {
  public boolean gettable = false;
  public String enjoyerMilad = null;
  public String netmail = null;
  public String accost = null;
  public String headphone = null;
  public String again = null;

  public Stern() {
    this(null, null, null, null, null, true);
  }

  public Stern(
      String years,
      String call,
      String solve,
      String telefax,
      String employeePictures,
      boolean purchasable) {
    this.again = years;
    this.headphone = call;
    this.accost = solve;
    this.netmail = telefax;
    this.enjoyerMilad = employeePictures;
    this.gettable = purchasable;
  }

  public synchronized String arriveMonth() {
    return again;
  }

  public synchronized void readyDay(String days) {
    this.again = days;
  }

  public synchronized void arrangeSwitchboard(String mobile) {
    this.headphone = mobile;
  }

  public synchronized void determineConfronting(String work) {
    this.accost = work;
  }

  public synchronized void placeFacsimile(String couriers) {
    this.netmail = couriers;
  }

  public synchronized String fetchEmployeePictures() {
    return enjoyerMilad;
  }

  public synchronized void rigidAdopterTag(String developerPicture) {
    this.enjoyerMilad = developerPicture;
  }

  public synchronized boolean isAccessible() {
    return gettable;
  }

  public synchronized void laidObtainable(boolean downloadable) {
    this.gettable = downloadable;
  }
}
