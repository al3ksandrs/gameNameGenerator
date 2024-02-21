package com.example.gamenamegenerator;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

import java.util.Random;

public class HelloController {
    Names names = new Names();

    String GenerateName(){
        String firstNamePart = names.getNames()[GenerateIndex()];
        String secondNamePart = names.getNames()[GenerateIndex()];

        if(!this.spaceToggle.isSelected()){
            return firstNamePart + secondNamePart.toLowerCase();
        } else return firstNamePart + " " + secondNamePart;
    }

    Integer GenerateIndex(){
        Random random = new Random();

        int index = random.nextInt(this.names.getNames().length);

        return index;
    }

    @FXML
    private Label welcomeText;

    @FXML
    private CheckBox spaceToggle;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onGenerateButtonClick() {
        welcomeText.setText(GenerateName());
    }
}