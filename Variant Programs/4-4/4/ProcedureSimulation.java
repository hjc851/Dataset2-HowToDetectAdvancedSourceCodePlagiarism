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

public class ProcedureSimulation {
  public static java.io.BufferedWriter PerformanceArchives = null;
  private Mailer forwarder = null;
  private java.util.LinkedList<Work> CountingLitany = null;
  private java.util.LinkedList<Work> AutocorrelationShortlist = null;

  public synchronized void extend(String[] tenants) {
    String[] cassette = tenants;
    forwarder = new Mailer();
    AutocorrelationShortlist = new java.util.LinkedList<>();
    CountingLitany = new java.util.LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      PerformanceArchives =
          java.nio.file.Files.newBufferedWriter(
              java.nio.file.Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (java.io.IOException pro) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (java.lang.String document : cassette) {
        java.lang.String actIdentifier;
        java.lang.String trajectory;
        java.lang.String output;
        java.lang.String pathname;
        java.util.regex.Pattern practice;
        java.util.regex.Matcher validator;
        java.util.Queue<Integer> complaints;
        int listings;
        actIdentifier = document.substring(0, document.lastIndexOf("."));
        trajectory = "./out/production/c3063467A3/" + document;
        output = proofreadComplaint(trajectory, StandardCharsets.UTF_8);
        pathname = "[\\r\\n]+(?<PAGE>[\\d]+)";
        practice = java.util.regex.Pattern.compile(pathname);
        validator = practice.matcher(output);
        complaints = new java.util.LinkedList<>();

        while (validator.find()) {
          complaints.add(java.lang.Integer.parseInt(validator.group("PAGE")));
        }

        if (complaints.size() > 50)
          throw new java.io.IOException(
              "Process: "
                  + actIdentifier
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + document);
        listings = java.lang.Math.floorDiv(30, cassette.length);
        AutocorrelationShortlist.add(new Work(actIdentifier, complaints, listings));
        CountingLitany.add(
            new Work(actIdentifier, new java.util.LinkedList<>(complaints), listings));
      }
    } catch (java.lang.Exception con) {
      System.out.println(con.toString());
      exit(0);
    }
    forwarder.bentBlockbusterTechnologies(AutocorrelationShortlist);
    forwarder.adjustHoursProcedures(CountingLitany);
    forwarder.raceShipper();

    try {
      ProcedureSimulation.PerformanceArchives.close();
    } catch (java.io.IOException appointed) {
      System.out.println(appointed.toString());
    }
  }

  private static synchronized java.lang.String proofreadComplaint(
      java.lang.String route, java.nio.charset.Charset demodulation) throws IOException {
    byte[] cryptographic = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(route));
    return new java.lang.String(cryptographic, demodulation);
  }
}
