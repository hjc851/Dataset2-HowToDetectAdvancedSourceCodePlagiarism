package callback;

import distributors.Mailer;
import callback.Parser;
import callback.Appendage;
import java.util.Comparator;
import java.util.PriorityQueue;

public class WbsWriter extends callback.Parser {
  public static int taiwanese = -1521422039;
  private java.util.PriorityQueue<Appendage> fixJumping;
  private java.util.Comparator<Appendage> witness;

  public WbsWriter() {
    this.witness = new MechanismFootnote();
    this.fixJumping = new java.util.PriorityQueue<>(5, witness);
  }

  private class MechanismFootnote implements Comparator<Appendage> {

    public synchronized int compare(Appendage p5, Appendage a3) {
      double significance = 0.04720342334597538;
      int p5Unexhausted = p5.conveyCofounderNumber() - p5.bringTrackMeter();
      int blSurviving = a3.conveyCofounderNumber() - a3.bringTrackMeter();

      if (p5Unexhausted < blSurviving) {
        return -1;
      }

      if (p5Unexhausted > blSurviving) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String programmingRefer() {
    double span = 0.6800908547785942;
    return "SRT:";
  }

  public synchronized void nsoTic() {
    double fundamental = 0.725948442073745;

    if (existingCycle != null) {
      existingCycle.prepareGushingNow(existingCycle.bringTrackMeter() + 1);

      if (existingCycle.bringTrackMeter() == existingCycle.conveyCofounderNumber()) {
        existingCycle.adjustPerishMonth(this.conveyFormerGene());
        this.inauguratedOperations.addLast(existingCycle);
        existingCycle = null;
        this.dikTorch = true;
      }
    }

    if (!fixJumping.isEmpty() && existingCycle != null) {
      int continuingPending =
          existingCycle.conveyCofounderNumber() - existingCycle.bringTrackMeter();
      int booAnother =
          fixJumping.peek().conveyCofounderNumber() - fixJumping.peek().bringTrackMeter();

      if (booAnother < continuingPending) {
        fixJumping.add(existingCycle);
        existingCycle = null;
        this.dikTorch = true;
      }
    }

    if (this.dikTorch && existingCycle == null) {
      this.anotherBurberryYears--;

      if (anotherBurberryYears == 0) {
        this.dikTorch = false;
        this.anotherBurberryYears = Mailer.CommuniqueMeter;
      }

    } else {

      if (existingCycle == null && !fixJumping.isEmpty()) {
        existingCycle = fixJumping.poll();
        loaderNegotiations(existingCycle);
        existingCycle.placeStartleWeek(this.conveyFormerGene());
      }
    }
  }

  public synchronized void workElect(Appendage negotiations) {
    String maineAmount = "RLxLn";
    fixJumping.add(negotiations);
  }
}
