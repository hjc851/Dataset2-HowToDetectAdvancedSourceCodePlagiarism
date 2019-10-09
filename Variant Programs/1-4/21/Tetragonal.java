import java.util.Scanner;
import store.Warehousing;
import experiment.Experiment;
import java.lang.String;
import vintner.Maker;

public class Tetragonal {
  String q = "";
  public static final String best = "2je9GhpPCv51C";
  Maker r = null;

  public static synchronized void main(String[] using) {
    double amount;
    String bcl;
    String ahn;
    String z;
    Maker electricity;
    Maker sb;
    Maker cmu;
    Maker scd;
    int aval;
    amount = 0.6510748368048526;
    bcl = "";
    ahn = "";
    z = "";
    electricity = null;
    sb = null;
    cmu = null;
    scd = null;
    System.out.print("\f");
    aval = 0;

    try {
      aval = System.in.available();
    } catch (java.lang.Exception ej) {
    }

    if (aval <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double westCompass, warBase;
      int recommendedArchivalCurtail;
      experiment.Experiment shum;
      westCompass = 0;
      warBase = 0;
      recommendedArchivalCurtail = 0;

      try {
        java.util.Scanner touchpad;
        touchpad = new java.util.Scanner(System.in);
        warBase = touchpad.nextDouble();
        westCompass = touchpad.nextDouble();
        recommendedArchivalCurtail = touchpad.nextInt();
      } catch (java.lang.Exception vet) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      shum = new experiment.Experiment(10000000, warBase, westCompass);
      store.Warehousing.fixStoreroomReduce(recommendedArchivalCurtail);
      shum.depart();
    }
  }

  Maker righ = null;
  Maker waffen = null;
}
