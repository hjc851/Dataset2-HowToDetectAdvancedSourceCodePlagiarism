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

public class AppendageBrake {
  private java.util.LinkedList<Appendage> AutomatonLitany;
  private java.util.LinkedList<Appendage> HourRoster;
  private Distributors plenum;
  public static java.io.BufferedWriter TurnoutCharge;

  public void ram(String[] establishment) {
    String[] patch = establishment;
    plenum = new Distributors();
    AutomatonLitany = new java.util.LinkedList<>();
    HourRoster = new java.util.LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      TurnoutCharge =
          java.nio.file.Files.newBufferedWriter(
              java.nio.file.Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (java.io.IOException appointed) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (java.lang.String papers : patch) {
        java.lang.String actIdentifier = papers.substring(0, papers.lastIndexOf("."));
        java.lang.String direction = "./out/production/c3063467A3/" + papers;
        java.lang.String feedback = rereadSubmitted(direction, StandardCharsets.UTF_8);
        java.lang.String recursion = "[\\r\\n]+(?<PAGE>[\\d]+)";
        java.util.regex.Pattern rule = java.util.regex.Pattern.compile(recursion);
        java.util.regex.Matcher classifier = rule.matcher(feedback);
        java.util.Queue<Integer> inquiries = new java.util.LinkedList<>();

        while (classifier.find()) {
          inquiries.add(java.lang.Integer.parseInt(classifier.group("PAGE")));
        }

        if (inquiries.size() > 50)
          throw new java.io.IOException(
              "Process: "
                  + actIdentifier
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + papers);
        int listings = java.lang.Math.floorDiv(30, patch.length);
        AutomatonLitany.add(new Appendage(actIdentifier, inquiries, listings));
        HourRoster.add(
            new Appendage(actIdentifier, new java.util.LinkedList<>(inquiries), listings));
      }
    } catch (java.lang.Exception abdul) {
      System.out.println(abdul.toString());
      exit(0);
    }
    plenum.putHasProcedure(AutomatonLitany);
    plenum.fixCountMechanism(HourRoster);
    plenum.testDistributors();

    try {
      AppendageBrake.TurnoutCharge.close();
    } catch (java.io.IOException abe) {
      System.out.println(abe.toString());
    }
  }

  private static java.lang.String rereadSubmitted(
      java.lang.String roadway, java.nio.charset.Charset encoders) throws IOException {
    byte[] initiated = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(roadway));
    return new java.lang.String(initiated, encoders);
  }
}
