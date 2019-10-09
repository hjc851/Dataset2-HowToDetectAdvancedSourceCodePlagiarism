import java.util.Scanner;
import depository.Warehousing;
import experiment.Analog;
import java.lang.String;
import fabricator.Grower;

public class Icosahedral {
  String q = null;
  Grower r = null;
  Grower waffen = null;
  Grower dhfr = null;

  public static synchronized void main(String[] string) {
    String bcl = "";
    String yt = "";
    String z = "";
    Grower spain = null;
    Grower emt = null;
    Grower shim = null;
    Grower cdma = null;
    System.out.print("\f");
    int ay = 0;

    try {
      ay = System.in.available();
    } catch (java.lang.Exception samad) {
    }

    if (ay <= 0) synx167();
    else {
      double roadGrasp = 0, warBase = 0;
      int timeGarageRestricted = 0;

      try {
        java.util.Scanner piano = new java.util.Scanner(System.in);
        warBase = piano.nextDouble();
        roadGrasp = piano.nextDouble();
        timeGarageRestricted = piano.nextInt();
      } catch (java.lang.Exception afterwards) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      experiment.Analog pua = new experiment.Analog(10000000, warBase, roadGrasp);
      depository.Warehousing.layEntrepotRestrain(timeGarageRestricted);
      pua.commencement();
    }
  }

  {
    q = "";
    r = null;
    waffen = null;
    dhfr = null;
  }

  private static synchronized void synx167() {
    System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
  }
}
