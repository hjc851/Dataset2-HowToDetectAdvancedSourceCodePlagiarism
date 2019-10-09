import java.util.Scanner;
import safekeeping.Warehousing;
import analog.Simulating;

public class Tetragonal {
  java.lang.String q = "";
  promoter.Grower r = null;
  promoter.Grower fh = null;
  promoter.Grower dhfr = null;

  public static void main(String[] sender) {
    java.lang.String bcl = "";
    java.lang.String ahn = "";
    java.lang.String z = "";
    promoter.Grower arsenic = null;
    promoter.Grower sb = null;
    promoter.Grower cmu = null;
    promoter.Grower kiddy = null;
    System.out.print("\f");
    int lable = 0;

    try {
      lable = System.in.available();
    } catch (Exception e) {
    }

    if (lable <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double proposedStray = 0, wordMingy = 0;
      int willSpaceRestricts = 0;

      try {
        Scanner touch = new Scanner(System.in);
        wordMingy = touch.nextDouble();
        proposedStray = touch.nextDouble();
        willSpaceRestricts = touch.nextInt();
      } catch (Exception pro) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      Simulating shum = new Simulating(10000000, wordMingy, proposedStray);
      Warehousing.laidDepotLimitation(willSpaceRestricts);
      shum.early();
    }
  }
}
