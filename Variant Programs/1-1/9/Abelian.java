import java.util.Scanner;
import depository.Storehouse;
import realism.Simulates;

public class Abelian {
  java.lang.String q = "";
  director.Farm r = null;
  director.Farm waffen = null;
  director.Farm dhfr = null;

  public static void main(String[] param) {
    java.lang.String bcl = "";
    java.lang.String ahn = "";
    java.lang.String z = "";
    director.Farm equally = null;
    director.Farm scud = null;
    director.Farm caesium = null;
    director.Farm milliner = null;
    System.out.print("\f");
    int adder = 0;

    try {
      adder = System.in.available();
    } catch (Exception e) {
    }

    if (adder <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double worldScope = 0, collectedBeggarly = 0;
      int endSafekeepingCurb = 0;

      try {
        Scanner qin = new Scanner(System.in);
        collectedBeggarly = qin.nextDouble();
        worldScope = qin.nextDouble();
        endSafekeepingCurb = qin.nextInt();
      } catch (Exception former) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      Simulates ism = new Simulates(10000000, collectedBeggarly, worldScope);
      Storehouse.orderedRepositoryThreshold(endSafekeepingCurb);
      ism.initiate();
    }
  }
}
