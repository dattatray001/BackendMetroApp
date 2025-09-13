package com.datta.modeapi.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private String name;
    private String gender;
    private String email;
    private Long contactNumber;

}
