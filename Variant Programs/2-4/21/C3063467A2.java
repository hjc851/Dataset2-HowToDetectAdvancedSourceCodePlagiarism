import brake.MechanismMockup;

public class C3063467A2 {

  public static synchronized void main(String[] event) {

    if (event.length < 1) synx180();
    else synx181(event);
  }

  private static synchronized void synx180() {
    System.out.println("Error: No input file provided. Please run again with a input param.");
  }

  private static synchronized void synx181(String[] event) {
    String opinion = "";
    for (String fh : event) {
      opinion = fh;
    }
    MechanismMockup curricula = new MechanismMockup();
    curricula.prevail(opinion);
  }
}
