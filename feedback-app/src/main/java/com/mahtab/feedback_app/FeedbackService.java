package com.mahtab.feedback_app;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class FeedbackService {
    @Autowired
    private FeedbackRepository repository;
    public List<Feedback> getAllFeedback(){
        return repository.findAll();
    }
    public Feedback saveFeedback(Feedback feedback){
        return repository.save(feedback);
    }
}
