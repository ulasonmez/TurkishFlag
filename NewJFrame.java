
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
import java.awt.geom.Path2D.Double;
import javax.swing.JFrame;
//SDÜ ULAŞ SÖNMEZ
/**
 *
 * @author ULAŞ SÖNMEZ
 */
public class NewJFrame extends javax.swing.JFrame {
    public NewJFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ULAŞ SÖNMEZ");
        setResizable(false);

        jButton1.setText("Çiz");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 234, Short.MAX_VALUE)
        );

        jButton2.setText("Temizle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Kapat");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addGap(0, 87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        Graphics g = jPanel1.getGraphics();
        Graphics2D g2d = (Graphics2D) g;

        g.setColor(Color.RED);
        g2d.setStroke(new BasicStroke(3));

        g2d.setStroke(new BasicStroke(3)); //kalınlık
		Path2D.Double curve = new Path2D.Double();
		curve.moveTo(60, 60);
		curve.curveTo(100, 90, 190, 90, 240, 60);
		g2d.draw(curve);

		Path2D.Double curve2 = new Path2D.Double();
		curve2.moveTo(240, 60);
		curve2.curveTo(280, 30, 370, 30, 420, 60);
		g2d.draw(curve2);

		Path2D.Double curve1 = new Path2D.Double();
		curve1.moveTo(60, 210);
		curve1.curveTo(100, 240, 190, 240, 240, 210);
		g2d.draw(curve1);

		Path2D.Double curve3 = new Path2D.Double();
		curve3.moveTo(240, 210);
		curve3.curveTo(280, 180, 370, 180, 420, 210);
		g2d.draw(curve3);
		//burası bayrağın yan kısımlarındaki doğrusal çizgiler
		Line2D.Double line1 = new Line2D.Double(60,60,60,210);
		g2d.draw(line1);
		Line2D.Double line2 = new Line2D.Double(420,60,420,210);
		g2d.draw(line2);
		//burası yıldız
		g2d.setStroke(new BasicStroke(3)); //kalınlık
		Line2D.Double star1 = new Line2D.Double(300,120,320,120);
		g2d.draw(star1);
		Line2D.Double star2 = new Line2D.Double(320,120,300,130);
		g2d.draw(star2);
		Line2D.Double star3 = new Line2D.Double(300,130,310,150);
		g2d.draw(star3);
		Line2D.Double star4 = new Line2D.Double(310,150,290,140);
		g2d.draw(star4);
		Line2D.Double star5 = new Line2D.Double(290,140,270,150);
		g2d.draw(star5);
		Line2D.Double star6 = new Line2D.Double(270,150,280,130);
		g2d.draw(star6);
		Line2D.Double star7 = new Line2D.Double(280,130,260,120);
		g2d.draw(star7);
		Line2D.Double star8 = new Line2D.Double(260,120,280,120);
		g2d.draw(star8);
		Line2D.Double star9 = new Line2D.Double(290,100,300,120);
		g2d.draw(star9);
		Line2D.Double star10 = new Line2D.Double(290,100,280,120);
		g2d.draw(star10);

		//ay (B-Spline) eğrileri
		g2d.setStroke(new BasicStroke(3)); //kalınlık
		//büyük kısmı
		Path2D.Double ay1 = new Path2D.Double();
		ay1.moveTo(200, 175);
		ay1.curveTo(110, 195, 110, 90, 200, 110);
		g2d.draw(ay1);
		//küçük kısmı
		Path2D.Double ay2 = new Path2D.Double();
		ay2.moveTo(200, 175);
		ay2.curveTo(140, 170, 140, 115, 200, 110);
		g2d.draw(ay2);

    }

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        Graphics g = jPanel1.getGraphics();
        g.clearRect(2, 2, 502, 352);
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }


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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

               new NewJFrame().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration

}
