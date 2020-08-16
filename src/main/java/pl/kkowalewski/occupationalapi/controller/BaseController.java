package pl.kkowalewski.occupationalapi.controller;

import java.util.Set;

public interface BaseController<T> {

    Set<T> getAll();

    T getById(Long id);

    T post(T object);

    T put(Long id, T object);

    void deleteById(Long id);
}
