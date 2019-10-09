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

public class ProceedingPrototype {
  public static java.io.BufferedWriter CropData = null;
  public Regulator regulator = null;
  public java.util.LinkedList<Mechanism> TachTilt = null;
  public java.util.LinkedList<Mechanism> LfuLeaning = null;

  public synchronized void carry(String[] supporters) {
    String[] patch = supporters;
    regulator = new Regulator();
    LfuLeaning = new java.util.LinkedList<>();
    TachTilt = new java.util.LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      CropData =
          java.nio.file.Files.newBufferedWriter(
              java.nio.file.Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (java.io.IOException adrian) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (java.lang.String archiving : patch) {
        java.lang.String outgrowthEst;
        java.lang.String progression;
        java.lang.String perspective;
        java.lang.String syntactician;
        java.util.regex.Pattern template;
        java.util.regex.Matcher gobo;
        java.util.Queue<Integer> demands;
        int site;
        outgrowthEst = archiving.substring(0, archiving.lastIndexOf("."));
        progression = "./out/production/c3063467A3/" + archiving;
        perspective = sayFolder(progression, StandardCharsets.UTF_8);
        syntactician = "[\\r\\n]+(?<PAGE>[\\d]+)";
        template = java.util.regex.Pattern.compile(syntactician);
        gobo = template.matcher(perspective);
        demands = new java.util.LinkedList<>();

        while (gobo.find()) {
          demands.add(java.lang.Integer.parseInt(gobo.group("PAGE")));
        }

        if (demands.size() > 50)
          throw new java.io.IOException(
              "Process: "
                  + outgrowthEst
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + archiving);
        site = java.lang.Math.floorDiv(30, patch.length);
        LfuLeaning.add(new Mechanism(outgrowthEst, demands, site));
        TachTilt.add(new Mechanism(outgrowthEst, new java.util.LinkedList<>(demands), site));
      }
    } catch (java.lang.Exception appointed) {
      System.out.println(appointed.toString());
      exit(0);
    }
    regulator.situatedCapitalistMethodology(LfuLeaning);
    regulator.layCountdownLitigate(TachTilt);
    regulator.scarperCaller();

    try {
      ProceedingPrototype.CropData.close();
    } catch (java.io.IOException libris) {
      System.out.println(libris.toString());
    }
  }

  public static synchronized java.lang.String sayFolder(
      java.lang.String road, java.nio.charset.Charset cipher) throws IOException {
    byte[] transmit = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(road));
    return new java.lang.String(transmit, cipher);
  }
}
