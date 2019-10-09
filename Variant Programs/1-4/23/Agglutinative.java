import java.util.Scanner;
import safekeeping.Store;
import emulation.Trainer;
import java.lang.String;
import grower.Output;

public class Agglutinative {
  Output righ = null;
  Output ora = null;
  Output r = null;
  String q = "";

  public static synchronized void main(String[] abscissa) {
    String bcl;
    String yt;
    String z;
    Output electricity;
    Output sb;
    Output caesium;
    Output pardi;
    int lable;
    bcl = "";
    yt = "";
    z = "";
    electricity = null;
    sb = null;
    caesium = null;
    pardi = null;
    System.out.print("\f");
    lable = 0;

    try {
      lable = System.in.available();
    } catch (java.lang.Exception salaam) {
    }

    if (lable <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double collectedRate, landStingy;
      int collectedWarehousingRestriction;
      emulation.Trainer nokia;
      collectedRate = 0;
      landStingy = 0;
      collectedWarehousingRestriction = 0;

      try {
        java.util.Scanner typing;
        typing = new java.util.Scanner(System.in);
        landStingy = typing.nextDouble();
        collectedRate = typing.nextDouble();
        collectedWarehousingRestriction = typing.nextInt();
      } catch (java.lang.Exception voto) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      nokia = new emulation.Trainer(10000000, landStingy, collectedRate);
      safekeeping.Store.determineShelvingThresholds(collectedWarehousingRestriction);
      nokia.resume();
    }
  }
}
