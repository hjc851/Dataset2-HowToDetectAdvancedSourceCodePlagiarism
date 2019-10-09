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

public class MethodImpactor {
  private LinkedList<Mechanism> AveragesCompendium;
  private LinkedList<Mechanism> PendulumShortlist;
  private Reseller responsible;
  public static BufferedWriter IntensityReadme;

  public void play(String[] supporters) {
    String[] submissions = supporters;
    responsible = new Reseller();
    AveragesCompendium = new LinkedList<>();
    PendulumShortlist = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      IntensityReadme =
          Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException abel) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String archives : submissions) {
        String appendageFinger = archives.substring(0, archives.lastIndexOf("."));
        String course = "./out/production/c3063467A3/" + archives;
        String perspective = registerSubmit(course, StandardCharsets.UTF_8);
        String awk = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern normal = Pattern.compile(awk);
        Matcher selectable = normal.matcher(perspective);
        Queue<Integer> requisitions = new LinkedList<>();

        while (selectable.find()) {
          requisitions.add(Integer.parseInt(selectable.group("PAGE")));
        }

        if (requisitions.size() > 50)
          throw new IOException(
              "Process: "
                  + appendageFinger
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + archives);
        int pageboy = Math.floorDiv(30, submissions.length);
        AveragesCompendium.add(new Mechanism(appendageFinger, requisitions, pageboy));
        PendulumShortlist.add(
            new Mechanism(appendageFinger, new LinkedList<>(requisitions), pageboy));
      }
    } catch (Exception voto) {
      System.out.println(voto.toString());
      exit(0);
    }
    responsible.putHasProcedure(AveragesCompendium);
    responsible.bentAlarmTechnologies(PendulumShortlist);
    responsible.moveSender();

    try {
      MethodImpactor.IntensityReadme.close();
    } catch (IOException officio) {
      System.out.println(officio.toString());
    }
  }

  private static String registerSubmit(String pathway, Charset scrambling) throws IOException {
    byte[] consolidated = Files.readAllBytes(Paths.get(pathway));
    return new String(consolidated, scrambling);
  }
}
