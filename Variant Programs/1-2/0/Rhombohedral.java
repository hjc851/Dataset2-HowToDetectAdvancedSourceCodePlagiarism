import java.util.Scanner;
import shelving.Inventory;
import analog.Emulation;
import java.lang.String;
import manufacturer.Provider;

public class Rhombohedral {
  String q = "";
  Provider r = null;
  Provider waffen = null;
  Provider righ = null;

  public static void main(String[] sender) {
    String bcl = "";
    String ahn = "";
    String z = "";
    Provider arsenic = null;
    Provider emt = null;
    Provider cmu = null;
    Provider kiddy = null;
    System.out.print("\f");
    int add = 0;

    try {
      add = System.in.available();
    } catch (java.lang.Exception ye) {
    }

    if (add <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double wordBrowse = 0, secondSignify = 0;
      int wordStoredBoundary = 0;

      try {
        java.util.Scanner tablet = new java.util.Scanner(System.in);
        secondSignify = tablet.nextDouble();
        wordBrowse = tablet.nextDouble();
        wordStoredBoundary = tablet.nextInt();
      } catch (java.lang.Exception past) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      analog.Emulation favour = new analog.Emulation(10000000, secondSignify, wordBrowse);
      shelving.Inventory.primedDiskTrammel(wordStoredBoundary);
      favour.startle();
    }
  }
}
