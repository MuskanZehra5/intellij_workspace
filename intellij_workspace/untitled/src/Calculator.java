/*
 * Created by JFormDesigner on Sat Mar 26 18:19:32 AST 2022
 */


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author unknown
 */
public class Calculator {
    public Calculator() {
        initComponents();
    }

    double firstnum;
    double secondnum;
    double result;
    String operator;
    String answer;
    String out = null;




    private void btn7(ActionEvent ignoredE) {
        // TODO add your code here
        String num = input.getText()+btn7.getText();
        input.setText(num);
        if (out == null)
            output.setText(num);

        else
            output.setText(out +operator+ num);

    }

    private void btn1(ActionEvent e) {
        // TODO add your code here

        String num = input.getText()+btn1.getText();
        input.setText(num);
        if (out == null)
            output.setText(num);

        else
            output.setText(out +operator+ num);
    }

    private void btn2(ActionEvent ignoredE) {
        // TODO add your code here
        String num = input.getText()+btn2.getText();
        input.setText(num);
        if (out == null)
            output.setText(num);

        else
            output.setText(out +operator+ num);
    }

    private void btn3(ActionEvent ignoredE) {
        // TODO add your code here
        String num = input.getText()+btn3.getText();
        input.setText(num);
        if (out == null)
            output.setText(num);

        else
            output.setText(out +operator+ num);
    }

    private void btn0(ActionEvent e) {
        // TODO add your code here
        String num = input.getText()+btn0.getText();
        input.setText(num);
        if (out == null)
            output.setText(num);

        else
            output.setText(out +operator+ num);
    }

    private void btn4(ActionEvent ignoredE) {
        // TODO add your code here
        String num = input.getText()+btn4.getText();
        input.setText(num);
        if (out == null)
            output.setText(num);

        else
            output.setText(out +operator+ num);
    }

    private void btn5(ActionEvent ignoredE) {
        // TODO add your code here
        String num = input.getText()+btn5.getText();
        input.setText(num);
        if (out == null)
            output.setText(num);

        else
            output.setText(out +operator+ num);
    }

    private void btn6(ActionEvent ignoredE) {
        // TODO add your code here
        String num = input.getText()+btn6.getText();
        input.setText(num);
        if (out == null)
            output.setText(num);

        else
            output.setText(out +operator+ num);
    }

    private void btn8(ActionEvent ignoredE) {
        // TODO add your code here
        String num = input.getText()+btn8.getText();
        input.setText(num);
        if (out == null)
            output.setText(num);

        else
            output.setText(out +operator+ num);
    }

    private void btn9(ActionEvent e) {
        // TODO add your code here
        String num = input.getText()+btn9.getText();
        input.setText(num);
        if (out == null)
            output.setText(num);

        else
            output.setText(out +operator+ num);
    }

    private void pointbtn(ActionEvent e) {
        // TODO add your code here
        String num = input.getText()+pointbtn.getText();
        input.setText(num);
        if (out == null)
            output.setText(num);

        else
            output.setText(out +operator+ num);
    }

    private void cbtn(ActionEvent e) {
        // TODO add your code here
        input.setText(null);
        out=null;
        output.setText(null);
    }

    private void backbtn(ActionEvent e) {
        // TODO add your code here
        String back;
        if(input.getText().length()>0)
        {
            StringBuilder str = new StringBuilder(input.getText());
            str.deleteCharAt(input.getText().length()-1);
            back=str.toString();
            input.setText(back);

            StringBuilder str0 = new StringBuilder(output.getText());
            str0.deleteCharAt(output.getText().length()-1);
            back=str0.toString();
            output.setText(back);
            out=output.getText();

        }
        else
        {

            StringBuilder str0 = new StringBuilder(output.getText());
            str0.deleteCharAt(output.getText().length()-1);
            back=str0.toString();
            output.setText(back);
            out = output.getText();
        }

    }

    private void plusbtn(ActionEvent e) {
        // TODO add your code here
        firstnum = Double.parseDouble(input.getText());
        operator="+";
        out = output.getText();
        output.setText(out + operator);
        input.setText("");
        output.setText(out + operator);
    }


    private void minusbtn(ActionEvent e) {
        // TODO add your code here
        firstnum = Double.parseDouble(input.getText());
        operator="-";
        out = output.getText();
        output.setText(out + operator);
        input.setText("");
        output.setText(out + operator);
    }

