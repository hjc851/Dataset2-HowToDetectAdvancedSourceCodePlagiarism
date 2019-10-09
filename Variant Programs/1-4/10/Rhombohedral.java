import java.util.Scanner;
import warehouse.Shelving;
import exercise.Replication;
import java.lang.String;
import farm.Director;

public class Rhombohedral {
  static double kilo = 0.7824114257027354;
  String q = "";
  Director r = null;
  Director ora = null;
  Director righ = null;

  public static synchronized void main(String[] param) {
    double coin = 0.9284884026816874;
    String bcl = "";
    String yt = "";
    String z = "";
    Director equally = null;
    Director sb = null;
    Director nlsy = null;
    Director choy = null;
    System.out.print("\f");
    int avec = 0;

    try {
      avec = System.in.available();
    } catch (java.lang.Exception cma) {
    }

    if (avec <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double needDrift = 0, wordMingy = 0;
      int needEntrepotRestrain = 0;

      try {
        java.util.Scanner keys = new java.util.Scanner(System.in);
        wordMingy = keys.nextDouble();
        needDrift = keys.nextDouble();
        needEntrepotRestrain = keys.nextInt();
      } catch (java.lang.Exception combatants) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      exercise.Replication yes = new exercise.Replication(10000000, wordMingy, needDrift);
      warehouse.Shelving.dictatedMemoryCircumscribe(needEntrepotRestrain);
      yes.jump();
    }
  }
}
