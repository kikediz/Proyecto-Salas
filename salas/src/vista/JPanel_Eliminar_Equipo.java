/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Choice;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author morte
 */
public class JPanel_Eliminar_Equipo extends JPanel implements Panels{

    private javax.swing.JLabel id_equipo_JLabel;
    private javax.swing.JTextField id_equipo_JTextField;
    private javax.swing.JLabel id_sala_JLabel;
    private java.awt.Choice id_sala_Choice;
    private javax.swing.JLabel tipo_equipo_JLabel;
    private java.awt.Choice tipo_equipo_Choice;
    private javax.swing.JLabel modelo_JLabel;
    private javax.swing.JTextField modelo_JTextField;
    private javax.swing.JLabel id_marca_JLabel;
    private java.awt.Choice id_marca_Choice;
    private javax.swing.JButton eliminar_JButton;
    private javax.swing.JButton limpiarJButton;
    private javax.swing.JLabel exito;
    
    public JPanel_Eliminar_Equipo(){
        initComponents();
        construir();
    }
    
    private void initComponents(){
        id_equipo_JLabel = new JLabel();
        id_equipo_JTextField = new JTextField();
        id_sala_JLabel = new JLabel();
        id_sala_Choice = new Choice();
        tipo_equipo_JLabel = new JLabel();
        tipo_equipo_Choice = new Choice();
        modelo_JLabel = new JLabel();
        modelo_JTextField = new JTextField();
        id_marca_JLabel = new JLabel();
        id_marca_Choice = new Choice();
        eliminar_JButton = new JButton();
        limpiarJButton = new JButton();
        exito = new JLabel();
    }

    
    private void construir(){
        setAutoscrolls(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLayout(new java.awt.GridBagLayout());
        id_equipo_JLabel.setFont(new java.awt.Font("Dustismo", 1, 32)); // NOI18N
        id_equipo_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        id_equipo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id_equipo_JLabel.setText("Id Equipo");
        add(id_equipo_JLabel, new GBConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(0, 0, 0, 0), 0, 0));
        
        id_equipo_JTextField.setBackground(new java.awt.Color(240, 240, 240));
        id_equipo_JTextField.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        id_equipo_JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_equipo_JTextField.setToolTipText("Introduzca la cedula que desea registrar");
        add(id_equipo_JTextField, new GBConstraints(1, 0, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(0, 0, 0, 0), 0, 0));
        
        id_sala_JLabel.setFont(new java.awt.Font("Dustismo", 1, 32)); // NOI18N
        id_sala_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        id_sala_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id_sala_JLabel.setText("Id Equipo");
        add(id_sala_JLabel, new GBConstraints(0, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(0, 0, 0, 0), 0, 0));
        
        id_sala_Choice.setFont(new java.awt.Font("Dustismo", 1, 32)); // NOI18N
        id_sala_Choice.setForeground(new java.awt.Color(0, 0, 0));
        //id_sala_Choice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id_sala_Choice.add("Id de Sala");
        add(id_sala_Choice, new GBConstraints(1, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(0, 0, 0, 0), 0, 0));
        
        tipo_equipo_JLabel.setFont(new java.awt.Font("Dustismo", 1, 32)); // NOI18N
        tipo_equipo_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        tipo_equipo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tipo_equipo_JLabel.setText("Id Equipo");
        add(tipo_equipo_JLabel, new GBConstraints(0, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(0, 0, 0, 0), 0, 0));
        
        tipo_equipo_Choice.setFont(new java.awt.Font("Dustismo", 1, 32)); // NOI18N
        tipo_equipo_Choice.setForeground(new java.awt.Color(0, 0, 0));
        //id_sala_Choice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tipo_equipo_Choice.add("Id de Tipo Equipo");
        add(tipo_equipo_Choice, new GBConstraints(1, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(0, 0, 0, 0), 0, 0));
        
        modelo_JLabel.setFont(new java.awt.Font("Dustismo", 1, 32)); // NOI18N
        modelo_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        modelo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modelo_JLabel.setText("Id Equipo");
        add(modelo_JLabel, new GBConstraints(0, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(0, 0, 0, 0), 0, 0));
        
        modelo_JTextField.setBackground(new java.awt.Color(240, 240, 240));
        modelo_JTextField.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        modelo_JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        modelo_JTextField.setToolTipText("Introduzca la cedula que desea registrar");
        add(modelo_JTextField, new GBConstraints(1, 3, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(0, 0, 0, 0), 0, 0));
        
        id_marca_JLabel.setFont(new java.awt.Font("Dustismo", 1, 32)); // NOI18N
        id_marca_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        id_marca_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id_marca_JLabel.setText("Correo");
        add(id_marca_JLabel, new GBConstraints(0, 4, 2, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(0, 0, 0, 0), 0, 0));
        
        id_marca_Choice.setFont(new java.awt.Font("Dustismo", 1, 32)); // NOI18N
        id_marca_Choice.setForeground(new java.awt.Color(0, 0, 0));
        //id_sala_Choice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id_marca_Choice.add("Id marca de Equipo");
        add(id_marca_Choice, new GBConstraints(1, 4, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(0, 0, 0, 0), 0, 0));
        
        exito.setFont(new java.awt.Font("Dustismo", 1, 26)); // NOI18N
        exito.setForeground(new java.awt.Color(0, 0, 0));
        exito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exito.setText("");
        add(exito, new GBConstraints(0, 6, 2, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(0, 0, 0, 0), 0, 0));
        
        eliminar_JButton.setBackground(new java.awt.Color(230, 230, 230));
        eliminar_JButton.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 32)); // NOI18N
        eliminar_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/actualizar.png"))); // NOI18N
        eliminar_JButton.setText("Actualizar");
        eliminar_JButton.setToolTipText("Pulse cuando haya acabado de llenar el formulario");
        eliminar_JButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), java.awt.Color.lightGray, java.awt.Color.lightGray)));
        eliminar_JButton.setContentAreaFilled(true);
        eliminar_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(eliminar_JButton, new GBConstraints(0, 5, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(0, 0, 0, 0), 0, 0));
        
        limpiarJButton.setBackground(new java.awt.Color(230, 230, 230));
        limpiarJButton.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 32)); // NOI18N
        //limpiarJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/agregar.png"))); // NOI18N
        limpiarJButton.setText("Limpiar");
        limpiarJButton.setToolTipText("Pulse para limpiar todos los campos");
        limpiarJButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), java.awt.Color.lightGray, java.awt.Color.lightGray)));
        limpiarJButton.setContentAreaFilled(true);
        limpiarJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(limpiarJButton, new GBConstraints(1, 5, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(0, 0, 0, 0), 0, 0));
    }
    
    public JLabel getId_equipo_JLabel() {
        return id_equipo_JLabel;
    }

    public void setId_equipo_JLabel(JLabel id_equipo_JLabel) {
        this.id_equipo_JLabel = id_equipo_JLabel;
    }

    public JTextField getId_equipo_JTextField() {
        return id_equipo_JTextField;
    }

    public void setId_equipo_JTextField(JTextField id_equipo_JTextField) {
        this.id_equipo_JTextField = id_equipo_JTextField;
    }

    public JLabel getId_sala_JLabel() {
        return id_sala_JLabel;
    }

    public void setId_sala_JLabel(JLabel id_sala_JLabel) {
        this.id_sala_JLabel = id_sala_JLabel;
    }

    public Choice getId_sala_Choice() {
        return id_sala_Choice;
    }

    public void setId_sala_Choice(Choice id_sala_Choice) {
        this.id_sala_Choice = id_sala_Choice;
    }

    public JLabel getTipo_equipo_JLabel() {
        return tipo_equipo_JLabel;
    }

    public void setTipo_equipo_JLabel(JLabel tipo_equipo_JLabel) {
        this.tipo_equipo_JLabel = tipo_equipo_JLabel;
    }

    public Choice getTipo_equipo_Choice() {
        return tipo_equipo_Choice;
    }

    public void setTipo_equipo_Choice(Choice tipo_equipo_Choice) {
        this.tipo_equipo_Choice = tipo_equipo_Choice;
    }

    public JLabel getModelo_JLabel() {
        return modelo_JLabel;
    }

    public void setModelo_JLabel(JLabel modelo_JLabel) {
        this.modelo_JLabel = modelo_JLabel;
    }

    public JTextField getModelo_JTextField() {
        return modelo_JTextField;
    }

    public void setModelo_JTextField(JTextField modelo_JTextField) {
        this.modelo_JTextField = modelo_JTextField;
    }

    public JLabel getId_marca_JLabel() {
        return id_marca_JLabel;
    }

    public void setId_marca_JLabel(JLabel id_marca_JLabel) {
        this.id_marca_JLabel = id_marca_JLabel;
    }

    public Choice getId_marca_Choice() {
        return id_marca_Choice;
    }

    public void setId_marca_Choice(Choice id_marca_Choice) {
        this.id_marca_Choice = id_marca_Choice;
    }

    public JButton getActualizar_JButton() {
        return eliminar_JButton;
    }

    public void setActualizar_JButton(JButton eliminar_JButton) {
        this.eliminar_JButton = eliminar_JButton;
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
        id_equipo_JTextField.setText("");
        modelo_JTextField.setText("");
    }
}