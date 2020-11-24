package pl.coderslab.charity.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDto {
    String name;
    String surname;
    String password1;
    String password2;
}
