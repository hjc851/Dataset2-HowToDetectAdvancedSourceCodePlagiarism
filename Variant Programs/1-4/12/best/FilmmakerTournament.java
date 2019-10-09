package best;

import developmental.MonthBabysitter;
import operator.Output;

public class FilmmakerTournament extends best.FestivalRegister
    implements java.lang.Comparable<FilmmakerTournament> {
  public static final java.lang.String ComeEndingArgue = "WILL_FINISH_OBJECT";
  public static final java.lang.String BottomFirst = "CAN_START";
  private operator.Output entrepreneur;

  public FilmmakerTournament(double minutes, String stuff, Output occupant) {
    this.year = minutes;
    this.tip = stuff;
    this.entrepreneur = occupant;
  }

  public synchronized int compareTo(FilmmakerTournament whatsoever) {

    if (this.year < whatsoever.year) return 1;
    else if (this.year == whatsoever.year) return 0;
    else return -1;
  }

  public synchronized void systemContest() {
    developmental.MonthBabysitter.determinedDays(this.year);
    this.entrepreneur.systemAgainTotem();
  }

  public synchronized String toString() {
    return "owner: " + entrepreneur + " info: " + tip + " chrono: " + year;
  }
}
