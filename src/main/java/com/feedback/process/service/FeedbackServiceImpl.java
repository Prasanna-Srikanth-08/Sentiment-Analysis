package com.feedback.process.service;

import com.feedback.process.NLPConfig;
import com.feedback.process.dto.Messages;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FeedbackServiceImpl implements FeedbackService{
    @Override
    public Map<String, List<String>> processFeedbacks(Messages messages) {
        Map<String,List<String>> result = new HashMap<>();
        String text = messages.getMessage();
        StanfordCoreNLP stanfordCoreNLP = NLPConfig.getPipeline();

        CoreDocument coreDocument = new CoreDocument(text);
        stanfordCoreNLP.annotate(coreDocument);
        List<CoreSentence> sentenceList = coreDocument.sentences();
        for(CoreSentence sentence : sentenceList){
            System.out.println(sentence);
            String sentiment = sentence.sentiment();
            if(result.containsKey(sentiment)){
                List<String> statements = result.get(sentiment);
                statements.add(sentence.toString());
                result.put(sentiment,statements);
            }
            else{
                List<String> statement = new ArrayList<>();
                statement.add(sentence.toString());
                result.put(sentiment,statement);
            }
        }
        System.out.println(result);
        return result;
    }
}
