package com.bilgeadam.photo.dto;


import com.bilgeadam.photo.common.dto.BaseDto;
import com.bilgeadam.photo.consts.MessageConstants;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data

public class PhotoDto extends BaseDto {

    @NotBlank
    private UUID userId;

    /**
     * photo category dto
     */
    @NotBlank
        private String category;

    /**
     * photo title dto
     */
    @NotBlank
    @Size (min = 2)
    private String title;

    /**
     * photo desc dto
     */
    @NotBlank
        private String description;

    /**
     * photo price dto
     */
    @NotBlank
    @Min(0)
    @Max(1000000)
    private BigDecimal price;

    /**
     * relations between tags and photos
     */
    @NotBlank
        private Set<TagDto> tagDtoSet;

    /**
     * relations between photos and user
     */
    @NotBlank
    private Set<UserDto> userDtoSet;


    }
