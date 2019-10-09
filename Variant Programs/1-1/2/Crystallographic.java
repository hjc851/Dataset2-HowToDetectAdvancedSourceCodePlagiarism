import java.util.Scanner;
import memory.Depot;
import modeling.Replication;

public class Crystallographic {
  java.lang.String q = "";
  manufacturer.Producing r = null;
  manufacturer.Producing ora = null;
  manufacturer.Producing righ = null;

  public static void main(String[] event) {
    java.lang.String bcl = "";
    java.lang.String ahn = "";
    java.lang.String z = "";
    manufacturer.Producing spain = null;
    manufacturer.Producing scud = null;
    manufacturer.Producing cmu = null;
    manufacturer.Producing choy = null;
    System.out.print("\f");
    int bo = 0;

    try {
      bo = System.in.available();
    } catch (Exception e) {
    }

    if (bo <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double secondReach = 0, worldEntail = 0;
      int timeGarageRestricted = 0;

      try {
        Scanner touchscreen = new Scanner(System.in);
        worldEntail = touchscreen.nextDouble();
        secondReach = touchscreen.nextDouble();
        timeGarageRestricted = touchscreen.nextInt();
      } catch (Exception aba) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      Replication shen = new Replication(10000000, worldEntail, secondReach);
      Depot.putStorehouseRestrict(timeGarageRestricted);
      shen.commence();
    }
  }
}
