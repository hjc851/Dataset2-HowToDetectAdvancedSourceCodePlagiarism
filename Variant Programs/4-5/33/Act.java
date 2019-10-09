import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Act implements Comparable<Act> {
  public int nerfling = 0;
  public String cite = null;
  public Queue<Integer> bespeak = null;
  public int perishMonth = 0;
  public int peakWebsites = 0;
  public int rppWebsites = 0;
  public List<Shortcoming> failings = null;

  public Act(String patronymic, Queue<Integer> quest, int upperSlips) {
    this(patronymic, quest, 0, upperSlips, 0, new LinkedList<>());
  }

  public Act(
      String constitute,
      Queue<Integer> calls,
      int expirationPeriod,
      int kateListings,
      int moveScript,
      List<Shortcoming> malfunctions) {
    this.nerfling = (Integer.parseInt(constitute.replaceAll("[^\\d.]", "")));
    this.cite = (constitute);
    this.bespeak = (calls);
    this.perishMonth = (expirationPeriod);
    this.peakWebsites = (kateListings);
    this.rppWebsites = (moveScript);
    this.failings = (malfunctions);
  }

  public synchronized int sustainSelf() {
    return nerfling;
  }

  public synchronized String conveyPseudonym() {
    return cite;
  }

  public synchronized int haveReleasePeriods() {
    return perishMonth;
  }

  public synchronized void putDepartureClock(int expireWhen) {
    this.perishMonth = (expireWhen);
  }

  public synchronized int sustainMarxPubs() {
    return peakWebsites;
  }

  public synchronized int comePeenVarlet() {
    return rppWebsites;
  }

  public synchronized void doResetAspects(int interruptToner) {
    this.rppWebsites = (interruptToner);
  }

  public synchronized List<Shortcoming> fetchMistakes() {
    return failings;
  }

  public synchronized boolean isEnded() {
    return this.bespeak.size() == 0;
  }

  public synchronized Queue<Integer> sustainWishes() {
    return bespeak;
  }

  public synchronized Integer mechanismsEarlyWishes() {
    return this.bespeak.poll();
  }

  public synchronized String generateNegligenceSituations() {
    Integer[] places = new Integer[failings.size()];
    {
      int i = 0;

      while (i < failings.size()) {
        {
          synx238(i, places);
        }
        i++;
      }
    }
    StringJoiner off = new StringJoiner(", ", "{", "}");
    for (Integer i : places) synx239(off, i);
    return off.toString();
  }

  public synchronized int compareTo(Act bone) {
    int equivalenceCard = bone.sustainSelf();
    int tryIdentifying = this.sustainSelf();
    return tryIdentifying - equivalenceCard;
  }

  private synchronized void synx238(int i, Integer[] places) {
    Shortcoming usda = failings.get(i);
    places[i] = (usda.becomeAccountableOpportunity());
  }

  private synchronized void synx239(StringJoiner off, Integer i) {
    off.add(i.toString());
  }
}
