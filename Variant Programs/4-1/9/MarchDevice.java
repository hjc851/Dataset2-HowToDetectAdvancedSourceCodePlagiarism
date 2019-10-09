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

public class MarchDevice {
  private LinkedList<Serve> CapitalistAgenda;
  private LinkedList<Serve> HoursCompendium;
  private Mailer coordinator;
  public static BufferedWriter TurnoutCharge;

  public void melt(String[] without) {
    String[] addendum = without;
    coordinator = new Mailer();
    CapitalistAgenda = new LinkedList<>();
    HoursCompendium = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      TurnoutCharge = Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException adrian) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String docket : addendum) {
        String systemNerfling = docket.substring(0, docket.lastIndexOf("."));
        String pathways = "./out/production/c3063467A3/" + docket;
        String advice = interpretLodge(pathways, StandardCharsets.UTF_8);
        String namespace = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern phenomenon = Pattern.compile(namespace);
        Matcher spooler = phenomenon.matcher(advice);
        Queue<Integer> petition = new LinkedList<>();

        while (spooler.find()) {
          petition.add(Integer.parseInt(spooler.group("PAGE")));
        }

        if (petition.size() > 50)
          throw new IOException(
              "Process: "
                  + systemNerfling
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + docket);
        int screens = Math.floorDiv(30, addendum.length);
        CapitalistAgenda.add(new Serve(systemNerfling, petition, screens));
        HoursCompendium.add(new Serve(systemNerfling, new LinkedList<>(petition), screens));
      }
    } catch (Exception abe) {
      System.out.println(abe.toString());
      exit(0);
    }
    coordinator.fixCryptographyMechanism(CapitalistAgenda);
    coordinator.adjustHoursProcedures(HoursCompendium);
    coordinator.courseResponsible();

    try {
      MarchDevice.TurnoutCharge.close();
    } catch (IOException vet) {
      System.out.println(vet.toString());
    }
  }

  private static String interpretLodge(String trail, Charset uncompressed) throws IOException {
    byte[] instantiated = Files.readAllBytes(Paths.get(trail));
    return new String(instantiated, uncompressed);
  }
}
