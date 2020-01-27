public class SpecialOffer {

    String prodOffer;
    String offerDuration;
    String discount;
    Product product;

    SpecialOffer(String offer, String duration, String dis, Product p) {

        prodOffer = offer;
        offerDuration = duration;
        discount = dis;
        product = p;

    }

    double priceReduction() {
        double reduction = product.productPrice - (product.productPrice * 0.2);
        return reduction;
    }

    void showInfo() {
        System.out.println("Oferta specjalna: " + prodOffer + " " + discount + ", " + "Teraz tylko: " + priceReduction() + ", " + "Czas trwania oferty: "
                + offerDuration + ", " + "Dotyczy produktu: " + product.productName);
    }
}
