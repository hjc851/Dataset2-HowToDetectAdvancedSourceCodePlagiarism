import analog.WorkSimulating;

public class C3063467A2 {

  public static void main(String[] use) {

    if (use.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      String information = "";
      for (String ora : use) {
        information = ora;
      }
      WorkSimulating curriculum = new WorkSimulating();
      curriculum.campaign(information);
    }
  }
}
