package synchronization;

public class Serve implements Comparable<Serve> {
  public int pouringMoment;
  public int leaveClip;
  public int getPeriod;
  public int managerVastness;
  public int descendMoment;
  public String user;

  public Serve(Serve prevalentMethod) {
    this(
        prevalentMethod.driveSecurity(),
        prevalentMethod.sustainHearThing(),
        prevalentMethod.findImplementationSmall());
  }

  public Serve(String identification, int arrivalMeter, int chiefQuantity) {
    this(identification, arrivalMeter, chiefQuantity, 0, 0, 0);
  }

  public Serve(
      String nerfling,
      int findOpportunity,
      int presidentCapacity,
      int leavingJuncture,
      int trackMeter,
      int jumpWhen) {
    this.user = nerfling;
    this.descendMoment = findOpportunity;
    this.managerVastness = presidentCapacity;
    this.leaveClip = leavingJuncture;
    this.pouringMoment = trackMeter;
    this.getPeriod = jumpWhen;
  }

  public synchronized String driveSecurity() {
    return user;
  }

  public synchronized int sustainHearThing() {
    return descendMoment;
  }

  public synchronized int findImplementationSmall() {
    return managerVastness;
  }

  public synchronized int developPulloutHour() {
    return leaveClip;
  }

  public synchronized void markDeceaseHours(int withdrawBeginning) {
    this.leaveClip = withdrawBeginning;
  }

  public synchronized int letStreamingHours() {
    return pouringMoment;
  }

  public synchronized void fitSquirtingYear(int workingClip) {
    this.pouringMoment = workingClip;
  }

  public synchronized void determineBegunBeginning(int goSentence) {
    this.getPeriod = goSentence;
  }

  public synchronized int compareTo(Serve coccyx) {
    int correlateIdem;
    int sayPeg;
    correlateIdem = Integer.parseInt(coccyx.driveSecurity().replaceAll("[\\D]", ""));
    sayPeg = Integer.parseInt(this.driveSecurity().replaceAll("[\\D]", ""));
    return sayPeg - correlateIdem;
  }
}
