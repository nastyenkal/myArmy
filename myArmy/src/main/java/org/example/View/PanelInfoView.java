package org.example.View;

import org.example.Model.Orc.Orc;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Представление для информации о персонаже - View в паттерне MVC
 */
public class PanelInfoView extends JPanel {
    private JLabel nameLabel;
    private JLabel typeLabel;
    private JLabel raceLabel;
    private JLabel weaponLabel;
    private JLabel armorLabel;
    private JLabel bannerLabel;

    private JCheckBox hornCheckBox;
    private JCheckBox bannerCheckBox;
    private Map<String, JProgressBar> attributeBars;

    public PanelInfoView() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Заголовок
        JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        titlePanel.add(new JLabel("Orc Info"));
        add(titlePanel);
        add(Box.createVerticalStrut(15));

        // Основная информация
        nameLabel = new JLabel("Name: ");
        typeLabel = new JLabel("Type: ");
        raceLabel = new JLabel("Race: ");
        weaponLabel = new JLabel("Weapon: ");
        armorLabel = new JLabel("Armor: ");
        bannerLabel = new JLabel("Banner: ");


        hornCheckBox = new JCheckBox("Has Horn ");
        hornCheckBox.setEnabled(false);
        bannerCheckBox = new JCheckBox("Has Banner ");
        bannerCheckBox.setEnabled(false);

        add(nameLabel);
        add(Box.createVerticalStrut(5));
        add(typeLabel);
        add(Box.createVerticalStrut(5));
        add(raceLabel);
        add(Box.createVerticalStrut(5));
        add(weaponLabel);
        add(Box.createVerticalStrut(5));
        add(armorLabel);
        add(Box.createVerticalStrut(5));
        add(bannerLabel);
        add(Box.createVerticalStrut(5));
        add(hornCheckBox);
        add(Box.createVerticalStrut(5));
        add(bannerCheckBox);
        add(Box.createVerticalStrut(20));

        // Панель для характеристик
        JPanel statsPanel = new JPanel(new GridLayout(0, 2, 10, 10));
        statsPanel.setBorder(BorderFactory.createTitledBorder("Characteristics"));

        attributeBars = new HashMap<>();
        String[] attributes = {"power", "agility", "intelligence", "health"};

        for (String attribute : attributes) {
            statsPanel.add(new JLabel(attribute + ":"));
            JProgressBar bar = createAttributeBar();
            attributeBars.put(attribute, bar);
            statsPanel.add(bar);
        }

        add(statsPanel);

        // Добавляем пустое пространство для заполнения
        add(Box.createVerticalGlue());

        // По умолчанию информационная панель не показывает информацию
        //clearCharacterInfo();
    }

    private JProgressBar createAttributeBar() {
        JProgressBar bar = new JProgressBar(0, 100);
        bar.setStringPainted(true);
        return bar;
    }

    public void displayCharacter(Orc orc) {
        if (orc == null) {
            //clearOrcInfo();
            return;
        }

        nameLabel.setText("Имя : " + orc.getName());
        typeLabel.setText("Тип : " + orc.getType().getTypeName());
        raceLabel.setText("Племя : " + orc.getRace().getRaceName());
        weaponLabel.setText("Оружие : " + orc.getWeapon());
        armorLabel.setText("Броня : " + orc.getArmor());
        bannerLabel.setText("Флаг : " + orc.getBanner());

        if(orc.isHasHorn()) {
            hornCheckBox.setSelected(true);
        } else {
            hornCheckBox.setSelected(false);
        }
        if(orc.isHasBanner()) {
            bannerCheckBox.setSelected(true);
        } else {
            bannerCheckBox.setSelected(false);
        }

        // Обновляем все атрибуты
        for (Map.Entry<String, JProgressBar> entry : attributeBars.entrySet()) {
            String attribute = entry.getKey();
            JProgressBar bar = entry.getValue();
            switch (attribute) {
                case "power":
                    bar.setValue(orc.getPower());
                    bar.setString(orc.getPower() + "/100");
                    break;
                case "agility":
                    bar.setValue(orc.getAgility());
                    bar.setString(orc.getAgility() + "/100");
                    break;
                case "intelligence":
                    bar.setValue(orc.getIntelligence());
                    bar.setString(orc.getIntelligence() + "/50");
                    break;
                case "health":
                    bar.setValue(orc.getHealth());
                    bar.setString(orc.getHealth() + "/200");
                    break;
                default:
                    break;
            }


        }
    }

    public void clearOrcInfo() {
        nameLabel.setText("Name : ");
        typeLabel.setText("Type : ");
        raceLabel.setText("Race : ");
        weaponLabel.setText("Weapon : ");
        armorLabel.setText("Armor : ");
        bannerLabel.setText("Banner : ");
        hornCheckBox.setSelected(false);
        bannerCheckBox.setSelected(false);

        for (JProgressBar bar : attributeBars.values()) {
            bar.setValue(0);
            bar.setString("0/20");
        }
    }
}
