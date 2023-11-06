package com.feedback.process;

import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.Properties;

public class NLPConfig {
    private static Properties properties;
    private static String propertiesName = "tokenize,ssplit,parse,sentiment";
    private static StanfordCoreNLP stanfordCoreNLP;

    private NLPConfig(){

    }

    static {
        properties = new Properties();
        properties.setProperty("annotators",propertiesName);
    }

    public static  StanfordCoreNLP getPipeline(){
        if(stanfordCoreNLP == null){
            stanfordCoreNLP = new StanfordCoreNLP(properties);
        }
        return  stanfordCoreNLP;
    }
}
