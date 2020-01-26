public class Product {
    String productName;
    double productPrice;
    String productDescription;
    Category category;

    Product(String prodName, double prodPrice, String prodDescription, Category c) {
        productName = prodName;
        productPrice = prodPrice;
        productDescription = prodDescription;
        category = c;
    }

    void showInfo() {
        System.out.println("Nazwa produktu: " + productName + ", " + "Cena produktu: "
                + productPrice + ", " + "Opis produktu: " + productDescription);
    }

}
