package com.hibicode.e1.functional.dto;

import com.hibicode.e1.functional.model.Product;

import java.util.Objects;

public class ProductDto {

    private String description;
    private boolean active;

    public ProductDto() {}

    public ProductDto(Product product) {
        this.description = product.getName() + " " + product.getVersion();
        this.active = product.getDeactivationDate() == null;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDto that = (ProductDto) o;
        return active == that.active &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, active);
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "description='" + description + '\'' +
                ", active=" + active +
                '}';
    }
}
