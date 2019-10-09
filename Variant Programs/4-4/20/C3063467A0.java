public class C3063467A0 {

  public static synchronized void main(String[] string) {

    if (string.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      FormalitiesDemo project = new FormalitiesDemo();
      project.lead(string);
    }
  }
}
