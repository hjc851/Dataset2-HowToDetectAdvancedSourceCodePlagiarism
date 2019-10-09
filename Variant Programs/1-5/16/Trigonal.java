import java.util.Scanner;
import storeroom.Warehouses;
import simulate.Analog;
import static java.lang.System.out;
import static java.lang.System.in;

public class Trigonal {
  private static final int synX1414int = 10000000;
  private static final String synX1413String =
      "       Values should be in the form mean (double) rng (double) storageLimit (int)";
  private static final String synX1412String =
      "ERROR: There are not enough values or the values passed are in the incorrect format";
  private static final int synX1411int = 0;
  private static final int synX1410int = 0;
  private static final int synX1409int = 0;
  private static final String synX1408String =
      "ERROR: System.in is empty, no file was passed or it is empty";
  private static final int synX1407int = 0;
  private static final int synX1406int = 0;
  private static final String synX1405String = "\f";
  private static final String synX1404String = "";
  private static final String synX1403String = "";
  private static final String synX1402String = "";
  java.lang.String q = "";

  public static synchronized void main(String[] using) {
    java.lang.String bcl;
    java.lang.String ahn;
    java.lang.String z;
    producing.Provider arsenic;
    producing.Provider emt;
    producing.Provider cesium;
    producing.Provider cdma;
    int adder;
    bcl = (synX1402String);
    ahn = (synX1403String);
    z = (synX1404String);
    arsenic = (null);
    emt = (null);
    cesium = (null);
    cdma = (null);
    out.print(synX1405String);
    adder = (synX1406int);

    try {
      adder = (in.available());
    } catch (Exception e) {
    }

    if (adder <= synX1407int) {
      out.println(synX1408String);
    } else {
      double recommendedChain, lordAverage;
      int wordStoredBoundary;
      Analog siem;
      recommendedChain = (synX1409int);
      lordAverage = (synX1410int);
      wordStoredBoundary = (synX1411int);

      try {
        Scanner portable;
        portable = (new Scanner(in));
        lordAverage = (portable.nextDouble());
        recommendedChain = (portable.nextDouble());
        wordStoredBoundary = (portable.nextInt());
      } catch (Exception abbe) {
        out.println(synX1412String);
        out.println(synX1413String);
        return;
      }
      siem = (new Analog(synX1414int, lordAverage, recommendedChain));
      Warehouses.orderedRepositoryThreshold(wordStoredBoundary);
      siem.opening();
    }
  }

  producing.Provider r = null;
  producing.Provider ora = null;
  producing.Provider dhfr = null;
}
