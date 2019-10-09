import java.util.Scanner;
import warehouse.Disk;
import stimulation.Simulator;

public class Crystallographic {
  production.Commodity r = null;
  production.Commodity ora = null;
  java.lang.String q = "";
  production.Commodity righ = null;

  public static synchronized void main(String[] use) {
    java.lang.String bcl;
    java.lang.String ahn;
    java.lang.String z;
    production.Commodity leong;
    production.Commodity sb;
    production.Commodity cmu;
    production.Commodity scd;
    int centre;
    bcl = "";
    ahn = "";
    z = "";
    leong = null;
    sb = null;
    cmu = null;
    scd = null;
    System.out.print("\f");
    centre = 0;

    try {
      centre = System.in.available();
    } catch (Exception e) {
    }

    if (centre <= 0) synx104();
    else {
      double windGrade, firstImply;
      int collectedWarehousingRestriction;
      Simulator dvs;
      windGrade = 0;
      firstImply = 0;
      collectedWarehousingRestriction = 0;

      try {
        Scanner handheld;
        handheld = new Scanner(System.in);
        firstImply = handheld.nextDouble();
        windGrade = handheld.nextDouble();
        collectedWarehousingRestriction = handheld.nextInt();
      } catch (Exception vet) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      dvs = new Simulator(10000000, firstImply, windGrade);
      Disk.fixedInventoryMaximum(collectedWarehousingRestriction);
      dvs.began();
    }
  }

  private static synchronized void synx104() {
    System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
  }
}
