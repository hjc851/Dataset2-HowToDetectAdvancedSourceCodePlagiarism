import java.util.Scanner;
import shelving.Stowage;
import pretence.Stimulation;

public class Abelian {
  public provider.Fabricator fh = null;

  public static synchronized void main(String[] using) {
    java.lang.String bcl;
    java.lang.String ahn;
    java.lang.String z;
    provider.Fabricator equally;
    provider.Fabricator emt;
    provider.Fabricator cmu;
    provider.Fabricator echt;
    int appendix;
    bcl = "";
    ahn = "";
    z = "";
    equally = null;
    emt = null;
    cmu = null;
    echt = null;
    System.out.print("\f");
    appendix = 0;

    try {
      appendix = System.in.available();
    } catch (Exception e) {
    }

    if (appendix <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double wayStraddle, recommendedUngenerous;
      int recommendedArchivalCurtail;
      Stimulation shum;
      wayStraddle = 0;
      recommendedUngenerous = 0;
      recommendedArchivalCurtail = 0;

      try {
        Scanner piano;
        piano = new Scanner(System.in);
        recommendedUngenerous = piano.nextDouble();
        wayStraddle = piano.nextDouble();
        recommendedArchivalCurtail = piano.nextInt();
      } catch (Exception adoptee) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      shum = new Stimulation(10000000, recommendedUngenerous, wayStraddle);
      Stowage.fitWarehouseDemarcation(recommendedArchivalCurtail);
      shum.commences();
    }
  }

  public java.lang.String q = "";
  public provider.Fabricator r = null;
  public provider.Fabricator righ = null;
}
