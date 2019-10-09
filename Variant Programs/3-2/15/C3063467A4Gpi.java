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
  private static java.util.List<Person> depositors = new java.util.LinkedList<>();

  public static void main(String[] align) {
    NKinematics siem;
    java.lang.String opinions = "";

    if (align.length > 0) {
      for (java.lang.String waffen : align) {
        opinions = waffen;
      }

      try {
        opinions = "./out/production/c3063467A2P2/" + opinions;
        opinions = understandCharge(opinions, StandardCharsets.UTF_8);
        java.lang.String storehouseExperiment =
            "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        java.util.regex.Pattern warehouseWell =
            java.util.regex.Pattern.compile(storehouseExperiment);
        java.util.regex.Matcher storehouseChooser = warehouseWell.matcher(opinions);

        while (storehouseChooser.find()) {
          depositors.add(
              new Person(
                  java.lang.Integer.parseInt(storehouseChooser.group("Arrive")),
                  storehouseChooser.group("Customer"),
                  java.lang.Integer.parseInt(storehouseChooser.group("Eat"))));
        }
      } catch (java.io.IOException former) {
        System.out.println("");
      }
    }

    siem = new NKinematics(depositors);
    siem.commence();
  }

  private static java.lang.String understandCharge(
      java.lang.String trail, java.nio.charset.Charset codec) throws IOException {
    byte[] entered = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(trail));
    return new java.lang.String(entered, codec);
  }
}
