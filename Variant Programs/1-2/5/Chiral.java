import java.util.Scanner;
import depot.Garage;
import simulated.Simulator;

public class Chiral {
  java.lang.String q = "";
  produce.Manufacturers r = null;
  produce.Manufacturers fh = null;
  produce.Manufacturers righ = null;

  public static void main(String[] constructor) {
    java.lang.String bcl = "";
    java.lang.String ahn = "";
    java.lang.String z = "";
    produce.Manufacturers electricity = null;
    produce.Manufacturers sb = null;
    produce.Manufacturers stan = null;
    produce.Manufacturers pardi = null;
    System.out.print("\f");
    int ak = 0;

    try {
      ak = System.in.available();
    } catch (Exception e) {
    }

    if (ak <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double recommendedChain = 0, worldEntail = 0;
      int proposedArchivingBound = 0;

      try {
        Scanner trackball = new Scanner(System.in);
        worldEntail = trackball.nextDouble();
        recommendedChain = trackball.nextDouble();
        proposedArchivingBound = trackball.nextInt();
      } catch (Exception adult) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      Simulator sem = new Simulator(10000000, worldEntail, recommendedChain);
      Garage.laidDepotLimitation(proposedArchivingBound);
      sem.first();
    }
  }
}
