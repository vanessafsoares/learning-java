/**
 * Exercise:
 *
 * The provided code defines a class named `Product` with some basic attributes and methods. 
 * Your task is to implement a new class named `Order` that represents an order for a product. 
 * The `Order` class should contain the following attributes and methods:
 *
 * Attributes:
 * - `product`: A reference to the product being ordered (of type `Product`).
 * - `quantity`: The quantity of the product being ordered.
 *
 * Methods:
 * - `calculateTotalPrice()`: Calculates and returns the total price of the order (product price multiplied by quantity).
 * - `displayOrderDetails()`: Displays the details of the order, including product details and total price.
 * - `updateQuantity(int newQuantity)`: Updates the quantity of the order with the new quantity specified.
 *
 * Implement the `Order` class according to the provided specifications.
 */

public class Order {
    private Product product;
    private int quantity;

    public Order(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double calculateTotalPrice() {
        return this.product.getPrice() * this.quantity;
    }

    public void displayOrderDetails() {
        System.out.println("Product Name: " + this.product.getName());
        System.out.println("Product Price: " + this.product.getPrice());
        System.out.println("Quantity: " + this.quantity);
        System.out.println("Total Price: " + calculateTotalPrice());
    }

    public void updateQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

    // Product class definition
    private static class Product {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
    }
}


////Could you do something better?
//
//public void SaveCustomers(List<Csutomer> customers)
//{
//    var repo = new DataRepository();
//
//    foreach (var c in customers)
//    {
//        repo.SaveCustomer(c);
//    }
//}