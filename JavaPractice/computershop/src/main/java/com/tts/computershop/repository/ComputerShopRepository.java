package com.tts.computershop.repository;

import com.tts.computershop.domain.ComputerShop;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComputerShopRepository extends CrudRepository<ComputerShop,Long> {
    //You only need to add this annotation if you're going to be doing updating or inserting operations
    //@Modifying
    @Query("SELECT c.numInStock FROM ComputerShop c WHERE c.model = :product") //Custom Queries for Custom methods. Syntax is relatively simple, you need to create an object of the entity/db you're going to be using when using FROM/UPDATE/INSERT etc. and then use it like a normal SQL query.
    public int findQuantityByProduct(@Param("product") String product);//@Param annotation is needed for the above. When using the parameter in  the query, it is done by `:(param)`.
}
