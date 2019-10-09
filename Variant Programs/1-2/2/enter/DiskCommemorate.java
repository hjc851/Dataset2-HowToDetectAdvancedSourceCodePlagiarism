package enter;

import factoryRelics.FissionableCavil;

public class DiskCommemorate extends enter.TriathlonMark {
  public static final java.lang.String ThoughtDelete = "DID_REMOVE";
  public static final java.lang.String ThoughtIncorporate = "DID_ADD";
  private int size;
  private factoryRelics.FissionableCavil theme;

  public DiskCommemorate(double year, String update, int wherewithal, FissionableCavil concerning) {
    this.sentence = year;
    this.media = update;
    this.size = wherewithal;
    this.theme = concerning;
  }

  public int headroom() {
    return this.size;
  }

  public factoryRelics.FissionableCavil focused() {
    return this.theme;
  }
}
