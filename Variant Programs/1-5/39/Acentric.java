import java.util.Scanner;
import warehouses.Caching;
import pretence.Emulation;

public class Acentric {
  public breeder.Maker righ = null;
  public breeder.Maker r = null;

  public static synchronized void main(String[] abscissa) {
    java.lang.String bcl;
    java.lang.String ahn;
    java.lang.String z;
    breeder.Maker arsenic;
    breeder.Maker scud;
    breeder.Maker cesium;
    breeder.Maker scd;
    int bo;
    bcl = "";
    ahn = "";
    z = "";
    arsenic = null;
    scud = null;
    cesium = null;
    scd = null;
    System.out.print("\f");
    bo = 0;

    try {
      bo = System.in.available();
    } catch (Exception einsteinium) {
    }

    if (bo <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double thirdSwan, endIgnoble;
      int collectedWarehousingRestriction;
      Emulation ism;
      thirdSwan = 0;
      endIgnoble = 0;
      collectedWarehousingRestriction = 0;

      try {
        Scanner keys;
        keys = new Scanner(System.in);
        endIgnoble = keys.nextDouble();
        thirdSwan = keys.nextDouble();
        collectedWarehousingRestriction = keys.nextInt();
      } catch (Exception adult) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      ism = new Emulation(10000000, endIgnoble, thirdSwan);
      Caching.orderedRepositoryThreshold(collectedWarehousingRestriction);
      ism.depart();
    }
  }

  public breeder.Maker fh = null;
  public java.lang.String q = "";
}
