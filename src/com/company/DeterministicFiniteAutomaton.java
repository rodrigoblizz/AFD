package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DeterministicFiniteAutomaton {
    private static Scanner sc = new Scanner(System.in);


        public static List<String> insereAlfabeto(){
            System.out.printf("Digite o alfabeto (separado por vírgula): ");
                String alfabeto = sc.nextLine().trim();
                String str[] = alfabeto.split(",");
                List<String> array;
                array = Arrays.asList(str);
            return array;
        }

        public static List<String> insereEstados(){
            System.out.printf("Digite os estados (separados por vírgula): ");
                String estados = sc.nextLine();
                String str[] = estados.split(",");
                List<String> array;
                array = Arrays.asList(str);

            return array;
        }

        public static List<String> insereTransicao(List<String> alfabeto, List<String> estados){
            String estado = "";
            String simboloAlfabeto = "";
            List<String> transicao = new ArrayList<>();

            for(int i=0; i<estados.size(); i++){
                estado = estados.get(i);
                for(int j=0; j< alfabeto.size(); j++){
                    simboloAlfabeto = alfabeto.get(j);
                    transicao.add(estado + ", " + simboloAlfabeto);
                }
            }
            return transicao;
        }

        public static String insereEstadoInicial(){
            System.out.printf("Digite o estado Inicial: ");
            String estadoInicial = sc.nextLine();
            return estadoInicial;
        }

        public static String[] insereConjuntoFinais(){
            System.out.printf("Digite o conjunto de estados finais (separados por vírgula): ");
            String estadosFinais = sc.nextLine();
            String[] vetor = estadosFinais.split(",");
            return vetor;
        }

        public static void main(String[] args) {
            List<String> alfabeto = insereAlfabeto();
            List<String> estados = insereEstados();
            insereTransicao(alfabeto, estados);
        }
}
