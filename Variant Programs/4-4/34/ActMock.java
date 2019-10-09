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

public class ActMock {
  public LinkedList<Cycle> SynchNames = null;
  public Vendor starter = null;

  public synchronized void scarper(String[] immigration) {
    String[] efficiency = immigration;
    starter = new Vendor();
    CryptographySelection = new LinkedList<>();
    SynchNames = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      PerformanceArchives =
          Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException abbe) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String initiate : efficiency) {
        String outgrowthEst;
        String approach;
        String opinions;
        String parse;
        Pattern patten;
        Matcher aspx;
        Queue<Integer> proposals;
        int website;
        outgrowthEst = initiate.substring(0, initiate.lastIndexOf("."));
        approach = "./out/production/c3063467A3/" + initiate;
        opinions = reciteSubmitting(approach, StandardCharsets.UTF_8);
        parse = "[\\r\\n]+(?<PAGE>[\\d]+)";
        patten = Pattern.compile(parse);
        aspx = patten.matcher(opinions);
        proposals = new LinkedList<>();

        while (aspx.find()) {
          proposals.add(Integer.parseInt(aspx.group("PAGE")));
        }

        if (proposals.size() > 50)
          throw new IOException(
              "Process: "
                  + outgrowthEst
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + initiate);
        website = Math.floorDiv(30, efficiency.length);
        CryptographySelection.add(new Cycle(outgrowthEst, proposals, website));
        SynchNames.add(new Cycle(outgrowthEst, new LinkedList<>(proposals), website));
      }
    } catch (Exception pro) {
      System.out.println(pro.toString());
      exit(0);
    }
    starter.settledAttractorServe(CryptographySelection);
    starter.determineBackProces(SynchNames);
    starter.footraceLimiter();

    try {
      ActMock.PerformanceArchives.close();
    } catch (IOException adoptee) {
      System.out.println(adoptee.toString());
    }
  }

  public static BufferedWriter PerformanceArchives = null;
  public LinkedList<Cycle> CryptographySelection = null;

  public static synchronized String reciteSubmitting(String progression, Charset codification)
      throws IOException {
    byte[] demodulated = Files.readAllBytes(Paths.get(progression));
    return new String(demodulated, codification);
  }
}
