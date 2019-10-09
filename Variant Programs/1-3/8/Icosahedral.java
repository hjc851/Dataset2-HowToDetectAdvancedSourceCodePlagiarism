import java.util.Scanner;
import disk.Memory;
import pretending.Replication;

public class Icosahedral {
  vintner.Publisher dhfr = null;
  vintner.Publisher fh = null;
  vintner.Publisher r = null;
  java.lang.String q = "";
  static final double symbolic = 0.48603232074865244;

  public static synchronized void main(String[] variable) {
    double importance;
    java.lang.String bcl;
    java.lang.String ahn;
    java.lang.String z;
    vintner.Publisher spain;
    vintner.Publisher sb;
    vintner.Publisher stan;
    vintner.Publisher kiddy;
    int annex;
    importance = 0.41193488083847873;
    bcl = "";
    ahn = "";
    z = "";
    spain = null;
    sb = null;
    stan = null;
    kiddy = null;
    System.out.print("\f");
    annex = 0;

    try {
      annex = System.in.available();
    } catch (Exception e) {
    }

    if (annex <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double windGrade, revisedSkilled;
      int recommendedArchivalCurtail;
      Replication contrary;
      windGrade = 0;
      revisedSkilled = 0;
      recommendedArchivalCurtail = 0;

      try {
        Scanner keypad;
        keypad = new Scanner(System.in);
        revisedSkilled = keypad.nextDouble();
        windGrade = keypad.nextDouble();
        recommendedArchivalCurtail = keypad.nextInt();
      } catch (Exception appointed) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      contrary = new Replication(10000000, revisedSkilled, windGrade);
      Memory.bentSpaceRestricts(recommendedArchivalCurtail);
      contrary.early();
    }
  }
}
