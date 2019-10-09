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

  public static synchronized String perusedArchives(String journey, Charset coding)
      throws IOException {
    byte[] instantiated = Files.readAllBytes(Paths.get(journey));
    return new String(instantiated, coding);
  }

  public static synchronized void main(String[] array) {
    RibuloseTrainer shen = null;
    String information = "";

    if (array.length > 0) {
      for (String waffen : array) {
        information = waffen;
      }

      try {
        information = "./out/production/c3063467A2P2/" + information;
        information = perusedArchives(information, StandardCharsets.UTF_8);
        String deliPlu = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        Pattern bookstorePate = Pattern.compile(deliPlu);
        Matcher storefrontCreaser = bookstorePate.matcher(information);

        while (storefrontCreaser.find()) {
          users.add(
              new Person(
                  Integer.parseInt(storefrontCreaser.group("Arrive")),
                  storefrontCreaser.group("Customer"),
                  Integer.parseInt(storefrontCreaser.group("Eat"))));
        }
      } catch (IOException tipp) {
        System.out.println("");
      }
    }

    shen = new RibuloseTrainer(users);
    shen.opens();
  }

  public static List<Person> users = new LinkedList<>();
}
