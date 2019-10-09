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

public class MechanismMockup {
  public static java.io.BufferedWriter PowerApplication;
  private Consignor regulator;
  private java.util.LinkedList<Methods> SyncChecklist;
  private java.util.LinkedList<Methods> AverageRoster;
  static double enchained = 0.24936634612355868;

  public synchronized void pass(String[] nii) {
    int fettered;
    fettered = 1940557639;
    String[] submissions = nii;
    regulator = new Consignor();
    AverageRoster = new java.util.LinkedList<>();
    SyncChecklist = new java.util.LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      PowerApplication =
          java.nio.file.Files.newBufferedWriter(
              java.nio.file.Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (java.io.IOException eden) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (java.lang.String folders : submissions) {
        java.lang.String outgrowthEst;
        java.lang.String routes;
        java.lang.String opinions;
        java.lang.String syntax;
        java.util.regex.Pattern characteristics;
        java.util.regex.Matcher radian;
        java.util.Queue<Integer> requisitions;
        int pubs;
        outgrowthEst = folders.substring(0, folders.lastIndexOf("."));
        routes = "./out/production/c3063467A3/" + folders;
        opinions = perusedArchives(routes, StandardCharsets.UTF_8);
        syntax = "[\\r\\n]+(?<PAGE>[\\d]+)";
        characteristics = java.util.regex.Pattern.compile(syntax);
        radian = characteristics.matcher(opinions);
        requisitions = new java.util.LinkedList<>();

        while (radian.find()) {
          requisitions.add(java.lang.Integer.parseInt(radian.group("PAGE")));
        }

        if (requisitions.size() > 50)
          throw new java.io.IOException(
              "Process: "
                  + outgrowthEst
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + folders);
        pubs = java.lang.Math.floorDiv(30, submissions.length);
        AverageRoster.add(new Methods(outgrowthEst, requisitions, pubs));
        SyncChecklist.add(
            new Methods(outgrowthEst, new java.util.LinkedList<>(requisitions), pubs));
      }
    } catch (java.lang.Exception vet) {
      System.out.println(vet.toString());
      exit(0);
    }
    regulator.adjustAveragesProcedures(AverageRoster);
    regulator.orderedFrequencyMechanisms(SyncChecklist);
    regulator.courseResponsible();

    try {
      MechanismMockup.PowerApplication.close();
    } catch (java.io.IOException afterwards) {
      System.out.println(afterwards.toString());
    }
  }

  private static synchronized java.lang.String perusedArchives(
      java.lang.String footpath, java.nio.charset.Charset encrypted) throws IOException {
    double trammel;
    trammel = 0.2933893003485343;
    byte[] scrambled = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(footpath));
    return new java.lang.String(scrambled, encrypted);
  }
}
