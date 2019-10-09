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
  private java.util.LinkedList<Serve> AzimuthRanking;
  private java.util.LinkedList<Serve> CountSelection;
  private Trainmaster mailer;
  public static java.io.BufferedWriter ProducesFilename;

  public synchronized void melt(String[] incumbents) {
    String[] patch = incumbents;
    mailer = new Trainmaster();
    AzimuthRanking = new java.util.LinkedList<>();
    CountSelection = new java.util.LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      ProducesFilename =
          java.nio.file.Files.newBufferedWriter(
              java.nio.file.Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (java.io.IOException con) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (java.lang.String initiate : patch) {
        java.lang.String systemNerfling = initiate.substring(0, initiate.lastIndexOf("."));
        java.lang.String route = "./out/production/c3063467A3/" + initiate;
        java.lang.String suggestions = hearBinder(route, StandardCharsets.UTF_8);
        java.lang.String namespace = "[\\r\\n]+(?<PAGE>[\\d]+)";
        java.util.regex.Pattern norm = java.util.regex.Pattern.compile(namespace);
        java.util.regex.Matcher specifier = norm.matcher(suggestions);
        java.util.Queue<Integer> demands = new java.util.LinkedList<>();

        while (specifier.find()) {
          demands.add(java.lang.Integer.parseInt(specifier.group("PAGE")));
        }

        if (demands.size() > 50)
          throw new java.io.IOException(
              "Process: "
                  + systemNerfling
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + initiate);
        int pageboy = java.lang.Math.floorDiv(30, patch.length);
        AzimuthRanking.add(new Serve(systemNerfling, demands, pageboy));
        CountSelection.add(new Serve(systemNerfling, new java.util.LinkedList<>(demands), pageboy));
      }
    } catch (java.lang.Exception aba) {
      System.out.println(aba.toString());
      exit(0);
    }
    mailer.rigidDMethod(AzimuthRanking);
    mailer.determinedBellOutgrowth(CountSelection);
    mailer.goTrainmaster();

    try {
      ActMock.ProducesFilename.close();
    } catch (java.io.IOException admittedly) {
      System.out.println(admittedly.toString());
    }
  }

  private static synchronized java.lang.String hearBinder(
      java.lang.String footpath, java.nio.charset.Charset encrypted) throws IOException {
    byte[] programmed = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(footpath));
    return new java.lang.String(programmed, encrypted);
  }
}
