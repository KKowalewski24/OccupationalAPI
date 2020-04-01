package pl.kkowalewski.occupationalapi.service;

import java.util.Set;

public interface BaseService<T> {

    T findById(Long id);

    Set<T> findAll();

    T save(T object);

    void deleteById(Long id);

    void delete(T object);

    void deleteAll();
}
