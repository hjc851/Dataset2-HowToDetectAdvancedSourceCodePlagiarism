package mark;

import glanced.SentenceGoalie;
import farmer.Vintner;

public class DirectorSeminar extends mark.FestivalRegister
    implements java.lang.Comparable<DirectorSeminar> {
  public static final java.lang.String WantsTerminateSubject = "WILL_FINISH_OBJECT";
  public static final java.lang.String ToiletBegan = "CAN_START";
  private farmer.Vintner possessor;

  public DirectorSeminar(double years, String informational, Vintner licensee) {
    this.meter = years;
    this.know = informational;
    this.possessor = licensee;
  }

  public int compareTo(DirectorSeminar hope) {

    if (this.meter < hope.meter) return 1;
    else if (this.meter == hope.meter) return 0;
    else return -1;
  }

  public void systemContest() {
    glanced.SentenceGoalie.determineBeginning(this.meter);
    this.possessor.formalitiesComeDisagree();
  }

  public String toString() {
    return "owner: " + possessor + " info: " + know + " chrono: " + meter;
  }
}
