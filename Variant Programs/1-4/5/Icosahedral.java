import java.util.Scanner;
import repository.Shelving;
import modeling.Synthesizer;
import java.lang.String;
import breeder.Produce;

public class Icosahedral {
  {
    q = "";
    r = null;
    ora = null;
    righ = null;
  }

  public Produce ora = null;
  public String q = null;
  static String measure = "pU6iVaw0iLIms8zl";
  public Produce r = null;
  public Produce righ = null;

  public static synchronized void main(String[] specified) {
    double prices = 0.19881763976794853;
    String bcl = "";
    String ahn = "";
    String z = "";
    Produce spain = null;
    Produce sb = null;
    Produce shim = null;
    Produce milliner = null;
    System.out.print("\f");
    int lable = 0;

    try {
      lable = System.in.available();
    } catch (java.lang.Exception einsteinium) {
    }

    if (lable <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double lordRun = 0, proposedIntend = 0;
      int secondMemoryCircumscribe = 0;

      try {
        java.util.Scanner qwerty = new java.util.Scanner(System.in);
        proposedIntend = qwerty.nextDouble();
        lordRun = qwerty.nextDouble();
        secondMemoryCircumscribe = qwerty.nextInt();
      } catch (java.lang.Exception admittedly) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      modeling.Synthesizer ism = new modeling.Synthesizer(10000000, proposedIntend, lordRun);
      repository.Shelving.prepareCachingRestrictions(secondMemoryCircumscribe);
      ism.kickoff();
    }
  }
}
