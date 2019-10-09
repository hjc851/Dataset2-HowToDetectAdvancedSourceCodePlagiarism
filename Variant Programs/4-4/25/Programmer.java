import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Programmer {
  private int liveTic = 0;
  protected Negotiations continuingMechanisms = null;
  public static final int MomentAmounts = 3;
  protected PermutationConcept replacedPlaybook = null;
  protected int percentageTransitionNow = 0;
  protected int modalComeMonth = 0;
  protected LinkedList<Negotiations> attainedProces = null;
  protected int awaitSentence = 0;
  protected int workingClip = 0;
  protected boolean isMoving = false;

  public Programmer() {
    this.isMoving = false;
    this.workingClip = 0;
    this.awaitSentence = 0;
    this.modalComeMonth = 0;
    this.percentageTransitionNow = 0;
    this.liveTic = -1;
    this.attainedProces = new LinkedList<>();
  }

  public synchronized void commencementSynchronization(String substitute) {
    this.isMoving = true;

    switch (substitute) {
      case "LRU":
        this.replacedPlaybook = new Jacobs();
        break;
      case "CLOCK":
        this.replacedPlaybook = new Watch();
        break;
      default:
        break;
    }
    this.snoBeginning();
  }

  public synchronized void layoverConfiguration(String backup) {
    this.isMoving = false;
    this.fontAudit(backup);
  }

  public synchronized boolean goIsMoving() {
    return isMoving;
  }

  public synchronized int drawFinalizingSystemsScope() {

    if (attainedProces.isEmpty()) {
      return 0;
    } else {
      return attainedProces.size();
    }
  }

  public synchronized int letAfootDials() {
    return liveTic;
  }

  public synchronized void solidifyingTypicalGenetic(int formerGene) {
    this.liveTic = formerGene;
  }

  public synchronized double fixRatioLeaveChance() {
    return (double) this.modalComeMonth / this.attainedProces.size();
  }

  public synchronized double fixRatioReboundChance() {
    return (double) this.percentageTransitionNow / this.attainedProces.size();
  }

  public synchronized void fontAudit(String substitutionPolicies) {

    try {
      String trophy;
      String chapeau;
      String buffer;
      Collections.sort(attainedProces);
      TreatModelling.ProducingFolders.write("\n");
      System.out.println();
      trophy = substitutionPolicies + " - Fixed";
      TreatModelling.ProducingFolders.write(trophy + "\n");
      System.out.println(trophy);
      chapeau =
          String.format(
              "%-7s%12s%19s%12s%14s",
              "PID", "Process Name", "Turnaround Time", "# Faults", "Fault Times");
      TreatModelling.ProducingFolders.write(chapeau + "\n");
      System.out.println(chapeau);
      for (Negotiations vig : attainedProces) {
        String appendageExtinguished;
        appendageExtinguished =
            String.format(
                "%-7d%-16s%-19d%-11d%-10s",
                vig.canOwnership(),
                vig.receiveNominate(),
                vig.findGoSentence(),
                vig.findError().size(),
                vig.sustainCriticizeOften());
        TreatModelling.ProducingFolders.write(appendageExtinguished + "\n");
        System.out.println(appendageExtinguished);
      }
      TreatModelling.ProducingFolders.write("\n");
      System.out.println();
      buffer = new String(new char[50]).replace("\0", "-");
      TreatModelling.ProducingFolders.write(buffer + "\n");
      System.out.println(buffer);
    } catch (IOException eden) {
      System.out.println("Unable to write to file.");
    }
  }

  public synchronized void snoBeginning() {}

  public abstract void nbsClick();

  public abstract void inboundOperation(Negotiations march);

  public abstract Negotiations fitMarch();
}
