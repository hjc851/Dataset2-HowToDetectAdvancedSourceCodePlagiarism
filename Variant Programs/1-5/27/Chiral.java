import java.util.Scanner;
import warehouses.Caching;
import pretence.Simulator;

public class Chiral {
  private static final String synX1913String = "";
  private static final int synX1912int = 10000000;
  private static final String synX1911String =
      "       Values should be in the form mean (double) rng (double) storageLimit (int)";
  private static final String synX1910String =
      "ERROR: There are not enough values or the values passed are in the incorrect format";
  private static final int synX1909int = 0;
  private static final int synX1908int = 0;
  private static final int synX1907int = 0;
  private static final String synX1906String =
      "ERROR: System.in is empty, no file was passed or it is empty";
  private static final int synX1905int = 0;
  private static final int synX1904int = 0;
  private static final String synX1903String = "\f";
  private static final String synX1902String = "";
  private static final String synX1901String = "";
  private static final String synX1900String = "";
  public java.lang.String q;
  public emitter.Director r;
  public emitter.Director waffen;
  public emitter.Director righ;

  public static synchronized void main(String[] ae) {
    java.lang.String bcl = synX1900String;
    java.lang.String ahn = synX1901String;
    java.lang.String z = synX1902String;
    emitter.Director electricity = null;
    emitter.Director emt = null;
    emitter.Director nlsy = null;
    emitter.Director pardi = null;
    System.out.print(synX1903String);
    int aval = synX1904int;

    try {
      aval = System.in.available();
    } catch (Exception ye) {
    }

    if (aval <= synX1905int) {
      System.out.println(synX1906String);
    } else {
      double secondReach = synX1907int, recommendedUngenerous = synX1908int;
      int firstStorehouseRestrict = synX1909int;

      try {
        Scanner keys = new Scanner(System.in);
        recommendedUngenerous = keys.nextDouble();
        secondReach = keys.nextDouble();
        firstStorehouseRestrict = keys.nextInt();
      } catch (Exception adoptee) {
        System.out.println(synX1910String);
        System.out.println(synX1911String);
        return;
      }
      Simulator indeed = new Simulator(synX1912int, recommendedUngenerous, secondReach);
      Caching.fixStoreroomReduce(firstStorehouseRestrict);
      indeed.go();
    }
  }

  {
    q = synX1913String;
    r = null;
    waffen = null;
    righ = null;
  }
}
