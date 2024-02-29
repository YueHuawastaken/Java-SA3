import java.util.ArrayList; 
import java.util.List;
import java.util.Scanner;
    
public class Main {
    private static List<Product> productList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        Normal product1 = new Normal ("Naruto Resin", 500);
        productList.add (product1);
        do {
            choice = displayMenu();
            if (choice == 1) {
                addNewProduct ();
            }
            if (choice == 2) {
                displayProducts ();
            }
            if (choice == 3) {
            break;
        }
        } while (true);   

    }

    private static int displayMenu() {
        int choice = 0;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add a product");
            System.out.println("2. List all products");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); //consume the newline character in the buffer
        if (choice >= 1 && choice <=3) {
            break;
            }    
        }
        return choice;
    } 

    private static void addNewProduct() {

  System.out.print("Enter the name of the product: ");
  String name = scanner.nextLine();
  System.out.print("Enter the value of the product: ");
  double value = scanner.nextDouble();
  scanner.nextLine(); // consume the newline character in the buffer
  System.out.println("1 for Sensitive / 2 for Normal");
  System.out.print("Enter Product Type: ");
  int type = scanner.nextInt(); 
  scanner.nextLine(); 
//   System.out.println(type.toUpperCase () == "S");
    if (type == 1) {
        // System.out.println("S in");
        Sensitive product = new Sensitive(name,value);
        productList.add(product);
    }
    else if (type ==2 ) {
        // System.out.println("N in");
        Normal product = new Normal(name,value);
        productList.add(product);
    }
  

//   Product product = new Product(name, value);

//   productList.add(product);
  System.out.println("Product added successfully!");
}

 
    // public static void createProduct() {
    //     Product product1 = new Product ();
    //     Product product2 = new Product ("Name", 0.0 , 25, 0.5);
    //     product1.setName("Naruto Resin");
    //     product1.setValue(500);
    //     product1.setWeight(29);
    //     product1.setCbm(0.20);

    //     System.out.println("Product : " + product1.getName ());
    //     System.out.println("Value : $" + product1.getValue ());
    //     System.out.println("Weight :" + product1.getWeight() + "KG");
    //     System.out.println("CBM :" + product1.getCbm() + "CBM");

    //     System.out.println("Product : " + product2.getName ());
    //     System.out.println("Value : $" + product2.getValue ());
    //     System.out.println("Weight :" + product2.getWeight() + "KG");
    //     System.out.println("CBM :" + product2.getCbm() + "CBM");
    // }

    // public static void displayMenu() {
    //     System.out.println("Product Management System");
    //     System.out.println("--------------------------");
    //     System.out.println("1. Show all products");
    //     System.out.println("2. Add a new product");
    //     System.out.println("3. Update a product");
    //     System.out.println("4. Delete a product");
    //     System.out.println("5. Quit");
    // }
    private static void displayProducts() {
  System.out.println("List of Products:");
  for (Product product : productList) {
    product.displayProduct ();
    // System.out.println("Name: " + product.getName());
    // System.out.println("Value: $" + product.getValue());
    // System.out.println("Weight: " + product.getWeight() + "KG");
    // System.out.println("CBM: " + product.getCbm() + "CBM");
    System.out.println("-----------------");
  }
  int choice = 0;
   do {
            choice = ED ();
            if (choice == 1) {
                editProduct ();
            }
            if (choice == 2) {
                deleteProduct ();
            }
            if (choice == 3) {
            break;
        }
        } while (true);   

}
private static int ED () {
     int choice = 0;
        while (true) {
            System.out.println("Edit/Delete:");
            System.out.println("1. Edit a Product");
            System.out.println("2. Delete a Product");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); //consume the newline character in the buffer
        if (choice >= 1 && choice <=3) {
            break;
            }    
        }
        return choice;
}
       private static void deleteProduct () {
        System.out.print("Please Key in the Name of the Product to delete: ");
        String name = scanner.nextLine ();
        Product deleteproduct = null;
        for (Product p : productList) {
            if (p.name.equals(name)) {
                deleteproduct = p;
                break;
           
            }

        }
          if (deleteproduct != null) {
          productList.remove (deleteproduct);
          System.out.println("Product has been deleted"); 
          }
          else System.out.println("No Product with that name found");
       }
    private static void editProduct () {
      System.out.println ("Please Enter the Name of the product you want edit: ");
      String name = scanner.nextLine ();
        for (Product p : productList) {
            if (p.name.equals(name)) {
              p.editProduct (scanner);
              System.out.println("Product has been edited Successfully");
                return;
           
            }

        }
           
           System.out.println("No Product with that name found");
       }
    }


    
//          public void setValue (double value) throws IllegalArgumentException {
//             if (value > 0) {
//                 this.value = value;
//             }
//             else {
//                 throw new IllegalArgumentException ("Invalid Value. Please key in a value, bitch !");
//             }
//          }
//          public void setName(String name) throws IllegalArgumentException {
//          if (name != null && !name.isEmpty()) {
//         this.name = name;
//          } else {
//           throw new IllegalArgumentException("Invalid name. Please do not leave it blank !");
//   }
// }  
        //  public void Product () {
        //     this.name = "N/A";
        //     this.value = 0;
        //     this.weight = 0;
        //     this.cmb = 0; 
        //  }
        
    

    