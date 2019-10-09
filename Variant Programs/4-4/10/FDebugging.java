import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class FDebugging extends Programmer {
  public int clockLeft = 0;
  public java.util.ArrayDeque<Demerit> responsibleRow = null;
  public java.util.ArrayDeque<Mechanism> setConvoy = null;

  public FDebugging() {
    this.setConvoy = new java.util.ArrayDeque<>();
    this.responsibleRow = new java.util.ArrayDeque<>();
    clockLeft = HoursHuge;
  }

  public synchronized void snoTicktock() {
    java.util.List<Demerit> failings;
    failings = new java.util.LinkedList<>();
    for (Demerit f : responsibleRow) {

      if (f.haveSetPeriods() == this.comeLatestTicktock()) failings.add(f);
    }
    for (Demerit failures : failings) {
      responsibleRow.remove(failures);
      replacingScheme.incorporateFootnote(
          new Screen(
              failures.catchSue().sustainWishes().peek(), failures.catchSue().fetchPictures(), 0),
          failures.catchSue());

      if (!setConvoy.contains(failures.catchSue())) {
        this.succeedingOutgrowth(failures.catchSue());
      }
    }

    if (streamPhase != null) {
      clockLeft--;

      if (streamPhase.isEnded()) {
        streamPhase.rigidQuittingAmount(this.comeLatestTicktock());
        this.realizedWork.addLast(streamPhase);
        streamPhase = null;
      }

      if (clockLeft == 0 && streamPhase != null) {

        if (setConvoy.isEmpty()) {
          clockLeft = HoursHuge;
        } else {
          this.succeedingOutgrowth(streamPhase);
          streamPhase = null;
        }
      }
    }

    if (streamPhase == null && !setConvoy.isEmpty()) {
      streamPhase = this.poisedProceeding();
      clockLeft = HoursHuge;
    }

    this.courseAfterInsistence();
  }

  public synchronized void succeedingOutgrowth(Mechanism sue) {
    setConvoy.addLast(sue);
  }

  public synchronized Mechanism poisedProceeding() {
    return setConvoy.removeFirst();
  }

  public synchronized void courseAfterInsistence() {

    if (this.streamPhase == null) {
      return;
    }

    while (!replacingScheme.chequePetitioning(this.streamPhase)) {
      this.directWebsiteDefect();
      clockLeft = HoursHuge;

      if (!setConvoy.isEmpty()) {
        streamPhase = poisedProceeding();
      } else {
        streamPhase = null;
        return;
      }
    }
    streamPhase.sueUpcomingApplication();
  }

  public synchronized void directWebsiteDefect() {
    Demerit f;
    f = new Demerit(this.comeLatestTicktock(), streamPhase);
    responsibleRow.add(f);
    streamPhase.developErrors().add(f);
  }
}
