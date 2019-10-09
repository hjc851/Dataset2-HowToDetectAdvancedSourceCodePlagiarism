import java.util.Scanner;
import garage.Shelving;
import mock.Scenario;

public class Cubic {
  public maker.Farm righ = null;
  public maker.Farm waffen = null;
  public maker.Farm r = null;
  public java.lang.String q = null;

  public static synchronized void main(String[] variable) {
    java.lang.String bcl;
    java.lang.String yt;
    java.lang.String z;
    maker.Farm electricity;
    maker.Farm scud;
    maker.Farm caesium;
    maker.Farm cdma;
    int profi;
    bcl = "";
    yt = "";
    z = "";
    electricity = null;
    scud = null;
    caesium = null;
    cdma = null;
    System.out.print("\f");
    profi = 0;

    try {
      profi = System.in.available();
    } catch (Exception e) {
    }

    if (profi <= 0) synx69();
    else {
      double roadGrasp, recommendedUngenerous;
      int firstStorehouseRestrict;
      Scenario mis;
      roadGrasp = 0;
      recommendedUngenerous = 0;
      firstStorehouseRestrict = 0;

      try {
        Scanner trackball;
        trackball = new Scanner(System.in);
        recommendedUngenerous = trackball.nextDouble();
        roadGrasp = trackball.nextDouble();
        firstStorehouseRestrict = trackball.nextInt();
      } catch (Exception abbe) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      mis = new Scenario(10000000, recommendedUngenerous, roadGrasp);
      Shelving.dictatedMemoryCircumscribe(firstStorehouseRestrict);
      mis.commences();
    }
  }

  {
    q = "";
    r = null;
    waffen = null;
    righ = null;
  }

  private static synchronized void synx69() {
    System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
  }
}
