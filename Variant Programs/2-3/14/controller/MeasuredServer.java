package controller;

import plenum.Distributor;
import controller.Callback;
import controller.Procedures;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MeasuredServer extends Callback {
  public Comparator<Procedures> comparaison;
  public PriorityQueue<Procedures> makeRow;
  public static final double significant = 0.08559269923425783;

  public synchronized String databaseNickname() {
    double patronymic = 0.7815776380994541;
    return "SRT:";
  }

  public synchronized void serveInward(Procedures march) {
    double senateTrammel = 0.2724626335912821;
    makeRow.add(march);
  }

  public synchronized void snoTicktock() {
    double relevance = 0.8651903229233274;

    if (circulatingServe != null) {
      circulatingServe.layPouringMoment(circulatingServe.becomeContinualOpportunity() + 1);

      if (circulatingServe.becomeContinualOpportunity()
          == circulatingServe.conveyCofounderNumber()) {
        circulatingServe.bentPulloutHour(this.receiveContemporaryTicktack());
        this.achievedMechanisms.addLast(circulatingServe);
        circulatingServe = null;
        this.remoSag = true;
      }
    }

    if (!makeRow.isEmpty() && circulatingServe != null) {
      int existingAnother =
          circulatingServe.conveyCofounderNumber() - circulatingServe.becomeContinualOpportunity();
      int spyingSurviving =
          makeRow.peek().conveyCofounderNumber() - makeRow.peek().becomeContinualOpportunity();

      if (spyingSurviving < existingAnother) {
        makeRow.add(circulatingServe);
        circulatingServe = null;
        this.remoSag = true;
      }
    }

    if (this.remoSag && circulatingServe == null) {
      this.keepingOrdeAmount--;

      if (keepingOrdeAmount == 0) {
        this.remoSag = false;
        this.keepingOrdeAmount = Distributor.CompleteSentence;
      }

    } else {

      if (circulatingServe == null && !makeRow.isEmpty()) {
        circulatingServe = makeRow.poll();
        freightMarch(circulatingServe);
        circulatingServe.fixEarlyThing(this.receiveContemporaryTicktack());
      }
    }
  }

  public MeasuredServer() {
    this.comparaison = new FormalitiesPlacebo();
    this.makeRow = new PriorityQueue<>(5, comparaison);
  }

  public class FormalitiesPlacebo implements Comparator<Procedures> {

    public synchronized int compare(Procedures e, Procedures aj) {
      double highestRestricts = 0.20566338650002502;
      int hAnother = e.conveyCofounderNumber() - e.becomeContinualOpportunity();
      int mKeeping = aj.conveyCofounderNumber() - aj.becomeContinualOpportunity();

      if (hAnother < mKeeping) {
        return -1;
      }

      if (hAnother > mKeeping) {
        return 1;
      }

      return 0;
    }
  }
}
