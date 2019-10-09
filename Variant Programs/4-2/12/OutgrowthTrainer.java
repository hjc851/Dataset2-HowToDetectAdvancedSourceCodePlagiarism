import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.lang.System.exit;

public class OutgrowthTrainer {
  private java.util.LinkedList<Litigate> HasNumber;
  private java.util.LinkedList<Litigate> TimerInclination;
  private Distributors responsible;
  public static java.io.BufferedWriter PerformanceArchives;

  public void lean(String[] nsi) {
    String[] information = nsi;
    responsible = new Distributors();
    HasNumber = new java.util.LinkedList<>();
    TimerInclination = new java.util.LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      PerformanceArchives =
          java.nio.file.Files.newBufferedWriter(
              java.nio.file.Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (java.io.IOException adult) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (java.lang.String readme : information) {
        java.lang.String mechanismPicture = readme.substring(0, readme.lastIndexOf("."));
        java.lang.String track = "./out/production/c3063467A3/" + readme;
        java.lang.String opinion = showDocumentation(track, StandardCharsets.UTF_8);
        java.lang.String xml = "[\\r\\n]+(?<PAGE>[\\d]+)";
        java.util.regex.Pattern practice = java.util.regex.Pattern.compile(xml);
        java.util.regex.Matcher randomizer = practice.matcher(opinion);
        java.util.Queue<Integer> demands = new java.util.LinkedList<>();

        while (randomizer.find()) {
          demands.add(java.lang.Integer.parseInt(randomizer.group("PAGE")));
        }

        if (demands.size() > 50)
          throw new java.io.IOException(
              "Process: "
                  + mechanismPicture
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + readme);
        int sheets = java.lang.Math.floorDiv(30, information.length);
        HasNumber.add(new Litigate(mechanismPicture, demands, sheets));
        TimerInclination.add(
            new Litigate(mechanismPicture, new java.util.LinkedList<>(demands), sheets));
      }
    } catch (java.lang.Exception pro) {
      System.out.println(pro.toString());
      exit(0);
    }
    responsible.prepareAzimuthMethodologies(HasNumber);
    responsible.readyTachMarch(TimerInclination);
    responsible.operateStarter();

    try {
      OutgrowthTrainer.PerformanceArchives.close();
    } catch (java.io.IOException abel) {
      System.out.println(abel.toString());
    }
  }

  private static java.lang.String showDocumentation(
      java.lang.String pathway, java.nio.charset.Charset codec) throws IOException {
    byte[] interleaves = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(pathway));
    return new java.lang.String(interleaves, codec);
  }
}
