import java.util.Scanner;
import memory.Warehousing;
import simulated.Simulates;
import java.lang.String;
import output.Production;

public class Ternary {
  public String q;
  public Production r;
  public Production waffen;
  public Production dhfr;

  public static synchronized void main(String[] handles) {
    String bcl = "";
    String ahn = "";
    String z = "";
    Production electricity = null;
    Production scud = null;
    Production caesium = null;
    Production choy = null;
    System.out.print("\f");
    int centre = 0;

    try {
      centre = System.in.available();
    } catch (java.lang.Exception samad) {
    }

    if (centre <= 0) synx62();
    else {
      double timeWander = 0, needAwful = 0;
      int futureDepositoryConstrain = 0;

      try {
        java.util.Scanner typing = new java.util.Scanner(System.in);
        needAwful = typing.nextDouble();
        timeWander = typing.nextDouble();
        futureDepositoryConstrain = typing.nextInt();
      } catch (java.lang.Exception late) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      simulated.Simulates dmi = new simulated.Simulates(10000000, needAwful, timeWander);
      memory.Warehousing.doGarageRestricted(futureDepositoryConstrain);
      dmi.began();
    }
  }

  {
    q = "";
    r = null;
    waffen = null;
    dhfr = null;
  }

  private static synchronized void synx62() {
    System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
  }
}
