package mephi.b23902.View;

import mephi.b23902.Model.OrcModel;
import mephi.b23902.Model.Orc.Orc;

import javax.swing.*;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class PanelTreeView extends JPanel {
    private DefaultMutableTreeNode rootNode;
    private DefaultTreeModel treeModel;
    private JTree tree;
    private OrcModel model;
    private Map<String, DefaultMutableTreeNode> raceNodes;
    private TreeSelectionListener selectionListener;

    public PanelTreeView(OrcModel model) {
        this.model = model;
        this.raceNodes = new HashMap<>();

        setLayout(new BorderLayout());

        rootNode = new DefaultMutableTreeNode("Orc Army");
        treeModel = new DefaultTreeModel(rootNode);
        tree = new JTree(treeModel);

        tree.setShowsRootHandles(true);
        tree.setRootVisible(true);

        for (String orcRace : model.getOrcRace()) {
            DefaultMutableTreeNode raceNode = new DefaultMutableTreeNode(orcRace);
            raceNodes.put(orcRace, raceNode);
            rootNode.add(raceNode);
        }

        JScrollPane scrollPane = new JScrollPane(tree);
        add(scrollPane, BorderLayout.CENTER);

        expandAllNodes();
    }

    public void setSelectionListener(TreeSelectionListener listener) {
        if (selectionListener != null) {
            tree.removeTreeSelectionListener(selectionListener);
        }

        selectionListener = listener;
        tree.addTreeSelectionListener(selectionListener);
    }


    public void onOrcAdded(Orc orc) {
        String orcRace = orc.getRace().name();
        DefaultMutableTreeNode raceNode = raceNodes.get(orcRace);

        if (raceNode == null) {
            return;
        }

        DefaultMutableTreeNode orcNode = new DefaultMutableTreeNode(orc);

        treeModel.insertNodeInto(orcNode, raceNode, raceNode.getChildCount());


        TreePath path = new TreePath(orcNode.getPath());
        tree.expandPath(path.getParentPath());
        tree.scrollPathToVisible(path);
        tree.setSelectionPath(path);
        treeModel.reload();
    }


    public void updateTreeStructure(Orc orc) {
        String orcRace = orc.getRace().name();
        DefaultMutableTreeNode raceNode = raceNodes.get(orcRace);
        DefaultMutableTreeNode orcNode = new DefaultMutableTreeNode(orc);
        treeModel.insertNodeInto(orcNode, raceNode , raceNode.getChildCount());

        TreePath path = new TreePath(orcNode.getPath());
        tree.expandPath(path);
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
