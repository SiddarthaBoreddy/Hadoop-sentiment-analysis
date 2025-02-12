package com.sentimentanalysis;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SentimentMapper extends Mapper<Object, Text, Text, Text> {
    private Map<String, Integer> sentimentLexicon = new HashMap<>();

    @Override
    protected void setup(Context context) throws IOException, InterruptedException {
        sentimentLexicon.put("happy", 1);
        sentimentLexicon.put("sad", -1);
        sentimentLexicon.put("neutral", 0);
    }

    @Override
    protected void map(Object key, Text value, Context context) throws IOException, InterruptedException {
        String line = value.toString();

        if (line.startsWith("id,")) {
            return;
        }

        String[] columns = line.split(",");

        if (columns.length > 10) {
            String id = columns[0]; 
            String tweet = columns[10]; 

            int sentimentScore = 0;
            for (String word : tweet.split("\\s+")) {
                sentimentScore += sentimentLexicon.getOrDefault(word.toLowerCase(), 0);
            }

            String sentiment;
            if (sentimentScore > 0) {
                sentiment = "Positive";
            } else if (sentimentScore < 0) {
                sentiment = "Negative";
            } else {
                sentiment = "Neutral";
            }

            context.write(new Text(id), new Text(tweet + "\t" + sentiment));
        }
    }
}