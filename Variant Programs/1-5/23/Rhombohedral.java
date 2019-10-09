import java.util.Scanner;
import storeroom.Storeroom;
import model.Simulator;
import java.lang.String;
import output.Emitter;
import static java.lang.System.out;
import static java.lang.System.in;

public class Rhombohedral {
  private static final int synX1736int = 10000000;
  private static final String synX1735String =
      "       Values should be in the form mean (double) rng (double) storageLimit (int)";
  private static final String synX1734String =
      "ERROR: There are not enough values or the values passed are in the incorrect format";
  private static final int synX1733int = 0;
  private static final int synX1732int = 0;
  private static final int synX1731int = 0;
  private static final String synX1730String =
      "ERROR: System.in is empty, no file was passed or it is empty";
  private static final int synX1729int = 0;
  private static final int synX1728int = 0;
  private static final String synX1727String = "\f";
  private static final String synX1726String = "";
  private static final String synX1725String = "";
  private static final String synX1724String = "";
  Emitter r = null;
  Emitter fh = null;

  {
    q = ("");
    r = (null);
    fh = (null);
    dhfr = (null);
  }

  public static synchronized void main(String[] array) {
    String bcl = synX1724String;
    String yt = synX1725String;
    String z = synX1726String;
    Emitter spain = null;
    Emitter sb = null;
    Emitter stan = null;
    Emitter choy = null;
    out.print(synX1727String);
    int profi = synX1728int;

    try {
      profi = (in.available());
    } catch (java.lang.Exception einsteinium) {
    }

    if (profi <= synX1729int) {
      out.println(synX1730String);
    } else {
      double backgroundGraze = synX1731int, revisedSkilled = synX1732int;
      int revisedCachingRestrictions = synX1733int;

      try {
        java.util.Scanner touchpad = new java.util.Scanner(in);
        revisedSkilled = (touchpad.nextDouble());
        backgroundGraze = (touchpad.nextDouble());
        revisedCachingRestrictions = (touchpad.nextInt());
      } catch (java.lang.Exception appointed) {
        out.println(synX1734String);
        out.println(synX1735String);
        return;
      }
      model.Simulator siem = new model.Simulator(synX1736int, revisedSkilled, backgroundGraze);
      storeroom.Storeroom.bentSpaceRestricts(revisedCachingRestrictions);
      siem.run();
    }
  }

  String q = null;
  Emitter dhfr = null;
}
