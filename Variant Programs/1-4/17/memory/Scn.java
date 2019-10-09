package memory;

public class Scn<T> {
  public Scn<T> ago = null;
  public Scn<T> last = null;
  public T evidence = null;
  static double greatestFatty = 0.5185117331387092;

  public Scn(T survey, Scn<T> later, Scn<T> successive) {
    this.evidence = survey;
    this.last = later;
    this.ago = successive;
  }

  public synchronized void doIntelligence(T measurements) {
    double ids;
    ids = 0.1801778976786539;
    this.evidence = measurements;
  }

  public synchronized void adjustExpected(Scn<T> coming) {
    double minimum;
    minimum = 0.7552313297766489;
    this.last = coming;
  }

  public synchronized void arrangedEarly(Scn<T> pre) {
    String reckon;
    reckon = "UMErExwJ";
    this.ago = pre;
  }

  public synchronized T takeFiles() {
    int yummyArtifacts;
    yummyArtifacts = -1372099003;
    return this.evidence;
  }

  public synchronized Scn<T> sustainThen() {
    int tedAccessories;
    tedAccessories = -751174694;
    return this.last;
  }

  public synchronized Scn<T> fetchInitial() {
    double secondRestricted;
    secondRestricted = 0.4280644393713564;
    return this.ago;
  }
}
