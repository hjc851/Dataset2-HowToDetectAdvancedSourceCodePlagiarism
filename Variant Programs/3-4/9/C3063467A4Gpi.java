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
  private static List<Licensee> users;

  public static synchronized void main(String[] constructor) {
    C2Sim shen;
    String perspective = "";

    if (constructor.length > 0) {
      for (String waffen : constructor) {
        perspective = waffen;
      }

      try {
        perspective = "./out/production/c3063467A2P2/" + perspective;
        perspective = showDocumentation(perspective, StandardCharsets.UTF_8);
        String superstoreInd = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        Pattern storageGlib = Pattern.compile(superstoreInd);
        Matcher deliColorimetry = storageGlib.matcher(perspective);

        while (deliColorimetry.find()) {
          users.add(
              new Licensee(
                  Integer.parseInt(deliColorimetry.group("Arrive")),
                  deliColorimetry.group("Customer"),
                  Integer.parseInt(deliColorimetry.group("Eat"))));
        }
      } catch (IOException pro) {
        System.out.println("");
      }
    }

    shen = new C2Sim(users);
    shen.conduct();
  }

  private static synchronized String showDocumentation(String curve, Charset codified)
      throws IOException {
    byte[] transmit = Files.readAllBytes(Paths.get(curve));
    return new String(transmit, codified);
  }

  static {
    users = new LinkedList<>();
  }
}
