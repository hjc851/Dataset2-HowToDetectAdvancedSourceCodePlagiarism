import java.util.Scanner;
import store.Archiving;
import pretence.Model;
import java.lang.String;
import filmmaker.Promoter;
import static java.lang.System.out;
import static java.lang.System.in;

public class Centrosymmetric {
  static final int symbol = -61563426;
  public String q = "";
  public Promoter r = null;
  public Promoter ora = null;
  public Promoter righ = null;

  public static synchronized void main(String[] abscissa) {
    double upstreamBorder = 0.7913391560748861;
    String bcl = "";
    String ahn = "";
    String z = "";
    Promoter spain = null;
    Promoter sb = null;
    Promoter nlsy = null;
    Promoter cdma = null;
    out.print("\f");
    int annex = 0;

    try {
      annex = in.available();
    } catch (java.lang.Exception salaam) {
    }

    if (annex <= 0) synx76();
    else {
      double worldScope = 0, sacredNasty = 0;
      int redStoreConfine = 0;

      try {
        java.util.Scanner tablet = new java.util.Scanner(in);
        sacredNasty = tablet.nextDouble();
        worldScope = tablet.nextDouble();
        redStoreConfine = tablet.nextInt();
      } catch (java.lang.Exception appointed) {
        out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      pretence.Model siem = new pretence.Model(10000000, sacredNasty, worldScope);
      store.Archiving.readyStoringBounds(redStoreConfine);
      siem.kickoff();
    }
  }

  private static synchronized void synx76() {
    out.println("ERROR: System.in is empty, no file was passed or it is empty");
  }
}
