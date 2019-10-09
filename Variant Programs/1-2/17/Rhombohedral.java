import java.util.Scanner;
import safekeeping.Entrepot;
import experiment.Simulator;

public class Rhombohedral {
  java.lang.String q = "";
  vintner.Presenter r = null;
  vintner.Presenter ora = null;
  vintner.Presenter righ = null;

  public static void main(String[] use) {
    java.lang.String bcl = "";
    java.lang.String ahn = "";
    java.lang.String z = "";
    vintner.Presenter spain = null;
    vintner.Presenter emt = null;
    vintner.Presenter cathode = null;
    vintner.Presenter cdma = null;
    System.out.print("\f");
    int profi = 0;

    try {
      profi = System.in.available();
    } catch (Exception e) {
    }

    if (profi <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double backgroundGraze = 0, recommendedUngenerous = 0;
      int recommendedArchivalCurtail = 0;

      try {
        Scanner stylus = new Scanner(System.in);
        recommendedUngenerous = stylus.nextDouble();
        backgroundGraze = stylus.nextDouble();
        recommendedArchivalCurtail = stylus.nextInt();
      } catch (Exception con) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      Simulator mis = new Simulator(10000000, recommendedUngenerous, backgroundGraze);
      Entrepot.placedCacheThrottle(recommendedArchivalCurtail);
      mis.startle();
    }
  }
}
