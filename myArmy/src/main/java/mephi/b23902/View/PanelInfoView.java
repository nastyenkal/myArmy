package mephi.b23902.View;

import mephi.b23902.Model.Orc.Orc;
import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class PanelInfoView extends JPanel {
    private JLabel nameLabel;
    private JLabel typeLabel;
    private JLabel raceLabel;
    private JLabel weaponLabel;
    private JLabel bannerNameLabel; 
    private JCheckBox armorCheckBox;
    private JCheckBox bannerCheckBox;
    private Map<String, JProgressBar> attributeBars;

    public PanelInfoView() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        titlePanel.add(new JLabel("Orc Info"));
        add(titlePanel);
        add(Box.createVerticalStrut(15));

        nameLabel = new JLabel("Имя: ");
        typeLabel = new JLabel("Тип: ");
        raceLabel = new JLabel("Племя: ");
        weaponLabel = new JLabel("Оружие: ");

        bannerNameLabel = new JLabel("Знамя: -");
        
        armorCheckBox = new JCheckBox("Has Armor");
        armorCheckBox.setEnabled(false);
        
        bannerCheckBox = new JCheckBox("Has Banner");
        bannerCheckBox.setEnabled(false);

        add(nameLabel);
        add(Box.createVerticalStrut(5));
        add(typeLabel);
        add(Box.createVerticalStrut(5));
        add(raceLabel);
        add(Box.createVerticalStrut(5));
        add(weaponLabel);
        add(Box.createVerticalStrut(10));
        add(bannerNameLabel); 
        add(Box.createVerticalStrut(5));
        add(armorCheckBox);
        add(Box.createVerticalStrut(5));
        add(bannerCheckBox);
        add(Box.createVerticalStrut(20));

        JPanel statsPanel = new JPanel(new GridLayout(0, 2, 10, 10));
        statsPanel.setBorder(BorderFactory.createTitledBorder("Характеристики"));

        attributeBars = new HashMap<>();
        String[] attributes = {"Сила", "Ловкость", "Интеллект", "Здоровье"};

        for (String attribute : attributes) {
            statsPanel.add(new JLabel(attribute));
            JProgressBar bar = new JProgressBar(0, 100);
            bar.setStringPainted(true);
            attributeBars.put(attribute, bar);
            statsPanel.add(bar);
        }

        add(statsPanel);
    }

    public void displayCharacter(Orc orc) {
        if (orc == null) {
            clearInfo();
            return;
        }

        nameLabel.setText("Имя: " + orc.getName());
        typeLabel.setText("Тип: " + orc.getType());
        raceLabel.setText("Племя: " + orc.getRace());
        weaponLabel.setText("Оружие: " + orc.getWeapon());

        if (orc.hasBanner()) {
            bannerNameLabel.setText("Знамя: " + orc.getBanner().toString());
        } else {
            bannerNameLabel.setText("Знамя: -");
        }

        armorCheckBox.setSelected(orc.hasArmor());
        bannerCheckBox.setSelected(orc.hasBanner());

        attributeBars.get("Сила").setValue(orc.getPower());
        attributeBars.get("Ловкость").setValue(orc.getAgility());
        attributeBars.get("Интеллект").setValue(orc.getIntelligence());
        attributeBars.get("Здоровье").setValue(orc.getHealth());
    }

    private void clearInfo() {
        nameLabel.setText("Имя: ");
        typeLabel.setText("Тип: ");
        raceLabel.setText("Племя: ");
        weaponLabel.setText("Оружие: ");
        bannerNameLabel.setText("Знамя: -");
        armorCheckBox.setSelected(false);
        bannerCheckBox.setSelected(false);
        attributeBars.values().forEach(bar -> bar.setValue(0));
    }
}