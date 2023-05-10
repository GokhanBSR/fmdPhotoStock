package com.bilgeadam.photo.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@SuperBuilder(toBuilder = true)
/**
 * superbuilder -> this pointing to class and say this
 * class is a super class and create
 * constructors self
 */
@AllArgsConstructor
@NoArgsConstructor

public abstract class BaseDto implements Serializable {
/**
 * this is an abs class because no method in
 */
    /**
     * DTO id info
     */
    private UUID id;

    /**
     * DTO state info
     * aliwe=1, dead=0
     */
    private short state = 1;

    /**
     * DTO version info
     */
    private long version;

}
