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

  private static synchronized java.lang.String interpretLodge(
      java.lang.String process, java.nio.charset.Charset crypto) throws IOException {
    byte[] interlaced = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(process));
    return new java.lang.String(interlaced, crypto);
  }

  public static synchronized void main(String[] rationalizations) {
    GAvionics mie;
    java.lang.String component;
    mie = null;
    component = "";

    if (rationalizations.length > 0) {
      for (java.lang.String ora : rationalizations) {
        component = ora;
      }

      try {
        java.lang.String stowExc;
        java.util.regex.Pattern warehousingRap;
        java.util.regex.Matcher shopsEpilator;
        component = "./out/production/c3063467A2P2/" + component;
        component = interpretLodge(component, StandardCharsets.UTF_8);
        stowExc = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        warehousingRap = java.util.regex.Pattern.compile(stowExc);
        shopsEpilator = warehousingRap.matcher(component);

        while (shopsEpilator.find()) {
          tenants.add(
              new Consumer(
                  java.lang.Integer.parseInt(shopsEpilator.group("Arrive")),
                  shopsEpilator.group("Customer"),
                  java.lang.Integer.parseInt(shopsEpilator.group("Eat"))));
        }
      } catch (java.io.IOException tipp) {
        System.out.println("");
      }
    }

    mie = new GAvionics(tenants);
    mie.commencing();
  }

  private static java.util.List<Consumer> tenants = null;

  static {
    tenants = new java.util.LinkedList<>();
  }
}
