import java.util.Scanner;
import space.Warehouse;
import simulate.Simulates;
import java.lang.String;
import promoter.Manufacturers;

public class Cubic {
  public Manufacturers righ = null;
  public Manufacturers ora = null;
  public Manufacturers r = null;
  public String q = "";

  public static synchronized void main(String[] sender) {
    String bcl;
    String ahn;
    String z;
    Manufacturers equally;
    Manufacturers scud;
    Manufacturers cmu;
    Manufacturers pardi;
    int centre;
    bcl = "";
    ahn = "";
    z = "";
    equally = null;
    scud = null;
    cmu = null;
    pardi = null;
    System.out.print("\f");
    centre = 0;

    try {
      centre = System.in.available();
    } catch (java.lang.Exception ej) {
    }

    if (centre <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double warRank, recommendedUngenerous;
      int redStoreConfine;
      simulate.Simulates shen;
      warRank = 0;
      recommendedUngenerous = 0;
      redStoreConfine = 0;

      try {
        java.util.Scanner typing;
        typing = new java.util.Scanner(System.in);
        recommendedUngenerous = typing.nextDouble();
        warRank = typing.nextDouble();
        redStoreConfine = typing.nextInt();
      } catch (java.lang.Exception former) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      shen = new simulate.Simulates(10000000, recommendedUngenerous, warRank);
      space.Warehouse.determinedStoredBoundary(redStoreConfine);
      shen.opening();
    }
  }
}
