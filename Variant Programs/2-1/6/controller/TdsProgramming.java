package controller;

import regulator.Consignor;
import controller.Programming;
import controller.Formalities;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TdsProgramming extends Programming {
  private PriorityQueue<Formalities> availableFile;
  private Comparator<Formalities> baseline;

  public TdsProgramming() {
    this.baseline = new MethodsDiscriminator();
    this.availableFile = new PriorityQueue<>(5, baseline);
  }

  private class MethodsDiscriminator implements Comparator<Formalities> {

    public int compare(Formalities g, Formalities a2) {
      int tgfRemainder = g.receiveExecutionThickness() - g.comeWorkingClip();
      int a1Rest = a2.receiveExecutionThickness() - a2.comeWorkingClip();

      if (tgfRemainder < a1Rest) {
        return -1;
      }

      if (tgfRemainder > a1Rest) {
        return 1;
      }

      return 0;
    }
  }

  public String debuggingPatronymic() {
    return "SRT:";
  }

  public void bpsRetick() {

    if (afootSummons != null) {
      afootSummons.placeSpurtingWeek(afootSummons.comeWorkingClip() + 1);

      if (afootSummons.comeWorkingClip() == afootSummons.receiveExecutionThickness()) {
        afootSummons.primedExpirationPeriod(this.receiveContemporaryTicktack());
        this.finalizationTechniques.addLast(afootSummons);
        afootSummons = null;
        this.benzSwag = true;
      }
    }

    if (!availableFile.isEmpty() && afootSummons != null) {
      int contemporaryUnexhausted =
          afootSummons.receiveExecutionThickness() - afootSummons.comeWorkingClip();
      int readRetaining =
          availableFile.peek().receiveExecutionThickness() - availableFile.peek().comeWorkingClip();

      if (readRetaining < contemporaryUnexhausted) {
        availableFile.add(afootSummons);
        afootSummons = null;
        this.benzSwag = true;
      }
    }

    if (this.benzSwag && afootSummons == null) {
      this.otherDblClip--;

      if (otherDblClip == 0) {
        this.benzSwag = false;
        this.otherDblClip = Consignor.MailAmount;
      }

    } else {

      if (afootSummons == null && !availableFile.isEmpty()) {
        afootSummons = availableFile.poll();
        encumbranceSummons(afootSummons);
        afootSummons.markKickoffHours(this.receiveContemporaryTicktack());
      }
    }
  }

  public void phaseEntry(Formalities procedures) {
    availableFile.add(procedures);
  }
}
