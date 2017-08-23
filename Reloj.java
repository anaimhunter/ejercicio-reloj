

public class Reloj
{
   
    private int horas;
    private int minutos;

    public Reloj(int horaInicial, int minInicial)
    {
        // initialise instance variables
        horas=horaInicial;
        minutos=minInicial;
    }
    
    public String dimeTuTiempo()
    {
        String cadResultado="";
        cadResultado +=horas;
        cadResultado=cadResultado +":";
        cadResultado+=minutos;
        return cadResultado;
        
    }
    
    public void ticTac()
    {
        if(minutos<60)
        {
            minutos++;
        }
        else if(horas<24)
            {
            minutos=0;
            horas++;
            }
            else
            {
                horas=0;
            }
    }
}
