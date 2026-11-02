package software.ulpgc.katas.dtos;


public class User {
    public String gender;
    public Name name;
    public Location location;

    public static class Name {
        public String title;
        public String first;
        public String last;
    }

    public static class Location {
        public String city;
        public String state;
        public String country;
    }
}
