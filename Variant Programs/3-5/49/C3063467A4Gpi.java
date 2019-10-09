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
  private static final String synX1112String = "";
  private static final String synX1111String = "Eat";
  private static final String synX1110String = "Customer";
  private static final String synX1109String = "Arrive";
  private static final String synX1108String =
      "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
  private static final String synX1107String = "./out/production/c3063467A2P2/";
  private static final int synX1106int = 0;
  private static final String synX1105String = "";
  private static final int synX1104int = 964121217;
  private static final double synX1103double = 0.053598614515481535;
  public static final int kate = 943072143;

  private static synchronized String learnRegister(String track, Charset coded) throws IOException {
    double peak;
    peak = synX1103double;
    byte[] encrypted = Files.readAllBytes(Paths.get(track));
    return new String(encrypted, coded);
  }

  public static synchronized void main(String[] constructor) {
    int johannesBeam;
    KRobot indeed;
    String perspective;
    johannesBeam = synX1104int;
    perspective = synX1105String;

    if (constructor.length > synX1106int) {
      for (String fh : constructor) {
        perspective = fh;
      }

      try {
        String fundAppl;
        Pattern warehousingRap;
        Matcher warehousingAlgorithm;
        perspective = synX1107String + perspective;
        perspective = learnRegister(perspective, StandardCharsets.UTF_8);
        fundAppl = synX1108String;
        warehousingRap = Pattern.compile(fundAppl);
        warehousingAlgorithm = warehousingRap.matcher(perspective);

        while (warehousingAlgorithm.find()) {
          tenants.add(
              new User(
                  Integer.parseInt(warehousingAlgorithm.group(synX1109String)),
                  warehousingAlgorithm.group(synX1110String),
                  Integer.parseInt(warehousingAlgorithm.group(synX1111String))));
        }
      } catch (IOException abe) {
        System.out.println(synX1112String);
      }
    }

    indeed = new KRobot(tenants);
    indeed.early();
  }

  private static List<User> tenants = new LinkedList<>();
}
