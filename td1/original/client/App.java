package td1.original.client;

import td1.original.api.general.*;


import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String args[]) {
        Burger alice_dinner = new Burger(
                "Fishy",
                List.of(new Meat(MeatType.WHITEFISH, 50),
                        new Sauce(SauceType.BEARNAISE, 40))
        );
        Burger bob_dinner = new Burger(
                "Beefy",
                List.of(new Meat(MeatType.BEEF, 100),
                        new Sauce(SauceType.BURGER, 40),
                        new DeepFriedOnions(10),
                        new Cheddar(15),
                        new DeepFriedOnions(10),
                        new Cheddar(15))
        );
        Burger charles_dinner = new Burger(
                "Own Style",
                List.of(new Meat(MeatType.BEEF,400),
                        new DeepFriedOnions(20),
                        new Cheddar(30),
                        new Sauce(SauceType.BARBECUE,20),
                        new Sauce(SauceType.BEARNAISE,20),
                        new Sauce(SauceType.BURGER,20),
                        new Cheddar(30))
        );
        List<Burger> dinners = Arrays.asList(
                alice_dinner,
                bob_dinner,
                charles_dinner
        );
        for (Burger dinner : dinners) {
            System.out.println(dinner);
        }
    }
}