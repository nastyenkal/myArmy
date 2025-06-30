package mephi.b23902.View;

import mephi.b23902.Controller.OrcController;
import mephi.b23902.Model.OrcModel;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private OrcModel model;
    private OrcController controller;
    private PanelTreeView treeView;
    private PanelInfoView infoView;
    private PanelAddView addView;

    public MainWindow() {
        super("Orc Army ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        model = new OrcModel();

        treeView = new PanelTreeView(model);
        infoView = new PanelInfoView();
        addView = new PanelAddView();

        controller = new OrcController(model, addView, treeView, infoView);

        JSplitPane mainSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, treeView, infoView);
        mainSplitPane.setDividerLocation(350);

        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.add(addView, BorderLayout.NORTH);
        mainPanel.add(mainSplitPane, BorderLayout.CENTER);
        setContentPane(mainPanel);

    }
}
