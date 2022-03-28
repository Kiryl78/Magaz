public class Babka {
    boolean xiTR;

    public Babka (boolean xiTR) {
        this.xiTR = xiTR;
    }

    public String whoIsBabka () {
        if (xiTR) { return "Противная "; } else { return "Рассеяная "; }
    }
    public  int babkaBuys ( int priceTag) {
        int finPrice;
        if (xiTR) { finPrice = priceTag -1;} else { finPrice = priceTag + 1;}
        return finPrice;
        }
    }
