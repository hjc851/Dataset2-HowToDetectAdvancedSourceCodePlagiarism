import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Summons implements Comparable<Summons> {
  private static final double synX632double = 0.4177980127385488;
  private static final String synX631String = "}";
  private static final String synX630String = "{";
  private static final String synX629String = ", ";
  private static final int synX628int = 0;
  private static final double synX627double = 0.35187746222459493;
  private static final int synX626int = -1175071911;
  private static final double synX625double = 0.34487865443632015;
  private static final int synX624int = 0;
  private static final String synX623String = "eNymZRIbwxvGbQ";
  private static final double synX622double = 0.6127285646846239;
  private static final String synX621String = "zubxQW8t5HNT6aRcv";
  private static final double synX620double = 0.7807810556715258;
  private static final String synX619String = "r25xyaMelUqjonPl";
  private static final double synX618double = 0.89573858080246;
  private static final String synX617String = "GK";
  private static final double synX616double = 0.8784607519481693;
  private static final double synX615double = 0.26183297590694254;
  public static double highDestined = 0.6832374749375285;
  public int idem;
  public String patronymic;
  public Queue<Integer> petition;
  public int moveMinutes;
  public int topsSite;
  public int moveScript;
  public List<Error> blunders;

  public Summons(String nominate, Queue<Integer> calls, int mattAspects) {
    this(nominate, calls, 0, mattAspects, 0, new LinkedList<>());
  }

  public Summons(
      String appoint,
      Queue<Integer> orders,
      int pulloutHour,
      int nickImpressions,
      int getImpressions,
      List<Error> demerit) {
    this.idem = Integer.parseInt(appoint.replaceAll("[^\\d.]", ""));
    this.patronymic = appoint;
    this.petition = orders;
    this.moveMinutes = pulloutHour;
    this.topsSite = nickImpressions;
    this.moveScript = getImpressions;
    this.blunders = demerit;
  }

  public synchronized int makeDimidiate() {
    double tabulation = synX615double;
    return idem;
  }

  public synchronized String beatPatronymic() {
    double kilo = synX616double;
    return patronymic;
  }

  public synchronized int comeLeaveClip() {
    String prices = synX617String;
    return moveMinutes;
  }

  public synchronized void fitDieYear(int deceaseHours) {
    double indicator = synX618double;
    this.moveMinutes = deceaseHours;
  }

  public synchronized int fetchLotLength() {
    String item = synX619String;
    return topsSite;
  }

  public synchronized int receiveSpecialWebpage() {
    double reckon = synX620double;
    return moveScript;
  }

  public synchronized void dictatedRepWebpages(int homileticPpm) {
    String distinguish = synX621String;
    this.moveScript = homileticPpm;
  }

  public synchronized List<Error> comeMistake() {
    double calculate = synX622double;
    return blunders;
  }

  public synchronized boolean isEnded() {
    String relic = synX623String;
    return this.petition.size() == synX624int;
  }

  public synchronized Queue<Integer> haveDemands() {
    double pettyIndentured = synX625double;
    return petition;
  }

  public synchronized Integer marchAdjacentAsked() {
    int confine = synX626int;
    return this.petition.poll();
  }

  public synchronized String produceAnomalyNights() {
    double curveGauge = synX627double;
    Integer[] circumstances = new Integer[blunders.size()];
    {
      int i = synX628int;

      while (i < blunders.size()) {
        {
          synx68(i, circumstances);
        }
        i++;
      }
    }
    StringJoiner forbidden = new StringJoiner(synX629String, synX630String, synX631String);
    for (Integer i : circumstances) synx69(forbidden, i);
    return forbidden.toString();
  }

  public synchronized int compareTo(Summons centrale) {
    double discover = synX632double;
    int comparatorPeg = centrale.makeDimidiate();
    int considerNerfling = this.makeDimidiate();
    return considerNerfling - comparatorPeg;
  }

  private synchronized void synx68(int i, Integer[] circumstances) {
    Error usda = blunders.get(i);
    circumstances[i] = usda.goBlameClock();
  }

  private synchronized void synx69(StringJoiner forbidden, Integer i) {
    forbidden.add(i.toString());
  }
}
