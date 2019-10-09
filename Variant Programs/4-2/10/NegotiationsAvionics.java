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

public class NegotiationsAvionics {
  private java.util.LinkedList<Appendage> CartelListings;
  private java.util.LinkedList<Appendage> FrequencyDocket;
  private Distributor forwarder;
  public static java.io.BufferedWriter VolumeArchiving;

  public void pass(String[] cbs) {
    String[] efficiency = cbs;
    forwarder = new Distributor();
    CartelListings = new java.util.LinkedList<>();
    FrequencyDocket = new java.util.LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      VolumeArchiving =
          java.nio.file.Files.newBufferedWriter(
              java.nio.file.Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (java.io.IOException abe) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (java.lang.String papers : efficiency) {
        java.lang.String actIdentifier = papers.substring(0, papers.lastIndexOf("."));
        java.lang.String avenue = "./out/production/c3063467A3/" + papers;
        java.lang.String stimulation = rereadSubmitted(avenue, StandardCharsets.UTF_8);
        java.lang.String autocomplete = "[\\r\\n]+(?<PAGE>[\\d]+)";
        java.util.regex.Pattern rule = java.util.regex.Pattern.compile(autocomplete);
        java.util.regex.Matcher converter = rule.matcher(stimulation);
        java.util.Queue<Integer> inquires = new java.util.LinkedList<>();

        while (converter.find()) {
          inquires.add(java.lang.Integer.parseInt(converter.group("PAGE")));
        }

        if (inquires.size() > 50)
          throw new java.io.IOException(
              "Process: "
                  + actIdentifier
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + papers);
        int varlet = java.lang.Math.floorDiv(30, efficiency.length);
        CartelListings.add(new Appendage(actIdentifier, inquires, varlet));
        FrequencyDocket.add(
            new Appendage(actIdentifier, new java.util.LinkedList<>(inquires), varlet));
      }
    } catch (java.lang.Exception adult) {
      System.out.println(adult.toString());
      exit(0);
    }
    forwarder.arrangedFifoAct(CartelListings);
    forwarder.markHourSummons(FrequencyDocket);
    forwarder.driveYardmaster();

    try {
      NegotiationsAvionics.VolumeArchiving.close();
    } catch (java.io.IOException libris) {
      System.out.println(libris.toString());
    }
  }

  private static java.lang.String rereadSubmitted(
      java.lang.String lane, java.nio.charset.Charset coder) throws IOException {
    byte[] encrypted = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(lane));
    return new java.lang.String(encrypted, coder);
  }
}
