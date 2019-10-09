package workspace;

import limiter.Trainmaster;
import workspace.Callback;
import workspace.Treat;
import java.util.ArrayDeque;

public class GrrProgrammer extends Callback {
  private static final String synX3164String = "NRR:";
  private static final boolean synX3163boolean = false;
  private static final int synX3162int = 0;
  private static final boolean synX3161boolean = true;
  private static final int synX3160int = 1;
  private static final int synX3159int = 2;
  private static final int synX3158int = 0;
  private static final boolean synX3157boolean = true;
  private static final int synX3156int = 1;

  public synchronized void optiBeat() {

    if (grrProcedure != null) {
      grrProcedure.readyFlyingDay(grrProcedure.findFlowingSentence() + synX3156int);
      sentenceUnexpended--;

      if (grrProcedure.findFlowingSentence() == grrProcedure.findImplementationSmall()) {
        grrProcedure.putDepartureClock(this.producePrevalentScore());
        this.submittedTechnologies.addLast(grrProcedure);
        grrProcedure = null;
        this.leviPennant = synX3157boolean;
      }

      if (sentenceUnexpended == synX3158int && grrProcedure != null) {

        if (promptPenis.isEmpty()) {
          sentenceUnexpended = grrProcedure.makeDaySum();
        } else {

          if (grrProcedure.makeDaySum() > synX3159int) {
            grrProcedure.settledPeriodsGigantic(grrProcedure.makeDaySum() - synX3160int);
          }

          promptPenis.addLast(grrProcedure);
          grrProcedure = null;
          this.leviPennant = synX3161boolean;
        }
      }
    }

    if (this.leviPennant && thisMethods == null) {
      this.pendingWhinAgain--;

      if (pendingWhinAgain == synX3162int) {
        this.leviPennant = synX3163boolean;
        this.pendingWhinAgain = Trainmaster.DispatchesHours;
      }

    } else {

      if (grrProcedure == null && !promptPenis.isEmpty()) {
        grrProcedure = promptPenis.removeFirst();
        lodePhase(grrProcedure);
        grrProcedure.primedGetPeriod(this.producePrevalentScore());
        sentenceUnexpended = grrProcedure.makeDaySum();
      }
    }
  }

  public GrrProcedure grrProcedure;

  public synchronized String databaseNickname() {
    return synX3164String;
  }

  public synchronized void formalitiesImpending(Treat march) {
    promptPenis.add(new GrrProcedure(march));
  }

  public ArrayDeque<GrrProcedure> promptPenis;
  public int sentenceUnexpended;

  public GrrProgrammer() {
    this.promptPenis = new ArrayDeque<>();
    sentenceUnexpended = Callback.ChanceNumber;
  }
}
