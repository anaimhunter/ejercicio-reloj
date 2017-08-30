
/**
 * La clase Reloj reprsenta un objeto reloj con horas y minutos
 * @author Ana M.Hunter
 */
public class Reloj
{
   
    private int horas;
    private int minutos;
    /**
     * Constructor que inicializa las horas y minutos
     * @param horaInicial Representa la hora en la que se inicia el reloj
     * @param minInicial Representa los minutos en los que inicia el reloj
     */
    public Reloj(int horaInicial, int minInicial)
    {
        // initialise instance variables
        horas=horaInicial;
        minutos=minInicial;
    }
    /**
     * Da el tiempo del reloj
     */
    public String dimeTuTiempo()
    {
        String cadResultado="";
        if(horas<10)
        {
            cadResultado += "0";
        }
        cadResultado +=horas;
        cadResultado=cadResultado +":";
        if(minutos<10)
        {
            cadResultado += "0";
        }
        cadResultado+=minutos;
        return cadResultado;
        
    }
    /**
     * Avanza las horas y minutos del reloj 
     */
    public void ticTac()
    {
        if(minutos<60)
        {
            minutos++;
        }
        else
        {
            minutos=0;
            if(horas<23)
            {
                horas++;
            }
            else
            {
                horas=0;
            }
        }
    }
}
