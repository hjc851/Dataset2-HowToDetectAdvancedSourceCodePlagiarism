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

public class MethodologyEmulator {
  public static java.io.BufferedWriter YieldRegister = null;
  public Sender distributors = null;
  public java.util.LinkedList<Work> SynchNames = null;
  public java.util.LinkedList<Work> BooleanRegistry = null;

  public synchronized void tally(String[] establishment) {
    String[] assistance = establishment;
    distributors = new Sender();
    BooleanRegistry = new java.util.LinkedList<>();
    SynchNames = new java.util.LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      YieldRegister =
          java.nio.file.Files.newBufferedWriter(
              java.nio.file.Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (java.io.IOException combatants) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (java.lang.String folders : assistance) {
        java.lang.String sueIbid;
        java.lang.String track;
        java.lang.String stimulant;
        java.lang.String namespace;
        java.util.regex.Pattern motif;
        java.util.regex.Matcher epilator;
        java.util.Queue<Integer> asking;
        int impressions;
        sueIbid = folders.substring(0, folders.lastIndexOf("."));
        track = "./out/production/c3063467A3/" + folders;
        stimulant = sayFolder(track, StandardCharsets.UTF_8);
        namespace = "[\\r\\n]+(?<PAGE>[\\d]+)";
        motif = java.util.regex.Pattern.compile(namespace);
        epilator = motif.matcher(stimulant);
        asking = new java.util.LinkedList<>();

        while (epilator.find()) {
          asking.add(java.lang.Integer.parseInt(epilator.group("PAGE")));
        }

        if (asking.size() > 50)
          throw new java.io.IOException(
              "Process: "
                  + sueIbid
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + folders);
        impressions = java.lang.Math.floorDiv(30, assistance.length);
        BooleanRegistry.add(new Work(sueIbid, asking, impressions));
        SynchNames.add(new Work(sueIbid, new java.util.LinkedList<>(asking), impressions));
      }
    } catch (java.lang.Exception voto) {
      System.out.println(voto.toString());
      exit(0);
    }
    distributors.rigidDMethod(BooleanRegistry);
    distributors.rigidDayMethod(SynchNames);
    distributors.passMailer();

    try {
      MethodologyEmulator.YieldRegister.close();
    } catch (java.io.IOException abbe) {
      System.out.println(abbe.toString());
    }
  }

  public static synchronized java.lang.String sayFolder(
      java.lang.String step, java.nio.charset.Charset codified) throws IOException {
    byte[] decrypt = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(step));
    return new java.lang.String(decrypt, codified);
  }
}
