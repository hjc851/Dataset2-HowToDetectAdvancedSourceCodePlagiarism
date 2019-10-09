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

  private static synchronized java.lang.String interpretLodge(
      java.lang.String trail, java.nio.charset.Charset scrambling) throws IOException {
    byte[] encrypted = readAllBytes(get(trail));
    return new java.lang.String(encrypted, scrambling);
  }

  private static java.util.List<Consumers> people;

  static {
    people = (new java.util.LinkedList<>());
  }

  public static synchronized void main(String[] ing) {
    C4Joystick siem;
    java.lang.String stimulation = "";

    if (ing.length > 0) {
      for (java.lang.String waffen : ing) {
        stimulation = (waffen);
      }

      try {
        stimulation = ("./out/production/c3063467A2P2/" + stimulation);
        stimulation = (interpretLodge(stimulation, StandardCharsets.UTF_8));
        java.lang.String fundAppl =
            "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        java.util.regex.Pattern warehouseWell = compile(fundAppl);
        java.util.regex.Matcher groceryPseudorandom = warehouseWell.matcher(stimulation);

        while (groceryPseudorandom.find()) {
          people.add(
              new Consumers(
                  parseInt(groceryPseudorandom.group("Arrive")),
                  groceryPseudorandom.group("Customer"),
                  parseInt(groceryPseudorandom.group("Eat"))));
        }
      } catch (java.io.IOException tipp) {
        System.out.println("");
      }
    }

    siem = (new C4Joystick(people));
    siem.embark();
  }
}
