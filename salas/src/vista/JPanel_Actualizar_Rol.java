/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.GridBagConstraints;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.freixas.jcalendar.JCalendar;

/**
 *
 * @author morte
 */
public class JPanel_Actualizar_Rol extends JPanel implements Panels{

    private javax.swing.JLabel id_rol_JLabel;
    private javax.swing.JTextField id_rol_JTextField;
    private javax.swing.JLabel nombre_rol_JLabel;
    private javax.swing.JTextField nombre_rol_JTextField;
    private javax.swing.JButton actualizar_JButton;
    private javax.swing.JButton limpiarJButton;
    private javax.swing.JLabel exito;
    
    public JPanel_Actualizar_Rol(){
        initComponents();
        construir();
    }
    
    private void initComponents(){
        nombre_rol_JLabel = new javax.swing.JLabel();
        nombre_rol_JTextField = new javax.swing.JTextField();
        id_rol_JLabel = new javax.swing.JLabel();
        id_rol_JTextField = new javax.swing.JTextField();
        actualizar_JButton = new javax.swing.JButton();
        exito=new  javax.swing.JLabel();
        limpiarJButton=new javax.swing.JButton();
    }
    private void construir(){
        setAutoscrolls(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLayout(new java.awt.GridBagLayout());
        
        id_rol_JLabel.setFont(new java.awt.Font("Dustismo", 1, 32)); // NOI18N
        id_rol_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        id_rol_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id_rol_JLabel.setText("id_rol_JLabel");
        add(id_rol_JLabel, new GBConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        id_rol_JTextField.setBackground(new java.awt.Color(240, 240, 240));
        id_rol_JTextField.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        id_rol_JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_rol_JTextField.setToolTipText("Introduzca la cedula que desea registrar");
        add(id_rol_JTextField, new GBConstraints(1, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        nombre_rol_JLabel.setFont(new java.awt.Font("Dustismo", 1, 32)); // NOI18N
        nombre_rol_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        nombre_rol_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre_rol_JLabel.setText("id_persona_JLabel");
        add(nombre_rol_JLabel, new GBConstraints(0, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        nombre_rol_JTextField.setBackground(new java.awt.Color(240, 240, 240));
        nombre_rol_JTextField.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        nombre_rol_JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombre_rol_JTextField.setToolTipText("Introduzca la cedula que desea registrar");
        add(nombre_rol_JTextField, new GBConstraints(1, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
                
        
        exito.setFont(new java.awt.Font("Dustismo", 1, 26)); // NOI18N
        exito.setForeground(new java.awt.Color(0, 0, 0));
        exito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exito.setText("");
        add(exito, new GBConstraints(0, 3, 2, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        actualizar_JButton.setBackground(new java.awt.Color(230, 230, 230));
        actualizar_JButton.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 32)); // NOI18N
        actualizar_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/actualizar.png"))); // NOI18N
        actualizar_JButton.setText("Actualizar");
        actualizar_JButton.setToolTipText("Pulse cuando haya acabado de llenar el formulario");
        actualizar_JButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), java.awt.Color.lightGray, java.awt.Color.lightGray)));
        actualizar_JButton.setContentAreaFilled(true);
        actualizar_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(actualizar_JButton, new GBConstraints(0, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        limpiarJButton.setBackground(new java.awt.Color(230, 230, 230));
        limpiarJButton.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 32)); // NOI18N
        //limpiarJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/agregar.png"))); // NOI18N
        limpiarJButton.setText("Limpiar");
        limpiarJButton.setToolTipText("Pulse para limpiar todos los campos");
        limpiarJButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), java.awt.Color.lightGray, java.awt.Color.lightGray)));
        limpiarJButton.setContentAreaFilled(true);
        limpiarJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(limpiarJButton, new GBConstraints(1, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
    }
    
    public JLabel getId_rol_JLabel() {
        return id_rol_JLabel;
    }

    public void setId_rol_JLabel(JLabel id_rol_JLabel) {
        this.id_rol_JLabel = id_rol_JLabel;
    }

    public JTextField getId_rol_JTextField() {
        return id_rol_JTextField;
    }

    public void setId_rol_JTextField(JTextField id_rol_JTextField) {
        this.id_rol_JTextField = id_rol_JTextField;
    }

    public JLabel getNombre_rol_JLabel() {
        return nombre_rol_JLabel;
    }

    public void setNombre_rol_JLabel(JLabel nombre_rol_JLabel) {
        this.nombre_rol_JLabel = nombre_rol_JLabel;
    }

    public JTextField getNombre_rol_JTextField() {
        return nombre_rol_JTextField;
    }

    public void setNombre_rol_JTextField(JTextField nombre_rol_JTextField) {
        this.nombre_rol_JTextField = nombre_rol_JTextField;
    }

    public JButton getActualizar_JButton() {
        return actualizar_JButton;
    }

    public void setActualizar_JButton(JButton actualizar_JButton) {
        this.actualizar_JButton = actualizar_JButton;
    }

    public JButton getLimpiarJButton() {
        return limpiarJButton;
    }

    public void setLimpiarJButton(JButton limpiarJButton) {
        this.limpiarJButton = limpiarJButton;
    }

    public JLabel getExito() {
        return exito;
    }

    public void setExito(JLabel exito) {
        this.exito = exito;
    }
    
    public void limpiar(){
        id_rol_JTextField.setText("");
        nombre_rol_JTextField.setText("");
    }
}