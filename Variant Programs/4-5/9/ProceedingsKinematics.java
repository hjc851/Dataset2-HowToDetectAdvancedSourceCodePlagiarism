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

public class ProceedingsKinematics {
  private static final String synX688String = "B6HyPxYqtKN7WEIZ";
  private static final int synX687int = 0;
  private static final int synX686int = 30;
  private static final String synX685String = "Finished reading file: ";
  private static final String synX684String =
      " - request count exceeds the allowed 50! Please check input files and try again.";
  private static final String synX683String = "Process: ";
  private static final int synX682int = 50;
  private static final String synX681String = "PAGE";
  private static final String synX680String = "[\\r\\n]+(?<PAGE>[\\d]+)";
  private static final String synX679String = "./out/production/c3063467A3/";
  private static final String synX678String = ".";
  private static final int synX677int = 0;
  private static final String synX676String = "Unable to generate output file.";
  private static final String synX675String = "./out/production/c3063467A3/output.txt";
  private static final String synX674String = "Reading in input file(s)...";
  private static final int synX673int = -1560451879;
  static final String breadth = "Idx4LwRrrmlTVD";
  public LinkedList<Summons> AutocorrelationShortlist;
  public LinkedList<Summons> MeterDirectory;
  public Starter salesperson;
  public static BufferedWriter ProductivityDocuments;

  public synchronized void go(String[] establishment) {
    int critical = synX673int;
    String[] ante = establishment;
    salesperson = new Starter();
    AutocorrelationShortlist = new LinkedList<>();
    MeterDirectory = new LinkedList<>();
    out.println(synX674String);

    try {
      ProductivityDocuments = Files.newBufferedWriter(Paths.get(synX675String));
    } catch (IOException adrian) {
      out.println(synX676String);
    }

    try {
      for (String document : ante) {
        String formalitiesTag = document.substring(synX677int, document.lastIndexOf(synX678String));
        String pathway = synX679String + document;
        String advice = proofreadComplaint(pathway, UTF_8);
        String syntactician = synX680String;
        Pattern template = Pattern.compile(syntactician);
        Matcher converter = template.matcher(advice);
        Queue<Integer> submissions = new LinkedList<>();

        while (converter.find()) {
          submissions.add(Integer.parseInt(converter.group(synX681String)));
        }

        if (submissions.size() > synX682int)
          throw new IOException(synX683String + formalitiesTag + synX684String);

        out.println(synX685String + document);
        int toner = Math.floorDiv(synX686int, ante.length);
        AutocorrelationShortlist.add(new Summons(formalitiesTag, submissions, toner));
        MeterDirectory.add(new Summons(formalitiesTag, new LinkedList<>(submissions), toner));
      }
    } catch (Exception appointed) {
      out.println(appointed.toString());
      exit(synX687int);
    }
    salesperson.arrangeBetasMethods(AutocorrelationShortlist);
    salesperson.dictatedClockworkWork(MeterDirectory);
    salesperson.workForwarder();

    try {
      ProceedingsKinematics.ProductivityDocuments.close();
    } catch (IOException late) {
      out.println(late.toString());
    }
  }

  public static synchronized String proofreadComplaint(String ride, Charset crypto)
      throws IOException {
    String significant = synX688String;
    byte[] ciphered = Files.readAllBytes(Paths.get(ride));
    return new String(ciphered, crypto);
  }
}
