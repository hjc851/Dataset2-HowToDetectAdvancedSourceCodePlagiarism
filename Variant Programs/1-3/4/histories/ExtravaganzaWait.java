package histories;

import stowage.ConsultedAgenda;

public class ExtravaganzaWait {
  private ConsultedAgenda<PresenterSymposium> extravaganzaName;
  private static ExtravaganzaWait contemporaryList;

  public static synchronized ExtravaganzaWait presentlyPecker() {
    return contemporaryList;
  }

  public ExtravaganzaWait() {
    this.extravaganzaName = new ConsultedAgenda<PresenterSymposium>();
    contemporaryList = this;
  }

  public synchronized void installCeremonies(PresenterSymposium revolutionaryVenue) {
    this.extravaganzaName.introduce(revolutionaryVenue);
  }

  public synchronized PresenterSymposium upcomingCarnival() {
    return this.extravaganzaName.ridOutset();
  }

  public synchronized PresenterSymposium cheatingAfter() {
    return this.extravaganzaName.oldestResist();
  }

  public synchronized int figures() {
    return this.extravaganzaName.get();
  }

  public synchronized String toString() {
    return this.extravaganzaName.toString();
  }
}
