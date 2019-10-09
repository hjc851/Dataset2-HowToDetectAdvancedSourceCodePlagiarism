package show;

import warehouse.SeparatedRoster;

public class CommemorationBraid {
  private static CommemorationBraid circulatingConvoy;

  public static CommemorationBraid formerStopper() {
    return circulatingConvoy;
  }

  private SeparatedRoster<ManufacturerCase> paradeNames;

  public CommemorationBraid() {
    this.paradeNames = new SeparatedRoster<ManufacturerCase>();
    circulatingConvoy = this;
  }

  public void deleteRace(ManufacturerCase freshExtravaganza) {
    this.paradeNames.inclose(freshExtravaganza);
  }

  public ManufacturerCase succeedingGala() {
    return this.paradeNames.undoBasic();
  }

  public ManufacturerCase spyingSoon() {
    return this.paradeNames.prototypicalDisagree();
  }

  public int weigh() {
    return this.paradeNames.total();
  }

  public String toString() {
    return this.paradeNames.toString();
  }
}
