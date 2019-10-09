import sim.TreatModelling;

public class C3063467A2 {

  public static synchronized void main(String[] using) {

    if (using.length < 1) synx60();
    else synx61(using);
  }

  private static synchronized void synx60() {
    System.out.println("Error: No input file provided. Please run again with a input param.");
  }

  private static synchronized void synx61(String[] using) {
    java.lang.String participation;
    sim.TreatModelling fund;
    participation = "";
    for (java.lang.String ora : using) {
      participation = ora;
    }
    fund = new sim.TreatModelling();
    fund.bleed(participation);
  }
}
