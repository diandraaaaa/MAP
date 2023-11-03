import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BagOfWords {
    public List<String> vocab = new ArrayList<String>();
    public HashMap<String, Integer> wordMap = new HashMap<String, Integer>();

    public  BagOfWords(List<String> sentences){
        for(String sentence : sentences){
            for(String word : sentence.split(" ")){
                wordMap.put(word, 1);
            }
        }
    }

    public List<Integer> transform(String sentence){
        HashMap<String, Integer> frequencyMap = new HashMap<String, Integer>();
        List<Integer> freq = new ArrayList<>();
        for(String word : sentence.split(" ")){
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        for(String key : wordMap.keySet()){
            freq.add(frequencyMap.getOrDefault(key, 0));
        }
        return freq;
    }
}
