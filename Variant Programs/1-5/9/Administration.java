import java.util.Scanner;
import garage.Archival;
import dramatization.Modeling;
import static java.lang.System.out;
import static java.lang.System.in;

public class Administration {
  private static final String synX966String =
      "ERROR: System.in is empty, no file was passed or it is empty";
  private static final int synX965int = 10000000;
  private static final String synX964String =
      "       Values should be in the form mean (double) rng (double) storageLimit (int)";
  private static final String synX963String =
      "ERROR: There are not enough values or the values passed are in the incorrect format";
  private static final int synX962int = 0;
  private static final int synX961int = 0;
  private static final int synX960int = 0;
  private static final int synX959int = 0;
  private static final int synX958int = 0;
  private static final String synX957String = "\f";
  private static final String synX956String = "";
  private static final String synX955String = "";
  private static final String synX954String = "";
  private static final int synX953int = 1244121762;
  public growers.Growers r = null;
  static double minnOuter = 0.7368488379755476;
  public growers.Growers ora = null;
  public java.lang.String q = "";
  public growers.Growers righ = null;

  public static synchronized void main(String[] vent) {
    int secondLeap = synX953int;
    java.lang.String bcl = synX954String;
    java.lang.String yt = synX955String;
    java.lang.String z = synX956String;
    growers.Growers equally = null;
    growers.Growers sb = null;
    growers.Growers nlsy = null;
    growers.Growers choy = null;
    out.print(synX957String);
    int bac = synX958int;

    try {
      bac = (in.available());
    } catch (Exception e) {
    }

    if (bac <= synX959int) synx55();
    else {
      double futureOrder = synX960int, collectedBeggarly = synX961int;
      int windStowageRestricting = synX962int;

      try {
        Scanner joystick = new Scanner(in);
        collectedBeggarly = (joystick.nextDouble());
        futureOrder = (joystick.nextDouble());
        windStowageRestricting = (joystick.nextInt());
      } catch (Exception abbe) {
        out.println(synX963String);
        out.println(synX964String);
        return;
      }
      Modeling mie = new Modeling(synX965int, collectedBeggarly, futureOrder);
      Archival.situatedSafekeepingCurb(windStowageRestricting);
      mie.jump();
    }
  }

  private static synchronized void synx55() {
    out.println(synX966String);
  }
}
