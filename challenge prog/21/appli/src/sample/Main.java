package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        CompteCourant Compte = new CompteCourant("Ju",100);

        primaryStage.setTitle("Banque");
        primaryStage.setResizable(false);


        VBox box = new VBox(10);
        box.setAlignment(Pos.CENTER);

        Label soldeTxt = new Label();
        soldeTxt.setFont(new Font(34));
        soldeTxt.setText("solde : " + Compte.getSolde() + " €");

        Button deposerBtn = new Button();
        deposerBtn.setText("Déposer 100 €");
        deposerBtn.setOnAction(e -> {
            Compte.deposerArgent(100);
            soldeTxt.setText("solde : " + Compte.getSolde() + " €");
        });

        Button retirerBtn = new Button();
        retirerBtn.setText("Retirer 100 €");
        retirerBtn.setOnAction(e -> {
            Compte.retirerArgent(100);
            soldeTxt.setText("solde : " + Compte.getSolde() + " €");
        });

        box.getChildren().add(soldeTxt);
        box.getChildren().add(deposerBtn);
        box.getChildren().add(retirerBtn);

        primaryStage.setScene(new Scene(box, 300, 275));

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
