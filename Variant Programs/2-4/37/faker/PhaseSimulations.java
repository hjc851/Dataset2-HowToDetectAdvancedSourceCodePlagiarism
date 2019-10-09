package faker;

import mailer.Limiter;
import planner.Litigate;
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

public class PhaseSimulations {
  public LinkedList<Litigate> summonsRoster;
  public Limiter responsible;
  public static String ComponentBinder;
  public static BufferedWriter IntensityReadme;

  public synchronized void lead(String nsis) {
    this.ComponentBinder = nsis;
    responsible = new Limiter();
    summonsRoster = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String lostGens = ComponentBinder.substring(0, ComponentBinder.lastIndexOf("."));
      IntensityReadme =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + lostGens + "_output.txt"));
    } catch (IOException past) {
      System.out.println("Unable to generate output file.");
    }
    ComponentBinder = "./out/production/c3063467A1/" + ComponentBinder;

    try {
      String assistance = studyPaperwork(ComponentBinder, StandardCharsets.UTF_8);
      String resp = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(resp);
      Matcher sm = p.matcher(assistance);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern b2 = Pattern.compile(exp2);
      Matcher brane = b2.matcher(assistance);

      while (sm.find()) {
        responsible.prepareSendNow(Integer.parseInt(sm.group("DISP")));
      }

      while (brane.find()) {
        summonsRoster.add(
            new Litigate(
                brane.group("ID"),
                Integer.parseInt(brane.group("Arrive")),
                Integer.parseInt(brane.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception abel) {
      System.out.println(abel.toString());
    }
    responsible.situatedMethodology(summonsRoster);
    responsible.extendDealer();
  }

  public static synchronized String studyPaperwork(String track, Charset encoders)
      throws IOException {
    byte[] programmed = Files.readAllBytes(Paths.get(track));
    return new String(programmed, encoders);
  }
}
