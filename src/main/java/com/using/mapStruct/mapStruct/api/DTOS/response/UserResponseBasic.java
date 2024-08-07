package com.using.mapStruct.mapStruct.api.DTOS.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseBasic {
    private String id;
    private String user;
    private String fullName;
    private String email;
    private String role;
}
