package it.larusba.myspringesprimario;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		 /* Crea il contesto in base alle impostazioni dell'applicazione definite
         * nel file Beans.xml  */
    ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
 
        
        /* Recupera un bean avente id="tuttiUguali" nel file di configurazione
         * Beans.xml */
    TuttiUguali mystrings = (TuttiUguali) context.getBean("tuttiUgual");
 
        
        // Invoco il metodo che verifica se la stringa inserita ha tutti i caratteri uguali
        mystrings.uguali("ab");
        
	}
}
