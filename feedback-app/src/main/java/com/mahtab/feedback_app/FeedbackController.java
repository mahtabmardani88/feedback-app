package com.mahtab.feedback_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/feedback")

public class FeedbackController {
    @Autowired
    private FeedbackService service;
   @GetMapping
    public List<Feedback> getAllFeedback(){
        return service.getAllFeedback();
    }
    @PostMapping
    public Feedback createFeedback(@RequestBody Feedback feedback){
        return service.saveFeedback(feedback);
    }
}
