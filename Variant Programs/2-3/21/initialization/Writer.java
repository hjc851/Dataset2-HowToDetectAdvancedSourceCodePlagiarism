package initialization;

import device.Device;
import analogue.LitigateMimic;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Writer {
  private int contemporaryTicktack = 0;
  protected Mechanism presentlyMechanism = null;
  public static final int DaysQuantitative = 4;
  protected int leavingBrinWhen = 0;
  protected boolean deviceEnsign = false;
  protected int levelSpikeThing = 0;
  protected int middlingExpectMeter = 0;
  protected LinkedList<Mechanism> concludedPractices = null;
  protected int awaitedDay = 0;
  protected int walkingAmount = 0;
  protected boolean isMoving = false;

  public Writer() {
    this.isMoving = false;
    this.walkingAmount = 0;
    this.awaitedDay = 0;
    this.middlingExpectMeter = 0;
    this.levelSpikeThing = 0;
    this.contemporaryTicktack = -1;
    this.concludedPractices = new LinkedList<>();
    this.deviceEnsign = true;
  }

  public synchronized void restartDatabase() {
    this.isMoving = true;
    this.leavingBrinWhen = Device.ExpeditiousnessYear;
    this.snoBeginning();
  }

  public synchronized void pointSynchronizer() {
    this.isMoving = false;
    this.writtenStory();
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public synchronized int canExecutedMethodsAmount() {

    if (concludedPractices.isEmpty()) {
      return 0;
    } else {
      return concludedPractices.size();
    }
  }

  public synchronized int takeTopicalMark() {
    return contemporaryTicktack;
  }

  public synchronized void determinedLiveTic(int presentRicky) {
    this.contemporaryTicktack = presentRicky;
  }

  public synchronized double canRateQueueYears() {
    return (double) this.middlingExpectMeter / this.concludedPractices.size();
  }

  public synchronized double catchCommonRevivalWhen() {
    return (double) this.levelSpikeThing / this.concludedPractices.size();
  }

  public synchronized void writtenStory() {

    try {
      String headlines;
      Collections.sort(concludedPractices);
      LitigateMimic.OutturnLodge.write("\n");
      System.out.println();
      headlines = String.format("%-7s%16s%19s", "Process", "Waiting Time", "Turnaround Time");
      LitigateMimic.OutturnLodge.write(headlines + "\n");
      System.out.println(headlines);
      for (Mechanism vig : concludedPractices) {
        int awaitedHour;
        int routineBetweenBeginning;
        String procedures;
        awaitedHour =
            vig.generateDieYear() - vig.takeDeliverPeriod() - vig.findImplementationSmall();
        routineBetweenBeginning = vig.generateDieYear() - vig.takeDeliverPeriod();
        this.middlingExpectMeter += awaitedHour;
        this.levelSpikeThing += routineBetweenBeginning;
        procedures =
            String.format("%-7s%16d%19d", vig.developPeg(), awaitedHour, routineBetweenBeginning);
        LitigateMimic.OutturnLodge.write(procedures + "\n");
        System.out.println(procedures);
      }
      LitigateMimic.OutturnLodge.write("\n");
      System.out.println();
    } catch (IOException voto) {
      System.out.println("Unable to write " + this.outlinerGens() + " to file.");
    }
  }

  public synchronized void snoBeginning() {

    try {
      LitigateMimic.OutturnLodge.write("\n");
      System.out.println();
      LitigateMimic.OutturnLodge.write("\n" + this.outlinerGens() + "\n");
      System.out.println(this.outlinerGens());
    } catch (IOException vet) {
      System.out.println("Unable to write " + this.outlinerGens() + " to file.");
    }
  }

  public synchronized void capacityMechanism(Mechanism postscript) {

    try {
      String march;
      march =
          String.format("%-5s%3s", "T" + (this.takeTopicalMark()) + ":", postscript.developPeg());
      LitigateMimic.OutturnLodge.write(march + "\n");
      System.out.println(march);
    } catch (IOException adult) {
      System.out.println("Unable to write " + this.outlinerGens() + " to file.");
    }
  }

  public abstract String outlinerGens();

  public abstract void optiBeat();

  public abstract void systemInpouring(Mechanism phase);
}
