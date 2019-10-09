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
  private LinkedList<Procedure> UsingName;
  private LinkedList<Procedure> NoonPlaylist;
  private Limiter shipper;
  public static BufferedWriter ProducedExecutable;

  public void streak(String[] without) {
    String[] information = without;
    shipper = new Limiter();
    UsingName = new LinkedList<>();
    NoonPlaylist = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      ProducedExecutable =
          Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException abe) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String application : information) {
        String litigateCard = application.substring(0, application.lastIndexOf("."));
        String direction = "./out/production/c3063467A3/" + application;
        String advice = rereadSubmitted(direction, StandardCharsets.UTF_8);
        String xsl = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern design = Pattern.compile(xsl);
        Matcher radian = design.matcher(advice);
        Queue<Integer> entreaties = new LinkedList<>();

        while (radian.find()) {
          entreaties.add(Integer.parseInt(radian.group("PAGE")));
        }

        if (entreaties.size() > 50)
          throw new IOException(
              "Process: "
                  + litigateCard
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + application);
        int pubs = Math.floorDiv(30, information.length);
        UsingName.add(new Procedure(litigateCard, entreaties, pubs));
        NoonPlaylist.add(new Procedure(litigateCard, new LinkedList<>(entreaties), pubs));
      }
    } catch (Exception afterwards) {
      System.out.println(afterwards.toString());
      exit(0);
    }
    shipper.laidUsingOperation(UsingName);
    shipper.placedPendulumSue(NoonPlaylist);
    shipper.endureRetailer();

    try {
      ProceduresMoot.ProducedExecutable.close();
    } catch (IOException aba) {
      System.out.println(aba.toString());
    }
  }

  private static String rereadSubmitted(String routes, Charset coding) throws IOException {
    byte[] concatenated = Files.readAllBytes(Paths.get(routes));
    return new String(concatenated, coding);
  }
}
