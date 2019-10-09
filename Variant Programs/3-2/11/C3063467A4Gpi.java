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
  private static java.util.List<Buyer> shoppers = new java.util.LinkedList<>();

  public static void main(String[] number) {
    ABrake smart;
    java.lang.String support = "";

    if (number.length > 0) {
      for (java.lang.String ora : number) {
        support = ora;
      }

      try {
        support = "./out/production/c3063467A2P2/" + support;
        support = registerSubmit(support, StandardCharsets.UTF_8);
        java.lang.String fundAppl =
            "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        java.util.regex.Pattern warehousingRap = java.util.regex.Pattern.compile(fundAppl);
        java.util.regex.Matcher groceryPseudorandom = warehousingRap.matcher(support);

        while (groceryPseudorandom.find()) {
          shoppers.add(
              new Buyer(
                  java.lang.Integer.parseInt(groceryPseudorandom.group("Arrive")),
                  groceryPseudorandom.group("Customer"),
                  java.lang.Integer.parseInt(groceryPseudorandom.group("Eat"))));
        }
      } catch (java.io.IOException pro) {
        System.out.println("");
      }
    }

    smart = new ABrake(shoppers);
    smart.commenced();
  }

  private static java.lang.String registerSubmit(
      java.lang.String footpath, java.nio.charset.Charset decoding) throws IOException {
    byte[] coded = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(footpath));
    return new java.lang.String(coded, decoding);
  }
}