    private void mulbtn(ActionEvent e) {
        // TODO add your code here
        firstnum = Double.parseDouble(input.getText());
        operator="×";
        out = output.getText();
        output.setText(out + operator);
        input.setText("");
        output.setText(out + operator);
    }

    private void divbtn(ActionEvent e) {
        // TODO add your code here
        firstnum = Double.parseDouble(input.getText());
        operator="÷";
        out = output.getText();
        output.setText(out + operator);
        input.setText("");
        output.setText(out + operator);
    }

    private void modbtn(ActionEvent e) {
        // TODO add your code here
        firstnum = Double.parseDouble(input.getText());
        operator="%";
        out = output.getText();
        output.setText(out + operator);
        input.setText("");
        output.setText(out + operator);
    }

    private void sqrtbtn(ActionEvent e) {
        // TODO add your code here
        firstnum = Double.parseDouble(input.getText());
        operator="√";
        out = output.getText();
        output.setText(operator + out);
        input.setText("");
        output.setText(operator + out);
    }

    private void x2btn(ActionEvent e) {
        // TODO add your code here
        firstnum = Double.parseDouble(input.getText());
        operator="^";
        out = output.getText();
        output.setText(out + "\u00B2");
        input.setText("");
        output.setText(out + "\u00B2");
    }

    private void halfbtn(ActionEvent e) {
        // TODO add your code here
        firstnum = Double.parseDouble(input.getText());
        operator="~";
        out = output.getText();
        output.setText("1/"+out);
        input.setText("");
        output.setText("1/"+out);

    }

    private void plusminusbtn(ActionEvent e) {
        // TODO add your code here
        firstnum = Double.parseDouble(input.getText());
        operator="!";
        input.setText("");
        result = -1 * firstnum;
        answer = String.format("%.3f", result);
        output.setText(answer);
        out = null;

    }


    private void cebtn(ActionEvent e) {
        // TODO add your code here
        String back ="";
        if(input.getText().length()>0)
        {
            StringBuilder str = new StringBuilder(input.getText());
            str.deleteCharAt(input.getText().length()-1);
            back=str.toString();
            input.setText(back);

            StringBuilder str0 = new StringBuilder(output.getText());
            str0.deleteCharAt(output.getText().length()-1);
            back=str0.toString();
            output.setText(back);
            out=output.getText();

        }
        else
        {

            StringBuilder str0 = new StringBuilder(output.getText());
            str0.deleteCharAt(output.getText().length()-1);
            back=str0.toString();
            output.setText(back);
            out = output.getText();
        }
    }

    private void equalbtn(ActionEvent e) {
        // TODO add your code here

        if(operator=="+")
        {   secondnum = Double.parseDouble(input.getText());
            input.setText(null);
            result = firstnum + secondnum;
            answer = String.format("%.3f", result);
            output.setText(answer);
            out = answer;


        }

        else if(operator=="-")
        {  secondnum = Double.parseDouble(input.getText());
            input.setText(null);
            result = firstnum - secondnum;
            answer = String.format("%.3f", result);
            output.setText(answer);
            out = answer;
        }

        else if(operator=="%")
        {  secondnum = Double.parseDouble(input.getText());
            input.setText(null);
            result = firstnum % secondnum;
            answer = String.format("%.3f", result);
            output.setText(answer);
            out = answer;
        }

        else if(operator=="÷")
        {  secondnum = Double.parseDouble(input.getText());
            input.setText(null);
            result = firstnum / secondnum;
            answer = String.format("%.3f", result);
            output.setText(answer);
            out = answer;
        }

        else if(operator=="√")
        {
            result =Math.sqrt(firstnum);
            System.out.println(result);
            answer = String.format("%.3f", result);
            output.setText(answer);
            out = answer;
        }

        else if(operator=="×")
        {  secondnum = Double.parseDouble(input.getText());
            input.setText(null);
            result = firstnum * secondnum;
            answer = String.format("%.3f", result);
            output.setText(answer);
            out = answer;
        }

        else if(operator=="^")
        {
            result = firstnum * firstnum;
            answer = String.format("%.3f", result);
            output.setText(answer);
            out = answer;
        }

        //for 1/x
        else if(operator=="~")
        {
            result = 1 / firstnum;
            answer = String.format("%.3f", result);
            output.setText(answer);
            out = answer;
        }

        out = null;
    }

    private void reciprocalbtn(ActionEvent e) {
        // TODO add your code here
    }

