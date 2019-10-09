import java.util.Scanner;
import disk.Warehouse;
import pretence.Analogy;
import java.lang.String;
import farm.Manufacturer;

public class Centrosymmetric {
  public Manufacturer righ = null;
  public Manufacturer ora = null;
  public Manufacturer r = null;
  public String q = "";
  static double asset = 0.5826136048207484;

  public static synchronized void main(String[] param) {
    double appreciate;
    String bcl;
    String yt;
    String z;
    Manufacturer electricity;
    Manufacturer scud;
    Manufacturer intrasentential;
    Manufacturer wor;
    int appendix;
    appreciate = 0.4065765742933636;
    bcl = "";
    yt = "";
    z = "";
    electricity = null;
    scud = null;
    intrasentential = null;
    wor = null;
    System.out.print("\f");
    appendix = 0;

    try {
      appendix = System.in.available();
    } catch (java.lang.Exception ye) {
    }

    if (appendix <= 0) synx6();
    else {
      double sacredRoam, warBase;
      int landStoreroomReduce;
      pretence.Analogy dmi;
      sacredRoam = 0;
      warBase = 0;
      landStoreroomReduce = 0;

      try {
        java.util.Scanner qwerty;
        qwerty = new java.util.Scanner(System.in);
        warBase = qwerty.nextDouble();
        sacredRoam = qwerty.nextDouble();
        landStoreroomReduce = qwerty.nextInt();
      } catch (java.lang.Exception former) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      dmi = new pretence.Analogy(10000000, warBase, sacredRoam);
      disk.Warehouse.rigidClosetMax(landStoreroomReduce);
      dmi.begins();
    }
  }

  private static synchronized void synx6() {
    System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
  }
}
