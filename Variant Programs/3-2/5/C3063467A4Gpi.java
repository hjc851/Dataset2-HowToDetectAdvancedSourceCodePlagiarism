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
  private static List<Person> users = new LinkedList<>();

  public static void main(String[] align) {
    P5Device intelligent;
    String response = "";

    if (align.length > 0) {
      for (String fh : align) {
        response = fh;
      }

      try {
        response = "./out/production/c3063467A2P2/" + response;
        response = quoteData(response, StandardCharsets.UTF_8);
        String fundAppl = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        Pattern mallBanging = Pattern.compile(fundAppl);
        Matcher fundSpooler = mallBanging.matcher(response);

        while (fundSpooler.find()) {
          users.add(
              new Person(
                  Integer.parseInt(fundSpooler.group("Arrive")),
                  fundSpooler.group("Customer"),
                  Integer.parseInt(fundSpooler.group("Eat"))));
        }
      } catch (IOException appointed) {
        System.out.println("");
      }
    }

    intelligent = new P5Device(users);
    intelligent.commencement();
  }

  private static String quoteData(String avenue, Charset codification) throws IOException {
    byte[] decodes = Files.readAllBytes(Paths.get(avenue));
    return new String(decodes, codification);
  }
}
