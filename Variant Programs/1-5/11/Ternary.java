import java.util.Scanner;
import storehouse.Closet;
import realism.Stimulation;
import java.lang.String;
import supplier.Farm;
import static java.lang.System.out;
import static java.lang.System.in;

public class Ternary {
  public String q = null;
  public Farm r = null;
  public Farm fh = null;
  public Farm dhfr = null;

  public static synchronized void main(String[] string) {
    String bcl = "";
    String ahn = "";
    String z = "";
    Farm spain = null;
    Farm scud = null;
    Farm cmu = null;
    Farm echt = null;
    out.print("\f");
    int add = 0;

    try {
      add = in.available();
    } catch (java.lang.Exception salaam) {
    }

    if (add <= 0) {
      out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double recommendedChain = 0, proposedIntend = 0;
      int firstStorehouseRestrict = 0;

      try {
        java.util.Scanner pad = new java.util.Scanner(in);
        proposedIntend = pad.nextDouble();
        recommendedChain = pad.nextDouble();
        firstStorehouseRestrict = pad.nextInt();
      } catch (java.lang.Exception exwife) {
        out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      realism.Stimulation favour =
          new realism.Stimulation(10000000, proposedIntend, recommendedChain);
      storehouse.Closet.markWarehousingRestriction(firstStorehouseRestrict);
      favour.initiate();
    }
  }

  {
    q = "";
    r = null;
    fh = null;
    dhfr = null;
  }
}
