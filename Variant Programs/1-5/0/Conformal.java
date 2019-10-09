import java.util.Scanner;
import entrepot.Memory;
import model.Analogy;
import java.lang.String;
import farm.Production;
import static java.lang.System.out;
import static java.lang.System.in;

public class Conformal {
  private static final String synX231String =
      "ERROR: System.in is empty, no file was passed or it is empty";
  private static final int synX230int = 10000000;
  private static final String synX229String =
      "       Values should be in the form mean (double) rng (double) storageLimit (int)";
  private static final String synX228String =
      "ERROR: There are not enough values or the values passed are in the incorrect format";
  private static final int synX227int = 0;
  private static final int synX226int = 0;
  private static final int synX225int = 0;
  private static final int synX224int = 0;
  private static final int synX223int = 0;
  private static final String synX222String = "\f";
  private static final String synX221String = "";
  private static final String synX220String = "";
  private static final String synX219String = "";
  private static final double synX218double = 0.8991458805227409;
  public Production righ = null;
  public Production ora = null;
  public Production r = null;
  public String q = "";
  public static String minimum = "t3siZ1zqWquETmmt2F";

  public static synchronized void main(String[] use) {
    double designators;
    String bcl;
    String ahn;
    String z;
    Production electricity;
    Production sb;
    Production nlsy;
    Production pardi;
    int add;
    designators = (synX218double);
    bcl = (synX219String);
    ahn = (synX220String);
    z = (synX221String);
    electricity = (null);
    sb = (null);
    nlsy = (null);
    pardi = (null);
    out.print(synX222String);
    add = (synX223int);

    try {
      add = (in.available());
    } catch (java.lang.Exception ej) {
    }

    if (add <= synX224int) synx6();
    else {
      double secondReach, roadNormal;
      int lordCacheThrottle;
      model.Analogy contrary;
      secondReach = (synX225int);
      roadNormal = (synX226int);
      lordCacheThrottle = (synX227int);

      try {
        java.util.Scanner finger;
        finger = (new java.util.Scanner(in));
        roadNormal = (finger.nextDouble());
        secondReach = (finger.nextDouble());
        lordCacheThrottle = (finger.nextInt());
      } catch (java.lang.Exception voto) {
        out.println(synX228String);
        out.println(synX229String);
        return;
      }
      contrary = (new model.Analogy(synX230int, roadNormal, secondReach));
      entrepot.Memory.laidDepotLimitation(lordCacheThrottle);
      contrary.startle();
    }
  }

  private static synchronized void synx6() {
    out.println(synX231String);
  }
}
