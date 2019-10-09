package repository;

public class StoredVacuousExemption extends Exception {

  public StoredVacuousExemption() {
    super();
  }

  public StoredVacuousExemption(String tagline) {
    super(tagline);
  }
}
