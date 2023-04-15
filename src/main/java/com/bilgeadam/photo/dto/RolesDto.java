package com.bilgeadam.photo.dto;

import com.bilgeadam.photo.common.dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.UUID;

@EqualsAndHashCode (callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RolesDto extends BaseDto {

    /**
     * Role-User relation
     */
    private UUID userId;

    /**
     * name info
     */
    private String name;


}