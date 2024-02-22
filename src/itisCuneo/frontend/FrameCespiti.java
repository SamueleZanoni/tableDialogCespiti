package itisCuneo.frontend;

import itisCuneo.backend.CespitiFile;
import itisCuneo.backend.ElencoCespiti;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameCespiti extends JFrame implements ActionListener {

    private final ElencoCespiti elencoCespiti;
    private JButton btnNuovo;
    private DefaultTableModel dtnCespiti;
    private JTable tableCespiti;
    private DefaultTableModel tableModel;
    private JTable table;
    private JMenuItem menuItemCsv;
    private JMenuItem menuItemJson;

    public FrameCespiti() throws HeadlessException {

        elencoCespiti = new ElencoCespiti();
        initComponents();
    }



    private void initComponents() {
        String[] aHeaderTableCespiti = {"codice", "quantità", "data acquisto"};
        dtnCespiti = new DefaultTableModel(aHeaderTableCespiti,0);
        tableCespiti = new JTable(dtnCespiti);

        this.setLayout(new BorderLayout());

        JPanel panelTable = new JPanel();
        JPanel panelCmd = new JPanel();
        panelCmd.add(btnNuovo);
        this.add(panelTable, BorderLayout.CENTER);
        this.add(panelCmd, BorderLayout.EAST );
        btnNuovo.addActionListener(this);

        String[] columnNames = {"Codice", "Quantità", "Data Acquisto"};
        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);


        JButton aggiornaButton = new JButton("Aggiorna");

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(aggiornaButton);
        add(buttonPanel, BorderLayout.SOUTH);

       /* JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem exportCSVItem = new JMenuItem("Esporta CSV");
        JMenuItem exportJSONItem = new JMenuItem("Esporta JSON");

        fileMenu.add(exportCSVItem);
        fileMenu.add(exportJSONItem);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);*/

        JMenuBar menuBar= new JMenuBar();
        menuBar = initMenu();
        this.setJMenuBar(menuBar);


    }

    private JMenuBar initMenu() {

        JMenuBar menuBar = new JMenuBar();

        JMenu menuFile = new JMenu("File");
        menuBar.add(menuFile);

        menuItemJson = new JMenuItem("Esporta Json");
        menuFile.add(menuItemJson);

        menuItemCsv = new JMenuItem("Esporta CSV");
        menuFile.add(menuItemCsv);


        return menuBar;
    }

    public ElencoCespiti getElencoCespiti() {
        return elencoCespiti;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnNuovo){

            new DialogCespiti(this).setVisible(true);

        }
        if(e.getSource() == menuItemCsv){

            CespitiFile cespitiFile = new CespitiFile();
            cespitiFile.scriviCsv(this.elencoCespiti);

        }if(e.getSource()== menuItemJson){

        }
    }

    public static void main(String[] args) {

        FrameCespiti frameCespiti;
        frameCespiti = new FrameCespiti();
        frameCespiti.setVisible(true);

    }


}
