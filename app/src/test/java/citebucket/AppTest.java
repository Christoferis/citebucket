/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package citebucket;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

class AppTest {
    @Test void appHasAGreeting() {
        invoke(true);
        build();
        invoke(false);
    }

    void build(){
        JFrame sc = new JFrame();
        sc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        sc.setLayout(new BoxLayout(sc.getContentPane(), 0));
        sc.add(new JLabel("test"));

        sc.setVisible(true);
    }

    void invoke(boolean fg){
        if(fg){
            System.out.println("This is invoked before building the app");
        }else{
            System.out.println("This is invoked after building the app");
        }
    }
}
