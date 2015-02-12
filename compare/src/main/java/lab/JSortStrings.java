package lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by joao on 11/02/15.
 */
public class JSortStrings {

    public static void main(String [] args){
        List<String> strings = new ArrayList<String>();
        strings.add("Está");
        strings.add("é");
        strings.add("uma");
        strings.add("lista");
        strings.add("de");
        strings.add("palavras");

        //Ordernação Lexical
        Collections.sort(strings);

        System.out.println(strings);
    }




}
