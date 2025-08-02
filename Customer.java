package ShoppingCartSystem;

public class Customer extends User implements Discountable{
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Customer(int userId, String username, String email) {
        super(userId,username);
        this.email=email;
    }

    @Override
    public void displayUserInfo() {
        System.out.println("Customer Info:");
        System.out.println("User ID: " + getUserId());
        System.out.println("Username: " + getUsername());
        System.out.println("Email: " + getEmail());
    }

    @Override
    public double applyDiscount(Product product) {
        double price = product.getPrice();
        if (price > 100) {
            return price * 0.90; // 10% discount
        } else if (price > 50) {
            return price * 0.95; // 5% discount
        } else {
            return price; // No discount
        }
    }
}