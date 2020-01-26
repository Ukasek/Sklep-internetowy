public class SpecialOffer {

    String prodOffer;
    String offerDuration;
    String discount;
    String product;
    double price;

    SpecialOffer(String offer, String duration, String dis, double pr, String p) {

        prodOffer = offer;
        offerDuration = duration;
        discount = dis;
        price = pr;
        product = p;
    }

    double priceReduction() {
        double reduction = price - (price * 0.2);
        return reduction;
    }

    void showInfo() {
        System.out.println("Oferta specjalna: " + prodOffer + " " + discount + ", " + "Teraz tylko: " + priceReduction() + ", " + "Czas trwania oferty: "
                + offerDuration + ", " + "Dotyczy produktu: " + product);
    }
}
