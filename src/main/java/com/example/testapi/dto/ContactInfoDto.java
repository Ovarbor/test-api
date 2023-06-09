package com.example.testapi.dto;
import com.example.testapi.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.Email;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactInfoDto {

    private Long id;

    private String phone;

    @Email(message = "Invalid email")
    private String email;

    private User user;
}
