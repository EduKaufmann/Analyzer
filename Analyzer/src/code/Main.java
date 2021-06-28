/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author José Eduardo Kaufmann e Leonardo Montiel
 */
public class Main {
    public static void main(String[] args) throws Exception {
        String route1 = "C:/Users/edu_k/Documents/GitHub/Analyzer/Analyzer/src/code/Lexer.flex";
        String route2 = "C:/Users/edu_k/Documents/GitHub/Analyzer/Analyzer/src/code/LexerCup.flex";
        String[] routeS = {"-parser", "Syntax", "C:/Users/edu_k/Documents/GitHub/Analyzer/Analyzer/src/code/Syntax.cup"};
        generate(route1, route2, routeS);
    }
    public static void generate(String route1, String route2, String[] routeS) throws IOException, Exception{
        File file;
        file = new File(route1);
        JFlex.Main.generate(file);
        file = new File(route2);
        JFlex.Main.generate(file);
        java_cup.Main.main(routeS);
        
        Path routeSym = Paths.get("C:/Users/edu_k/Documents/GitHub/Analyzer/Analyzer/src/code/sym.java");
        if (Files.exists(routeSym)) {
            Files.delete(routeSym);
        }
        Files.move(
                Paths.get("C:/Users/edu_k/Documents/GitHub/Analyzer/Analyzer/sym.java"), 
                Paths.get("C:/Users/edu_k/Documents/GitHub/Analyzer/Analyzer/src/code/sym.java")
        );
        Path routeSin = Paths.get("C:/Users/edu_k/Documents/GitHub/Analyzer/Analyzer/src/code/Syntax.java");
        if (Files.exists(routeSin)) {
            Files.delete(routeSin);
        }
        Files.move(
                Paths.get("C:/Users/edu_k/Documents/GitHub/Analyzer/Analyzer/Syntax.java"), 
                Paths.get("C:/Users/edu_k/Documents/GitHub/Analyzer/Analyzer/src/code/Syntax.java")
        );
    }
}
