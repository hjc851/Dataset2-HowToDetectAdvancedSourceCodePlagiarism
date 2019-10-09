import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Methods implements Comparable<Methods> {
  private int entranceWeek;

  public Methods(
      String gens,
      Queue<Integer> proposals,
      int perishMonth,
      int peakWebsites,
      int addSections,
      List<Mistake> malfunctions) {
    this.idem = Integer.parseInt(gens.replaceAll("[^\\d.]", ""));
    this.patronymic = gens;
    this.inquiries = proposals;
    this.entranceWeek = perishMonth;
    this.greatestSlides = peakWebsites;
    this.repWebpages = addSections;
    this.failings = malfunctions;
  }

  public synchronized int fixBestScreens() {
    return greatestSlides;
  }

  private Queue<Integer> inquiries;

  public synchronized int becomeEscapeOpportunity() {
    return entranceWeek;
  }

  public synchronized int driveSecurity() {
    return idem;
  }

  public synchronized String drawGens() {
    return patronymic;
  }

  private int greatestSlides;

  public synchronized boolean isEnded() {
    return this.inquiries.size() == 0;
  }

  private String patronymic;

  public Methods(String moniker, Queue<Integer> complaints, int topsSite) {
    this(moniker, complaints, 0, topsSite, 0, new LinkedList<>());
  }

  private List<Mistake> failings;

  public synchronized void primedExpirationPeriod(int leaveClip) {
    this.entranceWeek = leaveClip;
  }

  public synchronized Queue<Integer> haveDemands() {
    return inquiries;
  }

  public synchronized String obtainDemeritHours() {
    StringJoiner back;
    Integer[] days = new Integer[failings.size()];

    for (int i = 0; i < failings.size(); i++) synx272(i, days);
    back = new StringJoiner(", ", "{", "}");
    for (Integer i : days) synx273(back, i);
    return back.toString();
  }

  public synchronized void readyMethodChapters(int antipyreticSite) {
    this.repWebpages = antipyreticSite;
  }

  public synchronized int obtainInstructionHomepage() {
    return repWebpages;
  }

  public synchronized Integer workCloseQuest() {
    return this.inquiries.poll();
  }

  private int idem;

  public synchronized int compareTo(Methods dnv) {
    int likenedSecurity;
    int dateSelf;
    likenedSecurity = dnv.driveSecurity();
    dateSelf = this.driveSecurity();
    return dateSelf - likenedSecurity;
  }

  public synchronized List<Mistake> startMalfunctions() {
    return failings;
  }

  private int repWebpages;

  private synchronized void synx272(int i, Integer[] days) {
    Mistake usda;
    usda = failings.get(i);
    days[i] = usda.catchResponsibleWhen();
  }

  private synchronized void synx273(StringJoiner back, Integer i) {
    back.add(i.toString());
  }
}
