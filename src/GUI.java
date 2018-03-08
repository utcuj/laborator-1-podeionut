import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Pode Ionut on 3/4/2018.
 */
public class GUI {
    private JPanel PanelMain;
    private JButton afiseazaTrenButton;
    private JTextField CodTren;
    private JTextArea AfisInfo;
    private Gara gara;

    public GUI(Gara g) {
        this.gara=g;
        afiseazaTrenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean cnt=false;
                int i=0;
                if(CodTren.equals(""))
                    JOptionPane.showMessageDialog(null,"Nu ati completat");
                else{
                    for(Tren t:gara.getTrenuriGara()){
                        if(CodTren.getText().equals(t.getCod())){
                            AfisInfo.setText(gara.getTrenuriGara().get(i).toString());
                            cnt=true;
                        }
                        i++;
                    }
                    if(cnt==false){
                        AfisInfo.setText("Nu exista tren cu aceast cod!!!");
                    }
                }
            }
        });
    }
    public void GO(){
        JFrame frame=new JFrame("Train Station");
        frame.setContentPane(new GUI(gara).PanelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,150);
        frame.setVisible(true);
    }
}
