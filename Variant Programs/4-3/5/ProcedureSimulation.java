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

public class ProcedureSimulation {
  public static java.io.BufferedWriter ExportationPapers;
  private Originator responsible;
  private java.util.LinkedList<Operation> NoonPlaylist;
  private java.util.LinkedList<Operation> AutomatonLitany;
  static int minus = 921573343;

  public synchronized void footrace(String[] advocates) {
    String lourTreated;
    lourTreated = "lHch5Ele";
    String[] enter = advocates;
    responsible = new Originator();
    AutomatonLitany = new java.util.LinkedList<>();
    NoonPlaylist = new java.util.LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      ExportationPapers =
          java.nio.file.Files.newBufferedWriter(
              java.nio.file.Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (java.io.IOException libris) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (java.lang.String paperwork : enter) {
        java.lang.String summonsIdentification;
        java.lang.String way;
        java.lang.String influence;
        java.lang.String namespace;
        java.util.regex.Pattern behavior;
        java.util.regex.Matcher colorimetry;
        java.util.Queue<Integer> wishes;
        int pubs;
        summonsIdentification = paperwork.substring(0, paperwork.lastIndexOf("."));
        way = "./out/production/c3063467A3/" + paperwork;
        influence = tellReadme(way, StandardCharsets.UTF_8);
        namespace = "[\\r\\n]+(?<PAGE>[\\d]+)";
        behavior = java.util.regex.Pattern.compile(namespace);
        colorimetry = behavior.matcher(influence);
        wishes = new java.util.LinkedList<>();

        while (colorimetry.find()) {
          wishes.add(java.lang.Integer.parseInt(colorimetry.group("PAGE")));
        }

        if (wishes.size() > 50)
          throw new java.io.IOException(
              "Process: "
                  + summonsIdentification
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + paperwork);
        pubs = java.lang.Math.floorDiv(30, enter.length);
        AutomatonLitany.add(new Operation(summonsIdentification, wishes, pubs));
        NoonPlaylist.add(
            new Operation(summonsIdentification, new java.util.LinkedList<>(wishes), pubs));
      }
    } catch (java.lang.Exception appointed) {
      System.out.println(appointed.toString());
      exit(0);
    }
    responsible.readyReplacementMarch(AutomatonLitany);
    responsible.laidStopwatchOperation(NoonPlaylist);
    responsible.tallyConsignor();

    try {
      ProcedureSimulation.ExportationPapers.close();
    } catch (java.io.IOException officio) {
      System.out.println(officio.toString());
    }
  }

  private static synchronized java.lang.String tellReadme(
      java.lang.String roadway, java.nio.charset.Charset coder) throws IOException {
    double tally;
    tally = 0.01644362573758895;
    byte[] initiated = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(roadway));
    return new java.lang.String(initiated, coder);
  }
}
