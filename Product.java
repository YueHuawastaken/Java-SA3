 import java.util.Scanner;

 public abstract class Product {
    protected String name;
    protected double value;
    protected double weight;
    protected double cbm; 

public String getName (){
    return name;
}
// public void setName(String name) {
//     this.name = name;
// }

public void setName(String name) throws IllegalArgumentException {
  if (name != null && !name.isEmpty()) {
    this.name = name;
  } else {
    throw new IllegalArgumentException("Invalid Name. Please provide a legitimate name.");
  }
}

public double getValue () {
return value;
}
// public void setValue (double value) {
//     this.value = value;
// }
public void setValue(double value) throws IllegalArgumentException {
  if (value >= 0) {
    this.value = value;
  } else {
    throw new IllegalArgumentException("Invalid value. Please provide a non-negative value. Bitch !");
  }
}

public double getWeight () {
    return weight;
}
public void setWeight (double weight) {
    this.weight = weight;
}
public double getCbm () {
    return cbm;
}
public void setCbm (double cbm) {
    this.cbm = cbm; 
}

public Product() {
    this.name = "";
    this.value = 0.00;
    this.weight = 0.00;
    this.cbm = 0.00;
}

  public Product(String name, double value, double weight, double cbm) {
    this.name = name;
    this.value = value;
    this.weight = weight;
    this.cbm = cbm;
  }
  public Product (String name, double value) {
    this.name = name;
    this.value = value;
    this.weight = 0.0;
    this.cbm = 0.0;
  }
  public void displayProduct () {
    System.out.println("Name: " + this.getName());
    System.out.println("Value: $" + this.getValue());
    System.out.println("Weight: " + this.getWeight() + "KG");
    System.out.println("CBM: " + this.getCbm() + "CBM");
  }
  public void editProduct (Scanner scanner) {
   System.out.println("Please Key in the New Name: ");
     this.name = scanner.nextLine ();
    System.out.println ("Please key in the New Value: ");
    this.value = scanner.nextDouble ();
    scanner.nextLine ();
  }
}
