/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import javax.swing.*;
import logica.Restaurante;
import modelo.Producto;

public class MenuPrincipal extends javax.swing.JFrame {

    private Restaurante restaurante;

    public MenuPrincipal() {
        restaurante = new Restaurante();
        initComponents();
        cargarProductosEnCombo();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        btnVerPedidos = new javax.swing.JButton();
        btnRealizarPedido = new javax.swing.JButton();
        btnAnularPedido = new javax.swing.JButton();
        btnVerMenu = new javax.swing.JButton();
        cmbMesa = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaSalida = new javax.swing.JTextArea();
        cmbProducto = new javax.swing.JComboBox<>();
        btnEliminarPedido = new javax.swing.JButton();
        btnGenerarBoleta = new javax.swing.JButton();
        btnPedidoPrioridad = new javax.swing.JButton();
        spnCantidad = new javax.swing.JSpinner();
        lblAdmin = new javax.swing.JLabel();
        btnVerHistorial = new javax.swing.JButton();
        btnVerTurnoMesa = new javax.swing.JButton();
        btnVerPedidosEspera = new javax.swing.JButton();
        btnVerDevoluciones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI Emoji", 2, 14)); // NOI18N
        lblTitulo.setText("🍽️ Sistema de Restaurante");

        btnVerPedidos.setText("Ver Pedidos");
        btnVerPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPedidosActionPerformed(evt);
            }
        });

        btnRealizarPedido.setText("Realizar Pedido");
        btnRealizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarPedidoActionPerformed(evt);
            }
        });

        btnAnularPedido.setText("Anular Último Pedido");
        btnAnularPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularPedidoActionPerformed(evt);
            }
        });

        btnVerMenu.setText("Ver Menú Completo");
        btnVerMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerMenuActionPerformed(evt);
            }
        });

        cmbMesa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mesa 1", "Mesa 2", "Mesa 3", "Mesa 4", "Mesa 5", "Mesa 6", "Mesa 7", "Mesa 8", "Mesa 9", "Mesa 10" }));

        txtAreaSalida.setEditable(false);
        txtAreaSalida.setColumns(20);
        txtAreaSalida.setRows(5);
        jScrollPane1.setViewportView(txtAreaSalida);

        cmbProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnEliminarPedido.setText("Eliminar Pedido");
        btnEliminarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPedidoActionPerformed(evt);
            }
        });

        btnGenerarBoleta.setText("Generar Boleta");
        btnGenerarBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarBoletaActionPerformed(evt);
            }
        });

        btnPedidoPrioridad.setText("Pedido Prioritario");
        btnPedidoPrioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoPrioridadActionPerformed(evt);
            }
        });

        lblAdmin.setText("🔧 Zona de Administrador\t");

        btnVerHistorial.setText("📜 Ver Historial");
        btnVerHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerHistorialActionPerformed(evt);
            }
        });

        btnVerTurnoMesa.setText("⏳ Turno Siguiente Mesa");
        btnVerTurnoMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTurnoMesaActionPerformed(evt);
            }
        });

        btnVerPedidosEspera.setText("🕒 Pedidos en Espera");
        btnVerPedidosEspera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPedidosEsperaActionPerformed(evt);
            }
        });

        btnVerDevoluciones.setText("❌ Platos Devueltos");
        btnVerDevoluciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerDevolucionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAnularPedido)
                            .addComponent(btnVerPedidos)
                            .addComponent(btnRealizarPedido)
                            .addComponent(cmbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVerMenu))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGenerarBoleta)
                            .addComponent(cmbMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarPedido)
                            .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPedidoPrioridad))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAdmin)
                            .addComponent(btnVerHistorial)
                            .addComponent(btnVerTurnoMesa)
                            .addComponent(btnVerPedidosEspera)
                            .addComponent(btnVerDevoluciones)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVerMenu)
                            .addComponent(cmbMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVerPedidos)
                            .addComponent(btnEliminarPedido))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRealizarPedido)
                            .addComponent(btnGenerarBoleta))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAnularPedido)
                            .addComponent(btnPedidoPrioridad)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAdmin)
                        .addGap(18, 18, 18)
                        .addComponent(btnVerHistorial)
                        .addGap(18, 18, 18)
                        .addComponent(btnVerTurnoMesa)
                        .addGap(18, 18, 18)
                        .addComponent(btnVerPedidosEspera)
                        .addGap(18, 18, 18)
                        .addComponent(btnVerDevoluciones)))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void cargarProductosEnCombo() {
        cmbProducto.removeAllItems();
        for (Producto p : restaurante.getProductos()) {
            cmbProducto.addItem(p.getNombre());
        }
    }
    private void btnRealizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarPedidoActionPerformed

   int mesa = cmbMesa.getSelectedIndex() + 1;
        int productoIndex = cmbProducto.getSelectedIndex();

        if (productoIndex < 0) {
            txtAreaSalida.setText("⚠️ Selecciona un producto válido.");
            return;
        }

        int cantidad = (int) spnCantidad.getValue();
        if (cantidad <= 0) {
            txtAreaSalida.setText("⚠️ Ingresa una cantidad mayor a 0.");
            return;
        }

        int idProducto = restaurante.getProductos().get(productoIndex).getId();
        boolean exito = restaurante.realizarPedido(mesa, idProducto, cantidad);
        txtAreaSalida.setText(exito ? "✅ Pedido realizado correctamente." : "❌ No se pudo realizar el pedido. Verifica el stock.");
    

    }//GEN-LAST:event_btnRealizarPedidoActionPerformed

    private void btnVerPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPedidosActionPerformed

    int mesa = cmbMesa.getSelectedIndex() + 1;
        txtAreaSalida.setText(restaurante.obtenerPedidosDeMesa(mesa));
            

    }//GEN-LAST:event_btnVerPedidosActionPerformed

    private void btnAnularPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularPedidoActionPerformed

      int mesa = cmbMesa.getSelectedIndex() + 1;
        restaurante.anularUltimoPedido(mesa);
        txtAreaSalida.setText("🔁 Último pedido anulado.");
        
    }//GEN-LAST:event_btnAnularPedidoActionPerformed

    private void btnVerMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerMenuActionPerformed

        StringBuilder sb = new StringBuilder("📋 Menú del Restaurante (Ordenado alfabéticamente)\n");
        restaurante.getArbolProductos().inOrden(restaurante.getArbolProductos().getRaiz(), sb);
        txtAreaSalida.setText(sb.toString());
        
    }//GEN-LAST:event_btnVerMenuActionPerformed

    private void btnPedidoPrioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidoPrioridadActionPerformed

   int mesa = cmbMesa.getSelectedIndex() + 1;
        int confirm = JOptionPane.showConfirmDialog(this,
            "¿Desea marcar esta mesa como prioritaria?\nSe añadirá un recargo único de S/.5",
            "Confirmar prioridad", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            restaurante.agregarRecargoPrioridad(mesa);
            txtAreaSalida.setText("🚨 Pedido prioritario registrado para la mesa " + mesa + ".");
        } else {
            txtAreaSalida.setText("❌ Operación cancelada.");
        }

    }//GEN-LAST:event_btnPedidoPrioridadActionPerformed

    private void btnEliminarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPedidoActionPerformed
  
    int mesa = cmbMesa.getSelectedIndex() + 1;
        String input = JOptionPane.showInputDialog("Ingrese el número del pedido a eliminar:");
        try {
            int index = Integer.parseInt(input) - 1;
            boolean eliminado = restaurante.eliminarPedidoPorIndice(mesa, index);
            txtAreaSalida.setText(eliminado ? "❌ Pedido eliminado." : "⚠️ Pedido no encontrado.");
        } catch (NumberFormatException e) {
            txtAreaSalida.setText("⚠️ Entrada inválida.");
        }

    }//GEN-LAST:event_btnEliminarPedidoActionPerformed

    private void btnGenerarBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarBoletaActionPerformed
  
    int mesa = cmbMesa.getSelectedIndex() + 1;
        String boleta = restaurante.generarBoleta(mesa);
        txtAreaSalida.setText(boleta);
        
    }//GEN-LAST:event_btnGenerarBoletaActionPerformed

    private void btnVerHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerHistorialActionPerformed
    txtAreaSalida.setText(restaurante.verHistorialPedidos());

    }//GEN-LAST:event_btnVerHistorialActionPerformed

    private void btnVerTurnoMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTurnoMesaActionPerformed
    txtAreaSalida.setText(restaurante.verTurnoSiguienteMesa());

    }//GEN-LAST:event_btnVerTurnoMesaActionPerformed

    private void btnVerPedidosEsperaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPedidosEsperaActionPerformed
    txtAreaSalida.setText(restaurante.verPedidosEnEspera());

    }//GEN-LAST:event_btnVerPedidosEsperaActionPerformed

    private void btnVerDevolucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerDevolucionesActionPerformed
        txtAreaSalida.setText(restaurante.verPlatosDevueltos());

    }//GEN-LAST:event_btnVerDevolucionesActionPerformed

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new MenuPrincipal().setVisible(true));
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnularPedido;
    private javax.swing.JButton btnEliminarPedido;
    private javax.swing.JButton btnGenerarBoleta;
    private javax.swing.JButton btnPedidoPrioridad;
    private javax.swing.JButton btnRealizarPedido;
    private javax.swing.JButton btnVerDevoluciones;
    private javax.swing.JButton btnVerHistorial;
    private javax.swing.JButton btnVerMenu;
    private javax.swing.JButton btnVerPedidos;
    private javax.swing.JButton btnVerPedidosEspera;
    private javax.swing.JButton btnVerTurnoMesa;
    private javax.swing.JComboBox<String> cmbMesa;
    private javax.swing.JComboBox<String> cmbProducto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTextArea txtAreaSalida;
    // End of variables declaration//GEN-END:variables
}
