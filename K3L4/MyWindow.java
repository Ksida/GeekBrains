package K3L4;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

class SimpleChat extends JFrame implements ActionListener {
    final String TITLE_OF_PROGRAM = "Simple Messenger";
    final int START_LOCATION = 200;
    final int WINDOW_WIDTH = 350;
    final int WINDOW_HEIGHT = 450;

    JTextArea dialogue;
    JTextField message;

    public static void main(String[] args) throws IOException {
        new SimpleChat();
    }

    SimpleChat() throws IOException {
        setTitle(TITLE_OF_PROGRAM);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(START_LOCATION, START_LOCATION, WINDOW_WIDTH, WINDOW_HEIGHT);
        dialogue = new JTextArea();
        dialogue.setLineWrap(true);
        JScrollPane scrollBar = new JScrollPane(dialogue);
        JPanel bp = new JPanel();
        bp.setLayout(new BoxLayout(bp, BoxLayout.X_AXIS));
        message = new JTextField();
        message.addActionListener(this);
        JButton enter = new JButton("Отправить");
        enter.addActionListener(this);
        bp.add(message);
        bp.add(enter);
        add(BorderLayout.CENTER, scrollBar);
        add(BorderLayout.SOUTH, bp);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        try {
            PrintWriter pw= new PrintWriter(new FileOutputStream("text.txt", true));
            pw.println(message.getText() + "\n");
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (message.getText().trim().length() > 0) {
            dialogue.append(message.getText() + "\n");
        }
        message.setText("");
        message.requestFocusInWindow();
    }
}
