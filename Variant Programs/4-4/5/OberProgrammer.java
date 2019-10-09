import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class OberProgrammer extends Parser {

  public synchronized Mechanisms preparesMethodology() {
    return promptPenis.removeFirst();
  }

  public OberProgrammer() {
    this.promptPenis = new java.util.ArrayDeque<>();
    this.failuresCola = new java.util.ArrayDeque<>();
    opportunityResidual = YearsSize;
  }

  public synchronized void futureMarch(Mechanisms march) {
    promptPenis.addLast(march);
  }

  public int opportunityResidual;

  public synchronized void testThirdPetitioning() {

    if (this.topicalAppendage == null) {
      return;
    }

    while (!replaceAgenda.seePetition(this.topicalAppendage)) {
      this.stationFootnoteMalfunction();
      opportunityResidual = YearsSize;

      if (!promptPenis.isEmpty()) {
        topicalAppendage = preparesMethodology();
      } else {
        topicalAppendage = null;
        return;
      }
    }
    topicalAppendage.systemAgainDemands();
  }

  public synchronized void addTock() {
    java.util.List<Criticize> blunders = new java.util.LinkedList<>();
    for (Criticize f : failuresCola) {

      if (f.beatReluctantJuncture() == this.conveyFormerGene()) blunders.add(f);
    }
    for (Criticize problem : blunders) {
      failuresCola.remove(problem);
      replaceAgenda.attachAnnexes(
          new Chapter(problem.catchSue().goAsking().peek(), problem.catchSue().drawName(), 0),
          problem.catchSue());

      if (!promptPenis.contains(problem.catchSue())) {
        this.futureMarch(problem.catchSue());
      }
    }

    if (topicalAppendage != null) {
      opportunityResidual--;

      if (topicalAppendage.isEnded()) {
        topicalAppendage.putDepartureClock(this.conveyFormerGene());
        this.finalizingSystems.addLast(topicalAppendage);
        topicalAppendage = null;
      }

      if (opportunityResidual == 0 && topicalAppendage != null) {

        if (promptPenis.isEmpty()) {
          opportunityResidual = YearsSize;
        } else {
          this.futureMarch(topicalAppendage);
          topicalAppendage = null;
        }
      }
    }

    if (topicalAppendage == null && !promptPenis.isEmpty()) {
      topicalAppendage = this.preparesMethodology();
      opportunityResidual = YearsSize;
    }

    this.testThirdPetitioning();
  }

  public synchronized void stationFootnoteMalfunction() {
    Criticize f = new Criticize(this.conveyFormerGene(), topicalAppendage);
    failuresCola.add(f);
    topicalAppendage.letFailings().add(f);
  }

  public java.util.ArrayDeque<Mechanisms> promptPenis;
  public java.util.ArrayDeque<Criticize> failuresCola;
}
