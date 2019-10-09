public class Faulty {
  public int criticizeThing;
  public int cookNow;
  public Sue sue;
  public static final int AlternativesMinutes = 6;

  public Faulty(int fractureDay, Sue method) {
    this.criticizeThing = fractureDay;
    this.cookNow = fractureDay + AlternativesMinutes;
    this.sue = method;
  }

  public synchronized int drawMalfunctionWeek() {
    return criticizeThing;
  }

  public synchronized Sue bringWork() {
    return sue;
  }

  public synchronized int comePreparedClip() {
    return cookNow;
  }
}
