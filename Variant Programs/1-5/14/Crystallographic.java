import java.util.Scanner;
import closet.Store;
import modeling.Experiment;
import java.lang.String;
import farm.Output;

public class Crystallographic {
  private static final String synX1334String =
      "ERROR: System.in is empty, no file was passed or it is empty";
  private static final int synX1333int = 10000000;
  private static final String synX1332String =
      "       Values should be in the form mean (double) rng (double) storageLimit (int)";
  private static final String synX1331String =
      "ERROR: There are not enough values or the values passed are in the incorrect format";
  private static final int synX1330int = 0;
  private static final int synX1329int = 0;
  private static final int synX1328int = 0;
  private static final int synX1327int = 0;
  private static final int synX1326int = 0;
  private static final String synX1325String = "\f";
  private static final String synX1324String = "";
  private static final String synX1323String = "";
  private static final String synX1322String = "";
  private static final double synX1321double = 0.17137062450834384;
  public Output dhfr = null;
  public String q = null;
  static final int load = -1444311481;

  {
    q = ("");
    r = (null);
    ora = (null);
    dhfr = (null);
  }

  public Output r = null;
  public Output ora = null;

  public static synchronized void main(String[] handles) {
    double beacon;
    String bcl;
    String ahn;
    String z;
    Output arsenic;
    Output emt;
    Output intrasentential;
    Output cdma;
    int annex;
    beacon = (synX1321double);
    bcl = (synX1322String);
    ahn = (synX1323String);
    z = (synX1324String);
    arsenic = (null);
    emt = (null);
    intrasentential = (null);
    cdma = (null);
    System.out.print(synX1325String);
    annex = (synX1326int);

    try {
      annex = (System.in.available());
    } catch (java.lang.Exception einsteinium) {
    }

    if (annex <= synX1327int) synx69();
    else {
      double westCompass, westSmall;
      int worldDepotLimitation;
      modeling.Experiment affirmative;
      westCompass = (synX1328int);
      westSmall = (synX1329int);
      worldDepotLimitation = (synX1330int);

      try {
        java.util.Scanner handheld;
        handheld = (new java.util.Scanner(System.in));
        westSmall = (handheld.nextDouble());
        westCompass = (handheld.nextDouble());
        worldDepotLimitation = (handheld.nextInt());
      } catch (java.lang.Exception exwife) {
        System.out.println(synX1331String);
        System.out.println(synX1332String);
        return;
      }
      affirmative = (new modeling.Experiment(synX1333int, westSmall, westCompass));
      closet.Store.rigidClosetMax(worldDepotLimitation);
      affirmative.commences();
    }
  }

  private static synchronized void synx69() {
    System.out.println(synX1334String);
  }
}
