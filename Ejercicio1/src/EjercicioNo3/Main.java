/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioNo3;

import java.util.Date;

/**
 *
 * @author BRIAN
 */
public class Main {
    public static void main(String[] args) {
        
        Date horaInicial = new Date(117,4,2,11,0,0);
        Date horaFinal = new Date(117,4,2,13,0,0);
        Date horaInicial1 = new Date(117,4,1,13,30,0);
        Date horaFinal1 = new Date(117,4,1,15,30,0);
        Date horaInicial2 = new Date(117,4,1,16,0,0);
        Date horaFinal2 = new Date(117,4,1,18,0,0);
        Date horaInicial3 = new Date(117,4,1,19,30,0);
        Date horaFinal3 = new Date(117,4,1,20,30,0);
        Date horaInicial4 = new Date(117,4,1,21,0,0);
        Date horaFinal4 = new Date(117,4,1,23,0,0);
                
        Segmento seg = new Segmento(horaInicial, horaFinal);
        Segmento seg2 = new Segmento(horaInicial1, horaFinal1);
        Segmento seg3 = new Segmento(horaInicial2, horaFinal2);
        Segmento seg4 = new Segmento(horaInicial3, horaFinal3);
        Segmento seg5 = new Segmento(horaInicial4, horaFinal4);
        
        Date fec = new Date(117,4,1);
        Date fec2 = new Date(117,4,2);
        Date fec3 = new Date(117,4,3);
        Date fec4 = new Date(117,4,4);
        Date fec5 = new Date(117,4,5);
                
        Dia funcion1 = new Dia(fec, "Lunes");
        funcion1.añadirSegmento(seg);
        
        Dia funcion2 = new Dia(fec2, "Martes");
        funcion2.añadirSegmento(seg2);
        
        Dia funcion3 = new Dia(fec3, "Miercoles");
        funcion3.añadirSegmento(seg3);
        
        Dia funcion4 = new Dia(fec4, "Jueves");
        funcion4.añadirSegmento(seg4);
        
        Dia funcion5 = new Dia(fec5, "Viernes");
        funcion5.añadirSegmento(seg5);     
        
        Semana semana1 = new Semana(1);
        semana1.setDiasLaborados(funcion3);
        semana1.setDiasLaborados(funcion5);
        
        Semana semana2 = new Semana(2);
        semana2.setDiasLaborados(funcion3);
        semana2.setDiasLaborados(funcion5);
        
        Semana semana3 = new Semana(3);
        semana3.setDiasLaborados(funcion4);
        semana3.setDiasLaborados(funcion1);
        
        Semana semana4 = new Semana(4);
        semana4.setDiasLaborados(funcion2);
        semana4.setDiasLaborados(funcion3);
               
        Sala sala1 = new Sala();
        sala1.añadirSemana(semana1);
        sala1.añadirSemana(semana2);
        
        Sala sala2 = new Sala();
        sala2.añadirSemana(semana3);
        sala2.añadirSemana(semana4);
        
        Programacion program = new Programacion();
        program.añadirSala(sala1);
        program.añadirSala(sala2);
        
        System.out.println(program.toString());
             
    }
    
}
