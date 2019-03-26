package br.com.maison.teste;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class TesteString {
    public static void main(String[] args) {
        String literal = "Literal";
        System.out.println(literal);
        String normal = new String("Normal");
        System.out.println(normal);
        //Praticando o replace
        System.out.println(normal.replace("N","x"));
        System.out.println(literal.toLowerCase());
        System.out.println(normal.toUpperCase());
        //praticando outros métodos
        System.out.println(normal.charAt(3));
        System.out.println(literal.isEmpty());
        System.out.println(literal.indexOf("te"));
        System.out.println(literal.substring(2));
        //Mais métodos da classe String
        System.out.println(normal.length());
        System.out.println(normal.contains("or"));
    }
}
