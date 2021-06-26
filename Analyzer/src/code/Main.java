/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.io.File;

/**
 *
 * @author edu_k
 */
public class Main {
    public static void main(String[] args) {
        String route = "C:/Users/edu_k/Documents/NetBeansProjects/Analyzer/src/code/Lexer.flex";
        generateLexer(route);
    }
    public static void generateLexer(String route){
        File file = new File(route);
        JFlex.Main.generate(file);
    }
}
