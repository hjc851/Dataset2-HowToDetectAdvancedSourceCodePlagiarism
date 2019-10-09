package memorialize;

import safekeeping.ConsultedAgenda;

public class SeminarJumping {
  private static SeminarJumping actualLine;

  public static SeminarJumping prevailingWaiting() {
    return actualLine;
  }

  private ConsultedAgenda<SupplierVenue> expositionPlaylist;

  public SeminarJumping() {
    this.expositionPlaylist = new ConsultedAgenda<SupplierVenue>();
    actualLine = this;
  }

  public void appendForum(SupplierVenue originalGala) {
    this.expositionPlaylist.inscribe(originalGala);
  }

  public SupplierVenue followingExtravaganza() {
    return this.expositionPlaylist.hitTop();
  }

  public SupplierVenue spyingSoon() {
    return this.expositionPlaylist.forwardVictim();
  }

  public int enumeration() {
    return this.expositionPlaylist.numeration();
  }

  public String toString() {
    return this.expositionPlaylist.toString();
  }
}
