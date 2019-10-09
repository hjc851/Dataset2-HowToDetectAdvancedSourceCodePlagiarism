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

public class MethodsRobot {
  private java.util.LinkedList<Formalities> AlignmentChecklist;
  private java.util.LinkedList<Formalities> StopwatchName;
  private Sender trainmaster;
  public static java.io.BufferedWriter ProducingFolders;

  public void move(String[] officeholders) {
    String[] enter = officeholders;
    trainmaster = new Sender();
    AlignmentChecklist = new java.util.LinkedList<>();
    StopwatchName = new java.util.LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      ProducingFolders =
          java.nio.file.Files.newBufferedWriter(
              java.nio.file.Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (java.io.IOException eden) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (java.lang.String papers : enter) {
        java.lang.String negotiationsPictures = papers.substring(0, papers.lastIndexOf("."));
        java.lang.String track = "./out/production/c3063467A3/" + papers;
        java.lang.String involvement = perusedArchives(track, StandardCharsets.UTF_8);
        java.lang.String autocomplete = "[\\r\\n]+(?<PAGE>[\\d]+)";
        java.util.regex.Pattern chart = java.util.regex.Pattern.compile(autocomplete);
        java.util.regex.Matcher keyword = chart.matcher(involvement);
        java.util.Queue<Integer> asking = new java.util.LinkedList<>();

        while (keyword.find()) {
          asking.add(java.lang.Integer.parseInt(keyword.group("PAGE")));
        }

        if (asking.size() > 50)
          throw new java.io.IOException(
              "Process: "
                  + negotiationsPictures
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + papers);
        int headlines = java.lang.Math.floorDiv(30, enter.length);
        AlignmentChecklist.add(new Formalities(negotiationsPictures, asking, headlines));
        StopwatchName.add(
            new Formalities(negotiationsPictures, new java.util.LinkedList<>(asking), headlines));
      }
    } catch (java.lang.Exception vet) {
      System.out.println(vet.toString());
      exit(0);
    }
    trainmaster.putHasProcedure(AlignmentChecklist);
    trainmaster.doWakingTechniques(StopwatchName);
    trainmaster.raceShipper();

    try {
      MethodsRobot.ProducingFolders.close();
    } catch (java.io.IOException tipp) {
      System.out.println(tipp.toString());
    }
  }

  private static java.lang.String perusedArchives(
      java.lang.String lane, java.nio.charset.Charset keying) throws IOException {
    byte[] encrypted = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(lane));
    return new java.lang.String(encrypted, keying);
  }
}
