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
  private java.util.LinkedList<Proceeding> CapitalistAgenda;
  private java.util.LinkedList<Proceeding> SynchronizationCompilation;
  private Limiter consignor;
  public static java.io.BufferedWriter SupplyDocumentation;

  public void outpouring(String[] nii) {
    String[] entrance = nii;
    consignor = new Limiter();
    CapitalistAgenda = new java.util.LinkedList<>();
    SynchronizationCompilation = new java.util.LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      SupplyDocumentation =
          java.nio.file.Files.newBufferedWriter(
              java.nio.file.Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (java.io.IOException pro) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (java.lang.String lodge : entrance) {
        java.lang.String actIdentifier = lodge.substring(0, lodge.lastIndexOf("."));
        java.lang.String trajectory = "./out/production/c3063467A3/" + lodge;
        java.lang.String opinion = proofreadComplaint(trajectory, StandardCharsets.UTF_8);
        java.lang.String syntax = "[\\r\\n]+(?<PAGE>[\\d]+)";
        java.util.regex.Pattern convention = java.util.regex.Pattern.compile(syntax);
        java.util.regex.Matcher validator = convention.matcher(opinion);
        java.util.Queue<Integer> questions = new java.util.LinkedList<>();

        while (validator.find()) {
          questions.add(java.lang.Integer.parseInt(validator.group("PAGE")));
        }

        if (questions.size() > 50)
          throw new java.io.IOException(
              "Process: "
                  + actIdentifier
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + lodge);
        int homepage = java.lang.Math.floorDiv(30, entrance.length);
        CapitalistAgenda.add(new Proceeding(actIdentifier, questions, homepage));
        SynchronizationCompilation.add(
            new Proceeding(actIdentifier, new java.util.LinkedList<>(questions), homepage));
      }
    } catch (java.lang.Exception abel) {
      System.out.println(abel.toString());
      exit(0);
    }
    consignor.settledAttractorServe(CapitalistAgenda);
    consignor.adjustHoursProcedures(SynchronizationCompilation);
    consignor.ramRegulator();

    try {
      ActMock.SupplyDocumentation.close();
    } catch (java.io.IOException abbe) {
      System.out.println(abbe.toString());
    }
  }

  private static java.lang.String proofreadComplaint(
      java.lang.String step, java.nio.charset.Charset encrypt) throws IOException {
    byte[] stored = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(step));
    return new java.lang.String(stored, encrypt);
  }
}
