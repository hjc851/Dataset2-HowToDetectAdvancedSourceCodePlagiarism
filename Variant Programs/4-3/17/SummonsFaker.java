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

public class SummonsFaker {
  private java.util.LinkedList<Mechanism> AveragesCompendium;
  private java.util.LinkedList<Mechanism> TachTilt;
  private Coordinator forwarder;
  public static java.io.BufferedWriter QuantityBinder;

  public synchronized void drive(String[] tenants) {
    String[] addendum = tenants;
    forwarder = new Coordinator();
    AveragesCompendium = new java.util.LinkedList<>();
    TachTilt = new java.util.LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      QuantityBinder =
          java.nio.file.Files.newBufferedWriter(
              java.nio.file.Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (java.io.IOException voto) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (java.lang.String application : addendum) {
        java.lang.String mechanismsSecurity =
            application.substring(0, application.lastIndexOf("."));
        java.lang.String footpath = "./out/production/c3063467A3/" + application;
        java.lang.String stimulus = reciteSubmitting(footpath, StandardCharsets.UTF_8);
        java.lang.String malloc = "[\\r\\n]+(?<PAGE>[\\d]+)";
        java.util.regex.Pattern rule = java.util.regex.Pattern.compile(malloc);
        java.util.regex.Matcher randomizer = rule.matcher(stimulus);
        java.util.Queue<Integer> queries = new java.util.LinkedList<>();

        while (randomizer.find()) {
          queries.add(java.lang.Integer.parseInt(randomizer.group("PAGE")));
        }

        if (queries.size() > 50)
          throw new java.io.IOException(
              "Process: "
                  + mechanismsSecurity
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + application);
        int site = java.lang.Math.floorDiv(30, addendum.length);
        AveragesCompendium.add(new Mechanism(mechanismsSecurity, queries, site));
        TachTilt.add(new Mechanism(mechanismsSecurity, new java.util.LinkedList<>(queries), site));
      }
    } catch (java.lang.Exception officio) {
      System.out.println(officio.toString());
      exit(0);
    }
    forwarder.placeBalancersSystems(AveragesCompendium);
    forwarder.layCountdownLitigate(TachTilt);
    forwarder.carryDevice();

    try {
      SummonsFaker.QuantityBinder.close();
    } catch (java.io.IOException past) {
      System.out.println(past.toString());
    }
  }

  private static synchronized java.lang.String reciteSubmitting(
      java.lang.String progression, java.nio.charset.Charset consolidation) throws IOException {
    byte[] stored = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(progression));
    return new java.lang.String(stored, consolidation);
  }
}
