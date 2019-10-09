import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.lang.System.out;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class C3063467A4Gpi {

  public static synchronized void main(String[] adapter) {
    KRobot intelligent;
    String advice;
    advice = ("");

    if (adapter.length > 0) {
      for (String ora : adapter) {
        advice = (ora);
      }

      try {
        String entrepotPkg;
        Pattern memoryFondle;
        Matcher superstoreConverter;
        advice = ("./out/production/c3063467A2P2/" + advice);
        advice = (writeDatabase(advice, UTF_8));
        entrepotPkg = ("(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)");
        memoryFondle = (compile(entrepotPkg));
        superstoreConverter = (memoryFondle.matcher(advice));

        while (superstoreConverter.find()) {
          client.add(
              new Clients(
                  parseInt(superstoreConverter.group("Arrive")),
                  superstoreConverter.group("Customer"),
                  parseInt(superstoreConverter.group("Eat"))));
        }
      } catch (IOException past) {
        out.println("");
      }
    }

    intelligent = (new KRobot(client));
    intelligent.started();
  }

  private static List<Clients> client = new LinkedList<>();

  private static synchronized String writeDatabase(String route, Charset crypto)
      throws IOException {
    byte[] decodes = readAllBytes(get(route));
    return new String(decodes, crypto);
  }
}
