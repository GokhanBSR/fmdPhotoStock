package com.bilgeadam.photo.dto;

import com.bilgeadam.photo.common.dto.BaseDto;
import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PhotoDto extends BaseDto {

//    @NotBlank
//    private UUID userId;

    /**
     * photo category dto
     */
    @NotBlank
        private String category;

    /**
     * photo title dto
     */
    @NotBlank
    @Size(min = 2)
    private String title;

    /**
     * photo desc dto
     */
    @NotBlank
    @Size (min = 2)
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
        private Set<TagDto> tagDtos;

    /**
     * relations between photos and user
     */
    @NotBlank
    private Set<UserDto> userDtos;


    }
