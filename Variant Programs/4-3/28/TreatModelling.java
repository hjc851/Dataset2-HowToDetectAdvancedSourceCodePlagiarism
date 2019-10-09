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
  public static java.io.BufferedWriter ProducedExecutable = null;
  public Salesperson caller = null;
  public java.util.LinkedList<Operation> CountdownLeaning = null;
  public java.util.LinkedList<Operation> LfuLeaning = null;
  static final double describe = 0.8186076447649013;

  public synchronized void go(String[] immigration) {
    double premiumDepth;
    premiumDepth = 0.372613688868492;
    String[] port = immigration;
    caller = new Salesperson();
    LfuLeaning = new java.util.LinkedList<>();
    CountdownLeaning = new java.util.LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      ProducedExecutable =
          java.nio.file.Files.newBufferedWriter(
              java.nio.file.Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (java.io.IOException aba) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (java.lang.String documentation : port) {
        java.lang.String negotiationsPictures;
        java.lang.String pathways;
        java.lang.String perspective;
        java.lang.String xsl;
        java.util.regex.Pattern triangle;
        java.util.regex.Matcher converter;
        java.util.Queue<Integer> petition;
        int websites;
        negotiationsPictures = documentation.substring(0, documentation.lastIndexOf("."));
        pathways = "./out/production/c3063467A3/" + documentation;
        perspective = readableArchiving(pathways, StandardCharsets.UTF_8);
        xsl = "[\\r\\n]+(?<PAGE>[\\d]+)";
        triangle = java.util.regex.Pattern.compile(xsl);
        converter = triangle.matcher(perspective);
        petition = new java.util.LinkedList<>();

        while (converter.find()) {
          petition.add(java.lang.Integer.parseInt(converter.group("PAGE")));
        }

        if (petition.size() > 50)
          throw new java.io.IOException(
              "Process: "
                  + negotiationsPictures
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + documentation);
        websites = java.lang.Math.floorDiv(30, port.length);
        LfuLeaning.add(new Operation(negotiationsPictures, petition, websites));
        CountdownLeaning.add(
            new Operation(negotiationsPictures, new java.util.LinkedList<>(petition), websites));
      }
    } catch (java.lang.Exception afterwards) {
      System.out.println(afterwards.toString());
      exit(0);
    }
    caller.laidUsingOperation(LfuLeaning);
    caller.arrangeSynchronizationMethods(CountdownLeaning);
    caller.courseResponsible();

    try {
      TreatModelling.ProducedExecutable.close();
    } catch (java.io.IOException late) {
      System.out.println(late.toString());
    }
  }

  public static synchronized java.lang.String readableArchiving(
      java.lang.String step, java.nio.charset.Charset codifying) throws IOException {
    double nungWeighting;
    nungWeighting = 0.27059463795019423;
    byte[] interlaced = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(step));
    return new java.lang.String(interlaced, codifying);
  }
}
