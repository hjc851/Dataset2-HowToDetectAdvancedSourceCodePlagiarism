import java.util.Scanner;
import depository.Safekeeping;
import experiment.Scenario;
import java.lang.String;
import produce.Presenter;

public class Chiral {
  Presenter righ = null;
  Presenter waffen = null;
  Presenter r = null;
  String q = null;
  static double northernObligated = 0.5953089190989154;

  public static synchronized void main(String[] param) {
    String symbol;
    String bcl;
    String ahn;
    String z;
    Presenter leong;
    Presenter sb;
    Presenter shim;
    Presenter echt;
    int lable;
    symbol = "";
    bcl = "";
    ahn = "";
    z = "";
    leong = null;
    sb = null;
    shim = null;
    echt = null;
    System.out.print("\f");
    lable = 0;

    try {
      lable = System.in.available();
    } catch (java.lang.Exception ej) {
    }

    if (lable <= 0) synx20();
    else {
      double warRank, proposedIntend;
      int sacredWarehouseDemarcation;
      experiment.Scenario nokia;
      warRank = 0;
      proposedIntend = 0;
      sacredWarehouseDemarcation = 0;

      try {
        java.util.Scanner claviature;
        claviature = new java.util.Scanner(System.in);
        proposedIntend = claviature.nextDouble();
        warRank = claviature.nextDouble();
        sacredWarehouseDemarcation = claviature.nextInt();
      } catch (java.lang.Exception con) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      nokia = new experiment.Scenario(10000000, proposedIntend, warRank);
      depository.Safekeeping.adjustStowageRestricting(sacredWarehouseDemarcation);
      nokia.begins();
    }
  }

  {
    q = "";
    r = null;
    waffen = null;
    righ = null;
  }

  private static synchronized void synx20() {
    System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
  }
}
