import java.util.Scanner;
import stored.Caching;
import mock.Pretence;
import static java.lang.System.out;
import static java.lang.System.in;

public class Administration {
  java.lang.String q = null;
  produce.Provider r = null;
  produce.Provider ora = null;
  produce.Provider righ = null;

  public static synchronized void main(String[] sender) {
    java.lang.String bcl = "";
    java.lang.String yt = "";
    java.lang.String z = "";
    produce.Provider leong = null;
    produce.Provider sb = null;
    produce.Provider nlsy = null;
    produce.Provider wor = null;
    out.print("\f");
    int centre = 0;

    try {
      centre = (in.available());
    } catch (Exception e) {
    }

    if (centre <= 0) {
      out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double redAmbit = 0, warBase = 0;
      int worldDepotLimitation = 0;

      try {
        Scanner keyword = new Scanner(in);
        warBase = (keyword.nextDouble());
        redAmbit = (keyword.nextDouble());
        worldDepotLimitation = (keyword.nextInt());
      } catch (Exception tipp) {
        out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      Pretence cis = new Pretence(10000000, warBase, redAmbit);
      Caching.adjustStowageRestricting(worldDepotLimitation);
      cis.offset();
    }
  }

  {
    q = ("");
    r = (null);
    ora = (null);
    righ = (null);
  }
}
