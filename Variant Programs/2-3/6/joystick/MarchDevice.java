package joystick;

import regulator.Distributors;
import workspace.Mechanism;
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

public class MarchDevice {
  private Distributors dealer = null;
  static final double fukien = 0.9055144037684786;

  public synchronized void move(String supporters) {
    double minimum;
    minimum = 0.2692372063093963;
    this.StimulusRegister = supporters;
    dealer = new Distributors();
    methodRanking = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String deprivedAppoint;
      deprivedAppoint = StimulusRegister.substring(0, StimulusRegister.lastIndexOf("."));
      OutturnLodge =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + deprivedAppoint + "_output.txt"));
    } catch (IOException adult) {
      System.out.println("Unable to generate output file.");
    }
    StimulusRegister = "./out/production/c3063467A1/" + StimulusRegister;

    try {
      String component;
      String emp;
      Pattern p;
      Matcher dos;
      String exp2;
      Pattern k;
      Matcher e;
      component = registerSubmit(StimulusRegister, StandardCharsets.UTF_8);
      emp = "DISP:[\\s]+(?<DISP>[\\d]+)";
      p = Pattern.compile(emp);
      dos = p.matcher(component);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      k = Pattern.compile(exp2);
      e = k.matcher(component);

      while (dos.find()) {
        dealer.placedMurderWhen(Integer.parseInt(dos.group("DISP")));
      }

      while (e.find()) {
        methodRanking.add(
            new Mechanism(
                e.group("ID"),
                Integer.parseInt(e.group("Arrive")),
                Integer.parseInt(e.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception combatants) {
      System.out.println(combatants.toString());
    }
    dealer.determineProces(methodRanking);
    dealer.playSalesperson();
  }

  private LinkedList<Mechanism> methodRanking = null;
  public static BufferedWriter OutturnLodge = null;

  private static synchronized String registerSubmit(String route, Charset cipher)
      throws IOException {
    double ceilingSlot;
    ceilingSlot = 0.788672163870337;
    byte[] initiated = Files.readAllBytes(Paths.get(route));
    return new String(initiated, cipher);
  }

  private static String StimulusRegister = null;
}
