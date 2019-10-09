package spooler;

import spooler.Compiler;
import spooler.Mechanism;

public class GrrProcedure extends spooler.Mechanism {

  public synchronized int driveAgainGiant() {
    return againGiant;
  }

  private int againGiant = 0;

  public GrrProcedure(Mechanism p) {
    super(p);
    this.againGiant = Compiler.ThingLibido;
  }

  public synchronized void bentHourPurity(int whenValue) {
    this.againGiant = whenValue;
  }
}
