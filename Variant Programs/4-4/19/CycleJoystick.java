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

public class CycleJoystick {

  private static synchronized java.lang.String rereadSubmitted(
      java.lang.String roadway, java.nio.charset.Charset encryption) throws IOException {
    byte[] codified = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(roadway));
    return new java.lang.String(codified, encryption);
  }

  public static java.io.BufferedWriter TurnoutCharge = null;
  private Caller dealer = null;
  private java.util.LinkedList<Sue> CartesianBibliography = null;

  public synchronized void prevail(String[] officeholders) {
    String[] trash = officeholders;
    dealer = new Caller();
    CartesianBibliography = new java.util.LinkedList<>();
    SyncChecklist = new java.util.LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      TurnoutCharge =
          java.nio.file.Files.newBufferedWriter(
              java.nio.file.Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (java.io.IOException pro) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (java.lang.String application : trash) {
        java.lang.String proceedingPeg = application.substring(0, application.lastIndexOf("."));
        java.lang.String journey = "./out/production/c3063467A3/" + application;
        java.lang.String suggestions = rereadSubmitted(journey, StandardCharsets.UTF_8);
        java.lang.String emacs = "[\\r\\n]+(?<PAGE>[\\d]+)";
        java.util.regex.Pattern form = java.util.regex.Pattern.compile(emacs);
        java.util.regex.Matcher epilator = form.matcher(suggestions);
        java.util.Queue<Integer> inquiries = new java.util.LinkedList<>();

        while (epilator.find()) {
          inquiries.add(java.lang.Integer.parseInt(epilator.group("PAGE")));
        }

        if (inquiries.size() > 50)
          throw new java.io.IOException(
              "Process: "
                  + proceedingPeg
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + application);
        int impressions = java.lang.Math.floorDiv(30, trash.length);
        CartesianBibliography.add(new Sue(proceedingPeg, inquiries, impressions));
        SyncChecklist.add(
            new Sue(proceedingPeg, new java.util.LinkedList<>(inquiries), impressions));
      }
    } catch (java.lang.Exception post) {
      System.out.println(post.toString());
      exit(0);
    }
    dealer.fixCryptographyMechanism(CartesianBibliography);
    dealer.arrangedTimerAct(SyncChecklist);
    dealer.outpouringPlenum();

    try {
      CycleJoystick.TurnoutCharge.close();
    } catch (java.io.IOException appointed) {
      System.out.println(appointed.toString());
    }
  }

  private java.util.LinkedList<Sue> SyncChecklist = null;
}
