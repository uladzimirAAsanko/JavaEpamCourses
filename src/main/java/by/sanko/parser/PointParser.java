package by.sanko.parser;

import by.sanko.entity.Point;

import java.util.StringTokenizer;

public class PointParser {
    public Point parse(String input){
        StringTokenizer tokenizer = new StringTokenizer(input);
        if(tokenizer.countTokens() != 3){
            return null;
        }
        DataParser parser = new DataParser();
        String name = tokenizer.nextToken();
        double xCoordinate = parser.parseDouble(tokenizer.nextToken());
        double yCoordinate = parser.parseDouble(tokenizer.nextToken());
        return new Point(name, xCoordinate, yCoordinate);
    }
}
