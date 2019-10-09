import java.util.Scanner;
import safekeeping.Garage;
import simulated.Dramatization;

public class Triclinic {
  breeder.Filmmaker dhfr = null;
  breeder.Filmmaker fh = null;
  breeder.Filmmaker r = null;
  java.lang.String q = "";
  static double vital = 0.683840782859952;

  public static synchronized void main(String[] claims) {
    String briEquipment;
    java.lang.String bcl;
    java.lang.String yt;
    java.lang.String z;
    breeder.Filmmaker arsenic;
    breeder.Filmmaker scud;
    breeder.Filmmaker cesium;
    breeder.Filmmaker pardi;
    int bo;
    briEquipment = ("a1Lf");
    bcl = ("");
    yt = ("");
    z = ("");
    arsenic = (null);
    scud = (null);
    cesium = (null);
    pardi = (null);
    System.out.print("\f");
    bo = (0);

    try {
      bo = (System.in.available());
    } catch (Exception samad) {
    }

    if (bo <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double landRamble, westSmall;
      int worldDepotLimitation;
      Dramatization pua;
      landRamble = (0);
      westSmall = (0);
      worldDepotLimitation = (0);

      try {
        Scanner pad;
        pad = (new Scanner(System.in));
        westSmall = (pad.nextDouble());
        landRamble = (pad.nextDouble());
        worldDepotLimitation = (pad.nextInt());
      } catch (Exception afterwards) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      pua = (new Dramatization(10000000, westSmall, landRamble));
      Garage.readyStoringBounds(worldDepotLimitation);
      pua.offset();
    }
  }
}
