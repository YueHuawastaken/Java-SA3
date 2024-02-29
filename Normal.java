public class Normal extends Product {
    private String normalGoods;

    public Normal (String name, double value) {
        super(name, value);
        this.normalGoods = "";
    }
    public String getNormal () {
        return this.normalGoods;
    }
    public void setNormal(String normal) throws IllegalArgumentException {
  if (normal != null && !normal.isEmpty()) {
    this.normalGoods = normal;
  } else {
    throw new IllegalArgumentException("Invalid Name. Please provide a legitimate name.");
  }
}
   @Override
//    System.out.println("Sensitive Goods")
   public void displayProduct () {
    System.out.println("Normal Goods");
    super.displayProduct ();
   }
}