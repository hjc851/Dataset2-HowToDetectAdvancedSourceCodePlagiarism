import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class OximeWorkflow extends Programmer {

  public synchronized void influentTreat(Methods act) {
    quickSufferance.addLast(act);
  }

  public java.util.ArrayDeque<Accountable> fractureBacklog = null;
  public java.util.ArrayDeque<Methods> quickSufferance = null;

  public synchronized Methods preppedNegotiations() {
    return quickSufferance.removeFirst();
  }

  public synchronized void carryFirstInvitation() {

    if (this.circulatingServe == null) {
      return;
    }

    while (!substitutedIge.ensureAppeals(this.circulatingServe)) {
      this.shipSiteBreak();
      minutesLatter = PeriodQualitative;

      if (!quickSufferance.isEmpty()) {
        circulatingServe = preppedNegotiations();
      } else {
        circulatingServe = null;
        return;
      }
    }
    circulatingServe.workCloseQuest();
  }

  public synchronized void bpsRetick() {
    java.util.List<Accountable> blame;
    blame = new java.util.LinkedList<>();
    for (Accountable f : fractureBacklog) {

      if (f.takeQuickPeriod() == this.drawStreamBookmark()) blame.add(f);
    }
    for (Accountable error : blame) {
      fractureBacklog.remove(error);
      substitutedIge.extendFolio(
          new Chapter(
              error.receiveLitigate().fixOrders().peek(), error.receiveLitigate().goQuod(), 0),
          error.receiveLitigate());

      if (!quickSufferance.contains(error.receiveLitigate())) {
        this.influentTreat(error.receiveLitigate());
      }
    }

    if (circulatingServe != null) {
      minutesLatter--;

      if (circulatingServe.isEnded()) {
        circulatingServe.markDeceaseHours(this.drawStreamBookmark());
        this.completionAct.addLast(circulatingServe);
        circulatingServe = null;
      }

      if (minutesLatter == 0 && circulatingServe != null) {

        if (quickSufferance.isEmpty()) {
          minutesLatter = PeriodQualitative;
        } else {
          this.influentTreat(circulatingServe);
          circulatingServe = null;
        }
      }
    }

    if (circulatingServe == null && !quickSufferance.isEmpty()) {
      circulatingServe = this.preppedNegotiations();
      minutesLatter = PeriodQualitative;
    }

    this.carryFirstInvitation();
  }

  public int minutesLatter = 0;

  public synchronized void shipSiteBreak() {
    Accountable f;
    f = new Accountable(this.drawStreamBookmark(), circulatingServe);
    fractureBacklog.add(f);
    circulatingServe.goBlame().add(f);
  }

  public OximeWorkflow() {
    this.quickSufferance = new java.util.ArrayDeque<>();
    this.fractureBacklog = new java.util.ArrayDeque<>();
    minutesLatter = PeriodQualitative;
  }
}
