package com.feedback.process.api;

import com.feedback.process.dto.Messages;
import com.feedback.process.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/feedback")
public class FeedbackApi {
    @Autowired
    private FeedbackService feedbackService;

    @GetMapping("/process")
    Map<String, List<String>> processFeedback(@RequestBody Messages messages){
        return feedbackService.processFeedbacks(messages);
    }
}
