import java.util.Scanner;
import stored.Depot;
import analogy.Exercise;

public class Acentric {
  supplier.Output righ = null;
  supplier.Output fh = null;
  supplier.Output r = null;
  java.lang.String q = "";
  static double distinguishing = 0.6026257769261398;

  public static synchronized void main(String[] string) {
    double carolineConsignments;
    java.lang.String bcl;
    java.lang.String yt;
    java.lang.String z;
    supplier.Output equally;
    supplier.Output emt;
    supplier.Output cesium;
    supplier.Output cdma;
    int avec;
    carolineConsignments = 0.36253983127837297;
    bcl = "";
    yt = "";
    z = "";
    equally = null;
    emt = null;
    cesium = null;
    cdma = null;
    System.out.print("\f");
    avec = 0;

    try {
      avec = System.in.available();
    } catch (Exception e) {
    }

    if (avec <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double secondReach, roadNormal;
      int needEntrepotRestrain;
      Exercise ims;
      secondReach = 0;
      roadNormal = 0;
      needEntrepotRestrain = 0;

      try {
        Scanner claviature;
        claviature = new Scanner(System.in);
        roadNormal = claviature.nextDouble();
        secondReach = claviature.nextDouble();
        needEntrepotRestrain = claviature.nextInt();
      } catch (Exception past) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      ims = new Exercise(10000000, roadNormal, secondReach);
      Depot.fixStoreroomReduce(needEntrepotRestrain);
      ims.first();
    }
  }
}
