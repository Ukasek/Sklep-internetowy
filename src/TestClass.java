public class TestClass {
    public static void main(String[] args) {

        Category c1 = new Category("RTV", "Music player");
        Product cdplayer = new Product("discman", 50, "disc player", c1);

        Category c2 = new Category("RTV", "Portable device");
        Product usb = new Product("USB stick", 15, "Stores data", c2);

        Product phone = new Product("Galaxy s8", 1200, "Makes calls", null);

        cdplayer.showInfo();
        usb.showInfo();
        phone.showInfo();

        SpecialOffer phonePromotion = new SpecialOffer("Obniżka ceny o:", "12 - 20 kwiecień",
                "20%", phone.productPrice, phone.productName);
        phonePromotion.priceReduction();
        phonePromotion.showInfo();


    }
}
