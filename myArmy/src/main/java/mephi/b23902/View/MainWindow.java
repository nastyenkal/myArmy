package org.example.View;

import org.example.Controller.OrcController;
import org.example.Model.OrcModel;

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

        // Инициализируем модель
        model = new OrcModel();

        // Инициализируем представления
        treeView = new PanelTreeView(model);
        infoView = new PanelInfoView();
        addView = new PanelAddView();

        // Инициализируем контроллер
        controller = new OrcController(model, addView, treeView, infoView);

        // Собираем все панели
        JSplitPane mainSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, treeView, infoView);
        mainSplitPane.setDividerLocation(350);

        // Создаем основную панель и добавляем на нее компоненты
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.add(addView, BorderLayout.NORTH);
        mainPanel.add(mainSplitPane, BorderLayout.CENTER);
        setContentPane(mainPanel);

    }
}
