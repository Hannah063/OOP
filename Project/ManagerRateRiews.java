package Project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManagerRateRiews {
    private Map<Customer, List<RateReview>> customerRateReviews;

    public ManagerRateRiews() {
        customerRateReviews = new HashMap<>();
    }
    //thêm đánh giá và nhận xét
    public void addRateReview(Customer customer, RateReview rateReview) {
        List<RateReview> rateReviews = customerRateReviews.getOrDefault(customer, new ArrayList<>());
        rateReviews.add(rateReview);
        customerRateReviews.put(customer, rateReviews);
    }
    //in
    public void printRateReview(Customer customer) {
        List<RateReview> rateReviews = customerRateReviews.getOrDefault(customer, new ArrayList<>());
        for (RateReview rateReview : rateReviews) {
            System.out.println(rateReview.toString());
        }
    }
}
