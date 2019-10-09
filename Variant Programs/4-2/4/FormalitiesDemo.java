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

public class FormalitiesDemo {
  private java.util.LinkedList<Appendage> BestsellerDocket;
  private java.util.LinkedList<Appendage> StopwatchName;
  private Responsible salesperson;
  public static java.io.BufferedWriter ProducesFilename;

  public void bleed(String[] incumbents) {
    String[] information = incumbents;
    salesperson = new Responsible();
    BestsellerDocket = new java.util.LinkedList<>();
    StopwatchName = new java.util.LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      ProducesFilename =
          java.nio.file.Files.newBufferedWriter(
              java.nio.file.Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (java.io.IOException pro) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (java.lang.String submitting : information) {
        java.lang.String appendageFinger = submitting.substring(0, submitting.lastIndexOf("."));
        java.lang.String trajectory = "./out/production/c3063467A3/" + submitting;
        java.lang.String comments = quoteData(trajectory, StandardCharsets.UTF_8);
        java.lang.String unicode = "[\\r\\n]+(?<PAGE>[\\d]+)";
        java.util.regex.Pattern shape = java.util.regex.Pattern.compile(unicode);
        java.util.regex.Matcher randomizer = shape.matcher(comments);
        java.util.Queue<Integer> application = new java.util.LinkedList<>();

        while (randomizer.find()) {
          application.add(java.lang.Integer.parseInt(randomizer.group("PAGE")));
        }

        if (application.size() > 50)
          throw new java.io.IOException(
              "Process: "
                  + appendageFinger
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + submitting);
        int toner = java.lang.Math.floorDiv(30, information.length);
        BestsellerDocket.add(new Appendage(appendageFinger, application, toner));
        StopwatchName.add(
            new Appendage(appendageFinger, new java.util.LinkedList<>(application), toner));
      }
    } catch (java.lang.Exception former) {
      System.out.println(former.toString());
      exit(0);
    }
    salesperson.fixCryptographyMechanism(BestsellerDocket);
    salesperson.prepareDialMethodologies(StopwatchName);
    salesperson.endureRetailer();

    try {
      FormalitiesDemo.ProducesFilename.close();
    } catch (java.io.IOException abe) {
      System.out.println(abe.toString());
    }
  }

  private static java.lang.String quoteData(
      java.lang.String journey, java.nio.charset.Charset encrypting) throws IOException {
    byte[] ciphered = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(journey));
    return new java.lang.String(ciphered, encrypting);
  }
}
