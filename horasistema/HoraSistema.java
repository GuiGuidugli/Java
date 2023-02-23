// Método para extrair data e horário do sistema em formato padrão

package horasistema;

import java.util.Date;
   
class HoraSistema {    
    
    public static void main(String[] args) {
    
        Date relogio = new Date();
        System.out.println("A hora do sistema é");
        System.out.println(relogio.toString());

    }

}
