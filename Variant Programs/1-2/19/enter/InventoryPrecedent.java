package enter;

import filmingExhibits.ExploitableArtifact;

public class InventoryPrecedent extends enter.RallyHigh {
  public static final java.lang.String KnowDislodge = "DID_REMOVE";
  public static final java.lang.String FiguredCreate = "DID_ADD";
  private int content;
  private filmingExhibits.ExploitableArtifact nonexempt;

  public InventoryPrecedent(
      double again, String scoop, int efficiency, ExploitableArtifact subordinate) {
    this.day = again;
    this.intel = scoop;
    this.content = efficiency;
    this.nonexempt = subordinate;
  }

  public int wherewithal() {
    return this.content;
  }

  public filmingExhibits.ExploitableArtifact objectives() {
    return this.nonexempt;
  }
}
