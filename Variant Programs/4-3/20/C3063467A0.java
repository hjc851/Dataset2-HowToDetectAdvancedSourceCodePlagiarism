public class C3063467A0 {

  public static synchronized void main(String[] array) {

    if (array.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      ActMock project = new ActMock();
      project.race(array);
    }
  }
}
