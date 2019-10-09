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

public class TreatModelling {
  public static BufferedWriter GdpDatabase;
  public LinkedList<Procedures> CryptographySelection;
  public LinkedList<Procedures> WakingBibliography;

  public static synchronized String peruseDocket(String approach, Charset keying)
      throws IOException {
    byte[] stored = Files.readAllBytes(Paths.get(approach));
    return new String(stored, keying);
  }

  public synchronized void tally(String[] elected) {
    String[] submissions = elected;
    originator = new Reseller();
    CryptographySelection = new LinkedList<>();
    WakingBibliography = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      GdpDatabase = Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException adult) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String binder : submissions) {
        String sueIbid = binder.substring(0, binder.lastIndexOf("."));
        String pathways = "./out/production/c3063467A3/" + binder;
        String contributions = peruseDocket(pathways, StandardCharsets.UTF_8);
        String pathname = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern chart = Pattern.compile(pathname);
        Matcher collator = chart.matcher(contributions);
        Queue<Integer> petitions = new LinkedList<>();

        while (collator.find()) {
          petitions.add(Integer.parseInt(collator.group("PAGE")));
        }

        if (petitions.size() > 50)
          throw new IOException(
              "Process: "
                  + sueIbid
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + binder);
        int varlet = Math.floorDiv(30, submissions.length);
        CryptographySelection.add(new Procedures(sueIbid, petitions, varlet));
        WakingBibliography.add(new Procedures(sueIbid, new LinkedList<>(petitions), varlet));
      }
    } catch (Exception abe) {
      System.out.println(abe.toString());
      exit(0);
    }
    originator.rigidDMethod(CryptographySelection);
    originator.layCountdownLitigate(WakingBibliography);
    originator.outpouringPlenum();

    try {
      TreatModelling.GdpDatabase.close();
    } catch (IOException abel) {
      System.out.println(abel.toString());
    }
  }

  public Reseller originator;
}
