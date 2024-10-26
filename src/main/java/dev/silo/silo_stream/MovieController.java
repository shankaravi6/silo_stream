package dev.silo.silo_stream;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/silo_stream")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/movies")
    public ResponseEntity<ApiResponse<List<Movies>>> all_movies() {
        List<Movies> allMovies = movieService.getAll_Movies();
        return new ResponseEntity<>(new ApiResponse<>(true, "Movies retrieved successfully", allMovies), HttpStatus.OK);
    }

    @GetMapping("/slides")
    public ResponseEntity<ApiResponse<List<Slides>>> all_slides() {
        List<Slides> allSlides = movieService.getAll_Slides();
        return new ResponseEntity<>(new ApiResponse<>(true, "Slides retrieved successfully", allSlides), HttpStatus.OK);
    }

}

