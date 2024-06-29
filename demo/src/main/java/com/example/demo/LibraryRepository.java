package com.example.demo;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LibraryRepository {
    private JdbcClient jdbcClient;
    public LibraryRepository(JdbcClient jdbcClient){
        this.jdbcClient = jdbcClient;
    }
    public List<User> getAllusers(){
     return jdbcClient.sql("select * from User").query(
             (rs, rowNum) -> new User(
                     rs.getLong("Userid"),
                     rs.getString("email"),
                     rs.getString("password")
             )
     ).list();
//return User;
    }
    public List<Recipe> getAllrecipes() {
        return jdbcClient.sql("select * from Recipe").query(
                (rs, rowNum) -> new Recipe(
                        rs.getLong("Recipeid"),
                        rs.getString("Recipe_name"),
                        rs.getString("description" ),
                        rs.getString("type")
                )
        ).list();
       // return User;
    }
    public List<Ingridient> getAllIngridients() {
        return jdbcClient.sql("select * from Ingridient").query(
                (rs, rowNum) -> new Ingridient(
                        rs.getLong("Ingridientid"),
                        rs.getString("Ingridient_name"),
                        rs.getString("Nutrition_value" )
                )
        ).list();
        // return User;
    }
    public List<Rating> getAllRatings() {
        return jdbcClient.sql("select * from Rating").query(
                (rs, rowNum) -> new Rating(
                        rs.getLong("Ratingid"),
                        rs.getFloat("stars"),
                        rs.getString("Recipe_name"),
                        rs.getString("comment" )
                )
        ).list();
        // return User;
    }
}
