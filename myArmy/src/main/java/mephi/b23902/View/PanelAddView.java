package mephi.b23902.View;

import mephi.b23902.Model.Orc.OrcRace;
import mephi.b23902.Model.Orc.OrcType;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PanelAddView extends JPanel {
    private JTextField nameField;
    private JComboBox<String> raceComboBox;
    private JComboBox<String> typeComboBox;
    private JButton addButton;
    private JButton randomButton;

    public PanelAddView() {
        setLayout(new BorderLayout(5, 5));
        setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 5, 5));

        JLabel nameLabel = new JLabel("Orc name:");
        nameField = new JTextField(20);

        String[] type =  new String[OrcType.values().length];
        for (OrcType ot : OrcType.values()) {
            type[ot.ordinal()] = ot.name();
        }
        JLabel typeLabel = new JLabel("Orc Type:");
        typeComboBox = new JComboBox<>( type );
        typeComboBox.setEditable(false);

        String[] race =  new String[OrcRace.values().length];
        for (OrcRace or : OrcRace.values()) {
            race[or.ordinal()] = or.name();
        }
        JLabel raceLabel = new JLabel( "Orc Race:");
        raceComboBox = new JComboBox<>(race);

        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(typeLabel);
        inputPanel.add(typeComboBox);
        inputPanel.add(raceLabel);
        inputPanel.add(raceComboBox);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        addButton = new JButton("New Orc");

        buttonPanel.add(addButton);
        
        add(inputPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public void setAddButtonListener(ActionListener listener) {
        addButton.addActionListener(listener);
    }

    public void setRandomButtonListener(ActionListener listener) {
        randomButton.addActionListener(listener);
    }

    public String getOrcName() {
        return nameField.getText().trim();
    }

    public OrcType getOrcType() {
        return OrcType.valueOf( typeComboBox.getSelectedItem().toString() );
    }

    public OrcRace getOrcRace() {
        return OrcRace.valueOf( raceComboBox.getSelectedItem().toString());
    }

    public void clearInputs() {
        nameField.setText("");
    }
}
