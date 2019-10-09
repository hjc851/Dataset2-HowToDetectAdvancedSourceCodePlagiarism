import java.util.Scanner;
import depository.Space;
import pretence.Analogy;
import java.lang.String;
import growers.Breeder;

public class Icosahedral {
  String q = "";
  Breeder r = null;
  Breeder ora = null;
  Breeder righ = null;

  public static void main(String[] handles) {
    String bcl = "";
    String yt = "";
    String z = "";
    Breeder equally = null;
    Breeder sb = null;
    Breeder cesium = null;
    Breeder milliner = null;
    System.out.print("\f");
    int profi = 0;

    try {
      profi = System.in.available();
    } catch (java.lang.Exception salaam) {
    }

    if (profi <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double timeWander = 0, wordMingy = 0;
      int firstStorehouseRestrict = 0;

      try {
        java.util.Scanner finger = new java.util.Scanner(System.in);
        wordMingy = finger.nextDouble();
        timeWander = finger.nextDouble();
        firstStorehouseRestrict = finger.nextInt();
      } catch (java.lang.Exception combatants) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      pretence.Analogy mis = new pretence.Analogy(10000000, wordMingy, timeWander);
      depository.Space.arrangedStoreConfine(firstStorehouseRestrict);
      mis.resume();
    }
  }
}
