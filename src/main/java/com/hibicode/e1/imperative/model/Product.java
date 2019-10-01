package com.hibicode.e1.imperative.model;

import java.time.LocalDate;
import java.util.Objects;

public class Product {

    private String name;
    private String version;
    private LocalDate deactivationDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public LocalDate getDeactivationDate() {
        return deactivationDate;
    }

    public void setDeactivationDate(LocalDate deactivationDate) {
        this.deactivationDate = deactivationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) &&
                Objects.equals(version, product.version) &&
                Objects.equals(deactivationDate, product.deactivationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, version, deactivationDate);
    }
}
