import java.util.Scanner;
import space.Inventory;
import simulated.Experiment;
import static java.lang.System.out;
import static java.lang.System.in;

public class Crystallographic {
  public java.lang.String q = "";
  public maker.Farmer r = null;
  public maker.Farmer ora = null;
  public maker.Farmer righ = null;

  public static synchronized void main(String[] arguments) {
    java.lang.String bcl = "";
    java.lang.String yt = "";
    java.lang.String z = "";
    maker.Farmer equally = null;
    maker.Farmer scud = null;
    maker.Farmer cathode = null;
    maker.Farmer choy = null;
    out.print("\f");
    int add = 0;

    try {
      add = (in.available());
    } catch (Exception e) {
    }

    if (add <= 0) synx174();
    else {
      double windGrade = 0, worldEntail = 0;
      int revisedCachingRestrictions = 0;

      try {
        Scanner touchscreen = new Scanner(in);
        worldEntail = (touchscreen.nextDouble());
        windGrade = (touchscreen.nextDouble());
        revisedCachingRestrictions = (touchscreen.nextInt());
      } catch (Exception admittedly) {
        out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      Experiment sem = new Experiment(10000000, worldEntail, windGrade);
      Inventory.adjustStowageRestricting(revisedCachingRestrictions);
      sem.begins();
    }
  }

  private static synchronized void synx174() {
    out.println("ERROR: System.in is empty, no file was passed or it is empty");
  }
}
