import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

public class Banque {
  private JFrame frame;
  
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
          public void run() {
            try {
              Banque window = new Banque();
              window.frame.setVisible(true);
            } catch (Exception e) {
              e.printStackTrace();
            } 
          }
        });
  }
  
  public Banque() {
    initialize();
  }
  
  private void initialize() {
    this.frame = new JFrame();
    this.frame.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
    this.frame.setBackground(SystemColor.inactiveCaptionBorder);
    this.frame.setBounds(100, 100, 636, 518);
    this.frame.setDefaultCloseOperation(2);
    JPanel panel = new JPanel();
    panel.setBackground(SystemColor.inactiveCaptionBorder);
    panel.setBorder(new LineBorder(new Color(0, 0, 0)));
    this.frame.getContentPane().add(panel, "Center");
    panel.setLayout(new GridLayout(5, 3, 0, 0));
    JPanel panel_11 = new JPanel();
    panel_11.setBackground(SystemColor.inactiveCaptionBorder);
    panel.add(panel_11);
    panel_11.setLayout(new BorderLayout(0, 0));
    JLabel lblNewLabel = new JLabel("Paradise");
    lblNewLabel.setBackground(SystemColor.inactiveCaptionBorder);
    lblNewLabel.setForeground(new Color(0, 100, 0));
    lblNewLabel.setFont(new Font("Eras Bold ITC", 1, 45));
    lblNewLabel.setHorizontalAlignment(4);
    panel_11.add(lblNewLabel, "Center");
    JLabel lblNewLabel_22 = new JLabel(" ");
    panel_11.add(lblNewLabel_22, "South");
    JPanel panel_7 = new JPanel();
    panel_7.setBackground(SystemColor.inactiveCaptionBorder);
    panel.add(panel_7);
    panel_7.setLayout(new BorderLayout(0, 0));
    JLabel lblNewLabel_1 = new JLabel("Bank");
    lblNewLabel_1.setBackground(SystemColor.inactiveCaptionBorder);
    lblNewLabel_1.setForeground(new Color(0, 100, 0));
    lblNewLabel_1.setFont(new Font("Eras Bold ITC", 1, 45));
    lblNewLabel_1.setHorizontalAlignment(0);
    panel_7.add(lblNewLabel_1, "Center");
    JPanel panel_1 = new JPanel();
    panel_1.setBackground(SystemColor.inactiveCaptionBorder);
    panel.add(panel_1);
    panel_1.setLayout(new BorderLayout(0, 0));
    JLabel lblNewLabel_2 = new JLabel("Corp.");
    lblNewLabel_2.setBackground(SystemColor.inactiveCaptionBorder);
    lblNewLabel_2.setForeground(new Color(0, 100, 0));
    lblNewLabel_2.setFont(new Font("Eras Bold ITC", 1, 45));
    lblNewLabel_2.setHorizontalAlignment(2);
    panel_1.add(lblNewLabel_2, "Center");
    JPanel panel_8 = new JPanel();
    panel_8.setBackground(SystemColor.inactiveCaptionBorder);
    panel.add(panel_8);
    
    JLabel lblBienvenue = new JLabel("   Bienvenue,");
    lblBienvenue.setFont(new Font("Tahoma", Font.PLAIN, 20));
    lblBienvenue.setHorizontalAlignment(SwingConstants.LEFT);
    lblBienvenue.setForeground(Color.DARK_GRAY);
    lblBienvenue.setBackground(SystemColor.inactiveCaptionBorder);
    panel_8.add(lblBienvenue);
    JPanel panel_3 = new JPanel();
    panel_3.setBackground(SystemColor.inactiveCaptionBorder);
    panel.add(panel_3);
    panel_3.setLayout(new BorderLayout(0, 0));
    JLabel lblNewLabel_3 = new JLabel("");
    lblNewLabel_3.setBackground(SystemColor.inactiveCaptionBorder);
    lblNewLabel_3.setFont(new Font("Dialog", 2, 12));
    lblNewLabel_3.setHorizontalAlignment(4);
    panel_3.add(lblNewLabel_3, "North");
    JPanel panel_6 = new JPanel();
    panel_6.setBackground(SystemColor.inactiveCaptionBorder);
    panel.add(panel_6);
    panel_6.setLayout(new BorderLayout(0, 0));
    JLabel lblNewLabel_4 = new JLabel("");
    lblNewLabel_4.setBackground(SystemColor.inactiveCaptionBorder);
    lblNewLabel_4.setFont(new Font("Dialog", 2, 12));
    panel_6.add(lblNewLabel_4, "North");
    JPanel panel_9 = new JPanel();
    panel_9.setBackground(SystemColor.inactiveCaptionBorder);
    panel.add(panel_9);
    panel_9.setLayout(new BorderLayout(0, 0));
    JLabel lblNewLabel_6 = new JLabel("Veuillez");
    lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
    lblNewLabel_6.setForeground(Color.DARK_GRAY);
    lblNewLabel_6.setBackground(SystemColor.inactiveCaptionBorder);
    lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
    panel_9.add(lblNewLabel_6, "Center");
    JPanel panel_13 = new JPanel();
    panel_13.setBackground(SystemColor.inactiveCaptionBorder);
    panel.add(panel_13);
    panel_13.setLayout(new BorderLayout(0, 0));
    JLabel lblNewLabel_7 = new JLabel("utilisez");
    lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
    lblNewLabel_7.setForeground(Color.DARK_GRAY);
    lblNewLabel_7.setBackground(SystemColor.inactiveCaptionBorder);
    lblNewLabel_7.setHorizontalAlignment(0);
    panel_13.add(lblNewLabel_7, "Center");
    JLabel lblNewLabel_8 = new JLabel("           ");
    lblNewLabel_8.setBackground(SystemColor.inactiveCaptionBorder);
    panel_13.add(lblNewLabel_8, "North");
    JPanel panel_2 = new JPanel();
    panel_2.setBackground(SystemColor.inactiveCaptionBorder);
    panel.add(panel_2);
    panel_2.setLayout(new BorderLayout(0, 0));
    JLabel lblNewLabel_9 = new JLabel("                   ");
    lblNewLabel_9.setBackground(SystemColor.inactiveCaptionBorder);
    panel_2.add(lblNewLabel_9, "North");
    JLabel lblNewLabel_10 = new JLabel("les menus");
    lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
    lblNewLabel_10.setForeground(Color.DARK_GRAY);
    lblNewLabel_10.setBackground(SystemColor.inactiveCaptionBorder);
    lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
    panel_2.add(lblNewLabel_10, "Center");
    JPanel panel_15 = new JPanel();
    panel_15.setBackground(SystemColor.inactiveCaptionBorder);
    panel.add(panel_15);
    panel_15.setLayout(new BorderLayout(0, 0));
    JLabel lblNewLabel_15 = new JLabel("au dessus");
    lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 20));
    lblNewLabel_15.setForeground(Color.DARK_GRAY);
    lblNewLabel_15.setBackground(SystemColor.inactiveCaptionBorder);
    lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
    panel_15.add(lblNewLabel_15, "Center");
    JPanel panel_14 = new JPanel();
    panel_14.setBackground(SystemColor.inactiveCaptionBorder);
    panel.add(panel_14);
    panel_14.setLayout(new BorderLayout(0, 0));
    JLabel lblNewLabel_16 = new JLabel("Merci");
    lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 20));
    lblNewLabel_16.setForeground(Color.DARK_GRAY);
    lblNewLabel_16.setBackground(SystemColor.inactiveCaptionBorder);
    lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
    panel_14.add(lblNewLabel_16, "Center");
    JPanel panel_5 = new JPanel();
    panel_5.setBackground(SystemColor.inactiveCaptionBorder);
    panel.add(panel_5);
    panel_5.setLayout(new BorderLayout(0, 0));
    JPanel panel_12 = new JPanel();
    panel_12.setBackground(SystemColor.inactiveCaptionBorder);
    panel.add(panel_12);
    JPanel panel_4 = new JPanel();
    panel_4.setBackground(SystemColor.inactiveCaptionBorder);
    panel.add(panel_4);
    panel_4.setLayout(new BorderLayout(0, 0));
    JButton btnNewButton = new JButton("Quitter");
    panel_4.add(btnNewButton, BorderLayout.SOUTH);
    btnNewButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (JOptionPane.showConfirmDialog(Banque.this.frame, "Voulez-vous rquitter l'appli banque?", "IE Bank", 
                0) == 0)
              System.exit(1); 
          }
        });
    JPanel panel_10 = new JPanel();
    panel_10.setBackground(SystemColor.inactiveCaptionBorder);
    panel.add(panel_10);
    panel_10.setLayout(new BorderLayout(0, 0));
    JMenuBar menuBar = new JMenuBar();
    menuBar.setBackground(SystemColor.inactiveCaptionBorder);
    this.frame.setJMenuBar(menuBar);
    JMenu mnNewMenu_1 = new JMenu("Menu");
    mnNewMenu_1.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_1.setBackground(SystemColor.inactiveCaptionBorder);
    menuBar.add(mnNewMenu_1);
    JMenuItem Quitter = new JMenuItem("Quitter");
    Quitter.setFont(new Font("Segoe UI", 0, 15));
    Quitter.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Banque.this.frame = new JFrame("quitter");
            if (JOptionPane.showConfirmDialog(Banque.this.frame, "Voulez-vous rquitter l'appli banque?", "IE Bank", 
                0) == 0)
              System.exit(1); 
          }
        });
    mnNewMenu_1.add(Quitter);
    JMenu mnNewMenu = new JMenu("Créer");
    mnNewMenu.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu.setBackground(SystemColor.inactiveCaptionBorder);
    menuBar.add(mnNewMenu);
    JMenuItem NouveauCompte = new JMenuItem("Nouveau Compte");
    NouveauCompte.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Banque.this.frame.setVisible(false);
            Créer.main(null);
          }
        });
    NouveauCompte.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu.add(NouveauCompte);
    JMenu mnNewMenu_2 = new JMenu("Afficher");
    mnNewMenu_2.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_2.setBackground(SystemColor.inactiveCaptionBorder);
    menuBar.add(mnNewMenu_2);
    JMenuItem AffichertToutCompte = new JMenuItem("Tous les comptes");
    AffichertToutCompte.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Banque.this.frame.setVisible(false);
            Affichertout.main(null);
          }
        });
    AffichertToutCompte.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_2.add(AffichertToutCompte);
    JSeparator separator_2 = new JSeparator();
    mnNewMenu_2.add(separator_2);
    JMenuItem AfficherTypeCompte = new JMenuItem("Un type de compte / un compte sp");
    AfficherTypeCompte.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Banque.this.frame.setVisible(false);
            Affichertype.main(null);
          }
        });
    AfficherTypeCompte.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_2.add(AfficherTypeCompte);
    JMenu mnNewMenu_3 = new JMenu("Modifier");
    mnNewMenu_3.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_3.setBackground(SystemColor.inactiveCaptionBorder);
    menuBar.add(mnNewMenu_3);
    JMenuItem CrediterCompte = new JMenuItem("Dun compte");
    CrediterCompte.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_3.add(CrediterCompte);
    JSeparator separator_3 = new JSeparator();
    mnNewMenu_3.add(separator_3);
    JMenuItem SupprimerCompte = new JMenuItem("Supprimer un compte");
    SupprimerCompte.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Banque.this.frame.setVisible(false);
            Delete.main(null);
          }
        });
    SupprimerCompte.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_3.add(SupprimerCompte);
  }
}
