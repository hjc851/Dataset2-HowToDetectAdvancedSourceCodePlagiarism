package show;

import ra.ClipSteward;
import vintner.Presenter;

public class DirectorSeminar extends CommemorationHistory implements Comparable<DirectorSeminar> {
  public static final String VolitionConclusionObjection = "WILL_FINISH_OBJECT";
  public static final String CrapperKickoff = "CAN_START";
  private Presenter permittee;

  public DirectorSeminar(double beginning, String scoop, Presenter owns) {
    this.juncture = beginning;
    this.intelligence = scoop;
    this.permittee = owns;
  }

  public int compareTo(DirectorSeminar know) {

    if (this.juncture < know.juncture) return 1;
    else if (this.juncture == know.juncture) return 0;
    else return -1;
  }

  public void procedureCase() {
    ClipSteward.placeWeek(this.juncture);
    this.permittee.marchAdjacentObjection();
  }

  public String toString() {
    return "owner: " + permittee + " info: " + intelligence + " chrono: " + juncture;
  }
}
