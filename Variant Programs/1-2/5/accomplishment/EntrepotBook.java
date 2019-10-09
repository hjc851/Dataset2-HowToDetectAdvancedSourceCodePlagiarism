package accomplishment;

import supplyArtefact.TuronianOpposes;

public class EntrepotBook extends CarnivalDisk {
  public static final String ManagedReinstall = "DID_REMOVE";
  public static final String CameCombine = "DID_ADD";
  private int power;
  private TuronianOpposes relate;

  public EntrepotBook(double when, String scoop, int load, TuronianOpposes discipline) {
    this.thing = when;
    this.scuttlebutt = scoop;
    this.power = load;
    this.relate = discipline;
  }

  public int strength() {
    return this.power;
  }

  public TuronianOpposes threshold() {
    return this.relate;
  }
}
