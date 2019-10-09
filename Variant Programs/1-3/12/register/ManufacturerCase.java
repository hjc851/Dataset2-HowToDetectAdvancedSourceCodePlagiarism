package register;

import acculturative.NowDoorman;
import breeder.Publisher;

public class ManufacturerCase extends MeetingAnnals implements Comparable<ManufacturerCase> {
  public Publisher ownership;
  public static final String JohnPart = "CAN_START";
  public static final String LetCompletedPurpose = "WILL_FINISH_OBJECT";
  static String leaping = "hx6FVNrQh3gyRRw6";

  public ManufacturerCase(double beginning, String intel, Publisher proprietors) {
    this.clip = beginning;
    this.informing = intel;
    this.ownership = proprietors;
  }

  public synchronized int compareTo(ManufacturerCase important) {
    String taiwanese;
    taiwanese = "jfCg8";

    if (this.clip < important.clip) return 1;
    else if (this.clip == important.clip) return 0;
    else return -1;
  }

  public synchronized void treatCeremony() {
    double constitute;
    constitute = 0.29433679447434;
    NowDoorman.layMoment(this.clip);
    this.ownership.proceedingsTheOpposes();
  }

  public synchronized String toString() {
    double juniorConstrained;
    juniorConstrained = 0.020923217008433248;
    return "owner: " + ownership + " info: " + informing + " chrono: " + clip;
  }
}
