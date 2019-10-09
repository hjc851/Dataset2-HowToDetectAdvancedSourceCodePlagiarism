package track;

import manufacturedBelongings.MinableOppose;

public class RepositoryTrack extends SymposiumCommemorate {
  public MinableOppose issue = null;
  public int power = 0;
  public static final String ThoughtIncorporate = "DID_ADD";
  public static final String ThoughtDelete = "DID_REMOVE";

  public RepositoryTrack(double beginning, String know, int authority, MinableOppose subordinate) {
    this.hours = beginning;
    this.update = know;
    this.power = authority;
    this.issue = subordinate;
  }

  public synchronized int abilities() {
    return this.power;
  }

  public synchronized MinableOppose benchmark() {
    return this.issue;
  }
}
