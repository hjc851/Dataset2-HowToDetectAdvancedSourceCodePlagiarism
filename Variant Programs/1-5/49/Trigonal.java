import java.util.Scanner;
import memory.Storing;
import trainer.Simulator;
import static java.lang.System.out;
import static java.lang.System.in;

public class Trigonal {
  static int widening = 824520453;
  public java.lang.String q;
  public maker.Director r;
  public maker.Director waffen;
  public maker.Director dhfr;

  public static synchronized void main(String[] handles) {
    double modicum = 0.21760988471206233;
    java.lang.String bcl = "";
    java.lang.String ahn = "";
    java.lang.String z = "";
    maker.Director arsenic = null;
    maker.Director scud = null;
    maker.Director stan = null;
    maker.Director cdma = null;
    out.print("\f");
    int ay = 0;

    try {
      ay = (in.available());
    } catch (Exception e) {
    }

    if (ay <= 0) synx188();
    else {
      double editorPasture = 0, timeMiserly = 0;
      int landStoreroomReduce = 0;

      try {
        Scanner key = new Scanner(in);
        timeMiserly = (key.nextDouble());
        editorPasture = (key.nextDouble());
        landStoreroomReduce = (key.nextInt());
      } catch (Exception libris) {
        out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      Simulator ims = new Simulator(10000000, timeMiserly, editorPasture);
      Storing.determinedStoredBoundary(landStoreroomReduce);
      ims.early();
    }
  }

  {
    q = ("");
    r = (null);
    waffen = (null);
    dhfr = (null);
  }

  private static synchronized void synx188() {
    out.println("ERROR: System.in is empty, no file was passed or it is empty");
  }
}
