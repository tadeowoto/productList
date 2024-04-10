package views;


import entidades.Producto;
import java.util.ArrayList;
import views.AgregarProductos;


public class ListaProductos extends javax.swing.JFrame {
    private ArrayList<Producto> listaProductos = new ArrayList<Producto>();
    
    public ListaProductos() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtProductos = new javax.swing.JPanel();
        jsScroll = new javax.swing.JScrollPane();
        tjTablaProducto = new javax.swing.JTable();
        jbAgregar = new javax.swing.JButton();
        jdpEscritorio = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tjTablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Categoría", "Precio", "Producto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jsScroll.setViewportView(tjTablaProducto);
        if (tjTablaProducto.getColumnModel().getColumnCount() > 0) {
            tjTablaProducto.getColumnModel().getColumn(0).setResizable(false);
            tjTablaProducto.getColumnModel().getColumn(1).setResizable(false);
            tjTablaProducto.getColumnModel().getColumn(2).setResizable(false);
        }

        jbAgregar.setText("Agregar nuevo producto");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jdpEscritorioLayout = new javax.swing.GroupLayout(jdpEscritorio);
        jdpEscritorio.setLayout(jdpEscritorioLayout);
        jdpEscritorioLayout.setHorizontalGroup(
            jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );
        jdpEscritorioLayout.setVerticalGroup(
            jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 445, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jtProductosLayout = new javax.swing.GroupLayout(jtProductos);
        jtProductos.setLayout(jtProductosLayout);
        jtProductosLayout.setHorizontalGroup(
            jtProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jtProductosLayout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addComponent(jbAgregar)
                .addGap(146, 146, 146)
                .addComponent(jdpEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jtProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jtProductosLayout.createSequentialGroup()
                    .addGap(63, 63, 63)
                    .addComponent(jsScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(452, Short.MAX_VALUE)))
        );
        jtProductosLayout.setVerticalGroup(
            jtProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jtProductosLayout.createSequentialGroup()
                .addComponent(jdpEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jtProductosLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jtProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jtProductosLayout.createSequentialGroup()
                    .addGap(142, 142, 142)
                    .addComponent(jsScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(33, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jtProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        jdpEscritorio.removeAll();
        jdpEscritorio.repaint();
        AgregarProductos p1 = new AgregarProductos(listaProductos);
        p1.setVisible(true);
        p1.setLocation(00, 00);
        jdpEscritorio.add(p1);
        jdpEscritorio.moveToFront(p1);
        
    }//GEN-LAST:event_jbAgregarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaProductos().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbAgregar;
    private javax.swing.JDesktopPane jdpEscritorio;
    private javax.swing.JScrollPane jsScroll;
    private javax.swing.JPanel jtProductos;
    private javax.swing.JTable tjTablaProducto;
    // End of variables declaration//GEN-END:variables
}
