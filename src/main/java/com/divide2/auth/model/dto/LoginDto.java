package com.divide2.auth.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by bvvy on 2017/12/18.
 * com.divide2.auth.model.dto
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginDto {

    private String username;
    private String password;
    private boolean rememberMe;

}
