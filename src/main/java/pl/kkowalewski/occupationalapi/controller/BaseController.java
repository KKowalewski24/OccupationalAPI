package pl.kkowalewski.occupationalapi.controller;

import java.util.Set;

public interface BaseController<T> {

    Set<T> getAll();
}
