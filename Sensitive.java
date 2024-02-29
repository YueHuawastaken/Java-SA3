public class Sensitive extends Product {
    private String sensitiveGoods;

    public Sensitive (String name, double value) {
        super(name, value);
        this.sensitiveGoods = "";
    }
    public String getSensitive () {
        return this.sensitiveGoods;
    }
    public void setSensitive(String sensitive) throws IllegalArgumentException {
  if (sensitive != null && !sensitive.isEmpty()) {
    this.sensitiveGoods = sensitive;
  } else {
    throw new IllegalArgumentException("Invalid Name. Please provide a legitimate name.");
  }
}
   @Override
//    System.out.println("Sensitive Goods")
   public void displayProduct () {
    System.out.println("Sensitive Goods");
    super.displayProduct ();
   }
}