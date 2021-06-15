import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Affichertout {
  private JFrame frame;
  
  private JTable table;
  
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
          public void run() {
            try {
              Affichertout window = new Affichertout();
              window.frame.setVisible(true);
            } catch (Exception e) {
              e.printStackTrace();
            } 
          }
        });
  }
  
  public Affichertout() {
    initialize();
  }
  
  private void initialize() {
    this.frame = new JFrame();
    frame.getContentPane().setBackground(new Color(230, 230, 250));
    this.frame.setBackground(SystemColor.inactiveCaptionBorder);
    this.frame.setBounds(100, 100, 1200, 658);
    this.frame.setDefaultCloseOperation(2);
    JMenuBar menuBar = new JMenuBar();
    menuBar.setFont(new Font("Segoe UI", 0, 15));
    menuBar.setBackground(SystemColor.inactiveCaptionBorder);
    this.frame.setJMenuBar(menuBar);
    JMenu mnNewMenu_1 = new JMenu("Menu");
    mnNewMenu_1.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_1.setBackground(SystemColor.inactiveCaptionBorder);
    menuBar.add(mnNewMenu_1);
    JMenuItem Accueil = new JMenuItem("Retour a l'accueil");
    Accueil.setFont(new Font("Segoe UI", 0, 15));
    Accueil.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Affichertout.this.frame.setVisible(false);
            Banque.main(null);
          }
        });
    mnNewMenu_1.add(Accueil);
    JSeparator separator = new JSeparator();
    mnNewMenu_1.add(separator);
    JMenuItem Quitter = new JMenuItem("Quitter");
    Quitter.setFont(new Font("Segoe UI", 0, 15));
    Quitter.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Affichertout.this.frame = new JFrame("quitter");
            if (JOptionPane.showConfirmDialog(Affichertout.this.frame, "Voulez-vous réelement quitter l'appli Banque?", "IE Bank", 
                0) == 0)
              System.exit(1); 
          }
        });
    mnNewMenu_1.add(Quitter);
    JMenu mnCrer = new JMenu("Créer");
    mnCrer.setFont(new Font("Segoe UI", 0, 15));
    mnCrer.setBackground(SystemColor.inactiveCaptionBorder);
    menuBar.add(mnCrer);
    JMenuItem mntmUnNouveauCompte = new JMenuItem("Un nouveau compte");
    mntmUnNouveauCompte.setFont(new Font("Segoe UI", 0, 15));
    mnCrer.add(mntmUnNouveauCompte);
    JMenu mnNewMenu_2 = new JMenu("Afficher");
    mnNewMenu_2.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_2.setBackground(SystemColor.inactiveCaptionBorder);
    menuBar.add(mnNewMenu_2);
    JMenuItem AfficherTypeCompte = new JMenuItem("Un type de compte / un compte spécifique");
    AfficherTypeCompte.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Affichertout.this.frame.setVisible(false);
            Affichertype.main(null);
          }
        });
    AfficherTypeCompte.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_2.add(AfficherTypeCompte);
    JMenu mnNewMenu_3 = new JMenu("Modifier");
    mnNewMenu_3.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_3.setBackground(SystemColor.inactiveCaptionBorder);
    menuBar.add(mnNewMenu_3);
    JMenuItem CrediterCompte = new JMenuItem("Débiter/Créditer un compte");
    CrediterCompte.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_3.add(CrediterCompte);
    JSeparator separator_3 = new JSeparator();
    mnNewMenu_3.add(separator_3);
    JMenuItem SupprimerCompte = new JMenuItem("Supprimer un compte");
    SupprimerCompte.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Affichertout.this.frame.setVisible(false);
            Delete.main(null);
          }
        });
    SupprimerCompte.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_3.add(SupprimerCompte);
    this.frame.getContentPane().setLayout((LayoutManager)null);
    JScrollPane scrollPane = new JScrollPane();
    scrollPane.setBackground(new Color(230, 230, 250));
    scrollPane.setBounds(12, 69, 1158, 470);
    this.frame.getContentPane().add(scrollPane);
    this.table = new JTable();
    this.table.setModel(new DefaultTableModel(
          new Object[0][], 
          
          (Object[])new String[] { 
            "NoCompte", "Id", "Nom", "Prenom", "D.O.B", "Adresse", "Sexe", "Type de Compte", "Solde", "ID 2 (C.joint)", 
            "Taux(C.epargne)" }));
    scrollPane.setViewportView(this.table);
    JButton btnAfficher = new JButton("Afficher");
    btnAfficher.setHorizontalAlignment(SwingConstants.LEADING);
    btnAfficher.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            String filePath = "banque.dat";
            File file = new File(filePath);
            try {
              FileReader fr = new FileReader(file);
              BufferedReader br = new BufferedReader(fr);
              DefaultTableModel model = (DefaultTableModel)Affichertout.this.table.getModel();
              Object[] lines = br.lines().toArray();
              for (int i = 0; i < lines.length; i++) {
                String[] row = lines[i].toString().split(" ");
                model.addRow((Object[])row);
              } 
            } catch (FileNotFoundException fileNotFoundException) {}
          }
        });
    btnAfficher.setBounds(543, 551, 98, 23);
    this.frame.getContentPane().add(btnAfficher, BorderLayout.SOUTH);
    JLabel lblNewLabel = new JLabel("Listes des comptes");
    lblNewLabel.setForeground(new Color(0, 100, 0));
    lblNewLabel.setFont(new Font("Dialog", 1, 30));
    lblNewLabel.setBounds(12, 12, 447, 45);
    this.frame.getContentPane().add(lblNewLabel);
    
    JButton button = new JButton("Afficher");
    frame.getContentPane().add(button, BorderLayout.SOUTH);
  }
}
