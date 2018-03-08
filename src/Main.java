import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;


/**
 * Created by Pode Ionut on 3/4/2018.
 */

public class Main {
    public static void main(String args[])
    {
        DateFormat format=new SimpleDateFormat("HHmm");
        Tren t1=new Tren("Berlin", Time.valueOf("10:01:21"),"AC1");
        Tren t2=new Tren("Munchen", Time.valueOf("05:01:34"),"AC2");
        Tren t3=new Tren("Frankfurt",Time.valueOf("16:01:00"),"AC3");
        Tren t4=new Tren("Dusseldorf",Time.valueOf("10:31:00"),"AC4");
        Tren t5=new Tren("Koln",Time.valueOf("13:01:00"),"AC5");
        Gara g=new Gara();
        g.getTrenuriGara().add(t1);
        g.getTrenuriGara().add(t2);
        g.getTrenuriGara().add(t3);
        g.getTrenuriGara().add(t4);
        g.getTrenuriGara().add(t5);
        Collections.sort(g.getTrenuriGara(), new TrenComparator());
        System.out.println(""+g.getTrenuriGara());
        GUI gui=new GUI(g);
        gui.GO();










    }

}