    private void button32(ActionEvent e) {
        // TODO add your code here
    }




    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - muskan
        Calculator = new JFrame();
        panel1 = new JPanel();
        textfield = new JPanel();
        output = new JTextField();
        input = new JTextField();
        modbtn = new JButton();
        sqrtbtn = new JButton();
        x2btn = new JButton();
        halfbtn = new JButton();
        cebtn = new JButton();
        cbtn = new JButton();
        backbtn = new JButton();
        divbtn = new JButton();
        btn7 = new JButton();
        btn8 = new JButton();
        btn9 = new JButton();
        mulbtn = new JButton();
        btn4 = new JButton();
        btn5 = new JButton();
        btn6 = new JButton();
        minusbtn = new JButton();
        btn1 = new JButton();
        btn2 = new JButton();
        btn3 = new JButton();
        plusbtn = new JButton();
        plusminusbtn = new JButton();
        btn0 = new JButton();
        pointbtn = new JButton();
        equalbtn = new JButton();

        //======== Calculator ========
        {
            Container CalculatorContentPane = Calculator.getContentPane();
            CalculatorContentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 1, 1));

            //======== panel1 ========
            {
                panel1.setPreferredSize(new Dimension(330, 540));
                panel1.setBorder(new LineBorder(new Color(0, 137, 231)));
                panel1.setBackground(new Color(226, 225, 225));
                panel1.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new
                        javax . swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e" , javax
                        . swing .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java
                        . awt .Font ( "Dialo\u0067", java .awt . Font. BOLD ,12 ) ,java . awt
                        . Color .red ) ,panel1. getBorder () ) ); panel1. addPropertyChangeListener( new java. beans .
                    PropertyChangeListener ( ){  public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062order" .
                    equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );
                panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));

                //======== textfield ========
                {
                    textfield.setPreferredSize(new Dimension(330, 210));
                    textfield.setBackground(new Color(217, 216, 216));
                    textfield.setLayout(new FlowLayout());

                    //---- output ----
                    output.setPreferredSize(new Dimension(328, 90));
                    output.setAlignmentX(0.0F);
                    output.setAlignmentY(0.0F);
                    output.setMargin(new Insets(0, 0, 0, 0));
                    output.setBorder(null);
                    output.setForeground(Color.gray);
                    output.setFont(new Font("Arial", Font.PLAIN, 17));
                    output.setHorizontalAlignment(SwingConstants.RIGHT);
                    output.setEditable(false);
                    output.setBackground(new Color(217, 216, 216));
                    textfield.add(output);

                    //---- input ----
                    input.setPreferredSize(new Dimension(328, 100));
                    input.setAlignmentX(0.0F);
                    input.setAlignmentY(0.0F);
                    input.setMargin(new Insets(0, 0, 0, 0));
                    input.setBorder(null);
                    input.setFont(new Font("Arial", input.getFont().getStyle() | Font.BOLD, input.getFont().getSize() + 15));
                    input.setBackground(new Color(217, 216, 216));
                    input.setHorizontalAlignment(SwingConstants.RIGHT);
                    textfield.add(input);
                }
                panel1.add(textfield);

                //---- modbtn ----
                modbtn.setText("%");
                modbtn.setPreferredSize(new Dimension(80, 53));
                modbtn.setAlignmentY(0.0F);
                modbtn.setBorder(new LineBorder(new Color(217, 216, 216)));
                modbtn.setBackground(new Color(226, 225, 225));
                modbtn.setFont(modbtn.getFont().deriveFont(modbtn.getFont().getSize() + 4f));
                modbtn.setContentAreaFilled(false);
                modbtn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        modbtn(e);
                        modbtn(e);
                    }
                });
                panel1.add(modbtn);

                //---- sqrtbtn ----
                sqrtbtn.setText("\u221a");
                sqrtbtn.setPreferredSize(new Dimension(80, 53));
                sqrtbtn.setAlignmentY(0.0F);
                sqrtbtn.setBorder(new LineBorder(new Color(217, 216, 216)));
                sqrtbtn.setBackground(new Color(226, 225, 225));
                sqrtbtn.setFont(sqrtbtn.getFont().deriveFont(sqrtbtn.getFont().getSize() + 4f));
                sqrtbtn.setContentAreaFilled(false);
                sqrtbtn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        sqrtbtn(e);
                    }
                });
                panel1.add(sqrtbtn);

                //---- x2btn ----
                x2btn.setPreferredSize(new Dimension(80, 53));
                x2btn.setAlignmentY(0.0F);
                x2btn.setBorder(new LineBorder(new Color(217, 216, 216)));
                x2btn.setBackground(new Color(226, 225, 225));
                x2btn.setFont(x2btn.getFont().deriveFont(x2btn.getFont().getSize() + 4f));
                x2btn.setContentAreaFilled(false);
                x2btn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        x2btn(e);
                        x2btn(e);
                    }
                });
                panel1.add(x2btn);

                //---- halfbtn ----
                halfbtn.setText("1/x");
                halfbtn.setPreferredSize(new Dimension(80, 53));
                halfbtn.setAlignmentY(0.0F);
                halfbtn.setBorder(new LineBorder(new Color(217, 216, 216)));
                halfbtn.setBackground(new Color(226, 225, 225));
                halfbtn.setFont(halfbtn.getFont().deriveFont(halfbtn.getFont().getSize() + 4f));
                halfbtn.setContentAreaFilled(false);
                halfbtn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        reciprocalbtn(e);
                        halfbtn(e);
                    }
                });
                panel1.add(halfbtn);

                //---- cebtn ----
                cebtn.setText("CE");
                cebtn.setAlignmentY(0.0F);
                cebtn.setBorder(new LineBorder(new Color(217, 216, 216)));
                cebtn.setPreferredSize(new Dimension(80, 53));
                cebtn.setBackground(new Color(226, 225, 225));
                cebtn.setFont(cebtn.getFont().deriveFont(cebtn.getFont().getSize() + 4f));
                cebtn.setContentAreaFilled(false);
                cebtn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        cebtn(e);
                    }
                });
                panel1.add(cebtn);

                //---- cbtn ----
                cbtn.setText("C");
                cbtn.setAlignmentY(0.0F);
                cbtn.setBorder(new LineBorder(new Color(217, 216, 216)));
                cbtn.setPreferredSize(new Dimension(80, 53));
                cbtn.setBackground(new Color(226, 225, 225));
                cbtn.setFont(cbtn.getFont().deriveFont(cbtn.getFont().getSize() + 4f));
                cbtn.setContentAreaFilled(false);
                cbtn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        cbtn(e);
                    }
                });
                panel1.add(cbtn);

                //---- backbtn ----
                backbtn.setText("\u232b");
                backbtn.setAlignmentY(0.0F);
                backbtn.setBorder(new LineBorder(new Color(217, 216, 216)));
                backbtn.setPreferredSize(new Dimension(80, 53));
                backbtn.setBackground(new Color(226, 225, 225));
                backbtn.setFont(backbtn.getFont().deriveFont(backbtn.getFont().getSize() + 4f));
                backbtn.setContentAreaFilled(false);
                backbtn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        backbtn(e);
                    }
                });
                panel1.add(backbtn);

                //---- divbtn ----
                divbtn.setText("\u00f7");
                divbtn.setAlignmentY(0.0F);
                divbtn.setBorder(new LineBorder(new Color(217, 216, 216)));
                divbtn.setPreferredSize(new Dimension(80, 53));
                divbtn.setBackground(new Color(226, 225, 225));
                divbtn.setFont(divbtn.getFont().deriveFont(divbtn.getFont().getSize() + 7f));
                divbtn.setContentAreaFilled(false);
                divbtn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        divbtn(e);
                    }
                });
                panel1.add(divbtn);

                //---- btn7 ----
                btn7.setText("7");
                btn7.setAlignmentY(0.0F);
                btn7.setBorder(new LineBorder(new Color(217, 216, 216)));
                btn7.setPreferredSize(new Dimension(80, 53));
                btn7.setBackground(Color.white);
                btn7.setFont(btn7.getFont().deriveFont(btn7.getFont().getStyle() | Font.BOLD, btn7.getFont().getSize() + 5f));
                btn7.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        button32(e);
                        button32(e);
                        btn7(e);
                    }
                });
                panel1.add(btn7);

                //---- btn8 ----
                btn8.setText("8");
                btn8.setAlignmentY(0.0F);
                btn8.setBorder(new LineBorder(new Color(217, 216, 216)));
                btn8.setPreferredSize(new Dimension(80, 53));
                btn8.setBackground(Color.white);
                btn8.setFont(btn8.getFont().deriveFont(btn8.getFont().getStyle() | Font.BOLD, btn8.getFont().getSize() + 5f));
                btn8.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        btn8(e);
                    }
                });
                panel1.add(btn8);

                //---- btn9 ----
                btn9.setText("9");
                btn9.setAlignmentY(0.0F);
                btn9.setBorder(new LineBorder(new Color(217, 216, 216)));
                btn9.setPreferredSize(new Dimension(80, 53));
                btn9.setBackground(Color.white);
                btn9.setFont(btn9.getFont().deriveFont(btn9.getFont().getStyle() | Font.BOLD, btn9.getFont().getSize() + 5f));
                btn9.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        btn9(e);
                    }
                });
                panel1.add(btn9);

                //---- mulbtn ----
                mulbtn.setText("\u00d7");
                mulbtn.setAlignmentY(0.0F);
                mulbtn.setBorder(new LineBorder(new Color(217, 216, 216)));
                mulbtn.setPreferredSize(new Dimension(80, 53));
                mulbtn.setBackground(new Color(226, 225, 225));
                mulbtn.setFont(mulbtn.getFont().deriveFont(mulbtn.getFont().getSize() + 7f));
                mulbtn.setContentAreaFilled(false);
                mulbtn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        mulbtn(e);
                    }
                });
                panel1.add(mulbtn);

                //---- btn4 ----
                btn4.setText("4");
                btn4.setAlignmentY(0.0F);
                btn4.setBorder(new LineBorder(new Color(217, 216, 216)));
                btn4.setPreferredSize(new Dimension(80, 53));
                btn4.setBackground(Color.white);
                btn4.setFont(btn4.getFont().deriveFont(btn4.getFont().getStyle() | Font.BOLD, btn4.getFont().getSize() + 5f));
                btn4.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        btn4(e);
                    }
                });
                panel1.add(btn4);

                //---- btn5 ----
                btn5.setText("5");
                btn5.setAlignmentY(0.0F);
                btn5.setBorder(new LineBorder(new Color(217, 216, 216)));
                btn5.setPreferredSize(new Dimension(80, 53));
                btn5.setBackground(Color.white);
                btn5.setFont(btn5.getFont().deriveFont(btn5.getFont().getStyle() | Font.BOLD, btn5.getFont().getSize() + 5f));
                btn5.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        btn5(e);
                    }
                });
                panel1.add(btn5);

                //---- btn6 ----
                btn6.setText("6");
                btn6.setAlignmentY(0.0F);
                btn6.setBorder(new LineBorder(new Color(217, 216, 216)));
                btn6.setPreferredSize(new Dimension(80, 53));
                btn6.setBackground(Color.white);
                btn6.setFont(btn6.getFont().deriveFont(btn6.getFont().getStyle() | Font.BOLD, btn6.getFont().getSize() + 5f));
                btn6.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        btn6(e);
                    }
                });
                panel1.add(btn6);

                //---- minusbtn ----
                minusbtn.setText("-");
                minusbtn.setAlignmentY(0.0F);
                minusbtn.setBorder(new LineBorder(new Color(217, 216, 216)));
                minusbtn.setPreferredSize(new Dimension(80, 53));
                minusbtn.setBackground(new Color(226, 225, 225));
                minusbtn.setFont(minusbtn.getFont().deriveFont(minusbtn.getFont().getSize() + 7f));
                minusbtn.setContentAreaFilled(false);
                minusbtn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        minusbtn(e);
                    }
                });
                panel1.add(minusbtn);

                //---- btn1 ----
                btn1.setText("1");
                btn1.setAlignmentY(0.0F);
                btn1.setBorder(new LineBorder(new Color(217, 216, 216)));
                btn1.setPreferredSize(new Dimension(80, 53));
                btn1.setBackground(Color.white);
                btn1.setFont(btn1.getFont().deriveFont(btn1.getFont().getStyle() | Font.BOLD, btn1.getFont().getSize() + 5f));
                btn1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        btn1(e);
                    }
                });
                panel1.add(btn1);

                //---- btn2 ----
                btn2.setText("2");
                btn2.setAlignmentY(0.0F);
                btn2.setBorder(new LineBorder(new Color(217, 216, 216)));
                btn2.setPreferredSize(new Dimension(80, 53));
                btn2.setBackground(Color.white);
                btn2.setFont(btn2.getFont().deriveFont(btn2.getFont().getStyle() | Font.BOLD, btn2.getFont().getSize() + 5f));
                btn2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        btn2(e);
                    }
                });
                panel1.add(btn2);

                //---- btn3 ----
                btn3.setText("3");
                btn3.setAlignmentY(0.0F);
                btn3.setBorder(new LineBorder(new Color(217, 216, 216)));
                btn3.setPreferredSize(new Dimension(80, 53));
                btn3.setBackground(Color.white);
                btn3.setFont(btn3.getFont().deriveFont(btn3.getFont().getStyle() | Font.BOLD, btn3.getFont().getSize() + 5f));
                btn3.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        btn3(e);
                    }
                });
                panel1.add(btn3);

                //---- plusbtn ----
                plusbtn.setText("+");
                plusbtn.setAlignmentY(0.0F);
                plusbtn.setBorder(new LineBorder(new Color(217, 216, 216)));
                plusbtn.setPreferredSize(new Dimension(80, 53));
                plusbtn.setBackground(new Color(226, 225, 225));
                plusbtn.setFont(plusbtn.getFont().deriveFont(plusbtn.getFont().getSize() + 7f));
                plusbtn.setContentAreaFilled(false);
                plusbtn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        plusbtn(e);
                    }
                });
                panel1.add(plusbtn);

                //---- plusminusbtn ----
                plusminusbtn.setText("\u00b1");
                plusminusbtn.setAlignmentY(0.0F);
                plusminusbtn.setBorder(new LineBorder(new Color(217, 216, 216)));
                plusminusbtn.setPreferredSize(new Dimension(80, 53));
                plusminusbtn.setBackground(new Color(226, 225, 225));
                plusminusbtn.setFont(plusminusbtn.getFont().deriveFont(plusminusbtn.getFont().getSize() + 7f));
                plusminusbtn.setContentAreaFilled(false);
                plusminusbtn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        plusminusbtn(e);
                    }
                });
                panel1.add(plusminusbtn);

                //---- btn0 ----
                btn0.setText("0");
                btn0.setAlignmentY(0.0F);
                btn0.setBorder(new LineBorder(new Color(217, 216, 216)));
                btn0.setPreferredSize(new Dimension(80, 53));
                btn0.setBackground(Color.white);
                btn0.setFont(btn0.getFont().deriveFont(btn0.getFont().getStyle() | Font.BOLD, btn0.getFont().getSize() + 5f));
                btn0.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        btn0(e);
                    }
                });
                panel1.add(btn0);

                //---- pointbtn ----
                pointbtn.setText(".");
                pointbtn.setAlignmentY(0.0F);
                pointbtn.setBorder(new LineBorder(new Color(217, 216, 216)));
                pointbtn.setPreferredSize(new Dimension(80, 53));
                pointbtn.setBackground(new Color(226, 225, 225));
                pointbtn.setFont(pointbtn.getFont().deriveFont(pointbtn.getFont().getSize() + 7f));
                pointbtn.setSelectedIcon(null);
                pointbtn.setContentAreaFilled(false);
                pointbtn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        pointbtn(e);
                    }
                });
                panel1.add(pointbtn);

                //---- equalbtn ----
                equalbtn.setText("=");
                equalbtn.setAlignmentY(0.0F);
                equalbtn.setBorder(new LineBorder(new Color(217, 216, 216)));
                equalbtn.setPreferredSize(new Dimension(80, 53));
                equalbtn.setBackground(new Color(226, 225, 225));
                equalbtn.setFont(equalbtn.getFont().deriveFont(equalbtn.getFont().getSize() + 7f));
                equalbtn.setContentAreaFilled(false);
                equalbtn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        equalbtn(e);
                    }
                });
                panel1.add(equalbtn);
            }
            CalculatorContentPane.add(panel1);
            Calculator.pack();
            Calculator.setLocationRelativeTo(Calculator.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - muskan
    private JFrame Calculator;
    private JPanel panel1;
    private JPanel textfield;
    private JTextField output;
    private JTextField input;
    private JButton modbtn;
    private JButton sqrtbtn;
    private JButton x2btn;
    private JButton halfbtn;
    private JButton cebtn;
    private JButton cbtn;
    private JButton backbtn;
    private JButton divbtn;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton mulbtn;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton minusbtn;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton plusbtn;
    private JButton plusminusbtn;
    private JButton btn0;
    private JButton pointbtn;
    private JButton equalbtn;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
