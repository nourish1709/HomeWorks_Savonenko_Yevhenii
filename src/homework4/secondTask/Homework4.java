package homework4.secondTask;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

public class Homework4 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        Product pineapple = new FoodProduct("Pineapple", 100,0, AgeRestriction.NONE, new GregorianCalendar(2020, Calendar.APRIL, 20).getTime());
        Product coffee = new FoodProduct("Coffee", 112, 600, AgeRestriction.TEENAGER, addDays(15));
        Product beer = new FoodProduct("Beer", 42, 200, AgeRestriction.ADULT, addDays(20));
        Product computerDell = new Computer("Dell", 15000, 1100, AgeRestriction.NONE);
        Product headphones = new Appliance("Headphones", 1500, 45, AgeRestriction.NONE);
        Product iqos = new Appliance("IQOS", 2400, 160, AgeRestriction.ADULT);
        Product cigarettes = new FoodProduct("cigarettes", 45, 800, AgeRestriction.ADULT, new GregorianCalendar(2025, Calendar.MAY, 24).getTime());

        products.add(pineapple);
        products.add(coffee);
        products.add(beer);
        products.add(computerDell);
        products.add(headphones);
        products.add(iqos);
        products.add(cigarettes);

        Customer jack = new Customer("Jack", 17, 1000);
        Customer melvin = new Customer("Melvin", 25, 2000);
        Customer denis = new Customer("Denis", 34, 28000);
        Customer calvin = new Customer("Calvin", 14, 60);
        Customer molly = new Customer("Molly", 4, 200);

        PurchaseManager purchaseManager = new PurchaseManager();
        purchaseManager.processPurchase(products.get(0), jack);
        purchaseManager.processPurchase(products.get(1), molly);
        purchaseManager.processPurchase(products.get(2), calvin);
        purchaseManager.processPurchase(products.get(3), denis);
        purchaseManager.processPurchase(products.get(4), denis);
        purchaseManager.processPurchase(products.get(5), melvin);
        purchaseManager.processPurchase(products.get(6), jack);

        System.out.println();

        getSoonestExpire(products);
        sortAllWithRestriction(products);
    }

    public static void getSoonestExpire(List<Product> products){
        List<FoodProduct> foodProducts = new ArrayList<>();
        products.forEach((product) -> {
            if (product instanceof FoodProduct) {
                foodProducts.add((FoodProduct) product);
            }
        });
        foodProducts.sort((FoodProduct food1, FoodProduct food2) -> food1.getDaysLeft() - food2.getDaysLeft());
        System.out.println("The product with the soonest date of expiration: ");
        System.out.println(foodProducts.get(0) + "\n");
    }

    public static void sortAllWithRestriction(List<Product> products){
        List<Product> productsWithRestriction = new ArrayList<>();
        products.forEach((product -> {
            if (product.getAgeRestriction() == AgeRestriction.ADULT) {
                productsWithRestriction.add(product);
            }
        }));
        productsWithRestriction.sort((Product product1, Product product2) -> (int) (product1.getPrice() - product2.getPrice()));

        System.out.println("All products with adult age restriction sorted by price in ascending order");
        productsWithRestriction.forEach((product) -> {
            System.out.println(product);
            System.out.println();
        });
    }

    public static Date addDays(int days){
        LocalDate localDate = LocalDate.now().plusDays(days);
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }
}