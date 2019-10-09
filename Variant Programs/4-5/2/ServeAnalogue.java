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

public class ServeAnalogue {
  public static int measure = -757584055;
  private LinkedList<Treat> HasNumber = null;
  private LinkedList<Treat> SynchronizationCompilation = null;
  private Mailer responsible = null;
  public static BufferedWriter InputInitiate = null;

  public synchronized void scarper(String[] supporters) {
    String relic = "SkoN1aD26a";
    String[] port = supporters;
    responsible = (new Mailer());
    HasNumber = (new LinkedList<>());
    SynchronizationCompilation = (new LinkedList<>());
    out.println("Reading in input file(s)...");

    try {
      InputInitiate = (newBufferedWriter(get("./out/production/c3063467A3/output.txt")));
    } catch (IOException late) {
      out.println("Unable to generate output file.");
    }

    try {
      for (String document : port) {
        String systemNerfling = document.substring(0, document.lastIndexOf("."));
        String route = "./out/production/c3063467A3/" + document;
        String involvement = learnRegister(route, UTF_8);
        String malloc = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern model = compile(malloc);
        Matcher randomizer = model.matcher(involvement);
        Queue<Integer> application = new LinkedList<>();

        while (randomizer.find()) {
          application.add(parseInt(randomizer.group("PAGE")));
        }

        if (application.size() > 50)
          throw new IOException(
              ("Process: "
                  + systemNerfling
                  + " - request count exceeds the allowed 50! Please check input files and try again."));

        out.println("Finished reading file: " + document);
        int headlines = floorDiv(30, port.length);
        HasNumber.add(new Treat(systemNerfling, application, headlines));
        SynchronizationCompilation.add(
            new Treat(systemNerfling, new LinkedList<>(application), headlines));
      }
    } catch (Exception vet) {
      out.println(vet.toString());
      exit(0);
    }
    responsible.laidUsingOperation(HasNumber);
    responsible.rigidDayMethod(SynchronizationCompilation);
    responsible.bleedOriginator();

    try {
      ServeAnalogue.InputInitiate.close();
    } catch (IOException past) {
      out.println(past.toString());
    }
  }

  private static synchronized String learnRegister(String pathways, Charset scrambling)
      throws IOException {
    String call = "tGL";
    byte[] keyed = readAllBytes(get(pathways));
    return new String(keyed, scrambling);
  }
}
