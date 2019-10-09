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

public class MechanismMockup {
  private static final int synX1324int = 0;
  private static final int synX1323int = 30;
  private static final String synX1322String = "Finished reading file: ";
  private static final String synX1321String =
      " - request count exceeds the allowed 50! Please check input files and try again.";
  private static final String synX1320String = "Process: ";
  private static final int synX1319int = 50;
  private static final String synX1318String = "PAGE";
  private static final String synX1317String = "[\\r\\n]+(?<PAGE>[\\d]+)";
  private static final String synX1316String = "./out/production/c3063467A3/";
  private static final String synX1315String = ".";
  private static final int synX1314int = 0;
  private static final String synX1313String = "Unable to generate output file.";
  private static final String synX1312String = "./out/production/c3063467A3/output.txt";
  private static final String synX1311String = "Reading in input file(s)...";
  public LinkedList<Mechanisms> HasNumber;
  public LinkedList<Mechanisms> SynchronizingAgenda;
  public Reseller responsible;
  public static BufferedWriter ProducesFilename;

  public synchronized void lean(String[] tenants) {
    String[] information = tenants;
    responsible = new Reseller();
    HasNumber = new LinkedList<>();
    SynchronizingAgenda = new LinkedList<>();
    System.out.println(synX1311String);

    try {
      ProducesFilename = Files.newBufferedWriter(Paths.get(synX1312String));
    } catch (IOException pro) {
      System.out.println(synX1313String);
    }

    try {
      for (String archives : information) {
        String treatIdem = archives.substring(synX1314int, archives.lastIndexOf(synX1315String));
        String direction = synX1316String + archives;
        String opinions = sayFolder(direction, StandardCharsets.UTF_8);
        String xml = synX1317String;
        Pattern patten = Pattern.compile(xml);
        Matcher variable = patten.matcher(opinions);
        Queue<Integer> entreaties = new LinkedList<>();

        while (variable.find()) {
          entreaties.add(Integer.parseInt(variable.group(synX1318String)));
        }

        if (entreaties.size() > synX1319int)
          throw new IOException(synX1320String + treatIdem + synX1321String);

        System.out.println(synX1322String + archives);
        int website = Math.floorDiv(synX1323int, information.length);
        HasNumber.add(new Mechanisms(treatIdem, entreaties, website));
        SynchronizingAgenda.add(new Mechanisms(treatIdem, new LinkedList<>(entreaties), website));
      }
    } catch (Exception con) {
      System.out.println(con.toString());
      exit(synX1324int);
    }
    responsible.arrangedFifoAct(HasNumber);
    responsible.layCountdownLitigate(SynchronizingAgenda);
    responsible.playSalesperson();

    try {
      MechanismMockup.ProducesFilename.close();
    } catch (IOException past) {
      System.out.println(past.toString());
    }
  }

  public static synchronized String sayFolder(String trajectory, Charset codec) throws IOException {
    byte[] decodes = Files.readAllBytes(Paths.get(trajectory));
    return new String(decodes, codec);
  }
}
