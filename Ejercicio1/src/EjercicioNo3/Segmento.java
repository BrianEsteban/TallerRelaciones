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
public class Segmento {
    private Date horaInicial;
    private Date horaFinal;

    public Segmento(Date horaInicial, Date horaFinal) {
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
    }

    public Date getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(Date horaInicial) {
        this.horaInicial = horaInicial;
    }

    public Date getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(Date horaFinal) {
        this.horaFinal = horaFinal;
    }

    @Override
    public String toString() {
        return ("hora de inicio:" + horaInicial + ", hora final:" + horaFinal) ;
    }
    
    
}
