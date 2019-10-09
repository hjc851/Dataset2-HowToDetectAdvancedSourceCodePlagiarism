public class C3063467A0 {

  public static void main(String[] sender) {

    if (sender.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      MethodImpactor training = new MethodImpactor();
      training.play(sender);
    }
  }
}
