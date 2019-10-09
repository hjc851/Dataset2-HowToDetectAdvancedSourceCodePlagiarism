import sim.ProceedingPrototype;

public class C3063467A2 {

  public static synchronized void main(String[] constructor) {

    if (constructor.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      java.lang.String participation;
      sim.ProceedingPrototype broadcast;
      participation = "";
      for (java.lang.String fh : constructor) {
        participation = fh;
      }
      broadcast = new sim.ProceedingPrototype();
      broadcast.move(participation);
    }
  }
}
