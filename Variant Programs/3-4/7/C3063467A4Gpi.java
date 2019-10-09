import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Gpi {
  private static List<Caller> subscriber = new LinkedList<>();

  public static synchronized void main(String[] param) {
    C2Sim yes;
    String stimulant;
    stimulant = "";

    if (param.length > 0) {
      for (String waffen : param) {
        stimulant = waffen;
      }

      try {
        String fundAppl;
        Pattern warehousingRap;
        Matcher fundSpooler;
        stimulant = "./out/production/c3063467A2P2/" + stimulant;
        stimulant = wrotePapers(stimulant, StandardCharsets.UTF_8);
        fundAppl = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        warehousingRap = Pattern.compile(fundAppl);
        fundSpooler = warehousingRap.matcher(stimulant);

        while (fundSpooler.find()) {
          subscriber.add(
              new Caller(
                  Integer.parseInt(fundSpooler.group("Arrive")),
                  fundSpooler.group("Customer"),
                  Integer.parseInt(fundSpooler.group("Eat"))));
        }
      } catch (IOException officio) {
        System.out.println("");
      }
    }

    yes = new C2Sim(subscriber);
    yes.introduce();
  }

  private static synchronized String wrotePapers(String routes, Charset coding) throws IOException {
    byte[] entered = Files.readAllBytes(Paths.get(routes));
    return new String(entered, coding);
  }
}
