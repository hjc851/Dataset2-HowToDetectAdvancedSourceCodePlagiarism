import sim.ActMock;

public class C3063467A2 {

  public static void main(String[] use) {

    if (use.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      java.lang.String perspective = "";
      for (java.lang.String ora : use) {
        perspective = ora;
      }
      sim.ActMock project = new sim.ActMock();
      project.move(perspective);
    }
  }
}
