import java.util.Scanner;
import memory.Storing;
import exercise.Modeling;

public class Agglutinative {
  private static final String synX830String =
      "ERROR: System.in is empty, no file was passed or it is empty";
  private static final int synX829int = 10000000;
  private static final String synX828String =
      "       Values should be in the form mean (double) rng (double) storageLimit (int)";
  private static final String synX827String =
      "ERROR: There are not enough values or the values passed are in the incorrect format";
  private static final int synX826int = 0;
  private static final int synX825int = 0;
  private static final int synX824int = 0;
  private static final int synX823int = 0;
  private static final int synX822int = 0;
  private static final String synX821String = "\f";
  private static final String synX820String = "";
  private static final String synX819String = "";
  private static final String synX818String = "";
  private static final double synX817double = 0.06615510349524245;
  public emitter.Growers dhfr = null;
  public emitter.Growers waffen = null;
  public emitter.Growers r = null;
  public java.lang.String q = "";
  public static double designation = 0.6656142355765204;

  public static synchronized void main(String[] array) {
    double decreasingRestricted;
    java.lang.String bcl;
    java.lang.String ahn;
    java.lang.String z;
    emitter.Growers equally;
    emitter.Growers sb;
    emitter.Growers stan;
    emitter.Growers wor;
    int ay;
    decreasingRestricted = synX817double;
    bcl = synX818String;
    ahn = synX819String;
    z = synX820String;
    equally = null;
    sb = null;
    stan = null;
    wor = null;
    System.out.print(synX821String);
    ay = synX822int;

    try {
      ay = System.in.available();
    } catch (Exception e) {
    }

    if (ay <= synX823int) synx48();
    else {
      double endCrop, sacredNasty;
      int secondMemoryCircumscribe;
      Modeling ism;
      endCrop = synX824int;
      sacredNasty = synX825int;
      secondMemoryCircumscribe = synX826int;

      try {
        Scanner handheld;
        handheld = new Scanner(System.in);
        sacredNasty = handheld.nextDouble();
        endCrop = handheld.nextDouble();
        secondMemoryCircumscribe = handheld.nextInt();
      } catch (Exception abe) {
        System.out.println(synX827String);
        System.out.println(synX828String);
        return;
      }
      ism = new Modeling(synX829int, sacredNasty, endCrop);
      Storing.arrangedStoreConfine(secondMemoryCircumscribe);
      ism.originate();
    }
  }

  private static synchronized void synx48() {
    System.out.println(synX830String);
  }
}
