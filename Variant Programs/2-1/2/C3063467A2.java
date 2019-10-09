import emulator.NegotiationsAvionics;

public class C3063467A2 {

  public static void main(String[] string) {

    if (string.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      String component = "";
      for (String fh : string) {
        component = fh;
      }
      NegotiationsAvionics grants = new NegotiationsAvionics();
      grants.extend(component);
    }
  }
}
