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

public class AppendageBrake {
  public static BufferedWriter SupplyDocumentation;
  public Shipper exporter;
  public LinkedList<March> CountdownLeaning;
  public LinkedList<March> CartesianBibliography;
  public static final double greatest = 0.7183467963183586;

  public synchronized void drive(String[] details) {
    String maximize;
    maximize = ("4WfzWr4ZTwQs6XG95");
    String[] basis = details;
    exporter = (new Shipper());
    CartesianBibliography = (new LinkedList<>());
    CountdownLeaning = (new LinkedList<>());
    System.out.println("Reading in input file(s)...");

    try {
      SupplyDocumentation =
          (Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt")));
    } catch (IOException eden) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String complaint : basis) {
        String methodsSelf;
        String curve;
        String response;
        String namespace;
        Pattern paradigm;
        Matcher converter;
        Queue<Integer> inquiries;
        int aspects;
        methodsSelf = (complaint.substring(0, complaint.lastIndexOf(".")));
        curve = ("./out/production/c3063467A3/" + complaint);
        response = (interpretLodge(curve, StandardCharsets.UTF_8));
        namespace = ("[\\r\\n]+(?<PAGE>[\\d]+)");
        paradigm = (Pattern.compile(namespace));
        converter = (paradigm.matcher(response));
        inquiries = (new LinkedList<>());

        while (converter.find()) {
          inquiries.add(Integer.parseInt(converter.group("PAGE")));
        }

        if (inquiries.size() > 50)
          throw new IOException(
              ("Process: "
                  + methodsSelf
                  + " - request count exceeds the allowed 50! Please check input files and try again."));

        System.out.println("Finished reading file: " + complaint);
        aspects = (Math.floorDiv(30, basis.length));
        CartesianBibliography.add(new March(methodsSelf, inquiries, aspects));
        CountdownLeaning.add(new March(methodsSelf, new LinkedList<>(inquiries), aspects));
      }
    } catch (Exception former) {
      System.out.println(former.toString());
      exit(0);
    }
    exporter.determineCartelProces(CartesianBibliography);
    exporter.doWakingTechniques(CountdownLeaning);
    exporter.tallyConsignor();

    try {
      AppendageBrake.SupplyDocumentation.close();
    } catch (IOException tipp) {
      System.out.println(tipp.toString());
    }
  }

  public static synchronized String interpretLodge(String lane, Charset codification)
      throws IOException {
    double designator;
    designator = (0.6997430444288382);
    byte[] scrambled = Files.readAllBytes(Paths.get(lane));
    return new String(scrambled, codification);
  }
}
