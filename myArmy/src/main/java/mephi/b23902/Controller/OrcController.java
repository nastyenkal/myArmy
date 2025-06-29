package mephi.b23902.Controller;

import mephi.b23902.View.PanelAddView;
import mephi.b23902.View.PanelInfoView;
import mephi.b23902.View.PanelTreeView;
import mephi.b23902.Model.OrcModel;
import mephi.b23902.Model.Orc.Orc;
import mephi.b23902.Model.Orc.OrcRace;
import mephi.b23902.Model.Orc.OrcType;
import mephi.b23902.Model.OrcFactory.OrcDirector;


import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrcController {
    private OrcModel model;
    private PanelAddView addView;
    private PanelTreeView treeView;
    private PanelInfoView infoView;

    public OrcController(OrcModel model, PanelAddView addView, PanelTreeView treeView, PanelInfoView infoView) {
        this.model = model;
        this.addView = addView;
        this.treeView = treeView;
        this.infoView = infoView;
        setupListeners();
    }

    private void addNewOrc() {
        String name = addView.getOrcName();
        OrcType type = addView.getOrcType();
        OrcRace race = addView.getOrcRace();

        OrcDirector orcDirector = new OrcDirector( race );
        Orc orc = null;
        switch (type) {
            case BASIC:
                orc = orcDirector.createBasicOrc( name);
                break;
            case SCOUTE:
                orc = orcDirector.createScoutOrc( name );
                break;
            case LEADER:
                orc = orcDirector.createLeaderOrc(name);
                break;
            default:
                System.out.println("Не известный тип орка");
        }
        model.addOrc(orc);
        treeView.updateTreeStructure(orc);
        addView.clearInputs();
    }

    private void setupListeners() {

        addView.setAddButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNewOrc();
            }
        });

        treeView.setSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                Orc selectedOrc = treeView.getSelectedOrc();
                infoView.displayCharacter(selectedOrc);
            }
        });
    }
}
