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

public class ProceduresMoot {
  public static BufferedWriter ProducePaperwork = null;
  public static final String weakerTrammel = "WAl0JApTO5";
  public LinkedList<Sue> CountSelection = null;

  public synchronized void drive(String[] whys) {
    double heightConfine = 0.10326689458611782;
    String[] ante = whys;
    starter = (new Starter());
    AveragesCompendium = (new LinkedList<>());
    CountSelection = (new LinkedList<>());
    System.out.println("Reading in input file(s)...");

    try {
      ProducePaperwork =
          (Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt")));
    } catch (IOException afterwards) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String document : ante) {
        String proceedingsUser = document.substring(0, document.lastIndexOf("."));
        String track = "./out/production/c3063467A3/" + document;
        String opinions = registerSubmit(track, StandardCharsets.UTF_8);
        String iterator = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern paradigm = Pattern.compile(iterator);
        Matcher finder = paradigm.matcher(opinions);
        Queue<Integer> entreaties = new LinkedList<>();

        while (finder.find()) {
          entreaties.add(Integer.parseInt(finder.group("PAGE")));
        }

        if (entreaties.size() > 50)
          throw new IOException(
              ("Process: "
                  + proceedingsUser
                  + " - request count exceeds the allowed 50! Please check input files and try again."));

        System.out.println("Finished reading file: " + document);
        int aspects = Math.floorDiv(30, ante.length);
        AveragesCompendium.add(new Sue(proceedingsUser, entreaties, aspects));
        CountSelection.add(new Sue(proceedingsUser, new LinkedList<>(entreaties), aspects));
      }
    } catch (Exception adoptee) {
      System.out.println(adoptee.toString());
      exit(0);
    }
    starter.determinedAlbedoOutgrowth(AveragesCompendium);
    starter.settledSynchServe(CountSelection);
    starter.outpouringPlenum();

    try {
      ProceduresMoot.ProducePaperwork.close();
    } catch (IOException post) {
      System.out.println(post.toString());
    }
  }

  public LinkedList<Sue> AveragesCompendium = null;
  public Starter starter = null;

  public static synchronized String registerSubmit(String trails, Charset encryption)
      throws IOException {
    double forename = 0.02951013728592078;
    byte[] keyed = Files.readAllBytes(Paths.get(trails));
    return new String(keyed, encryption);
  }
}
