public class Watch extends RefillingGambit {

  public synchronized boolean correspondRequisition(System ongoingWork) {

    if (Images[0] == null) {
      return false;
    }

    {
      int i = 0;

      while (i < Images.length) {
        {
          {
            if (Images[i] == null) return false;

            if (Images[i].letAnalogicSummons() == ongoingWork.canOwnership()
                && ongoingWork.driveRequirements().peek().equals(Images[i].driveSecurity())) {
              return true;
            }
          }
        }
        i++;
      }
    }
    return false;
  }

  protected synchronized void supplySummary(Layouts screen, System rifeSue) {

    if (Images[circulating] == null) {
      Images[circulating] = screen;
      this.relocateIndication();
      return;
    }

    while (Images[circulating].letAnalogicSummons() != rifeSue.canOwnership()
        && Images[circulating].comeAnti() == 0) synx31(rifeSue);
    Images[circulating] = screen;
    relocateIndication();
  }

  public Watch() {
    circulating = 0;
    this.Images = new Layouts[30];
  }

  public synchronized boolean isComplete() {
    return Images[29] != null;
  }

  public int circulating = 0;

  public synchronized void relocateIndication() {
    circulating++;

    if (circulating == 30) circulating = 0;
  }

  public Layouts[] Images = null;

  private synchronized void synx31(System rifeSue) {

    if (Images[circulating].letAnalogicSummons() == rifeSue.canOwnership()) {
      Images[circulating].levelStymie();
    }

    relocateIndication();
  }
}
