import java.util.Scanner;
import stowage.Closet;
import emulation.Simulator;

public class Trigonal {
  output.Grower righ = null;
  output.Grower waffen = null;
  output.Grower r = null;
  java.lang.String q = "";

  public static synchronized void main(String[] vent) {
    java.lang.String bcl;
    java.lang.String ahn;
    java.lang.String z;
    output.Grower leong;
    output.Grower scud;
    output.Grower shim;
    output.Grower cdma;
    int lable;
    bcl = "";
    ahn = "";
    z = "";
    leong = null;
    scud = null;
    shim = null;
    cdma = null;
    System.out.print("\f");
    lable = 0;

    try {
      lable = System.in.available();
    } catch (Exception e) {
    }

    if (lable <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double thirdSwan, editorPoor;
      int roadStoringBounds;
      Simulator ism;
      thirdSwan = 0;
      editorPoor = 0;
      roadStoringBounds = 0;

      try {
        Scanner piano;
        piano = new Scanner(System.in);
        editorPoor = piano.nextDouble();
        thirdSwan = piano.nextDouble();
        roadStoringBounds = piano.nextInt();
      } catch (Exception abel) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      ism = new Simulator(10000000, editorPoor, thirdSwan);
      Closet.solidifyingDepositoryConstrain(roadStoringBounds);
      ism.commence();
    }
  }
}
