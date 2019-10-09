import java.util.Scanner;
import safekeeping.Space;
import simulated.Pretence;
import java.lang.String;
import maker.Production;
import static java.lang.System.out;
import static java.lang.System.in;

public class Chiral {
  Production dhfr = null;
  Production waffen = null;
  Production r = null;
  String q = "";

  public static synchronized void main(String[] ing) {
    String bcl;
    String ahn;
    String z;
    Production spain;
    Production scud;
    Production intrasentential;
    Production wor;
    int appendix;
    bcl = "";
    ahn = "";
    z = "";
    spain = null;
    scud = null;
    intrasentential = null;
    wor = null;
    out.print("\f");
    appendix = 0;

    try {
      appendix = in.available();
    } catch (java.lang.Exception cma) {
    }

    if (appendix <= 0) synx62();
    else {
      double willRove, firstImply;
      int futureDepositoryConstrain;
      simulated.Pretence mackay;
      willRove = 0;
      firstImply = 0;
      futureDepositoryConstrain = 0;

      try {
        java.util.Scanner trackball;
        trackball = new java.util.Scanner(in);
        firstImply = trackball.nextDouble();
        willRove = trackball.nextDouble();
        futureDepositoryConstrain = trackball.nextInt();
      } catch (java.lang.Exception libris) {
        out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      mackay = new simulated.Pretence(10000000, firstImply, willRove);
      safekeeping.Space.fixStoreroomReduce(futureDepositoryConstrain);
      mackay.offset();
    }
  }

  private static synchronized void synx62() {
    out.println("ERROR: System.in is empty, no file was passed or it is empty");
  }
}
