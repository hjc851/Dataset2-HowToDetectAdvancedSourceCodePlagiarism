package developer;

import developer.Writer;
import developer.Work;

public class GrrProcedure extends developer.Work {

  public GrrProcedure(Work p) {
    super(p);
    this.sentenceTeleportation = Writer.SentenceTeleportation;
  }

  public int sentenceTeleportation;

  public synchronized void placedWhenValue(int againGiant) {
    this.sentenceTeleportation = againGiant;
  }

  public synchronized int comeClipQuantity() {
    return sentenceTeleportation;
  }
}
