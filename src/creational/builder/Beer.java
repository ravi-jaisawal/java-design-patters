package creational.builder;


//@Builder
//@Getter
//@Setter
public class Beer {
    //required
    private String name;
    private double drinkSize;
    private double alcoholPercentage;
    private double price;

    // Other attributes
    private String brewery;            // The brewery that produces the beer.
    private String countryOfOrigin;    // The country where the beer is originally from.
    private String description;        // A brief description of the beer's characteristics.
    private String packaging;          // The packaging type (bottle, can, draft, etc.).
    private String servingTemperature; // The recommended serving temperature.
    private String foodPairing;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDrinkSize() {
        return drinkSize;
    }

    public void setDrinkSize(double drinkSize) {
        this.drinkSize = drinkSize;
    }

    public double getAlcoholPercentage() {
        return alcoholPercentage;
    }

    public void setAlcoholPercentage(double alcoholPercentage) {
        this.alcoholPercentage = alcoholPercentage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrewery() {
        return brewery;
    }

    public void setBrewery(String brewery) {
        this.brewery = brewery;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPackaging() {
        return packaging;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    public String getServingTemperature() {
        return servingTemperature;
    }

    public void setServingTemperature(String servingTemperature) {
        this.servingTemperature = servingTemperature;
    }

    public String getFoodPairing() {
        return foodPairing;
    }

    public void setFoodPairing(String foodPairing) {
        this.foodPairing = foodPairing;
    }
}
