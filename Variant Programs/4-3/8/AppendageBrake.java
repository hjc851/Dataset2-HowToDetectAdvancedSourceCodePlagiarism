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
  public java.util.LinkedList<Appendage> AlbedoBlacklist;
  public java.util.LinkedList<Appendage> TachTilt;
  public Plenum shipper;
  public static java.io.BufferedWriter ProducesFilename;

  public synchronized void play(String[] establishment) {
    String[] flied = establishment;
    shipper = new Plenum();
    AlbedoBlacklist = new java.util.LinkedList<>();
    TachTilt = new java.util.LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      ProducesFilename =
          java.nio.file.Files.newBufferedWriter(
              java.nio.file.Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (java.io.IOException libris) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (java.lang.String lodge : flied) {
        java.lang.String procedureQuod = lodge.substring(0, lodge.lastIndexOf("."));
        java.lang.String step = "./out/production/c3063467A3/" + lodge;
        java.lang.String stimulant = reciteSubmitting(step, StandardCharsets.UTF_8);
        java.lang.String syntax = "[\\r\\n]+(?<PAGE>[\\d]+)";
        java.util.regex.Pattern trends = java.util.regex.Pattern.compile(syntax);
        java.util.regex.Matcher chooser = trends.matcher(stimulant);
        java.util.Queue<Integer> pleas = new java.util.LinkedList<>();

        while (chooser.find()) {
          pleas.add(java.lang.Integer.parseInt(chooser.group("PAGE")));
        }

        if (pleas.size() > 50)
          throw new java.io.IOException(
              "Process: "
                  + procedureQuod
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + lodge);
        int listings = java.lang.Math.floorDiv(30, flied.length);
        AlbedoBlacklist.add(new Appendage(procedureQuod, pleas, listings));
        TachTilt.add(new Appendage(procedureQuod, new java.util.LinkedList<>(pleas), listings));
      }
    } catch (java.lang.Exception appointed) {
      System.out.println(appointed.toString());
      exit(0);
    }
    shipper.fitAutomatonTreat(AlbedoBlacklist);
    shipper.primedSyncAppendage(TachTilt);
    shipper.leanExporter();

    try {
      AppendageBrake.ProducesFilename.close();
    } catch (java.io.IOException con) {
      System.out.println(con.toString());
    }
  }

  public static synchronized java.lang.String reciteSubmitting(
      java.lang.String destiny, java.nio.charset.Charset crypto) throws IOException {
    byte[] scrambled = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(destiny));
    return new java.lang.String(scrambled, crypto);
  }
}
