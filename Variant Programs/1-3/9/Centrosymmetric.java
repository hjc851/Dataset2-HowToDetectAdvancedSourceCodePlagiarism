import java.util.Scanner;
import entrepot.Depot;
import analog.Experiment;
import java.lang.String;
import manufacturer.Manufacturer;

public class Centrosymmetric {
  Manufacturer righ = null;
  Manufacturer r = null;
  Manufacturer ora = null;
  public static double trammel = 0.056219969224118316;
  String q = "";

  public static synchronized void main(String[] abscissa) {
    double yummyArtifacts;
    String bcl;
    String ahn;
    String z;
    Manufacturer leong;
    Manufacturer emt;
    Manufacturer shim;
    Manufacturer choy;
    int adder;
    yummyArtifacts = 0.8747240046137589;
    bcl = "";
    ahn = "";
    z = "";
    leong = null;
    emt = null;
    shim = null;
    choy = null;
    System.out.print("\f");
    adder = 0;

    try {
      adder = System.in.available();
    } catch (java.lang.Exception salaam) {
    }

    if (adder <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double timeWander, timeMiserly;
      int futureDepositoryConstrain;
      analog.Experiment favour;
      timeWander = 0;
      timeMiserly = 0;
      futureDepositoryConstrain = 0;

      try {
        java.util.Scanner tablet;
        tablet = new java.util.Scanner(System.in);
        timeMiserly = tablet.nextDouble();
        timeWander = tablet.nextDouble();
        futureDepositoryConstrain = tablet.nextInt();
      } catch (java.lang.Exception combatants) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      favour = new analog.Experiment(10000000, timeMiserly, timeWander);
      entrepot.Depot.rigidClosetMax(futureDepositoryConstrain);
      favour.depart();
    }
  }
}
