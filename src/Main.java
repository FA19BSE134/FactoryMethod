import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        getInternetPlan subscribe = new getInternetPlan();

        System.out.println("Subscribe to any internet plan 8MB | 10MB | 15MB : ");
        String sub = sc.next();

        InternetPlan p = subscribe.SubscribePlane(sub);

        p.PlanName();

    }
}