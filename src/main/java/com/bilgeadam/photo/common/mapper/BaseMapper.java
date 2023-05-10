package com.bilgeadam.photo.common.mapper;

import com.bilgeadam.photo.common.dto.BaseDto;
import com.bilgeadam.photo.common.entity.BaseEntity;

import java.util.List;
import java.util.Set;

public interface BaseMapper<T1 extends BaseDto, T2 extends BaseEntity> {


    /**
     * @param entity
     * @return dto
     */
    T1 entityToDto(T2 entity);

    /**
     * @param dto
     * @return entity
     */
    T2 dtoToEntity(T1 dto);

    /**
     * @param entitySet
     * @return to dtoSet
     */

    Set<T1> entitySetToDtoSet(Set<T2> entitySet);

    /**
     * @param entityset
     * @return to entitySet
     */
    Set<T1> dtoSetToEntitySet(Set<T2> entityset);


    /**
     * ???
     *
     * @param entitySet
     * @return T1 list to T2 list
     */
    List<T2> dtoListToEntityList(List<T1> entitySet);

    /**
     * ???
     *
     * @param entityList
     * @return T2 entityList to T1 entityList
     */
    List<T1> entityListTeDtoList(List<T2> entityList);
}

