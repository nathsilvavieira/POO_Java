package POO_DH.aula6;

import java.time.LocalDate;
//import java.util.Date;

public class Imprimindo {
    public static void main(String[] args) {
        //Date data = new Date();

        Impressora impressora = new Impressora("Epson", "wifi",  LocalDate.of(2021,8,20));
        System.out.println(impressora.getDataFabricacao());
    }
}
