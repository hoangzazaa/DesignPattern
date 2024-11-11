package hoangnv.creational.builder;

import java.time.LocalDate;

//this is our client which also works as "director"
public class Client {

    public static void main(String[] args) {
        User user = createUser();
        UserDTOBuilder userDTOBuilder = new UserWebDTOBuilder();
        UserDTO userDTO = directBuild(userDTOBuilder, user);
        System.out.println(userDTO);
    }

//    Director
    public static UserDTO directBuild(UserDTOBuilder builder, User user) {
        return builder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withBirthday(user.getBirthday())
                .withAddress(user.getAddress())
                .build();
    }

    /**
     * return a sample user
     * @return
     */
    public static User createUser() {
        User user = new User();
        user.setFirstName("azzzz");
        user.setLastName("xxxxxxxx");
        user.setBirthday(LocalDate.of(1996, 9, 30));
        Address address = new Address();
        address.setCity("xxxxxx");
        address.setHouseNumber("123");
        address.setCity("new york");
        address.setZipCode("1000");
        user.setAddress(address);
        return user;
    }
}
