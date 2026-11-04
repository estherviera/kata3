package software.ulpgc.katas.adapters;

import javax.naming.Name;
import javax.xml.stream.Location;
import java.security.PublicKey;

public class UserDto {
    public String gender;
    public Name name;
    public Location location;
    public String email;
    public Dob dob;

    public static class Name{
        public String title;
        public String first;
        public String last;
    }
    public static class Location{
        public Street street;
        public String city;
        public String country;
        public Object postcode;
        public Coordinates coordinates;

        private class Street {
            public int number;
            public String name;
        }

        private class Coordinates {
            public String latitude;
            public String longitude;
        }
    }


    private class Dob {
        public String date;
        public int age;
    }
}
