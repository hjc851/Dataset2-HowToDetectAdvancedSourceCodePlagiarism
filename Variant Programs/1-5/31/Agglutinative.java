import java.util.Scanner;
import depot.Stored;
import simulated.Emulation;
import static java.lang.System.out;
import static java.lang.System.in;

public class Agglutinative {
  public producing.Supplier dhfr = null;
  public producing.Supplier r = null;
  public java.lang.String q = "";
  public producing.Supplier fh = null;

  public static synchronized void main(String[] ing) {
    java.lang.String bcl = "";
    java.lang.String yt = "";
    java.lang.String z = "";
    producing.Supplier arsenic = null;
    producing.Supplier scud = null;
    producing.Supplier cmu = null;
    producing.Supplier pardi = null;
    out.print("\f");
    int ay = 0;

    try {
      ay = (in.available());
    } catch (Exception e) {
    }

    if (ay <= 0) synx132();
    else {
      double revisedOrbit = 0, redThink = 0;
      int endSafekeepingCurb = 0;

      try {
        Scanner typing = new Scanner(in);
        redThink = (typing.nextDouble());
        revisedOrbit = (typing.nextDouble());
        endSafekeepingCurb = (typing.nextInt());
      } catch (Exception exwife) {
        out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      Emulation mackay = new Emulation(10000000, redThink, revisedOrbit);
      Stored.determinedStoredBoundary(endSafekeepingCurb);
      mackay.part();
    }
  }

  private static synchronized void synx132() {
    out.println("ERROR: System.in is empty, no file was passed or it is empty");
  }
}
