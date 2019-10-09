public class GSim {
  private Islander confederacyProvince;
  private Islander northeastwardVieques;

  public GSim(int southern, int southeast) {
    northeastwardVieques = new Islander("N", southern);
    confederacyProvince = new Islander("S", southeast);
  }

  public void undertake() {
    northeastwardVieques.early();
    confederacyProvince.early();
  }
}
