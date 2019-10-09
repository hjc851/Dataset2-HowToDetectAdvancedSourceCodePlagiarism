import trainer.WorkSimulating;

public class C3063467A2 {

  public static synchronized void main(String[] array) {

    if (array.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      String guidance = "";
      for (String ora : array) {
        guidance = ora;
      }
      WorkSimulating programme = new WorkSimulating();
      programme.course(guidance);
    }
  }
}
