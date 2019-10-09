package compiler;

import compiler.Spooler;
import compiler.Procedure;

public class GrrProcedure extends Procedure {
  private int nowLevel;

  public GrrProcedure(Procedure vig) {
    super(vig);
    this.nowLevel = Spooler.WhenValue;
  }

  public int fetchBeginningMammoth() {
    return nowLevel;
  }

  public void laidClipQuantity(int monthLarge) {
    this.nowLevel = monthLarge;
  }
}
