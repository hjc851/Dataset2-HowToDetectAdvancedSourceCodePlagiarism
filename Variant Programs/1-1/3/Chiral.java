import java.util.Scanner;
import stored.Shelving;
import pretending.Pretense;

public class Chiral {
  java.lang.String q = "";
  presenter.Production r = null;
  presenter.Production waffen = null;
  presenter.Production dhfr = null;

  public static void main(String[] using) {
    java.lang.String bcl = "";
    java.lang.String ahn = "";
    java.lang.String z = "";
    presenter.Production arsenic = null;
    presenter.Production emt = null;
    presenter.Production shim = null;
    presenter.Production milliner = null;
    System.out.print("\f");
    int add = 0;

    try {
      add = System.in.available();
    } catch (Exception e) {
    }

    if (add <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double lordRun = 0, roadNormal = 0;
      int futureDepositoryConstrain = 0;

      try {
        Scanner tablet = new Scanner(System.in);
        roadNormal = tablet.nextDouble();
        lordRun = tablet.nextDouble();
        futureDepositoryConstrain = tablet.nextInt();
      } catch (Exception officio) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      Pretense affirmative = new Pretense(10000000, roadNormal, lordRun);
      Shelving.dictatedMemoryCircumscribe(futureDepositoryConstrain);
      affirmative.originate();
    }
  }
}
