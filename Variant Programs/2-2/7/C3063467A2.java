import analogue.ProceduresMoot;

public class C3063467A2 {

  public static void main(String[] adapter) {

    if (adapter.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      java.lang.String participation = "";
      for (java.lang.String waffen : adapter) {
        participation = waffen;
      }
      analogue.ProceduresMoot system = new analogue.ProceduresMoot();
      system.operate(participation);
    }
  }
}
