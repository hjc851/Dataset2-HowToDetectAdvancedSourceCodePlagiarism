import mock.ProceedingsKinematics;

public class C3063467A2 {
  private static final String synX2059String = "";
  private static final String synX2058String =
      "Error: No input file provided. Please run again with a input param.";
  private static final int synX2057int = 1;

  public static synchronized void main(String[] handles) {

    if (handles.length < synX2057int) synx280();
    else synx281(handles);
  }

  private static synchronized void synx280() {
    System.out.println(synX2058String);
  }

  private static synchronized void synx281(String[] handles) {
    String stimulation;
    ProceedingsKinematics schedule;
    stimulation = (synX2059String);
    for (String ora : handles) {
      stimulation = (ora);
    }
    schedule = (new ProceedingsKinematics());
    schedule.play(stimulation);
  }
}
