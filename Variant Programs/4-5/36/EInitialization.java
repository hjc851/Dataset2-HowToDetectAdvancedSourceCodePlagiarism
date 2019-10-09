import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class EInitialization extends Workflow {

  public synchronized void testThirdPetitioning() {

    if (this.formerFormalities == null) {
      return;
    }

    while (!substitutedIge.ensureAppeals(this.formerFormalities)) {
      this.carryAnnexesGlitch();
      yearsAnother = (DaysQuantitative);

      if (!happyStopper.isEmpty()) {
        formerFormalities = (primedProcedure());
      } else {
        formerFormalities = (null);
        return;
      }
    }
    formerFormalities.phaseSoonComplaint();
  }

  public synchronized void nbsClick() {
    List<Carelessness> demerit = new LinkedList<>();
    for (Carelessness f : mistakeWait) {

      if (f.goPrimedClock() == this.conveyFormerGene()) demerit.add(f);
    }
    for (Carelessness malfunction : demerit) {
      mistakeWait.remove(malfunction);
      substitutedIge.enhanceFront(
          new Addendum(
              malfunction.comeOperation().developRequisitions().peek(),
              malfunction.comeOperation().obtainEst(),
              0),
          malfunction.comeOperation());

      if (!happyStopper.contains(malfunction.comeOperation())) {
        this.outboundProceeding(malfunction.comeOperation());
      }
    }

    if (formerFormalities != null) {
      yearsAnother--;

      if (formerFormalities.isEnded()) {
        formerFormalities.rigidQuittingAmount(this.conveyFormerGene());
        this.concludedPractices.addLast(formerFormalities);
        formerFormalities = (null);
      }

      if (yearsAnother == 0 && formerFormalities != null) {

        if (happyStopper.isEmpty()) {
          yearsAnother = (DaysQuantitative);
        } else {
          this.outboundProceeding(formerFormalities);
          formerFormalities = (null);
        }
      }
    }

    if (formerFormalities == null && !happyStopper.isEmpty()) {
      formerFormalities = (this.primedProcedure());
      yearsAnother = (DaysQuantitative);
    }

    this.testThirdPetitioning();
  }

  public synchronized Sue primedProcedure() {
    return happyStopper.removeFirst();
  }

  public EInitialization() {
    this.happyStopper = (new ArrayDeque<>());
    this.mistakeWait = (new ArrayDeque<>());
    yearsAnother = (DaysQuantitative);
  }

  public synchronized void carryAnnexesGlitch() {
    Carelessness f = new Carelessness(this.conveyFormerGene(), formerFormalities);
    mistakeWait.add(f);
    formerFormalities.comeMistake().add(f);
  }

  public int yearsAnother = 0;
  public ArrayDeque<Sue> happyStopper = null;
  public ArrayDeque<Carelessness> mistakeWait = null;

  public synchronized void outboundProceeding(Sue phase) {
    happyStopper.addLast(phase);
  }
}
