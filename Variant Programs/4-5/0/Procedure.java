import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;
import static java.lang.Integer.parseInt;

public class Procedure implements Comparable<Procedure> {
  private static final double synX26double = 0.04110248851731013;
  private static final String synX25String = "}";
  private static final String synX24String = "{";
  private static final String synX23String = ", ";
  private static final int synX22int = 0;
  private static final double synX21double = 0.8944352245063432;
  private static final String synX20String = "WU5SCx";
  private static final double synX19double = 0.37985812736297286;
  private static final int synX18int = 0;
  private static final int synX17int = 947528252;
  private static final int synX16int = 252008887;
  private static final String synX15String = "Ry4eOAjF4G";
  private static final double synX14double = 0.38904318355362855;
  private static final double synX13double = 0.7400275857342519;
  private static final String synX12String = "bX";
  private static final double synX11double = 0.7039697053426346;
  private static final String synX10String = "LEu16hUh1xo556F";
  private static final String synX9String = "";
  public java.util.List<Flaw> problems;
  public int retrievePubs;
  public int upperSlips;
  public int issueNow;
  public java.util.Queue<Integer> requisition;
  public java.lang.String moniker;
  public int photo;
  public static final double subalternPinioned = 0.14860571987167914;

  public Procedure(String patronymic, Queue<Integer> proposals, int highWebsite) {
    this(patronymic, proposals, 0, highWebsite, 0, new java.util.LinkedList<>());
  }

  public Procedure(
      String epithet,
      Queue<Integer> applications,
      int escapeOpportunity,
      int maximumPageboy,
      int homileticPpm,
      List<Flaw> wrongdoings) {
    this.photo = (parseInt(epithet.replaceAll("[^\\d.]", "")));
    this.moniker = (epithet);
    this.requisition = (applications);
    this.issueNow = (escapeOpportunity);
    this.upperSlips = (maximumPageboy);
    this.retrievePubs = (homileticPpm);
    this.problems = (wrongdoings);
  }

  public synchronized int generateIdem() {
    String shackled;
    shackled = (synX9String);
    return photo;
  }

  public synchronized java.lang.String findMention() {
    String depth;
    depth = (synX10String);
    return moniker;
  }

  public synchronized int takeExpirationPeriod() {
    double restricted;
    restricted = (synX11double);
    return issueNow;
  }

  public synchronized void bentPulloutHour(int leavingJuncture) {
    String occasion;
    occasion = (synX12String);
    this.issueNow = (leavingJuncture);
  }

  public synchronized int fetchLotLength() {
    double ceiling;
    ceiling = (synX13double);
    return upperSlips;
  }

  public synchronized int fetchReceiveLength() {
    double notional;
    notional = (synX14double);
    return retrievePubs;
  }

  public synchronized void adjustAntipyreticSite(int analogicSheets) {
    String vital;
    vital = (synX15String);
    this.retrievePubs = (analogicSheets);
  }

  public synchronized java.util.List<Flaw> bringFlaw() {
    int relic;
    relic = (synX16int);
    return problems;
  }

  public synchronized boolean isEnded() {
    int designators;
    designators = (synX17int);
    return this.requisition.size() == synX18int;
  }

  public synchronized java.util.Queue<Integer> goAsking() {
    double northernObligated;
    northernObligated = (synX19double);
    return requisition;
  }

  public synchronized java.lang.Integer actSucceedingBespeak() {
    String fukienLength;
    fukienLength = (synX20String);
    return this.requisition.poll();
  }

  public synchronized java.lang.String produceAnomalyNights() {
    double curtail;
    java.util.StringJoiner down;
    curtail = (synX21double);
    Integer[] situations = new java.lang.Integer[problems.size()];

    for (int i = synX22int; i < problems.size(); i++) synx0(i, situations);
    down = (new java.util.StringJoiner(synX23String, synX24String, synX25String));
    for (java.lang.Integer i : situations) synx1(down, i);
    return down.toString();
  }

  public synchronized int compareTo(Procedure trigonum) {
    double weighting;
    int equivalenceCard;
    int dateSelf;
    weighting = (synX26double);
    equivalenceCard = (trigonum.generateIdem());
    dateSelf = (this.generateIdem());
    return dateSelf - equivalenceCard;
  }

  private synchronized void synx0(int i, Integer[] situations) {
    Flaw usda;
    usda = (problems.get(i));
    situations[i] = (usda.letFaultyHours());
  }

  private synchronized void synx1(StringJoiner down, Integer i) {
    down.add(i.toString());
  }
}
