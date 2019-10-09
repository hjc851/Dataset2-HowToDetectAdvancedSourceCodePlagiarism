public class C3063467A0 {

  public static void main(String[] array) {

    if (array.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      ProceduresMoot schedule = new ProceduresMoot();
      schedule.streak(array);
    }
  }
}
