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
  public java.util.LinkedList<Methods> StopwatchName = null;
  public java.util.LinkedList<Methods> AlbedoBlacklist = null;

  public static synchronized java.lang.String writtenFilename(
      java.lang.String footpath, java.nio.charset.Charset decoding) throws IOException {
    byte[] instantiated = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(footpath));
    return new java.lang.String(instantiated, decoding);
  }

  public Limiter mailer = null;

  public synchronized void outpouring(String[] incumbents) {
    String[] entry = incumbents;
    mailer = new Limiter();
    AlbedoBlacklist = new java.util.LinkedList<>();
    StopwatchName = new java.util.LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      ProducedExecutable =
          java.nio.file.Files.newBufferedWriter(
              java.nio.file.Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (java.io.IOException con) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (java.lang.String archiving : entry) {
        java.lang.String appendageFinger;
        java.lang.String direction;
        java.lang.String contributions;
        java.lang.String parser;
        java.util.regex.Pattern form;
        java.util.regex.Matcher aspx;
        java.util.Queue<Integer> wishes;
        int leafs;
        appendageFinger = archiving.substring(0, archiving.lastIndexOf("."));
        direction = "./out/production/c3063467A3/" + archiving;
        contributions = writtenFilename(direction, StandardCharsets.UTF_8);
        parser = "[\\r\\n]+(?<PAGE>[\\d]+)";
        form = java.util.regex.Pattern.compile(parser);
        aspx = form.matcher(contributions);
        wishes = new java.util.LinkedList<>();

        while (aspx.find()) {
          wishes.add(java.lang.Integer.parseInt(aspx.group("PAGE")));
        }

        if (wishes.size() > 50)
          throw new java.io.IOException(
              "Process: "
                  + appendageFinger
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + archiving);
        leafs = java.lang.Math.floorDiv(30, entry.length);
        AlbedoBlacklist.add(new Methods(appendageFinger, wishes, leafs));
        StopwatchName.add(new Methods(appendageFinger, new java.util.LinkedList<>(wishes), leafs));
      }
    } catch (java.lang.Exception late) {
      System.out.println(late.toString());
      exit(0);
    }
    mailer.determineCartelProces(AlbedoBlacklist);
    mailer.prepareDialMethodologies(StopwatchName);
    mailer.ramRegulator();

    try {
      SummonsFaker.ProducedExecutable.close();
    } catch (java.io.IOException exwife) {
      System.out.println(exwife.toString());
    }
  }

  public static java.io.BufferedWriter ProducedExecutable = null;
}
