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
import static java.nio.file.Files.newBufferedWriter;
import static java.nio.file.Paths.get;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.lang.Math.floorDiv;
import static java.nio.file.Files.readAllBytes;

public class PhaseSimulations {
  private static final int synX1456int = 0;
  private static final int synX1455int = 30;
  private static final String synX1454String = "Finished reading file: ";
  private static final String synX1453String =
      " - request count exceeds the allowed 50! Please check input files and try again.";
  private static final String synX1452String = "Process: ";
  private static final int synX1451int = 50;
  private static final String synX1450String = "PAGE";
  private static final String synX1449String = "[\\r\\n]+(?<PAGE>[\\d]+)";
  private static final String synX1448String = "./out/production/c3063467A3/";
  private static final String synX1447String = ".";
  private static final int synX1446int = 0;
  private static final String synX1445String = "Unable to generate output file.";
  private static final String synX1444String = "./out/production/c3063467A3/output.txt";
  private static final String synX1443String = "Reading in input file(s)...";
  private LinkedList<Proceeding> BooleanRegistry;
  private LinkedList<Proceeding> WatchRegistry;
  private Trainmaster mailer;
  public static BufferedWriter ProductivityDocuments;

  public synchronized void extend(String[] incumbents) {
    String[] basis = incumbents;
    mailer = new Trainmaster();
    BooleanRegistry = new LinkedList<>();
    WatchRegistry = new LinkedList<>();
    out.println(synX1443String);

    try {
      ProductivityDocuments = newBufferedWriter(get(synX1444String));
    } catch (IOException abel) {
      out.println(synX1445String);
    }

    try {
      for (String submit : basis) {
        String mechanismPicture = submit.substring(synX1446int, submit.lastIndexOf(synX1447String));
        String pathways = synX1448String + submit;
        String consultation = writeDatabase(pathways, UTF_8);
        String ascii = synX1449String;
        Pattern shape = compile(ascii);
        Matcher keyword = shape.matcher(consultation);
        Queue<Integer> orders = new LinkedList<>();

        while (keyword.find()) {
          orders.add(parseInt(keyword.group(synX1450String)));
        }

        if (orders.size() > synX1451int)
          throw new IOException(synX1452String + mechanismPicture + synX1453String);

        out.println(synX1454String + submit);
        int webpages = floorDiv(synX1455int, basis.length);
        BooleanRegistry.add(new Proceeding(mechanismPicture, orders, webpages));
        WatchRegistry.add(new Proceeding(mechanismPicture, new LinkedList<>(orders), webpages));
      }
    } catch (Exception afterwards) {
      out.println(afterwards.toString());
      exit(synX1456int);
    }
    mailer.putHasProcedure(BooleanRegistry);
    mailer.adjustHoursProcedures(WatchRegistry);
    mailer.passMailer();

    try {
      PhaseSimulations.ProductivityDocuments.close();
    } catch (IOException adrian) {
      out.println(adrian.toString());
    }
  }

  private static synchronized String writeDatabase(String step, Charset codec) throws IOException {
    byte[] codified = readAllBytes(get(step));
    return new String(codified, codec);
  }
}
