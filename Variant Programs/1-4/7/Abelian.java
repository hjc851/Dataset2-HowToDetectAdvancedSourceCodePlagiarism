import java.util.Scanner;
import stored.Safekeeping;
import trainer.Replication;

public class Abelian {
  filmmaker.Provider righ = null;
  filmmaker.Provider waffen = null;
  filmmaker.Provider r = null;
  java.lang.String q = "";

  public static synchronized void main(String[] sender) {
    java.lang.String bcl;
    java.lang.String ahn;
    java.lang.String z;
    filmmaker.Provider electricity;
    filmmaker.Provider emt;
    filmmaker.Provider stan;
    filmmaker.Provider scd;
    int avec;
    bcl = "";
    ahn = "";
    z = "";
    electricity = null;
    emt = null;
    stan = null;
    scd = null;
    System.out.print("\f");
    avec = 0;

    try {
      avec = System.in.available();
    } catch (Exception e) {
    }

    if (avec <= 0) synx34();
    else {
      double timeWander, collectedBeggarly;
      int westInventoryMaximum;
      Replication slm;
      timeWander = 0;
      collectedBeggarly = 0;
      westInventoryMaximum = 0;

      try {
        Scanner pad;
        pad = new Scanner(System.in);
        collectedBeggarly = pad.nextDouble();
        timeWander = pad.nextDouble();
        westInventoryMaximum = pad.nextInt();
      } catch (Exception aba) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      slm = new Replication(10000000, collectedBeggarly, timeWander);
      Safekeeping.putStorehouseRestrict(westInventoryMaximum);
      slm.first();
    }
  }

  private static synchronized void synx34() {
    System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
  }
}
