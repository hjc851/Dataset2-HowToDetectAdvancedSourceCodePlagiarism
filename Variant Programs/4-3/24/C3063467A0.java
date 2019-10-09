public class C3063467A0 {

  public static synchronized void main(String[] handles) {

    if (handles.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      ServeAnalogue programme;
      programme = new ServeAnalogue();
      programme.campaign(handles);
    }
  }
}
