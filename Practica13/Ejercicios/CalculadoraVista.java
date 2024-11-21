import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.jar.JarEntry;

public class CalculadoraVista extends JFrame{ 
    private JTextField display;
    private JButton boton0, boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9;
    private JButton botonSuma, botonResta, botonMultiplica, botonDivide, botonBorrar, botonIgual;

    public CalculadoraVista(){
        setTitle("Calculadora MVC");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLocationRelativeTo(null);

        JPanel panelDisplay = new JPanel();
        display = new JTextField(20);
        display.setEditable(false);
        panelDisplay.add(display);

        JPanel panelBotones = new JPanel(new GridLayout(4,4));
        boton7 = new JButton("7");
        boton8 = new JButton("8");
        boton9 = new JButton("9");
        botonDivide = new JButton("/");
        boton4 = new JButton("4");
        boton5 = new JButton("5");
        boton6 = new JButton("6");
        botonMultiplica = new JButton("*");
        boton1 = new JButton("1");
        boton2 = new JButton("2");
        boton3 = new JButton("3");
        botonResta = new JButton("-");
        boton0 = new JButton("0");
        botonIgual = new JButton("=");
        botonBorrar = new JButton("C");
        botonSuma = new JButton("+");

        panelBotones.add(boton7);
        panelBotones.add(boton8);
        panelBotones.add(boton9);
        panelBotones.add(botonDivide);
        panelBotones.add(boton4);
        panelBotones.add(boton5);
        panelBotones.add(boton6);
        panelBotones.add(botonMultiplica);
        panelBotones.add(boton1);
        panelBotones.add(boton2);
        panelBotones.add(boton3);
        panelBotones.add(botonResta);
        panelBotones.add(boton0);
        panelBotones.add(botonIgual);
        panelBotones.add(botonBorrar);
        panelBotones.add(botonSuma);

        add(panelDisplay, BorderLayout.NORTH);
        add(panelBotones, BorderLayout.CENTER);

        setVisible(true);
    }
    public String getDisplay(){
        return display.getText();
    }
    public void setDisplay(String texto){
        display.setText(texto);
    }

    public void agregarListener(ActionListener listener){
        boton0.addActionListener(listener);
        boton1.addActionListener(listener);
        boton2.addActionListener(listener);
        boton3.addActionListener(listener);
        boton4.addActionListener(listener);
        boton5.addActionListener(listener);
        boton6.addActionListener(listener);
        boton7.addActionListener(listener);
        boton8.addActionListener(listener);
        boton9.addActionListener(listener);
        botonDivide.addActionListener(listener);
        botonMultiplica.addActionListener(listener);
        botonResta.addActionListener(listener);
        botonSuma.addActionListener(listener);
        botonIgual.addActionListener(listener);
        botonBorrar.addActionListener(listener);
    }


}
