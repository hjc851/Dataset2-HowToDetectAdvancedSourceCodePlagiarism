import java.util.Scanner;
import disk.Storing;
import exercise.Experiment;
import java.lang.String;
import filmmaker.Director;

public class Triclinic {
  public Director r;
  public Director righ;
  public static double minimumAcross = 0.28739606712545185;
  public String q;

  {
    q = "";
    r = null;
    ora = null;
    righ = null;
  }

  public Director ora;

  public static synchronized void main(String[] using) {
    int superiorTethered = -1855148172;
    String bcl = "";
    String ahn = "";
    String z = "";
    Director equally = null;
    Director scud = null;
    Director cathode = null;
    Director wor = null;
    System.out.print("\f");
    int bo = 0;

    try {
      bo = System.in.available();
    } catch (java.lang.Exception ej) {
    }

    if (bo <= 0) synx118();
    else {
      double roadGrasp = 0, futureEquate = 0;
      int willSpaceRestricts = 0;

      try {
        java.util.Scanner pad = new java.util.Scanner(System.in);
        futureEquate = pad.nextDouble();
        roadGrasp = pad.nextDouble();
        willSpaceRestricts = pad.nextInt();
      } catch (java.lang.Exception afterwards) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      exercise.Experiment siem = new exercise.Experiment(10000000, futureEquate, roadGrasp);
      disk.Storing.determinedStoredBoundary(willSpaceRestricts);
      siem.run();
    }
  }

  private static synchronized void synx118() {
    System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
  }
}
