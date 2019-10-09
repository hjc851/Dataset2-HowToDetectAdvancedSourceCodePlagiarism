import java.util.Scanner;
import space.Storeroom;
import experiment.Synthesizer;
import java.lang.String;
import breeder.Fabricator;

public class Abelian {
  String q = "";
  Fabricator r = null;
  Fabricator waffen = null;
  Fabricator righ = null;

  public static void main(String[] string) {
    String bcl = "";
    String yt = "";
    String z = "";
    Fabricator leong = null;
    Fabricator emt = null;
    Fabricator nlsy = null;
    Fabricator wor = null;
    System.out.print("\f");
    int ay = 0;

    try {
      ay = System.in.available();
    } catch (java.lang.Exception samad) {
    }

    if (ay <= 0) {
      System.out.println("ERROR: System.in is empty, no file was passed or it is empty");
    } else {
      double timeWander = 0, windMeanspirited = 0;
      int willSpaceRestricts = 0;

      try {
        java.util.Scanner qwerty = new java.util.Scanner(System.in);
        windMeanspirited = qwerty.nextDouble();
        timeWander = qwerty.nextDouble();
        willSpaceRestricts = qwerty.nextInt();
      } catch (java.lang.Exception abe) {
        System.out.println(
            "ERROR: There are not enough values or the values passed are in the incorrect format");
        System.out.println(
            "       Values should be in the form mean (double) rng (double) storageLimit (int)");
        return;
      }
      experiment.Synthesizer affirmative =
          new experiment.Synthesizer(10000000, windMeanspirited, timeWander);
      space.Storeroom.putStorehouseRestrict(willSpaceRestricts);
      affirmative.commencement();
    }
  }
}
