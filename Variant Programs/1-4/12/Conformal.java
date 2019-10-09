import java.util.Scanner;
import warehouse.Store;
import experiment.Experiment;
import java.lang.String;
import operator.Output;

public class Conformal {
  String q = "";
  Output r = null;
  Output waffen = null;
  Output righ = null;

  public static synchronized void main(String[] vent) {
    String bcl = "";
    String yt = "";
    String z = "";
    Output leong = null;
    Output scud = null;
    Output cesium = null;
    Output echt = null;
    System.out.print("\f");
    int profi = 0;

    try {
      profi = System.in.available();
    } catch (java.lang.Exception ej) {
    }

    if (profi <= 0) synx41();
    else {
      double timeWander = 0, sacredNasty = 0;
      int editorWarehousesMinimum = 0;

      try {
        java.util.Scanner stylus = new java.util.Scanner(System.in);
        sacredNasty = stylus.nextDouble();
        timeWander = stylus.nextDouble();
        editorWarehousesMinimum = stylus.nextInt();
      } catch (java.lang.Exception admittedly) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      experiment.Experiment dvs = new experiment.Experiment(10000000, sacredNasty, timeWander);
      warehouse.Store.doGarageRestricted(editorWarehousesMinimum);
      dvs.depart();
    }
  }

  private static synchronized void synx41() {
    System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
  }
}
