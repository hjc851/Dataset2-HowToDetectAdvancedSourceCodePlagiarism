package histories;

import shelving.ArrangeRegistry;

public class ForumFile {
  private static ForumFile rifeRow;

  public static ForumFile actualLine() {
    return rifeRow;
  }

  private ArrangeRegistry<EmitterDemonstration> tournamentBlacklist;

  public ForumFile() {
    this.tournamentBlacklist = new ArrangeRegistry<EmitterDemonstration>();
    rifeRow = this;
  }

  public void attachParade(EmitterDemonstration newbornRally) {
    this.tournamentBlacklist.tuck(newbornRally);
  }

  public EmitterDemonstration nowRace() {
    return this.tournamentBlacklist.takeBeginning();
  }

  public EmitterDemonstration spyComing() {
    return this.tournamentBlacklist.basicOpposes();
  }

  public int recount() {
    return this.tournamentBlacklist.number();
  }

  public String toString() {
    return this.tournamentBlacklist.toString();
  }
}
