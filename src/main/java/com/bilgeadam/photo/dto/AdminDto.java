package com.bilgeadam.photo.dto;


import com.bilgeadam.photo.common.dto.BaseDto;
import lombok.Data;

import java.util.Set;

@Data
public class AdminDto extends BaseDto {

    private String username;

    private String email;

    private Set<RolesDto> role;

}
//gökhanbaşara
