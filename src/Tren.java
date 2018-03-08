import java.sql.Time;

/**
 * Created by Pode Ionut on 3/4/2018.
 */
public class Tren {
    public String destinatie;
    public Time ora_plecarii;
    public String cod;

    public Tren(String dest,Time ora, String cod){
        this.destinatie=dest;
        this.ora_plecarii=ora;
        this.cod=cod;
    }

    public String getDestinatie(){
        return this.destinatie;
    }

    public Time getOra_plecarii(){
        return this.ora_plecarii;
    }

    public String getCod(){
        return this.cod;
    }

    @Override
    public String toString(){
        return("\nDestinatie:"+this.getDestinatie()+
                "\nOra Plecarii:"+this.getOra_plecarii()+
                "\nCod:"+this.getCod());
    }


}
