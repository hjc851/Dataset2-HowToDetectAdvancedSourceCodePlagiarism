import brake.MarchDevice;

public class C3063467A2 {

  public static synchronized void main(String[] array) {

    if (array.length < 1) {
      System.out.println("Error: No input file provided. Please run again with a input param.");
    } else {
      java.lang.String response = "";
      for (java.lang.String fh : array) {
        response = fh;
      }
      brake.MarchDevice broadcast = new brake.MarchDevice();
      broadcast.outpouring(response);
    }
  }
}
