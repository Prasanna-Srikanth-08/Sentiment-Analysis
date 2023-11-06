package com.feedback.process.service;

import com.feedback.process.dto.Messages;

import java.util.List;
import java.util.Map;

public interface FeedbackService {
    Map<String, List<String>> processFeedbacks(Messages messages);

}
