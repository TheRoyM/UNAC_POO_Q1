import javax.swing.*;import java.awt.event.ActionEvent;import java.awt.event.ActionListener;import java.util.ArrayList;public class frmInicio2 extends JFrame implements ActionListener {    static JButton btnLeer, btnListar, btnNuevo,btnVerAnimales,btnEliminarAnimal,btnOrdenarAscendente,btnOrdenarDescendente,btnAgregarAnimal;    static JTextArea txtTablero;    static JLabel lblRespuesta;    public frmInicio2(){        //configuración        btnLeer = new JButton("Leer Archivo");        btnLeer.setLocation(30,30);        btnLeer.setSize(130,30);        btnLeer.addActionListener(this);        txtTablero = new JTextArea();        txtTablero.setLocation(30,70);        txtTablero.setSize(200,350);        btnVerAnimales = new JButton("Ver A agregado");        btnVerAnimales.setLocation(270,40);        btnVerAnimales.setSize(130,30);        btnVerAnimales.addActionListener(this);        btnEliminarAnimal = new JButton("Eliminar A");        btnEliminarAnimal.setLocation(270,80);        btnEliminarAnimal.setSize(130,30);        btnEliminarAnimal.addActionListener(this);        btnOrdenarAscendente = new JButton("Ordenar A");        btnOrdenarAscendente.setLocation(270,120);        btnOrdenarAscendente.setSize(130,30);        btnOrdenarAscendente.addActionListener(this);        btnOrdenarDescendente = new JButton("Ordenar D");        btnOrdenarDescendente.setLocation(270,160);        btnOrdenarDescendente.setSize(130,30);        btnOrdenarDescendente.addActionListener(this);        btnAgregarAnimal = new JButton("Agregar N A");        btnAgregarAnimal.setLocation(270,200);        btnAgregarAnimal.setSize(130,30);        btnAgregarAnimal.addActionListener(this);        btnNuevo = new JButton("Registrar");        btnNuevo.setLocation(270,240);        btnNuevo.setSize(130,30);        btnNuevo.addActionListener(this);        btnListar = new JButton("Listar");        btnListar.setLocation(270,280);        btnListar.setSize(130,30);        btnListar.addActionListener(this);        lblRespuesta = new JLabel("..");        lblRespuesta.setLocation(270,320);        lblRespuesta.setSize(200,30);        //adicionar        add(btnLeer);        add(btnVerAnimales);        add(btnEliminarAnimal);        add(btnOrdenarAscendente);        add(btnOrdenarDescendente);        add(btnAgregarAnimal);        add(txtTablero);        add(btnNuevo);        add(btnListar);        setLayout(null);        setSize(500,500);        setTitle("Quiz Metodos Roysman-Duvan");        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);        setLocation(300,200);        setVisible (true);    }    @Override    public void actionPerformed(ActionEvent e) {        if (e.getSource().equals(btnVerAnimales)){            txtTablero.setText(String.valueOf(Lista.listadoAnimales()));        }        if (e.getSource().equals(btnEliminarAnimal)){            txtTablero.setText(String.valueOf(Lista.eliminarAnimal()));        }        if (e.getSource().equals(btnOrdenarAscendente)){            txtTablero.setText(String.valueOf(Lista.ordenarAnimales()));        }        if (e.getSource().equals(btnOrdenarDescendente)){            txtTablero.setText(String.valueOf(Lista.ordenarAnimalesreversa()));        }    }}