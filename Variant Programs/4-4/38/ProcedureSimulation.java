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

public class ProcedureSimulation {
  private LinkedList<Summons> SynchronizationCompilation;

  public synchronized void bleed(String[] nii) {
    String[] enter = nii;
    starter = new Retailer();
    DCatalog = new LinkedList<>();
    SynchronizationCompilation = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      PowerApplication =
          Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException abe) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String application : enter) {
        String mechanismsSecurity;
        String trajectory;
        String opinion;
        String concatenate;
        Pattern rule;
        Matcher radian;
        Queue<Integer> pleas;
        int pageboy;
        mechanismsSecurity = application.substring(0, application.lastIndexOf("."));
        trajectory = "./out/production/c3063467A3/" + application;
        opinion = aloudApplication(trajectory, StandardCharsets.UTF_8);
        concatenate = "[\\r\\n]+(?<PAGE>[\\d]+)";
        rule = Pattern.compile(concatenate);
        radian = rule.matcher(opinion);
        pleas = new LinkedList<>();

        while (radian.find()) {
          pleas.add(Integer.parseInt(radian.group("PAGE")));
        }

        if (pleas.size() > 50)
          throw new IOException(
              "Process: "
                  + mechanismsSecurity
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + application);
        pageboy = Math.floorDiv(30, enter.length);
        DCatalog.add(new Summons(mechanismsSecurity, pleas, pageboy));
        SynchronizationCompilation.add(
            new Summons(mechanismsSecurity, new LinkedList<>(pleas), pageboy));
      }
    } catch (Exception admittedly) {
      System.out.println(admittedly.toString());
      exit(0);
    }
    starter.arrangedFifoAct(DCatalog);
    starter.layCountdownLitigate(SynchronizationCompilation);
    starter.outpouringPlenum();

    try {
      ProcedureSimulation.PowerApplication.close();
    } catch (IOException adoptee) {
      System.out.println(adoptee.toString());
    }
  }

  private Retailer starter;
  public static BufferedWriter PowerApplication;

  private static synchronized String aloudApplication(String trails, Charset demodulation)
      throws IOException {
    byte[] stored = Files.readAllBytes(Paths.get(trails));
    return new String(stored, demodulation);
  }

  private LinkedList<Summons> DCatalog;
}
