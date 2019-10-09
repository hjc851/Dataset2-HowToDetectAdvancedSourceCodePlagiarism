import joystick.WorkSimulating;
import static java.lang.System.out;

public class C3063467A2 {

  public static synchronized void main(String[] handles) {

    if (handles.length < 1) synx600();
    else synx601(handles);
  }

  private static synchronized void synx600() {
    out.println("Error: No input file provided. Please run again with a input param.");
  }

  private static synchronized void synx601(String[] handles) {
    java.lang.String participatory;
    joystick.WorkSimulating programme;
    participatory = "";
    for (java.lang.String waffen : handles) {
      participatory = waffen;
    }
    programme = new joystick.WorkSimulating();
    programme.melt(participatory);
  }
}
