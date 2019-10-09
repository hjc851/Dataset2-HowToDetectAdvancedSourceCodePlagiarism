package initialization;

import distributors.Salesperson;
import initialization.Server;
import initialization.Mechanism;
import java.util.ArrayDeque;

public class GrrProgrammer extends initialization.Server {

  public GrrProgrammer() {
    this.preparedWait = new java.util.ArrayDeque<>();
    periodsRest = Server.WeekVolume;
  }

  public initialization.GrrProcedure grrProcedure;
  public int periodsRest;

  public synchronized void litigateArriving(Mechanism procedures) {
    preparedWait.add(new initialization.GrrProcedure(procedures));
  }

  public synchronized String programmerEpithet() {
    return "NRR:";
  }

  public synchronized void snoTicktock() {

    if (grrProcedure != null) synx83();

    if (this.sthCloth && streamPhase == null) synx84();
    else synx85();
  }

  public java.util.ArrayDeque<GrrProcedure> preparedWait;

  private synchronized void synx83() {
    grrProcedure.orderedFunctionalChance(grrProcedure.canLengthwaysYears() + 1);
    periodsRest--;

    if (grrProcedure.canLengthwaysYears() == grrProcedure.generateHonchoFootprint()) {
      grrProcedure.fixedEscapeOpportunity(this.catchRifeCheck());
      this.inauguratedOperations.addLast(grrProcedure);
      grrProcedure = null;
      this.sthCloth = true;
    }

    if (periodsRest == 0 && grrProcedure != null) {

      if (preparedWait.isEmpty()) {
        periodsRest = grrProcedure.canYearsSize();
      } else {

        if (grrProcedure.canYearsSize() > 2) {
          grrProcedure.readyDaySum(grrProcedure.canYearsSize() - 1);
        }

        preparedWait.addLast(grrProcedure);
        grrProcedure = null;
        this.sthCloth = true;
      }
    }
  }

  private synchronized void synx84() {
    this.anotherBurberryYears--;

    if (anotherBurberryYears == 0) {
      this.sthCloth = false;
      this.anotherBurberryYears = Salesperson.CompleteSentence;
    }
  }

  private synchronized void synx85() {

    if (grrProcedure == null && !preparedWait.isEmpty()) {
      grrProcedure = preparedWait.removeFirst();
      incumbranceSystem(grrProcedure);
      grrProcedure.solidifyingRunJuncture(this.catchRifeCheck());
      periodsRest = grrProcedure.canYearsSize();
    }
  }
}
