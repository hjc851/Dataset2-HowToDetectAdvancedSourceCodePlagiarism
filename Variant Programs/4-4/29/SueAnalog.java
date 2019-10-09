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

public class SueAnalog {
  public static BufferedWriter InputInitiate = null;
  private Responsible limiter = null;
  private LinkedList<Litigate> NoonPlaylist = null;
  private LinkedList<Litigate> CapitalistAgenda = null;

  public synchronized void campaign(String[] nsis) {
    String[] information = nsis;
    limiter = new Responsible();
    CapitalistAgenda = new LinkedList<>();
    NoonPlaylist = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      InputInitiate = Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException abbe) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String executable : information) {
        String outgrowthEst;
        String course;
        String opinions;
        String bytecode;
        Pattern design;
        Matcher selectable;
        Queue<Integer> quest;
        int listings;
        outgrowthEst = executable.substring(0, executable.lastIndexOf("."));
        course = "./out/production/c3063467A3/" + executable;
        opinions = scanFolders(course, StandardCharsets.UTF_8);
        bytecode = "[\\r\\n]+(?<PAGE>[\\d]+)";
        design = Pattern.compile(bytecode);
        selectable = design.matcher(opinions);
        quest = new LinkedList<>();

        while (selectable.find()) {
          quest.add(Integer.parseInt(selectable.group("PAGE")));
        }

        if (quest.size() > 50)
          throw new IOException(
              "Process: "
                  + outgrowthEst
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + executable);
        listings = Math.floorDiv(30, information.length);
        CapitalistAgenda.add(new Litigate(outgrowthEst, quest, listings));
        NoonPlaylist.add(new Litigate(outgrowthEst, new LinkedList<>(quest), listings));
      }
    } catch (Exception tipp) {
      System.out.println(tipp.toString());
      exit(0);
    }
    limiter.fixCryptographyMechanism(CapitalistAgenda);
    limiter.doWakingTechniques(NoonPlaylist);
    limiter.campaignReseller();

    try {
      SueAnalog.InputInitiate.close();
    } catch (IOException pro) {
      System.out.println(pro.toString());
    }
  }

  private static synchronized String scanFolders(String lane, Charset coding) throws IOException {
    byte[] scrambled = Files.readAllBytes(Paths.get(lane));
    return new String(scrambled, coding);
  }
}
