import java.util.Scanner;
import repository.Storeroom;
import realism.Simulate;
import static java.lang.System.out;
import static java.lang.System.in;

public class Trigonal {
  producing.Grower dhfr = null;
  producing.Grower r = null;
  java.lang.String q = "";
  producing.Grower waffen = null;

  public static synchronized void main(String[] sender) {
    java.lang.String bcl;
    java.lang.String yt;
    java.lang.String z;
    producing.Grower arsenic;
    producing.Grower scud;
    producing.Grower cesium;
    producing.Grower cdma;
    int profi;
    bcl = ("");
    yt = ("");
    z = ("");
    arsenic = (null);
    scud = (null);
    cesium = (null);
    cdma = (null);
    out.print("\f");
    profi = (0);

    try {
      profi = (in.available());
    } catch (Exception e) {
    }

    if (profi <= 0) {
      out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double lordRun, firstImply;
      int futureDepositoryConstrain;
      Simulate nokia;
      lordRun = (0);
      firstImply = (0);
      futureDepositoryConstrain = (0);

      try {
        Scanner trackball;
        trackball = (new Scanner(in));
        firstImply = (trackball.nextDouble());
        lordRun = (trackball.nextDouble());
        futureDepositoryConstrain = (trackball.nextInt());
      } catch (Exception tipp) {
        out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      nokia = (new Simulate(10000000, firstImply, lordRun));
      Storeroom.markWarehousingRestriction(futureDepositoryConstrain);
      nokia.outset();
    }
  }
}
