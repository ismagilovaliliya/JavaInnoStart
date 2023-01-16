package functional;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //лямда выражение
        //(параметры) -> { тело функции}
 /*   ConvertFunction function = (line, format) -> {
        char lineArray[] = line.toCharArray();
        String result = "";
        for (int i = 0; i < line.length(); i++) {
            if (format.equals("%d -> %s")) {
                if (Character.isDigit(lineArray[i])) {
                    String newElementInString;

                    switch (lineArray[i]) {
                        case '1': {
                            newElementInString = "one";
                        }
                        break;
                        case '2': {
                            newElementInString = "two";
                        } break;
                        case '3': {
                            newElementInString = "three";
                        }
                        break;
                        default : {
                            newElementInString = "";
                        }
                    }
                    result += newElementInString;
                }
                }
            }
            return result;
        } ;*/

            String lines[] = {"1Hello", "12366", "2Bye"};

            TextProcessor textProcessor = new TextProcessor(lines, "%d -> %s");

            String resultLines[] = textProcessor.process((line, format) -> {
                char lineArray[] = line.toCharArray();
                String result = "";
                for (int i = 0; i < line.length(); i++) {
                    if (format.equals("%d -> %s")) {
                        if (Character.isDigit(lineArray[i])) {
                            String newElementInString;

                            switch (lineArray[i]) {
                                case '1': {
                                    newElementInString = "one";
                                }
                                break;
                                case '2': {
                                    newElementInString = "two";
                                } break;
                                case '3': {
                                    newElementInString = "three";
                                }
                                break;
                                default : {
                                    newElementInString = "";
                                }
                            }
                            result += newElementInString;
                        }
                    }
                }
                return result;
            });
        System.out.println(Arrays.toString(resultLines));
        }
}
