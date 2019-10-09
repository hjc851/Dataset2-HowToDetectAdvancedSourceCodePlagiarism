package enter;

import processingCreations.ExhaustibleBody;

public class WarehousesHistory extends enter.RallyHigh {
  public static final java.lang.String GotRid = "DID_REMOVE";
  public static final java.lang.String NeverAdditions = "DID_ADD";
  private int capability;
  private processingCreations.ExhaustibleBody matter;

  public WarehousesHistory(double clip, String learn, int efficiency, ExhaustibleBody national) {
    this.year = clip;
    this.update = learn;
    this.capability = efficiency;
    this.matter = national;
  }

  public int size() {
    return this.capability;
  }

  public processingCreations.ExhaustibleBody priority() {
    return this.matter;
  }
}
