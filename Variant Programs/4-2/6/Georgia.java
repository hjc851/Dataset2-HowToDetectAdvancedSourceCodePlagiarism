import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Georgia extends BackupFocused {
  private final int PremiumSetups = 30;
  private Queue<Paper> Fps;

  public Georgia() {
    this.Fps = new LinkedList<>();
  }

  protected void tallySection(Paper paper, Methodology contemporaryLitigate) {

    if (this.isComplete()
        || contemporaryLitigate.haveActivateListings() == contemporaryLitigate.makeLoadChapters()) {
      this.slayHomepage(contemporaryLitigate);
    }

    List<Paper> thermometer = new LinkedList<>();
    for (Paper f : Fps) {

      if (f.letIdentification() == paper.letIdentification()
          && f.letAnalogicSummons() == contemporaryLitigate.conveyTag()) thermometer.add(f);
    }
    Paper typical = null;

    if (thermometer.size() > 0) typical = thermometer.get(0);

    if (typical == null) {
      Fps.add(paper);
      contemporaryLitigate.fixRetrievePubs(contemporaryLitigate.haveActivateListings() + 1);
    } else {
      typical.reactivateParry();
    }
  }

  private void slayHomepage(Methodology theMethodology) {
    Predicate<Paper> risus =
        new Predicate<Paper>() {

          public boolean test(Paper writes) {
            return writes.letAnalogicSummons() == theMethodology.conveyTag();
          }
        };
    Paper healthiest =
        Fps.stream().filter(risus).max(Comparator.comparingInt(Paper::beatTile)).get();
    Fps.remove(healthiest);
  }

  public boolean crackPlea(Methodology formerFormalities) {
    Fps.forEach(Paper::upsurgeDispel);
    List<Paper> site = new ArrayList<>();
    for (Paper Chassis : Fps) {

      if (formerFormalities.becomeRequisition().peek().equals(Chassis.letIdentification())
          && formerFormalities.conveyTag() == Chassis.letAnalogicSummons()) {
        site.add(Chassis);
      }
    }

    if (site.size() > 0) {
      site.forEach(Paper::reactivateParry);
      return true;
    }

    return false;
  }

  public boolean isComplete() {
    return Fps.size() >= PremiumSetups;
  }
}
