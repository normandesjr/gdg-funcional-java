package com.hibicode.e1.imperative;

import com.hibicode.e1.imperative.dto.ProductDto;
import com.hibicode.e1.imperative.model.Product;
import com.hibicode.e1.imperative.repository.ProductsRepository;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItems;
import static org.mockito.Mockito.when;

public class ProductsTest {

    @Rule
    public MockitoRule mockito = MockitoJUnit.rule();

    @Mock
    private ProductsRepository repository;

    private Products products;

    @Before
    public void setup() {
        products = new Products(repository);
    }

    @Test
    public void should_create_list_of_dtos() {
        Product p1 = new Product();
        p1.setName("Fone ouvido Sony");
        p1.setVersion("WH-1000XM3");

        Product p2 = new Product();
        p2.setName("Celular Motorola");
        p2.setVersion("G7 Plus");
        p2.setDeactivationDate(LocalDate.of(2018, 02, 10));

        when(repository.findAll()).thenReturn(Arrays.asList(p1, p2));

        List<ProductDto> dtos = products.list();

        ProductDto d1 = new ProductDto();
        d1.setDescription("Fone ouvido Sony WH-1000XM3");
        d1.setActive(true);

        ProductDto d2 = new ProductDto();
        d2.setDescription("Celular Motorola G7 Plus");

        assertThat(dtos, hasItems(d1, d2));
    }

}
