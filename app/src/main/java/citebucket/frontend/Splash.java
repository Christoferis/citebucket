package citebucket.frontend;

import java.awt.event.ActionEvent;

import javax.swing.Action;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

import citebucket.App;

//Start screen, for creating buckets and such
public class Splash {
    
    
    public static String showSplash() {
        String path = "";
        JFrame scr = new JFrame("Welcome to Citebucket");

        scr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        scr.setLayout(new BoxLayout(scr.getContentPane(), 0));

        scr.add(new JLabel("Welcome to Citebucket"));

        //the string has a path
        JList<String> list = new JList<>();
        JButton diff = new JButton();
        JButton open = new JButton();

        open.addActionListener(arg0 -> {
            scr.dispose();
        });

        diff.addActionListener(arg0 -> {
            
        });
        
        scr.add(list);
        scr.add(new JButton("Open different Bucket"));
        scr.add(new JButton());

        while (scr.isActive()) {
            
        }

        return path;
    }

}
