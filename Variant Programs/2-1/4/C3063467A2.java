import faker.LitigateMimic;

public class C3063467A2 {

  public static void main(String[] handles) {

    if (handles.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      String participation = "";
      for (String ora : handles) {
        participation = ora;
      }
      LitigateMimic project = new LitigateMimic();
      project.carry(participation);
    }
  }
}
