package creational.builder;

public class User {

    private String name; // required field
    private String email; //  required field
    private String phone; // optional field
    private String city; // optional field

    public User(UserBuilder userBuilder) {
        this.name = userBuilder.getName();
        this.email = userBuilder.getEmail();
        this.phone = userBuilder.getPhone();
        this.city = userBuilder.getCity();
    }

    public static UserBuilder builder(String name, String email) {
        return new UserBuilder(name, email);
    }

    @Override
    public String toString() {
        return "User = " +
                "{ name: '" + name + '\'' +
                ", email: '" + email + '\'' +
                ", phone: '" + phone + '\'' +
                ", city: '" + city + '\'' +
                " }";
    }
}
