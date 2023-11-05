package Project;

public class RateReview {
    public final int maximumRate = 5;
    private int rate;
    private String review;
    private Products product;

    public RateReview(){}

    public RateReview(Products product, int rate, String review){
        this.product = product;
        this.rate = rate;
        this.review = review;
    }
    public String toString(){
        return "Nhan xet ve " + this.product.getName() + ": " + this.review + ", danh gia: " + this.rate + " sao";
    }
}
