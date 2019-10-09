import impactor.SystemSim;

public class C3063467A2 {

  public static void main(String[] using) {

    if (using.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      String representations = "";
      for (String ora : using) {
        representations = ora;
      }
      SystemSim fund = new SystemSim();
      fund.melt(representations);
    }
  }
}
