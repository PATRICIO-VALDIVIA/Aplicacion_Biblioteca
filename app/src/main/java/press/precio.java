package press;

public class precio {
    private int Farenheith;
    private int Revival;
    private int El_Alquimista;
    private int El_Poder;
    private int Despertar;

    public precio()
    {
        //Precios cambiados
        Farenheith = 7000;
        Revival = 22000;

        //libros nuevos con sus precioS
        El_Alquimista = 45000;
        El_Poder = 88000;
        Despertar = 156000;
    }

    public int getFarenheith()
    {
        return Farenheith;

    }
    public int getRevival()
    {
        return Revival;

    }
    public int getEl_Alquimista()
    {
        return El_Alquimista;

    }
    public int getEl_Poder()
    {
        return El_Poder;
    }
    public int getDespertar()
    {
        return Despertar;
    }

}
