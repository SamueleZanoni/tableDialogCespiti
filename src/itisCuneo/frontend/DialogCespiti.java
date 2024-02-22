package itisCuneo.frontend;

import javax.swing.*;
import java.awt.*;

public class DialogCespiti extends FrameCespiti {
    
    private FrameCespiti frameCespiti;
    private JTextField txtFieldCodice;
    private JTextField txtFieldQuantita;
    private JTextField txtFieldDataAcquisto;
    private JButton btnOk;
    private JButton btnUndo;

    public DialogCespiti(FrameCespiti frameCespiti) {
        this.frameCespiti = frameCespiti;
        this.setSize(new Dimension(400,600));
        initComponents();
    }

    private void initComponents() {
        this.setLayout(new GridLayout(4,2));
        
        this.add(new JLabel("Codice:"));
        txtFieldCodice = new JTextField(10);
        this.add(txtFieldCodice);

        this.add(new JLabel("Quantità:"));
        txtFieldQuantita = new JTextField(10);
        this.add(txtFieldQuantita);

        this.add(new JLabel("Data Acquisto:"));
        txtFieldDataAcquisto = new JTextField(10);
        this.add(txtFieldDataAcquisto);
        
        btnOk = new JButton("Ok");
        this.add(btnOk);
        
        btnUndo = new JButton("Annulla");
        this.add(btnUndo);
    }
    
    

}
