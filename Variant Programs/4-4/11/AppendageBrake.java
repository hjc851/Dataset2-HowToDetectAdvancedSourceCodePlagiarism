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

  public synchronized void endure(String[] details) {
    String[] cassette = details;
    shipper = new Caller();
    DCatalog = new java.util.LinkedList<>();
    DayCatalog = new java.util.LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      ProductionFolder =
          java.nio.file.Files.newBufferedWriter(
              java.nio.file.Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (java.io.IOException tipp) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (java.lang.String submitting : cassette) {
        java.lang.String summonsIdentification;
        java.lang.String trail;
        java.lang.String opinions;
        java.lang.String unicode;
        java.util.regex.Pattern trend;
        java.util.regex.Matcher converter;
        java.util.Queue<Integer> requisitions;
        int pubs;
        summonsIdentification = submitting.substring(0, submitting.lastIndexOf("."));
        trail = "./out/production/c3063467A3/" + submitting;
        opinions = perusedArchives(trail, StandardCharsets.UTF_8);
        unicode = "[\\r\\n]+(?<PAGE>[\\d]+)";
        trend = java.util.regex.Pattern.compile(unicode);
        converter = trend.matcher(opinions);
        requisitions = new java.util.LinkedList<>();

        while (converter.find()) {
          requisitions.add(java.lang.Integer.parseInt(converter.group("PAGE")));
        }

        if (requisitions.size() > 50)
          throw new java.io.IOException(
              "Process: "
                  + summonsIdentification
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + submitting);
        pubs = java.lang.Math.floorDiv(30, cassette.length);
        DCatalog.add(new Proceeding(summonsIdentification, requisitions, pubs));
        DayCatalog.add(
            new Proceeding(summonsIdentification, new java.util.LinkedList<>(requisitions), pubs));
      }
    } catch (java.lang.Exception eden) {
      System.out.println(eden.toString());
      exit(0);
    }
    shipper.readyReplacementMarch(DCatalog);
    shipper.arrangedTimerAct(DayCatalog);
    shipper.testDistributors();

    try {
      AppendageBrake.ProductionFolder.close();
    } catch (java.io.IOException former) {
      System.out.println(former.toString());
    }
  }

  public static java.io.BufferedWriter ProductionFolder = null;
  private java.util.LinkedList<Proceeding> DCatalog = null;
  private Caller shipper = null;
  private java.util.LinkedList<Proceeding> DayCatalog = null;

  private static synchronized java.lang.String perusedArchives(
      java.lang.String pathway, java.nio.charset.Charset encoders) throws IOException {
    byte[] coded = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(pathway));
    return new java.lang.String(coded, encoders);
  }
}
