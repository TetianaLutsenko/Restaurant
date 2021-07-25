package takeout;

import static takeout.utils.PrintUtils.CommonPrintMethod.*;  //printMenuTitle;
import static takeout.utils.PrintUtils.PrintSpaces.*;
import static takeout.utils.PrintUtils.PrintTitles.*;
// import static takeout.utils.PrintUtils.println;

//    static MainDish beef = new MainDish("Beef Wellington", 13.00);
//    static MainDish fish = new MainDish("Miso Salmon", 12.00);
//    static MainDish chicken = new MainDish("Chicken Teriaki", 7.00);
//    static MainDish pork = new MainDish("Honey Garlic Pork Chops", 10.00);
//
//    static Side rice = new Side("Brown Rice", 2.99);
//    static Side asparagus = new Side("Oven-Roasted Asparagus", 4.50);
//    static Side beens = new Side("Green Beans Amandine", 5.00);
//    static Side potato = new Side("Creamy Mashed Potatoes", 4.00);
//
//    static Drink water = new Drink("Perrier® carbonated mineral water", 3.50);
//    static Drink wineWhite = new Drink("Oaked Chardonnay", 20.50);
//    static Drink wineRed =  new Drink("Château Corton Grancey Grand Cru", 40.00);
//    static Drink juiceApple = new Drink("Fresh squeezed Apple juice", 10.00);
public class Menu {
    MainDish beef = new MainDish("Beef Wellington", 13.00);
    MainDish fish = new MainDish("Miso Salmon", 12.00);
    MainDish chicken = new MainDish("Chicken Teriaki", 7.00);
    MainDish pork = new MainDish("Honey Garlic Pork Chops", 10.00);

    Side rice = new Side("Brown Rice", 2.99);
    Side asparagus = new Side("Oven-Roasted Asparagus", 4.50);
    Side beens = new Side("Green Beans Amandine", 5.00);
    Side potato = new Side("Creamy Mashed Potatoes", 4.00);

    Drink water = new Drink("Perrier® carbonated mineral water", 3.50);
    Drink wineWhite = new Drink("Oaked Chardonnay", 20.50);
    Drink wineRed =  new Drink("Château Corton Grancey Grand Cru", 40.00);
    Drink juiceApple = new Drink("Fresh squeezed Apple juice", 10.00);

    MainDish[] mainDishes = new MainDish[]{beef, fish, chicken, pork};
    Side[] sides = new  Side[]{rice, asparagus, beens, potato};
    Drink[] drinks = new Drink[]{water, wineWhite, wineRed, juiceApple};

    public MainDish getBeef() {
        return beef;
    }

    public void setBeef(MainDish beef) {
        this.beef = beef;
    }

    public MainDish getFish() {
        return fish;
    }

    public void setFish(MainDish fish) {
        this.fish = fish;
    }

    public MainDish getChicken() {
        return chicken;
    }

    public void setChicken(MainDish chicken) {
        this.chicken = chicken;
    }

    public MainDish getPork() {
        return pork;
    }

    public void setPork(MainDish pork) {
        this.pork = pork;
    }

    public Side getRice() {
        return rice;
    }

    public void setRice(Side rice) {
        this.rice = rice;
    }

    public Side getAsparagus() {
        return asparagus;
    }

    public void setAsparagus(Side asparagus) {
        this.asparagus = asparagus;
    }

    public Side getBeens() {
        return beens;
    }

    public void setBeens(Side beens) {
        this.beens = beens;
    }

    public Side getPotato() {
        return potato;
    }

    public void setPotato(Side potato) {
        this.potato = potato;
    }

    public Drink getWater() {
        return water;
    }

    public void setWater(Drink water) {
        this.water = water;
    }

    public Drink getWineWhite() {
        return wineWhite;
    }

    public void setWineWhite(Drink wineWhite) {
        this.wineWhite = wineWhite;
    }

    public Drink getWineRed() {
        return wineRed;
    }

    public void setWineRed(Drink wineRed) {
        this.wineRed = wineRed;
    }

    public Drink getJuiceApple() {
        return juiceApple;
    }

    public void setJuiceApple(Drink juiceApple) {
        this.juiceApple = juiceApple;
    }

    public String[] getMainDishesNames() {
        String[] mainDishesNames = new String[mainDishes.length];
        for (int i = 0; i < mainDishes.length; i++) {
            mainDishesNames[i] = mainDishes[i].getMainDishName();
        }
        return mainDishesNames;
    }

    public double[] getMainDishesPrices() {
        double[] mainDishesPrices = new double[mainDishes.length];
        for (int i = 0; i < mainDishes.length; i++) {
            mainDishesPrices[i] = mainDishes[i].getMainDishPrice();
        }
        return mainDishesPrices;
    }

    public String[] getSidesNames() {
        String[] sidesNames = new String[sides.length];
        for (int i = 0; i < sides.length; i ++) {
            sidesNames[i] = sides[i].getSideName();
        }
        return sidesNames;
    }

    public double[] getSidesPrices() {
        double[] sidesPrices = new double[sides.length];
        for (int i = 0; i < sides.length; i ++) {
            sidesPrices[i] = sides[i].getSidePrice();
        }
        return sidesPrices;
    }

    public String[] getDrinksNames() {
        String[] drinksNames = new String[drinks.length];
        for (int i = 0; i < drinks.length; i ++) {
            drinksNames[i] = drinks[i].getDrinkName();

        }
        return drinksNames;
    }

    public double[] getDrinksPrices() {
        double[] drinksPrices = new double[drinks.length];
        for (int i = 0; i < drinks.length; i ++) {
            drinksPrices[i] = drinks[i].getDrinkPrice();
        }
        return drinksPrices;
    }

    private void printMainDishes() {
        printMainDishesTitle();
        for (int i =0; i < getMainDishesNames().length; i++) {
            print(getMainDishesNames()[i]);
            printSpacesAfterName(spacesAfterName(getMainDishesNames(), getSidesNames(), getDrinksNames(), getMainDishesNames()[i]));
            printPrice(getMainDishesPrices()[i]);
            println();
        }
        println();

    }

    private void  printSides() {
        printSidesTitle();
        for (int i =0; i < getSidesNames().length; i++) {
            print(getSidesNames()[i]);
            printSpacesAfterName(spacesAfterName(getMainDishesNames(), getSidesNames(), getDrinksNames(), getSidesNames()[i]));
            printPrice(getSidesPrices()[i]);
            println();
        }
        println();
    }

    private void printDrinks() {
        printSidesTitle();
        for (int i =0; i < getDrinksNames().length; i++) {
            print(getDrinksNames()[i]);
            printSpacesAfterName(spacesAfterName(getMainDishesNames(), getSidesNames(), getDrinksNames(), getDrinksNames()[i]));
            printPrice(getDrinksPrices()[i]);
            println();
        }
        println();
    }

    public void printMenu() {
        printMenuTitle();
        printMainDishes();
        printSides();
        printDrinks();
        println();
        printLine();
    }
}
