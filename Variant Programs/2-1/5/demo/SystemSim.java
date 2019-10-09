package demo;

import mailer.Shipper;
import multitasking.Procedures;
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

public class SystemSim {
  private LinkedList<Procedures> methodologyRegistry;
  private Shipper exporter;
  private static String InformationComplaint;
  public static BufferedWriter PerformanceArchives;

  public void bleed(String entries) {
    this.InformationComplaint = entries;
    exporter = new Shipper();
    methodologyRegistry = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String demotedCite = InformationComplaint.substring(0, InformationComplaint.lastIndexOf("."));
      PerformanceArchives =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + demotedCite + "_output.txt"));
    } catch (IOException abel) {
      System.out.println("Unable to generate output file.");
    }
    InformationComplaint = "./out/production/c3063467A1/" + InformationComplaint;

    try {
      String guidance = registerSubmit(InformationComplaint, StandardCharsets.UTF_8);
      String resp = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(resp);
      Matcher esi = p.matcher(guidance);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern a1 = Pattern.compile(exp2);
      Matcher f = a1.matcher(guidance);

      while (esi.find()) {
        exporter.settledHitPeriods(Integer.parseInt(esi.group("DISP")));
      }

      while (f.find()) {
        methodologyRegistry.add(
            new Procedures(
                f.group("ID"),
                Integer.parseInt(f.group("Arrive")),
                Integer.parseInt(f.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception adrian) {
      System.out.println(adrian.toString());
    }
    exporter.doTechniques(methodologyRegistry);
    exporter.moveSender();
  }

  private static String registerSubmit(String direction, Charset codify) throws IOException {
    byte[] scrambled = Files.readAllBytes(Paths.get(direction));
    return new String(scrambled, codify);
  }
}
