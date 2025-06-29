package org.example.View;

import org.example.Model.OrcModel;
import org.example.Model.Orc.Orc;

import javax.swing.*;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Представление для дерева персонажей - View в паттерне MVC
 */
public class PanelTreeView extends JPanel /*implements CharacterModel.ModelObserver*/ {
    private DefaultMutableTreeNode rootNode;
    private DefaultTreeModel treeModel;
    private JTree tree;
    private OrcModel model;
    private Map<String, DefaultMutableTreeNode> raceNodes;
    private TreeSelectionListener selectionListener;

    public PanelTreeView(OrcModel model) {
        this.model = model;
        //this.model.addObserver(this);
        this.raceNodes = new HashMap<>();

        setLayout(new BorderLayout());

        // Создаем корневой узел и дерево
        rootNode = new DefaultMutableTreeNode("Orc Army");
        treeModel = new DefaultTreeModel(rootNode);
        tree = new JTree(treeModel);

        // Настраиваем дерево
        tree.setShowsRootHandles(true);
        tree.setRootVisible(true);

        // Инициализируем узлы для существующих классов
        for (String orcRace : model.getOrcRace()) {
            DefaultMutableTreeNode raceNode = new DefaultMutableTreeNode(orcRace);
            raceNodes.put(orcRace, raceNode);
            rootNode.add(raceNode);
        }

        // Добавляем дерево в панель с прокруткой
        JScrollPane scrollPane = new JScrollPane(tree);
        add(scrollPane, BorderLayout.CENTER);

        // Раскрываем все узлы
        expandAllNodes();
    }

    public void setSelectionListener(TreeSelectionListener listener) {
        // Удаляем предыдущего слушателя, если он был
        if (selectionListener != null) {
            tree.removeTreeSelectionListener(selectionListener);
        }

        // Устанавливаем нового слушателя
        selectionListener = listener;
        tree.addTreeSelectionListener(selectionListener);
    }


    public void onOrcAdded(Orc orc) {
        String orcRace = orc.getRace().name();
        DefaultMutableTreeNode raceNode = raceNodes.get(orcRace);

        // Если для такого класса нет узла (теоретически не должно происходить без динамического добавления)
        if (raceNode == null) {
            return;
        }

        // Создаем узел для персонажа
        DefaultMutableTreeNode orcNode = new DefaultMutableTreeNode(orc);

        // Добавляем персонажа в узел класса
        treeModel.insertNodeInto(orcNode, raceNode, raceNode.getChildCount());


        // Раскрываем путь и прокручиваем к новому узлу
        TreePath path = new TreePath(orcNode.getPath());
        tree.expandPath(path.getParentPath());
        tree.scrollPathToVisible(path);
        tree.setSelectionPath(path);
        treeModel.reload();
    }


    public void updateTreeStructure(Orc orc) {
        String orcRace = orc.getRace().name();
        DefaultMutableTreeNode raceNode = raceNodes.get(orcRace);
        // Добавление нового персонажа
        DefaultMutableTreeNode orcNode = new DefaultMutableTreeNode(orc);
        treeModel.insertNodeInto(orcNode, raceNode , raceNode.getChildCount());

        // Разворачиваем узел типа
        TreePath path = new TreePath(orcNode.getPath());
        tree.expandPath(path);
        //tree.scrollPathToVisible(path);
        //tree.setSelectionPath(path);
        //treeModel.reload();
    }







    public Orc getSelectedOrc() {
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
        if (node != null && node.getUserObject() instanceof Orc) {
            return (Orc) node.getUserObject();
        }
        return null;
    }

    private void expandAllNodes() {
        for (int i = 0; i < tree.getRowCount(); i++) {
            tree.expandRow(i);
        }
    }
}
