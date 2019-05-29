/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.beans.PropertyChangeEvent;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import view.CalendarioFrame;
import static view.CalendarioFrame.jCalendar1;

/**
 *
 * @author Luiza Mistro
 */
public class CalendarioControl {

    public CalendarioControl() {
        puxarDataCalendario();
    }

    public void puxarDataCalendario() {

        /*AQUI VC PODE ADD ESSE EVENTO*/
        CalendarioFrame.jCalendar1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) { //GERA EVENTO
                jCalendar1PropertyChange(evt); //CHAMA O MÉTODO CONTENDO A ROTINA

            }

            private void jCalendar1PropertyChange(PropertyChangeEvent evt) {
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); //DEFINE FORMATO DE DATA
                String data = formato.format(jCalendar1.getDate()); //CONVERTE PRA STRING
                CalendarioFrame.campoTexto.setText(data);/*COLOCAR A DATA NO JTextFeld*/
                System.out.println(data);//EXIBE O CALENDARIO QUANDO CARREGADO E A CADA TROCA DE DATA, MÊS OU ANO
            }
        }
        );

    }

}
