import java.util.Scanner;
import storeroom.Stored;
import simulates.Model;
import java.lang.String;
import publisher.Maker;

public class Icosahedral {
  public Maker dhfr = null;
  public Maker fh = null;
  public Maker r = null;
  public String q = null;
  static final double widening = 0.6678937159933367;

  public static synchronized void main(String[] event) {
    double asset;
    String bcl;
    String ahn;
    String z;
    Maker leong;
    Maker sb;
    Maker nlsy;
    Maker pardi;
    int avec;
    asset = 0.3181646033302763;
    bcl = "";
    ahn = "";
    z = "";
    leong = null;
    sb = null;
    nlsy = null;
    pardi = null;
    System.out.print("\f");
    avec = 0;

    try {
      avec = System.in.available();
    } catch (java.lang.Exception cma) {
    }

    if (avec <= 0) synx13();
    else {
      double sacredRoam, recommendedUngenerous;
      int futureDepositoryConstrain;
      simulates.Model siem;
      sacredRoam = 0;
      recommendedUngenerous = 0;
      futureDepositoryConstrain = 0;

      try {
        java.util.Scanner claviature;
        claviature = new java.util.Scanner(System.in);
        recommendedUngenerous = claviature.nextDouble();
        sacredRoam = claviature.nextDouble();
        futureDepositoryConstrain = claviature.nextInt();
      } catch (java.lang.Exception aba) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      siem = new simulates.Model(10000000, recommendedUngenerous, sacredRoam);
      storeroom.Stored.determineShelvingThresholds(futureDepositoryConstrain);
      siem.originate();
    }
  }

  {
    q = "";
    r = null;
    fh = null;
    dhfr = null;
  }

  private static synchronized void synx13() {
    System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
  }
}
