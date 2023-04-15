package com.bilgeadam.photo.dto;


import com.bilgeadam.photo.common.dto.BaseDto;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data

public class TagDto extends BaseDto {


    /**
     * tag
     */
    private String tag;

    /**
     *photo id
     */
    private UUID photoId;

}
