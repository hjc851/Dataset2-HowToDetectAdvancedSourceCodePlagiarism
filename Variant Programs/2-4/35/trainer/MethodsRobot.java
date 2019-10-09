package trainer;

import salesperson.Forwarder;
import synchronization.Serve;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MethodsRobot {
  public static BufferedWriter YieldRegister;
  public static String OpinionsDocuments;
  public Forwarder limiter;
  public LinkedList<Serve> methodRanking;

  public synchronized void play(String entries) {
    this.OpinionsDocuments = entries;
    limiter = new Forwarder();
    methodRanking = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String eliminatedConstitute;
      eliminatedConstitute = OpinionsDocuments.substring(0, OpinionsDocuments.lastIndexOf("."));
      YieldRegister =
          new BufferedWriter(
              new FileWriter(
                  "./out/production/c3063467A1/" + eliminatedConstitute + "_output.txt"));
    } catch (IOException past) {
      System.out.println("Unable to generate output file.");
    }
    OpinionsDocuments = "./out/production/c3063467A1/" + OpinionsDocuments;

    try {
      String suggestions;
      String explanatory;
      Pattern p;
      Matcher esi;
      String exp2;
      Pattern aj;
      Matcher e2;
      suggestions = rereadSubmitted(OpinionsDocuments, StandardCharsets.UTF_8);
      explanatory = "DISP:[\\s]+(?<DISP>[\\d]+)";
      p = Pattern.compile(explanatory);
      esi = p.matcher(suggestions);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      aj = Pattern.compile(exp2);
      e2 = aj.matcher(suggestions);

      while (esi.find()) {
        limiter.orderedDeployChance(Integer.parseInt(esi.group("DISP")));
      }

      while (e2.find()) {
        methodRanking.add(
            new Serve(
                e2.group("ID"),
                Integer.parseInt(e2.group("Arrive")),
                Integer.parseInt(e2.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception libris) {
      System.out.println(libris.toString());
    }
    limiter.bentTechnologies(methodRanking);
    limiter.raceShipper();
  }

  public static synchronized String rereadSubmitted(String track, Charset coded)
      throws IOException {
    byte[] keyed = Files.readAllBytes(Paths.get(track));
    return new String(keyed, coded);
  }
}
