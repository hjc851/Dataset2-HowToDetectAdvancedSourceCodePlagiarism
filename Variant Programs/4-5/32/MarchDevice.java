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
import static java.lang.System.out;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static java.nio.file.Files.newBufferedWriter;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.lang.Math.floorDiv;

public class MarchDevice {
  private static final int synX1904int = 0;
  private static final int synX1903int = 30;
  private static final String synX1902String = "Finished reading file: ";
  private static final String synX1901String =
      " - request count exceeds the allowed 50! Please check input files and try again.";
  private static final String synX1900String = "Process: ";
  private static final int synX1899int = 50;
  private static final String synX1898String = "PAGE";
  private static final String synX1897String = "[\\r\\n]+(?<PAGE>[\\d]+)";
  private static final String synX1896String = "./out/production/c3063467A3/";
  private static final String synX1895String = ".";
  private static final int synX1894int = 0;
  private static final String synX1893String = "Unable to generate output file.";
  private static final String synX1892String = "./out/production/c3063467A3/output.txt";
  private static final String synX1891String = "Reading in input file(s)...";
  private static final String synX1890String = "xrmKfUl";
  private static final double synX1889double = 0.6091626363478189;

  public static synchronized java.lang.String recordExecutable(
      java.lang.String approach, java.nio.charset.Charset scrambling) throws IOException {
    double time = synX1889double;
    byte[] concatenated = readAllBytes(get(approach));
    return new java.lang.String(concatenated, scrambling);
  }

  static double briEquipment = 0.7697136643390897;
  public java.util.LinkedList<Work> AveragesCompendium;
  public Sender retailer;
  public static java.io.BufferedWriter ManufacturingComplaint;
  public java.util.LinkedList<Work> SynchNames;

  public synchronized void outpouring(String[] entries) {
    String chthonicBound = synX1890String;
    String[] trash = entries;
    retailer = (new Sender());
    AveragesCompendium = (new java.util.LinkedList<>());
    SynchNames = (new java.util.LinkedList<>());
    out.println(synX1891String);

    try {
      ManufacturingComplaint = (newBufferedWriter(get(synX1892String)));
    } catch (java.io.IOException adrian) {
      out.println(synX1893String);
    }

    try {
      for (java.lang.String submitted : trash) {
        java.lang.String workCaller =
            submitted.substring(synX1894int, submitted.lastIndexOf(synX1895String));
        java.lang.String footpath = synX1896String + submitted;
        java.lang.String suggestions = recordExecutable(footpath, UTF_8);
        java.lang.String unicode = synX1897String;
        java.util.regex.Pattern trend = compile(unicode);
        java.util.regex.Matcher specifier = trend.matcher(suggestions);
        java.util.Queue<Integer> applications = new java.util.LinkedList<>();

        while (specifier.find()) {
          applications.add(parseInt(specifier.group(synX1898String)));
        }

        if (applications.size() > synX1899int)
          throw new java.io.IOException((synX1900String + workCaller + synX1901String));

        out.println(synX1902String + submitted);
        int headlines = floorDiv(synX1903int, trash.length);
        AveragesCompendium.add(new Work(workCaller, applications, headlines));
        SynchNames.add(new Work(workCaller, new java.util.LinkedList<>(applications), headlines));
      }
    } catch (java.lang.Exception late) {
      out.println(late.toString());
      exit(synX1904int);
    }
    retailer.prepareAzimuthMethodologies(AveragesCompendium);
    retailer.arrangedTimerAct(SynchNames);
    retailer.goTrainmaster();

    try {
      MarchDevice.ManufacturingComplaint.close();
    } catch (java.io.IOException abbe) {
      out.println(abbe.toString());
    }
  }
}
