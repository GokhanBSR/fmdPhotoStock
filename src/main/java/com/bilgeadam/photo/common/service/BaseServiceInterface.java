package com.bilgeadam.photo.common.service;

import java.util.List;

public interface BaseServiceInterface<T, ID> {

    T save(T entity);

    T update(ID id, T entity);

    void delete(ID id);

    T findById(ID id);

    List<T> findAll();
}
