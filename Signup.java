package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4,r5;
    JButton next;
    JTextField textName,textFName,textMName,textEmail,textAdd,textCity,textState,textPin;
    JDateChooser dateChooser;
    Random ran=new Random();
    long first4=(ran.nextLong()%9000L)+1000L;
    String first=" " +Math.abs(first4);

    Signup(){
        super("APPLICATION FORM");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 =i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 =new JLabel("APPLICATION FORM NO." +first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("raleway",Font.BOLD,38));
        add(label1);

        JLabel label2 =new JLabel("Page 1");
        label2.setFont(new Font("raleway",Font.BOLD,20));
        label2.setBounds(330,70,600,30);
        add(label2);
        JLabel label3 =new JLabel("Personal Details");
        label3.setFont(new Font("railway",Font.BOLD,20));
        label3.setBounds(290,90,600,30);
        add(label3);

        JLabel labelName =new JLabel("Name :");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);
        textName =new JTextField();
        textName.setFont(new Font("raleway",Font.BOLD,14));
        textName.setBounds(300,190,350,30);
        add(textName);


        JLabel labelFName =new JLabel("Father Name :");
        labelFName.setFont(new Font("Raleway",Font.BOLD,20));
        labelFName.setBounds(100,230,150,30);
        add(labelFName);
        textFName =new JTextField();
        textFName.setFont(new Font("raleway",Font.BOLD,14));
        textFName.setBounds(300,230,350,30);
        add(textFName);

        JLabel labelMName =new JLabel("Mother Name :");
        labelMName.setFont(new Font("Raleway",Font.BOLD,20));
        labelMName.setBounds(100,270,150,30);
        add(labelMName);
        textMName =new JTextField();
        textMName.setFont(new Font("raleway",Font.BOLD,14));
        textMName.setBounds(300,270,350,30);
        add(textMName);


        JLabel DOB =new JLabel("Date of Brith :");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,310,150,30);
        add(DOB);
        dateChooser =new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,310,350,30);
        add(dateChooser);

        JLabel labelG =new JLabel("Gender :");
        labelG.setFont(new Font("Raleway",Font.BOLD,20));
        labelG.setBounds(100,350,150,30);
        add(labelG);
        r1 =new JRadioButton("Male");
        r1.setFont(new Font("raleway",Font.BOLD,14));
        r1.setBounds(300,350,145,30);
        r1.setBackground(new Color(222,255,228));
        add(r1);
        r2 =new JRadioButton("Female");
        r2.setBackground(new Color(222,255,228));
        r2.setFont(new Font("raleway",Font.BOLD,14));
        r2.setBounds(450,350,200,30);
        add(r2);
        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail =new JLabel("Email :");
        labelEmail.setBounds(100,400,100,30);
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelEmail);
        textEmail =new JTextField();
        textEmail.setBounds(300,400,350,30);
        textEmail.setFont(new Font("raleway",Font.BOLD,14));
        add(textEmail);

        JLabel labelMs =new JLabel("Marital Status :");
        labelMs.setBounds(100,440,200,30);
        labelMs.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelMs);
        r3 =new JRadioButton("Maried ");
        r3.setFont(new Font("raleway",Font.BOLD,14));
        r3.setBounds(300,440,100,30);
        r3.setBackground(new Color(222,255,228));
        add(r3);
        r4 =new JRadioButton("Unmaried");
        r4.setBackground(new Color(222,255,228));
        r4.setFont(new Font("raleway",Font.BOLD,14));
        r4.setBounds(415,440,100,30);
        add(r4);
        r5 =new JRadioButton("Other");
        r5.setBackground(new Color(222,255,228));
        r5.setFont(new Font("raleway",Font.BOLD,14));
        r5.setBounds(525,440,125,30);
        add(r5);
        ButtonGroup buttonGroup1=new ButtonGroup();
        buttonGroup1.add(r3);
        buttonGroup1.add(r4);
        buttonGroup1.add(r5);


        JLabel labelAdd =new JLabel("Address :");
        labelAdd.setBounds(100,470,200,30);
        labelAdd.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelAdd);
        textAdd =new JTextField();
        textAdd.setBounds(300,470,350,30);
        textAdd.setFont(new Font("raleway",Font.BOLD,14));
        add(textAdd);

        JLabel labelCity =new JLabel("City :");
        labelCity.setBounds(100,510,200,30);
        labelCity.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelCity);
        textCity =new JTextField();
        textCity.setBounds(300,510,350,30);
        textCity.setFont(new Font("raleway",Font.BOLD,14));
        add(textCity);

        JLabel labelPin =new JLabel("Pin Code :");
        labelPin.setBounds(100,560,200,30);
        labelPin.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelPin);
        textPin =new JTextField();
        textPin.setBounds(300,560,350,30);
        textPin.setFont(new Font("raleway",Font.BOLD,14));
        add(textPin);

        JLabel labelState =new JLabel("State :");
        labelState.setBounds(100,600,200,30);
        labelState.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelState);
        textState =new JTextField();
        textState.setBounds(300,600,350,30);
        textState.setFont(new Font("raleway",Font.BOLD,14));
        add(textState);

        next =new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(500,670,150,30);
        next.setFont(new Font("Raleway",Font.BOLD,20));
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222,225,228));
        setLayout(null);
       setSize(850,800);
       setLocation(360,40);
       setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textName.getText();
        String fname = textFName.getText();
        String mname = textMName.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (r1.isSelected()){
            gender ="Male";
        }else if (r2.isSelected()){
            gender ="Female";
        }
        String email = textEmail.getText();
        String marital = null;
        if (r3.isSelected()){
            marital ="Maried";
        } else if (r4.isSelected()) {
            marital ="Unmaried";
        } else if (r5.isSelected()) {
            marital ="other";
        }

        String address =textAdd.getText();
        String city = textCity.getText();
        String pincode =textPin.getText();
        String state = textState.getText();

        try {
            if (textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else {
                Connn con1 =new Connn();
                String q ="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+mname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}
