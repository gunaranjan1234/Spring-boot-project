package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/")
public class LibraryController {
   private LibraryRepository libraryRepository;
   public LibraryController(LibraryRepository libraryRepository) {
       this.libraryRepository = libraryRepository;
   }
   @GetMapping("/users")
    public String home(Model model) {
       var s=libraryRepository.getAllusers();
       model.addAttribute("users", s);
       return "index";
   }
//     private LibraryRepository libraryRepository;
//    public LibraryController (LibraryRepository libraryRepository){
//        this.libraryRepository = libraryRepository;
//    }
//    @GetMapping("/")
//    public int getDataFromRepository(){
//        return 1;
//
//    }
//    @GetMapping("/User")
//    public List<User> getUsers(){
//        return this.libraryRepository.getAllusers();
//    }
//    @GetMapping("/Recipe")
//    public List<Recipe> getRecipes(){
//        return this.libraryRepository.getAllrecipes();
//    }
//    @GetMapping("/Ingridient")
//    public List<Ingridient> getIngridients(){
//        return this.libraryRepository.getAllIngridients();
//    }
//    @GetMapping("/Rating")
//    public List<Rating> getRatings(){
//        return this.libraryRepository.getAllRatings();
//    }

}
