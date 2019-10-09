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
  private java.util.LinkedList<Phase> AlignmentChecklist;
  private java.util.LinkedList<Phase> TimeNumber;
  private Shipper dealer;
  public static java.io.BufferedWriter VolumeArchiving;

  public void play(String[] nsi) {
    String[] patch = nsi;
    dealer = new Shipper();
    AlignmentChecklist = new java.util.LinkedList<>();
    TimeNumber = new java.util.LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      VolumeArchiving =
          java.nio.file.Files.newBufferedWriter(
              java.nio.file.Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (java.io.IOException admittedly) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (java.lang.String binder : patch) {
        java.lang.String mechanismPicture = binder.substring(0, binder.lastIndexOf("."));
        java.lang.String progression = "./out/production/c3063467A3/" + binder;
        java.lang.String feedback = reciteSubmitting(progression, StandardCharsets.UTF_8);
        java.lang.String pathname = "[\\r\\n]+(?<PAGE>[\\d]+)";
        java.util.regex.Pattern template = java.util.regex.Pattern.compile(pathname);
        java.util.regex.Matcher variable = template.matcher(feedback);
        java.util.Queue<Integer> applications = new java.util.LinkedList<>();

        while (variable.find()) {
          applications.add(java.lang.Integer.parseInt(variable.group("PAGE")));
        }

        if (applications.size() > 50)
          throw new java.io.IOException(
              "Process: "
                  + mechanismPicture
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + binder);
        int slips = java.lang.Math.floorDiv(30, patch.length);
        AlignmentChecklist.add(new Phase(mechanismPicture, applications, slips));
        TimeNumber.add(
            new Phase(mechanismPicture, new java.util.LinkedList<>(applications), slips));
      }
    } catch (java.lang.Exception officio) {
      System.out.println(officio.toString());
      exit(0);
    }
    dealer.markAverageSummons(AlignmentChecklist);
    dealer.markHourSummons(TimeNumber);
    dealer.leanExporter();

    try {
      MethodsRobot.VolumeArchiving.close();
    } catch (java.io.IOException appointed) {
      System.out.println(appointed.toString());
    }
  }

  private static java.lang.String reciteSubmitting(
      java.lang.String ride, java.nio.charset.Charset demodulation) throws IOException {
    byte[] concatenated = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(ride));
    return new java.lang.String(concatenated, demodulation);
  }
}
