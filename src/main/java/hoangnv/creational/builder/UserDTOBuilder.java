package hoangnv.creational.builder;

import java.time.LocalDate;

// abstract builder
public interface UserDTOBuilder {

//    method build  parts of product at a time
    UserDTOBuilder withFirstName(String firstName);
    UserDTOBuilder withLastName(String lastName);
    UserDTOBuilder withBirthday(LocalDate date);
    UserDTOBuilder withAddress(Address address);

//    method to assemble final  product
    UserDTO build();

//    optional method to fetch already built object
    UserDTO getUserDTO();


}
