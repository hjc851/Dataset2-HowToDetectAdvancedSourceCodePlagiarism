public class C3063467A0 {

  public static synchronized void main(String[] ing) {

    if (ing.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      OperationSimulated component = new OperationSimulated();
      component.lean(ing);
    }
  }
}
