package com.bilgeadam.photo.dto;

import com.bilgeadam.photo.common.dto.BaseDto;
import com.bilgeadam.photo.consts.MessageConstants;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Set;

@EqualsAndHashCode (callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto extends BaseDto {

    /**
     * constant that called from massageCostants class
     * username info from User class
     */
    @NotBlank (message = MessageConstants.MESSAGE_NOT_BLANK)
    @Size (min = 2, max = 50)
    private String username;

    /**
     * password confirmation and warning that called from messageConstants
     * class
     * password info from user class
     */
    @NotBlank (message = MessageConstants.MESSAGE_NOT_BLANK)
    @Size (min = 8)
    private double password;

    /**
     * password confirmation
     */
    @Size(min = 8)
    private double confPassword;

    /**
     * Entity E-mail info
     */
    @Email
    @NotBlank (message = MessageConstants.MESSAGE_NOT_BLANK)
    private String email;

    /**
     * Create infos
     */
    private LocalDateTime createDate;

    /**
     * user situation
     */
    private boolean isEnable=true;

    /**
     * role entity relation
     */
    private Set<RolesDto> roles;

}
