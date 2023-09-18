package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
    JFrame jFrame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample(); //
        example.go();
    }
    public void go(){
        jFrame = new JFrame();

        JButton button = new JButton("할까? 말까?");
/*        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListner());*/
        button.addActionListener(event-> System.out.println("하지 마! 아마 후회할 걸?"));
        button.addActionListener(event-> System.out.println("그냥 저질러 버렷!!!"));

        jFrame.add(button);
        jFrame.pack();
        jFrame.setVisible(true);

    }

    class AngelListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("하지 마! 아마 후회할 걸?");
        }
    }

    class DevilListner implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("그냥 저질러 버렷!!!");
        }
    }
}
