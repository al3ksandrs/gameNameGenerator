package com.example.gamenamegenerator;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

import java.util.Random;

public class HelloController {
    private String[] names = {
            "Alpha", "Beta", "Gamma", "Delta", "Echo", "Nova", "Zenith", "Spectra", "Vortex", "Nebula",
            "Chrono", "Pulse", "Quasar", "Infinity", "Apex", "Aurora", "Blaze", "Crimson", "Dynamo",
            "Eclipse", "Flare", "Galaxy", "Horizon", "Ignite", "Jupiter", "Lunar", "Meteor", "Nimbus",
            "Orbit", "Photon", "Radiant", "Solar", "Terra", "Velocity", "Zephyr", "Aether", "Celestial",
            "Elemental", "Fusion", "Gravity", "Hydra", "Luminous", "Matrix", "Nucleus", "Omega", "Paragon",
            "Quanta", "Ragnarok", "Seraph", "Trinity", "Vortex", "Warp", "Xenon", "Yonder", "Zodiac",
            "Echo", "Falcon", "Genesis", "Harmony", "Inferno", "Jade", "Kaleidoscope", "Labyrinth",
            "Mirage", "Nemesis", "Oblivion", "Phoenix", "Quantum", "Radiance", "Serenity", "Thunder",
            "Umbra", "Vivid", "Whisper", "Xanadu", "Yggdrasil", "Zen", "Abyss", "Bliss", "Cascade",
            "Destiny", "Empyrean", "Fable", "Glimmer", "Halcyon", "Illusion", "Jubilee", "Kismet",
            "Lagoon", "Mystic", "Noble", "Opal", "Pandemonium", "Quest", "Rhapsody", "Silhouette",
            "Tempest", "Utopia", "Vortex", "Whimsy", "Xylophone", "Yonder", "Zeal", "Allegro",
            "Blossom", "Crescendo", "Dawn", "Ethereal", "Fantasia", "Glacier", "Harmony", "Infinity",
            "Journey", "Kaleidoscope", "Labyrinth", "Melody", "Nimbus", "Oasis", "Paradise", "Quest",
            "Radiant", "Serenade", "Tranquility", "Utopia", "Voyage", "Wanderlust", "Xanadu", "Yonder",
            "Zephyr", "Astral", "Breeze", "Crystal", "Dusk", "Enigma", "Fable", "Glow", "Harmony",
            "Illumination", "Jubilee", "Kismet", "Lagoon", "Mystery", "Noble", "Orchid", "Petal",
            "Quintessence", "Rapture", "Serenade", "Twilight", "Unity", "Vibrant", "Whisper", "Xenon",
            "Yonder", "Zest", "Aurora", "Blossom", "Crescendo", "Dawn", "Ethereal", "Fantasia", "Glacier",
            "Harmony", "Infinity", "Journey", "Kaleidoscope", "Labyrinth", "Melody", "Nimbus", "Oasis",
            "Paradise", "Quest", "Radiant", "Serenade", "Tranquility", "Utopia", "Voyage", "Wanderlust",
            "Xanadu", "Yonder", "Zephyr", "Odyssey", "Legends", "Chronicles", "Venture", "Quest", "Adventures",
            "Journey", "Saga", "Explorers", "Heroes", "Realm", "World", "Quests", "Tales", "Sagas", "Voyage",
            "Expedition", "Mysteries", "Conquest", "Discovery", "Voyages", "Destiny", "Fables", "Fate",
            "Prophecy", "Dreams", "Lore", "Epic", "Discovery", "Adventure", "Legend", "Mythos", "Legacy",
            "Empire", "Frontier", "Mystic", "Trek", "Secrets", "Fantasy", "Rise", "Kingdoms", "Chaos",
            "Genesis", "Ascension", "Revelation", "Horizon", "Apocalypse", "Era", "Age", "Inception",
            "Epoch", "Genesis", "Inferno", "Journey", "Kismet", "Labyrinth", "Metropolis", "Nebula",
            "Oblivion", "Paragon", "Quest", "Renaissance", "Saga", "Tales", "Utopia", "Vanguard",
            "Voyage", "Wonders", "Zenith", "Abyss", "Brilliance", "Cascade", "Destiny", "Enigma",
            "Fable", "Genesis", "Harmony", "Infinity", "Journey", "Kaleidoscope", "Labyrinth", "Melody",
            "Nimbus", "Oasis", "Paradise", "Quest", "Radiant", "Serenade", "Tranquility", "Utopia",
            "Voyage", "Wanderlust", "Xanadu", "Yonder", "Zephyr", "Astral", "Breeze", "Crystal", "Dusk",
            "Enigma", "Fable", "Glow", "Harmony", "Illumination", "Jubilee", "Kismet", "Lagoon", "Mystery",
            "Noble", "Orchid", "Petal", "Quintessence", "Rapture", "Serenade", "Twilight", "Unity", "Vibrant",
            "Whisper", "Xenon", "Yonder", "Zest", "Aurora", "Blossom", "Crescendo", "Dawn", "Ethereal",
            "Fantasia", "Glacier", "Harmony", "Infinity", "Journey", "Kaleidoscope", "Labyrinth", "Melody",
            "Nimbus", "Oasis", "Paradise", "Quest", "Radiant", "Serenade", "Tranquility", "Utopia", "Voyage",
            "Wanderlust", "Xanadu", "Yonder", "Zephyr"
    };

    String GenerateName(){
        String firstNamePart = this.names[GenerateIndex()];
        String secondNamePart = this.names[GenerateIndex()];

        if(!this.spaceToggle.isSelected()){
            return firstNamePart + secondNamePart;
        } else return firstNamePart + " " + secondNamePart;
    }

    Integer GenerateIndex(){
        Random random = new Random();

        int index = random.nextInt(this.names.length);

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