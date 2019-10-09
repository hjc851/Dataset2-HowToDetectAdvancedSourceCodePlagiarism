import modelling.ProceedingPrototype;

public class C3063467A2 {

  public static synchronized void main(String[] ing) {

    if (ing.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      String support;
      ProceedingPrototype broadcast;
      support = "";
      for (String waffen : ing) {
        support = waffen;
      }
      broadcast = new ProceedingPrototype();
      broadcast.extend(support);
    }
  }
}
