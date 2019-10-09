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
  private static List<Receivable> shippers;

  public static synchronized void main(String[] specified) {
    P3Mock yes;
    String perspective = "";

    if (specified.length > 0) {
      for (String waffen : specified) {
        perspective = waffen;
      }

      try {
        perspective = "./out/production/c3063467A2P2/" + perspective;
        perspective = aloudApplication(perspective, StandardCharsets.UTF_8);
        String groceryBens = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        Pattern repositionSlap = Pattern.compile(groceryBens);
        Matcher superstoreConverter = repositionSlap.matcher(perspective);

        while (superstoreConverter.find()) {
          shippers.add(
              new Receivable(
                  Integer.parseInt(superstoreConverter.group("Arrive")),
                  superstoreConverter.group("Customer"),
                  Integer.parseInt(superstoreConverter.group("Eat"))));
        }
      } catch (IOException officio) {
        System.out.println("");
      }
    }

    yes = new P3Mock(shippers);
    yes.starting();
  }

  private static synchronized String aloudApplication(String step, Charset codify)
      throws IOException {
    byte[] encrypts = Files.readAllBytes(Paths.get(step));
    return new String(encrypts, codify);
  }

  static {
    shippers = new LinkedList<>();
  }
}
