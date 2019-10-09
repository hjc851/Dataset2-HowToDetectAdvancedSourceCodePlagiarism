public abstract class SubstituteStrategic {

  protected abstract boolean isComplete();

  protected abstract boolean testProposal(Procedure prevailingProcedure);

  protected abstract void extendFolio(Tab vig, Procedure formerFormalities);
}
