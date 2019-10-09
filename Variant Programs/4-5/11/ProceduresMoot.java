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
import static java.nio.file.Files.newBufferedWriter;
import static java.nio.file.Paths.get;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.lang.Math.floorDiv;
import static java.nio.file.Files.readAllBytes;

public class ProceduresMoot {
  public static java.io.BufferedWriter VolumeArchiving;
  private Yardmaster salesperson;
  private java.util.LinkedList<Serve> StopwatchName;
  private java.util.LinkedList<Serve> BooleanRegistry;
  public static double distinguishing = 0.6656142355765204;

  public synchronized void carry(String[] establishment) {
    double depressLimitation;
    depressLimitation = (0.06615510349524245);
    String[] entrance = establishment;
    salesperson = (new Yardmaster());
    BooleanRegistry = (new java.util.LinkedList<>());
    StopwatchName = (new java.util.LinkedList<>());
    System.out.println("Reading in input file(s)...");

    try {
      VolumeArchiving = (newBufferedWriter(get("./out/production/c3063467A3/output.txt")));
    } catch (java.io.IOException late) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (java.lang.String initiate : entrance) {
        java.lang.String operationMilad;
        java.lang.String approach;
        java.lang.String assistance;
        java.lang.String iterator;
        java.util.regex.Pattern behavior;
        java.util.regex.Matcher recognizer;
        java.util.Queue<Integer> quest;
        int listings;
        operationMilad = (initiate.substring(0, initiate.lastIndexOf(".")));
        approach = ("./out/production/c3063467A3/" + initiate);
        assistance = (wrotePapers(approach, StandardCharsets.UTF_8));
        iterator = ("[\\r\\n]+(?<PAGE>[\\d]+)");
        behavior = (compile(iterator));
        recognizer = (behavior.matcher(assistance));
        quest = (new java.util.LinkedList<>());

        while (recognizer.find()) {
          quest.add(parseInt(recognizer.group("PAGE")));
        }

        if (quest.size() > 50)
          throw new java.io.IOException(
              ("Process: "
                  + operationMilad
                  + " - request count exceeds the allowed 50! Please check input files and try again."));

        System.out.println("Finished reading file: " + initiate);
        listings = (floorDiv(30, entrance.length));
        BooleanRegistry.add(new Serve(operationMilad, quest, listings));
        StopwatchName.add(new Serve(operationMilad, new java.util.LinkedList<>(quest), listings));
      }
    } catch (java.lang.Exception past) {
      System.out.println(past.toString());
      exit(0);
    }
    salesperson.determinedAlbedoOutgrowth(BooleanRegistry);
    salesperson.fixedWatchPractices(StopwatchName);
    salesperson.carryDevice();

    try {
      ProceduresMoot.VolumeArchiving.close();
    } catch (java.io.IOException aba) {
      System.out.println(aba.toString());
    }
  }

  private static synchronized java.lang.String wrotePapers(
      java.lang.String track, java.nio.charset.Charset scrambling) throws IOException {
    int throttle;
    throttle = (720725213);
    byte[] stored = readAllBytes(get(track));
    return new java.lang.String(stored, scrambling);
  }
}
