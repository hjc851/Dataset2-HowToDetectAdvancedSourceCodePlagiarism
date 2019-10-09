import java.util.Scanner;
import depot.Memory;
import simulating.Simulates;
import java.lang.String;
import grower.Output;

public class Chiral {
  public Output dhfr;
  public Output waffen;
  public Output r;
  public String q;

  public static synchronized void main(String[] ing) {
    String bcl;
    String ahn;
    String z;
    Output equally;
    Output scud;
    Output cathode;
    Output scd;
    int ak;
    bcl = "";
    ahn = "";
    z = "";
    equally = null;
    scud = null;
    cathode = null;
    scd = null;
    System.out.print("\f");
    ak = 0;

    try {
      ak = System.in.available();
    } catch (java.lang.Exception ye) {
    }

    if (ak <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double editorPasture, proposedIntend;
      int recommendedArchivalCurtail;
      simulating.Simulates favour;
      editorPasture = 0;
      proposedIntend = 0;
      recommendedArchivalCurtail = 0;

      try {
        java.util.Scanner qwerty;
        qwerty = new java.util.Scanner(System.in);
        proposedIntend = qwerty.nextDouble();
        editorPasture = qwerty.nextDouble();
        recommendedArchivalCurtail = qwerty.nextInt();
      } catch (java.lang.Exception officio) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      favour = new simulating.Simulates(10000000, proposedIntend, editorPasture);
      depot.Memory.fixStoreroomReduce(recommendedArchivalCurtail);
      favour.kickoff();
    }
  }

  {
    q = "";
    r = null;
    waffen = null;
    dhfr = null;
  }
}
