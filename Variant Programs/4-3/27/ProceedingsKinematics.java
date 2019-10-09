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

public class ProceedingsKinematics {
  public static java.io.BufferedWriter InputInitiate;
  public Limiter dealer;
  public java.util.LinkedList<Methods> DayCatalog;
  public java.util.LinkedList<Methods> DCatalog;

  public synchronized void operate(String[] tenants) {
    String[] gain = tenants;
    dealer = new Limiter();
    DCatalog = new java.util.LinkedList<>();
    DayCatalog = new java.util.LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      InputInitiate =
          java.nio.file.Files.newBufferedWriter(
              java.nio.file.Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (java.io.IOException officio) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (java.lang.String initiate : gain) {
        java.lang.String marchDimidiate;
        java.lang.String trail;
        java.lang.String feedback;
        java.lang.String awk;
        java.util.regex.Pattern trends;
        java.util.regex.Matcher synchroniser;
        java.util.Queue<Integer> questions;
        int impressions;
        marchDimidiate = initiate.substring(0, initiate.lastIndexOf("."));
        trail = "./out/production/c3063467A3/" + initiate;
        feedback = reciteSubmitting(trail, StandardCharsets.UTF_8);
        awk = "[\\r\\n]+(?<PAGE>[\\d]+)";
        trends = java.util.regex.Pattern.compile(awk);
        synchroniser = trends.matcher(feedback);
        questions = new java.util.LinkedList<>();

        while (synchroniser.find()) {
          questions.add(java.lang.Integer.parseInt(synchroniser.group("PAGE")));
        }

        if (questions.size() > 50)
          throw new java.io.IOException(
              "Process: "
                  + marchDimidiate
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + initiate);
        impressions = java.lang.Math.floorDiv(30, gain.length);
        DCatalog.add(new Methods(marchDimidiate, questions, impressions));
        DayCatalog.add(
            new Methods(marchDimidiate, new java.util.LinkedList<>(questions), impressions));
      }
    } catch (java.lang.Exception admittedly) {
      System.out.println(admittedly.toString());
      exit(0);
    }
    dealer.situatedCapitalistMethodology(DCatalog);
    dealer.rigidDayMethod(DayCatalog);
    dealer.goTrainmaster();

    try {
      ProceedingsKinematics.InputInitiate.close();
    } catch (java.io.IOException adoptee) {
      System.out.println(adoptee.toString());
    }
  }

  public static synchronized java.lang.String reciteSubmitting(
      java.lang.String destiny, java.nio.charset.Charset keying) throws IOException {
    byte[] codified = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(destiny));
    return new java.lang.String(codified, keying);
  }
}
