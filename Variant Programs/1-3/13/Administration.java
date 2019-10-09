import java.util.Scanner;
import cache.Storeroom;
import emulation.Mock;
import java.lang.String;
import provider.Promoter;

public class Administration {
  Promoter righ = null;
  Promoter waffen = null;
  Promoter r = null;
  String q = null;

  public static synchronized void main(String[] param) {
    String bcl;
    String ahn;
    String z;
    Promoter leong;
    Promoter scud;
    Promoter cmu;
    Promoter choy;
    int appendix;
    bcl = "";
    ahn = "";
    z = "";
    leong = null;
    scud = null;
    cmu = null;
    choy = null;
    System.out.print("\f");
    appendix = 0;

    try {
      appendix = System.in.available();
    } catch (java.lang.Exception salaam) {
    }

    if (appendix <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double worldScope, westSmall;
      int wordStoredBoundary;
      emulation.Mock hrs;
      worldScope = 0;
      westSmall = 0;
      wordStoredBoundary = 0;

      try {
        java.util.Scanner qwerty;
        qwerty = new java.util.Scanner(System.in);
        westSmall = qwerty.nextDouble();
        worldScope = qwerty.nextDouble();
        wordStoredBoundary = qwerty.nextInt();
      } catch (java.lang.Exception officio) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      hrs = new emulation.Mock(10000000, westSmall, worldScope);
      cache.Storeroom.prepareCachingRestrictions(wordStoredBoundary);
      hrs.initiate();
    }
  }

  {
    q = "";
    r = null;
    waffen = null;
    righ = null;
  }
}
