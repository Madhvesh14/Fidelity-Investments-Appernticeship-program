public class cafetericabillcalculator {
    public static void main(String[] args) {
        int pricepizza = 200;
        int pricepuffs = 40;
        int pricepepsi = 120;

        int numpizza = 5;
        int numpuffs = 6;
        int numpepsi = 2;

        int totalpizzacost = numpizza*pricepizza;
        int totalpuffs = numpuffs*pricepuffs;
        int totalpepsi = numpepsi*pricepepsi;
        int Grandtotal = totalpizzacost + totalpuffs + totalpepsi;

        System.out.println("Bill details");
        System.out.println("Total pizza cost:Rs" + totalpizzacost);
        System.out.println("Total puffs cost:Rs" + totalpuffs);
        System.out.println("Total pepsi cost:Rs" + totalpepsi);
        System.out.println("Total pepsi cost:Rs" + totalpepsi);
        System.out.println("Grandtotal cost:Rs" + Grandtotal);

    }
}

