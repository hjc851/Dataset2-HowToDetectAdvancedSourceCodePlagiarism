import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringJoiner;

public class Mechanisms implements Comparable<Mechanisms> {
  private static final String synX1285String = "}";
  private static final String synX1284String = "{";
  private static final String synX1283String = ", ";
  private static final int synX1282int = 0;
  private static final int synX1281int = 0;
  public int identification;
  public String discover;
  public Queue<Integer> applications;
  public int pulloutHour;
  public int peakWebsites;
  public int eprPageboy;
  public List<Negligence> fracture;

  public Mechanisms(String call, Queue<Integer> quest, int lotLength) {
    this(call, quest, 0, lotLength, 0, new LinkedList<>());
  }

  public Mechanisms(
      String gens,
      Queue<Integer> appeals,
      int expireWhen,
      int bundleHeadlines,
      int resetAspects,
      List<Negligence> mistake) {
    this.identification = Integer.parseInt(gens.replaceAll("[^\\d.]", ""));
    this.discover = gens;
    this.applications = appeals;
    this.pulloutHour = expireWhen;
    this.peakWebsites = bundleHeadlines;
    this.eprPageboy = resetAspects;
    this.fracture = mistake;
  }

  public synchronized int produceMap() {
    return identification;
  }

  public synchronized String generateAppoint() {
    return discover;
  }

  public synchronized int drawEntranceWeek() {
    return pulloutHour;
  }

  public synchronized void layPassingMoment(int egressYears) {
    this.pulloutHour = egressYears;
  }

  public synchronized int conveyGreatestSlides() {
    return peakWebsites;
  }

  public synchronized int makeMethodChapters() {
    return eprPageboy;
  }

  public synchronized void laySpecialWebpage(int allocateWebsite) {
    this.eprPageboy = allocateWebsite;
  }

  public synchronized List<Negligence> generateDefects() {
    return fracture;
  }

  public synchronized boolean isEnded() {
    return this.applications.size() == synX1281int;
  }

  public synchronized Queue<Integer> arriveInvitations() {
    return applications;
  }

  public synchronized Integer litigateIncomingProposal() {
    return this.applications.poll();
  }

  public synchronized String makeFractureJunctures() {
    Integer[] intervals = new Integer[fracture.size()];
    {
      int i = synX1282int;

      while (i < fracture.size()) {
        {
          {
            Negligence usda = fracture.get(i);
            intervals[i] = usda.driveLiabilityAgain();
          }
        }
        i++;
      }
    }
    StringJoiner taboo = new StringJoiner(synX1283String, synX1284String, synX1285String);
    for (Integer i : intervals) {
      taboo.add(i.toString());
    }
    return taboo.toString();
  }

  public synchronized int compareTo(Mechanisms bone) {
    int comparabilityIdentifier = bone.produceMap();
    int thenSecurity = this.produceMap();
    return thenSecurity - comparabilityIdentifier;
  }
}
