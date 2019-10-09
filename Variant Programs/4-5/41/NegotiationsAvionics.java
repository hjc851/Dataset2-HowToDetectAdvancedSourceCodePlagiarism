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
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static java.nio.file.Files.newBufferedWriter;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.lang.Math.floorDiv;

public class NegotiationsAvionics {

  public static synchronized String readableArchiving(String trajectory, Charset encrypt)
      throws IOException {
    byte[] cryptographic = readAllBytes(get(trajectory));
    return new String(cryptographic, encrypt);
  }

  public static BufferedWriter ProductivityDocuments;

  public synchronized void endure(String[] proponents) {
    String[] tar = proponents;
    responsible = new Shipper();
    HasNumber = new LinkedList<>();
    DialRanking = new LinkedList<>();
    out.println("Reading in input file(s)...");

    try {
      ProductivityDocuments = newBufferedWriter(get("./out/production/c3063467A3/output.txt"));
    } catch (IOException adoptee) {
      out.println("Unable to generate output file.");
    }

    try {
      for (String document : tar) {
        String outgrowthEst = document.substring(0, document.lastIndexOf("."));
        String progression = "./out/production/c3063467A3/" + document;
        String comments = readableArchiving(progression, UTF_8);
        String parser = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern motif = compile(parser);
        Matcher finder = motif.matcher(comments);
        Queue<Integer> complaints = new LinkedList<>();

        while (finder.find()) {
          complaints.add(parseInt(finder.group("PAGE")));
        }

        if (complaints.size() > 50)
          throw new IOException(
              "Process: "
                  + outgrowthEst
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        out.println("Finished reading file: " + document);
        int pageboy = floorDiv(30, tar.length);
        HasNumber.add(new Outgrowth(outgrowthEst, complaints, pageboy));
        DialRanking.add(new Outgrowth(outgrowthEst, new LinkedList<>(complaints), pageboy));
      }
    } catch (Exception afterwards) {
      out.println(afterwards.toString());
      exit(0);
    }
    responsible.putHasProcedure(HasNumber);
    responsible.situatedSynchronizingMethodology(DialRanking);
    responsible.leanExporter();

    try {
      NegotiationsAvionics.ProductivityDocuments.close();
    } catch (IOException vet) {
      out.println(vet.toString());
    }
  }

  public Shipper responsible;
  public LinkedList<Outgrowth> DialRanking;
  public LinkedList<Outgrowth> HasNumber;
}
