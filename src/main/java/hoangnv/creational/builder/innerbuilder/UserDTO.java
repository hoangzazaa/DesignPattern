package hoangnv.creational.builder.innerbuilder;

import hoangnv.creational.builder.Address;
import hoangnv.creational.builder.UserDTOBuilder;
import hoangnv.creational.builder.UserWebDTO;

import java.time.LocalDate;
import java.time.Period;

public class UserDTO {
    private String name;
    private String address;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public static UserDTOBuilder getBuilder() {
        return new UserDTOBuilder();
    }

    public static class UserDTOBuilder {
        private String firstName;
        private String lastName;
        private String address;
        private String age;
        private UserDTO userDTO;


        public UserDTOBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserDTOBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserDTOBuilder withBirthday(LocalDate date) {
            Period period = Period.between(date, LocalDate.now());
            this.age = Integer.toString(period.getYears());
            return this;
        }

        public UserDTOBuilder withAddress(Address address) {
            this.address = address.getHouseNumber() + ", " + address.getStreet() + ", " + address.getCity() + ", " + address.getState();
            return this;
        }

        public UserDTO build() {
            userDTO = new UserDTO();
            userDTO.setName(firstName + " " + lastName);
            userDTO.setAge(age);
            userDTO.setAddress(address);
            return userDTO;
        }

        public UserDTO getUserDTO() {
            return this.userDTO;
        }

    }
}
