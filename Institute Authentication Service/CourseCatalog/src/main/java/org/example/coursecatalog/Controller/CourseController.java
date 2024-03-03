package org.example.coursecatalog.Controller;

import org.example.coursecatalog.Model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.web.client.RestTemplate;
import static com.fasterxml.jackson.databind.cfg.CoercionInputShape.Array;

@RestController
@RequestMapping("/course")
public class CourseController {
    String baseUrl="http://localhost:9090/course";
    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/retrieveData")
    public List<Course> getData(){
        Course arr[] = restTemplate.getForObject(baseUrl + "/retrieveData", Course[].class);
        return Array.asList(arr);
    }

}
