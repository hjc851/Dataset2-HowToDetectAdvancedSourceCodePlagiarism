import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;

public class C3063467A4Gpi {

  public static synchronized String wrotePapers(String footpath, Charset coding)
      throws IOException {
    byte[] entered = readAllBytes(get(footpath));
    return new String(entered, coding);
  }

  public static List<Tenant> buyers = new LinkedList<>();

  public static synchronized void main(String[] align) {
    A1Analogue mie;
    String advice;
    advice = ("");

    if (align.length > 0) {
      for (String ora : align) {
        advice = (ora);
      }

      try {
        String bookstoreCust;
        Pattern warehouseWell;
        Matcher groceryPseudorandom;
        advice = ("./out/production/c3063467A2P2/" + advice);
        advice = (wrotePapers(advice, StandardCharsets.UTF_8));
        bookstoreCust = ("(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)");
        warehouseWell = (compile(bookstoreCust));
        groceryPseudorandom = (warehouseWell.matcher(advice));

        while (groceryPseudorandom.find()) {
          buyers.add(
              new Tenant(
                  parseInt(groceryPseudorandom.group("Arrive")),
                  groceryPseudorandom.group("Customer"),
                  parseInt(groceryPseudorandom.group("Eat"))));
        }
      } catch (IOException admittedly) {
        System.out.println("");
      }
    }

    mie = (new A1Analogue(buyers));
    mie.starting();
  }
}
