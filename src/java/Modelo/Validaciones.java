package Modelo;

public class Validaciones 
{
    public boolean VerificarNumero(String numero)
    {
        return verificacionNumero(numero);
    }
    
    public boolean VerificarTerminal(String terminal)
    {
        return verificacionTerminal(terminal);
    }
    
    private boolean verificacionNumero(String numero)
    {
        if(numero.length()== 10)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    
    private boolean verificacionTerminal(String terminal)
    {
        if(terminal.length()== 8)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    
}
