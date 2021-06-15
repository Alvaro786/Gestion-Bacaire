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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import java.awt.Component;
import java.awt.Dimension;

public class Créer {
  private JFrame frame;
  
  private JTextField textnom;
  
  private JTextField textprenom;
  
  private JTextField textdob;
  
  private JTextField textsexe;
  
  private JTextField textadresse;
  
  private JTextField texttype;
  
  private String[] array;
  
  private int i = 0;
  
  private JTextField textid2;
  
  private JTextField texttaux;
  
  private JTextField textid;
  
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
          public void run() {
            try {
              Créer window = new Créer();
              window.frame.setVisible(true);
            } catch (Exception e) {
              e.printStackTrace();
            } 
          }
        });
  }
  
  public Créer() {
    initialize();
  }
  
  private void initialize() {
    this.frame = new JFrame();
    this.frame.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
    this.frame.setBackground(SystemColor.inactiveCaptionBorder);
    this.frame.setBounds(100, 100, 420, 518);
    this.frame.setDefaultCloseOperation(2);
    JPanel panel = new JPanel();
    panel.setBackground(new Color(230, 230, 250));
    panel.setBorder(new LineBorder(new Color(0, 0, 0)));
    this.frame.getContentPane().add(panel, "Center");
    panel.setLayout(new GridLayout(14, 3, 0, 0));
    JPanel panel_2 = new JPanel();
    panel_2.setBackground(new Color(230, 230, 250));
    panel.add(panel_2);
    JLabel lblNewLabel = new JLabel("Créer un compte");
    lblNewLabel.setVerticalAlignment(1);
    lblNewLabel.setForeground(new Color(0, 100, 0));
    lblNewLabel.setFont(new Font("Segoe UI", 1, 20));
    lblNewLabel.setHorizontalAlignment(0);
    panel_2.add(lblNewLabel);
    JPanel panel_3 = new JPanel();
    panel_3.setBackground(new Color(230, 230, 250));
    panel.add(panel_3);
    JPanel panel_14 = new JPanel();
    panel.add(panel_14);
    panel_14.setLayout(new BorderLayout(0, 0));
    JLabel lblNewLabel_3 = new JLabel("Id :");
    lblNewLabel_3.setBackground(new Color(230, 230, 250));
    lblNewLabel_3.setForeground(new Color(0, 0, 0));
    lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
    panel_14.add(lblNewLabel_3, "North");
    this.textid = new JTextField();
    textid.setPreferredSize(new Dimension(50, 100));
    textid.setFont(new Font("Tahoma", Font.PLAIN, 15));
    this.textid.setHorizontalAlignment(2);
    panel_14.add(this.textid, "Center");
    this.textid.setColumns(25);
    JPanel panel_4 = new JPanel();
    panel.add(panel_4);
    panel_4.setLayout(new BorderLayout(0, 0));
    JPanel panel_10 = new JPanel();
    panel_4.add(panel_10, "Center");
    panel_10.setLayout(new BorderLayout(0, 0));
    this.textnom = new JTextField();
    this.textnom.setHorizontalAlignment(2);
    this.textnom.setFont(new Font("Dialog", 0, 15));
    panel_10.add(this.textnom, "Center");
    this.textnom.setColumns(10);
    JLabel lblNom = new JLabel("Nom :                    ");
    lblNom.setBackground(new Color(230, 230, 250));
    lblNom.setFont(new Font("Tahoma", Font.PLAIN, 15));
    panel_10.add(lblNom, "North");
    JPanel panel_5 = new JPanel();
    panel.add(panel_5);
    panel_5.setLayout(new BorderLayout(0, 0));
    this.textprenom = new JTextField();
    this.textprenom.setHorizontalAlignment(2);
    this.textprenom.setFont(new Font("Dialog", 0, 15));
    panel_5.add(this.textprenom, "Center");
    this.textprenom.setColumns(10);
    JLabel lblPrnom = new JLabel("Pr\u00E9nom :             ");
    lblPrnom.setFont(new Font("Tahoma", Font.PLAIN, 15));
    panel_5.add(lblPrnom, "North");
    JPanel panel_6 = new JPanel();
    panel.add(panel_6);
    panel_6.setLayout(new BorderLayout(0, 0));
    this.textdob = new JTextField();
    this.textdob.setFont(new Font("Dialog", 0, 15));
    this.textdob.setHorizontalAlignment(2);
    panel_6.add(this.textdob, "Center");
    this.textdob.setColumns(10);
    JLabel lblDateDeNaissance = new JLabel("Date de naissance (jj-mm-yyyy) :    ");
    lblDateDeNaissance.setFont(new Font("Tahoma", Font.PLAIN, 15));
    panel_6.add(lblDateDeNaissance, "North");
    JPanel panel_7 = new JPanel();
    panel.add(panel_7);
    panel_7.setLayout(new BorderLayout(0, 0));
    this.textsexe = new JTextField();
    this.textsexe.setFont(new Font("Dialog", 0, 15));
    this.textsexe.setHorizontalAlignment(2);
    panel_7.add(this.textsexe, "Center");
    this.textsexe.setColumns(10);
    JLabel label_3 = new JLabel("Sexe :                            ");
    label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
    panel_7.add(label_3, "North");
    JPanel panel_8 = new JPanel();
    panel.add(panel_8);
    panel_8.setLayout(new BorderLayout(0, 0));
    this.textadresse = new JTextField();
    this.textadresse.setFont(new Font("Dialog", 0, 15));
    this.textadresse.setHorizontalAlignment(2);
    panel_8.add(this.textadresse, "Center");
    this.textadresse.setColumns(10);
    JLabel label_4 = new JLabel("Adresse :                       ");
    label_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
    panel_8.add(label_4, "North");
    JPanel panel_1 = new JPanel();
    panel.add(panel_1);
    panel_1.setLayout(new BorderLayout(0, 0));
    this.texttype = new JTextField();
    this.texttype.setFont(new Font("Dialog", 0, 15));
    this.texttype.setHorizontalAlignment(2);
    panel_1.add(this.texttype, "Center");
    this.texttype.setColumns(10);
    JLabel label_6 = new JLabel("Type de compte  :        ");
    label_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
    panel_1.add(label_6, "North");
    JPanel panel_12 = new JPanel();
    panel.add(panel_12);
    panel_12.setLayout(new BorderLayout(0, 0));
    JLabel lblNewLabel_1 = new JLabel("Id du compte joint :");
    lblNewLabel_1.setBackground(new Color(230, 230, 250));
    lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
    panel_12.add(lblNewLabel_1, "North");
    this.textid2 = new JTextField();
    panel_12.add(this.textid2, "Center");
    this.textid2.setColumns(10);
    JPanel panel_9 = new JPanel();
    panel.add(panel_9);
    panel_9.setLayout(new BorderLayout(0, 0));
    JLabel lblNewLabel_2 = new JLabel("taux en % (si compte épargne) : ");
    lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
    panel_9.add(lblNewLabel_2, "North");
    this.texttaux = new JTextField();
    this.texttaux.setHorizontalAlignment(2);
    panel_9.add(this.texttaux, "Center");
    this.texttaux.setColumns(10);
    JPanel panel_11 = new JPanel();
    panel_11.setBackground(new Color(230, 230, 250));
    panel.add(panel_11);
    JPanel panel_13 = new JPanel();
    panel_13.setBackground(new Color(230, 230, 250));
    panel.add(panel_13);
    JButton btnreset = new JButton("Reinitialiser");
    btnreset.setFont(new Font("Dialog", 1, 11));
    btnreset.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Créer.this.textnom.setText("");
            Créer.this.textprenom.setText("");
            Créer.this.textdob.setText("");
            Créer.this.textsexe.setText("");
            Créer.this.texttype.setText("");
            Créer.this.textadresse.setText("");
          }
        });
    JButton btnannuler = new JButton("Annuler");
    btnannuler.setFont(new Font("Dialog", 1, 11));
    btnannuler.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Créer.this.frame.setVisible(false);
            Banque.main(null);
          }
        });
    panel_13.add(btnannuler);
    panel_13.add(btnreset);
    JButton btncréer = new JButton("Créer");
    btncréer.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            String compte = Créer.this.texttype.getText().toUpperCase();
            try {
              CompteJoint joint;
              FileWriter fileWritterjoint;
              BufferedWriter bwjoint;
              CompteCourant courant;
              FileWriter fileWrittercourant;
              BufferedWriter bwcourant;
              CompteEpargne epargne;
              FileWriter fileWritterepargne;
              BufferedWriter bwepargne;
              File banque = new File("banque.dat");
              if (!banque.exists())
                banque.createNewFile(); 
              String str;
              switch ((str = compte).hashCode()) {
                case -833880926:
                  if (!str.equals("EPARGNE"))
                    break; 
                  epargne = new CompteEpargne();
                  Créer.this.array = epargne.creerCompte(Créer.this.textid.getText(), Créer.this.textnom.getText(), Créer.this.textprenom.getText(), 
                      Créer.this.textdob.getText(), Créer.this.textsexe.getText(), Créer.this.textadresse.getText(), Créer.this.texttype.getText(), Créer.this.texttaux.getText(), "0");
                  fileWritterepargne = new FileWriter(banque.getName(), true);
                  bwepargne = new BufferedWriter(fileWritterepargne);
                  Créer.this.i = 0;
                  for (; Créer.this.i < Créer.this.array.length; Créer.this.i = Créer.this.i + 1)
                    bwepargne.write(Créer.this.array[Créer.this.i]); 
                  bwepargne.close();
                  JOptionPane.showMessageDialog(Créer.this.frame, "Utilisateur crée");
                  Créer.this.frame.setVisible(false);
                  Banque.main(null);
                  return;
                case 70766698:
                  if (!str.equals("JOINT"))
                    break; 
                  joint = new CompteJoint();
                  Créer.this.array = joint.creerCompte(Créer.this.textid.getText(), Créer.this.textnom.getText(), Créer.this.textprenom.getText(), Créer.this.textdob.getText(), Créer.this.textsexe.getText(), Créer.this.textadresse.getText(), Créer.this.texttype.getText(), Créer.this.textid2.getText(), "0");
                  fileWritterjoint = new FileWriter(banque.getName(), true);
                  bwjoint = new BufferedWriter(fileWritterjoint);
                  Créer.this.i = 0;
                  for (; Créer.this.i < Créer.this.array.length; Créer.this.i = Créer.this.i + 1)
                    bwjoint.write(Créer.this.array[Créer.this.i]); 
                  bwjoint.close();
                  JOptionPane.showMessageDialog(Créer.this.frame, "Utilisateur crée");
                  Créer.this.frame.setVisible(false);
                  Banque.main(null);
                  return;
                case 1675914526:
                  if (!str.equals("COURANT"))
                    break; 
                  courant = new CompteCourant();
                  Créer.this.array = courant.creerCompte(Créer.this.textid.getText(), Créer.this.textnom.getText(), Créer.this.textprenom.getText(), Créer.this.textdob.getText(), Créer.this.textsexe.getText(), Créer.this.textadresse.getText(), Créer.this.texttype.getText(), "0");
                  fileWrittercourant = new FileWriter(banque.getName(), true);
                  bwcourant = new BufferedWriter(fileWrittercourant);
                  Créer.this.i = 0;
                  for (; Créer.this.i < Créer.this.array.length; Créer.this.i = Créer.this.i + 1)
                    bwcourant.write(Créer.this.array[Créer.this.i]); 
                  bwcourant.close();
                  JOptionPane.showMessageDialog(Créer.this.frame, "Utilisateur crée");
                  Créer.this.frame.setVisible(false);
                  Banque.main(null);
                  return;
              } 
              JOptionPane.showMessageDialog(Créer.this.frame, "Erreur type de compte incorrect");
            } catch (IOException e1) {
              e1.printStackTrace();
            } 
          }
        });
    btncréer.setFont(new Font("Dialog", 1, 11));
    panel_13.add(btncréer);
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
            Créer.this.frame.setVisible(false);
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
            Créer.this.frame = new JFrame("quitter");
            if (JOptionPane.showConfirmDialog(Créer.this.frame, "Voulez-vous réelement quitter l'appli Banque?", "IE Bank", 
                0) == 0)
              System.exit(1); 
          }
        });
    mnNewMenu_1.add(Quitter);
    JMenu mnNewMenu_2 = new JMenu("Afficher");
    mnNewMenu_2.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_2.setBackground(SystemColor.inactiveCaptionBorder);
    menuBar.add(mnNewMenu_2);
    JMenuItem AffichertToutCompte = new JMenuItem("Tous les comptes");
    AffichertToutCompte.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Créer.this.frame.setVisible(false);
            Affichertout.main(null);
          }
        });
    AffichertToutCompte.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_2.add(AffichertToutCompte);
    JSeparator separator_2 = new JSeparator();
    mnNewMenu_2.add(separator_2);
    JMenuItem AfficherTypeCompte = new JMenuItem("Un type de compte / un compte spécifique");
    AfficherTypeCompte.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Créer.this.frame.setVisible(false);
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
            Créer.this.frame.setVisible(false);
            Delete.main(null);
          }
        });
    SupprimerCompte.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_3.add(SupprimerCompte);
  }
}
