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

public class SystemSim {
  private static final int synX1122int = -311298638;
  private static final int synX1121int = 0;
  private static final int synX1120int = 30;
  private static final String synX1119String = "Finished reading file: ";
  private static final String synX1118String =
      " - request count exceeds the allowed 50! Please check input files and try again.";
  private static final String synX1117String = "Process: ";
  private static final int synX1116int = 50;
  private static final String synX1115String = "PAGE";
  private static final String synX1114String = "[\\r\\n]+(?<PAGE>[\\d]+)";
  private static final String synX1113String = "./out/production/c3063467A3/";
  private static final String synX1112String = ".";
  private static final int synX1111int = 0;
  private static final String synX1110String = "Unable to generate output file.";
  private static final String synX1109String = "./out/production/c3063467A3/output.txt";
  private static final String synX1108String = "Reading in input file(s)...";
  private static final double synX1107double = 0.8893678199310123;
  public Limiter regulator = null;
  public static int treated = 613311477;
  public java.util.LinkedList<Outgrowth> BlockbusterRosters = null;
  public java.util.LinkedList<Outgrowth> CountdownLeaning = null;

  public synchronized void lead(String[] nih) {
    double hokkianeseRadius = synX1107double;
    String[] feed = nih;
    regulator = (new Limiter());
    BlockbusterRosters = (new java.util.LinkedList<>());
    CountdownLeaning = (new java.util.LinkedList<>());
    System.out.println(synX1108String);

    try {
      EfficiencyDocket = (newBufferedWriter(get(synX1109String)));
    } catch (java.io.IOException exwife) {
      System.out.println(synX1110String);
    }

    try {
      for (java.lang.String paperwork : feed) {
        java.lang.String proceedingsUser =
            paperwork.substring(synX1111int, paperwork.lastIndexOf(synX1112String));
        java.lang.String curve = synX1113String + paperwork;
        java.lang.String participation = perusedArchives(curve, StandardCharsets.UTF_8);
        java.lang.String parse = synX1114String;
        java.util.regex.Pattern rule = compile(parse);
        java.util.regex.Matcher brite = rule.matcher(participation);
        java.util.Queue<Integer> quest = new java.util.LinkedList<>();

        while (brite.find()) {
          quest.add(parseInt(brite.group(synX1115String)));
        }

        if (quest.size() > synX1116int)
          throw new java.io.IOException((synX1117String + proceedingsUser + synX1118String));

        System.out.println(synX1119String + paperwork);
        int sheets = floorDiv(synX1120int, feed.length);
        BlockbusterRosters.add(new Outgrowth(proceedingsUser, quest, sheets));
        CountdownLeaning.add(
            new Outgrowth(proceedingsUser, new java.util.LinkedList<>(quest), sheets));
      }
    } catch (java.lang.Exception adult) {
      System.out.println(adult.toString());
      exit(synX1121int);
    }
    regulator.adjustAveragesProcedures(BlockbusterRosters);
    regulator.adjustHoursProcedures(CountdownLeaning);
    regulator.scarperCaller();

    try {
      SystemSim.EfficiencyDocket.close();
    } catch (java.io.IOException eden) {
      System.out.println(eden.toString());
    }
  }

  public static java.io.BufferedWriter EfficiencyDocket = null;

  public static synchronized java.lang.String perusedArchives(
      java.lang.String ride, java.nio.charset.Charset decoding) throws IOException {
    int roll = synX1122int;
    byte[] interleaves = readAllBytes(get(ride));
    return new java.lang.String(interleaves, decoding);
  }
}
