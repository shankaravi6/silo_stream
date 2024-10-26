package dev.silo.silo_stream;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private SlideRepository slideRepository;


    public List<Movies> getAll_Movies() {
        return movieRepository.findAll();
    }

    public List<Slides> getAll_Slides() {
        return slideRepository.findAll();
    }


}

