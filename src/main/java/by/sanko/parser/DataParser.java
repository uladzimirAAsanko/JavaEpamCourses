package by.sanko.parser;

import java.util.StringTokenizer;

public class DataParser {
    public int parseInt(String input){
        return Integer.parseInt(input);
    }

    public int[] parseIntArray(String input){
        StringTokenizer tokenizer = new StringTokenizer(input);
        int[] arr = new int[tokenizer.countTokens()];
        for(int i =0; i < arr.length; i++){
            arr[i] = Integer.parseInt(tokenizer.nextToken());
        }
        return arr;
    }

    public double parseDouble(String input){
        return Double.parseDouble(input);
    }


}
