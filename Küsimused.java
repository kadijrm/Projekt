
import java.io.FileNotFoundException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Katse extends Application {

	@Override
	public void start(Stage primaryStage) throws FileNotFoundException {
		BorderPane juur = new BorderPane();
	    java.io.File fail = new java.io.File("c:/Users/Kadi/workspace/oop/Projekt2/src/kysimused.txt");
		java.util.Scanner sc = new java.util.Scanner(fail);
		ArrayList<String> küsimused = new ArrayList<String>();
		ArrayList<String> vastused = new ArrayList<String>();
		while (sc.hasNextLine()) {
		    String rida = sc.nextLine();
		    küsimused.add(rida);
		}
		double x = 20.0;
		double y = 20.0;
		for(int i = 0; i < 35; i++){
			VBox vbox = new VBox(5);
			vbox.setPadding(new Insets(x, 50, 50, y));
			Text kysimus = new Text(0, 0, küsimused.get(i));
			juur.getChildren().add(kysimus);

			ToggleGroup grupp = new ToggleGroup();
			RadioButton nupp1 = new RadioButton("1");
			nupp1.setToggleGroup(grupp);
		    RadioButton nupp2 = new RadioButton("2");
		    nupp2.setToggleGroup(grupp);
		    RadioButton nupp3 = new RadioButton("3");
			nupp3.setToggleGroup(grupp);
		    RadioButton nupp4 = new RadioButton("4");
		    nupp4.setToggleGroup(grupp);
			
		    vbox.getChildren().addAll(kysimus, nupp1, nupp2, nupp3, nupp4);
		    juur.getChildren().add(vbox);
			
		    x += 115;
		    
		    
		}
		
		//Button nupp = new Button("Valmis");
		//juur.getChildren().add(nupp);
		Scene stseen = new Scene(juur, 800, 500, Color.WHITE);
	    primaryStage.setTitle("Ülitundlikkuse test");
	    primaryStage.setScene(stseen);
	    primaryStage.show();
	   
	}

	public static void main(String[] args) {
		launch(args);
	}
}

