package dad.javaspace.HUD;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.util.Duration;
import javafx.util.converter.NumberStringConverter;

public class JavaSpaceHUD extends HBox implements Initializable {

	// Vista
	@FXML
	private HBox rootView;

	@FXML
	private StackPane stackRoot;

	@FXML
	private Circle circleRoot;

	@FXML
	private Label speedLabel;

	@FXML
	private VBox vBoxRoot;

	@FXML
	private ProgressBar shieldBar;

	@FXML
	private ProgressBar hpBar;
	
	@FXML
	private Label nombreJugador;
	
	@FXML
	private ProgressIndicator thrustIndicator;
	
	// Animación barras de vida
	private Timeline task;
	
	// Modelo
	private HUDModel model = new HUDModel();

	public JavaSpaceHUD() {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/dad/javaspace/HUD/HUDView.fxml"));
		loader.setController(this);
		loader.setRoot(this);
		try {
			loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		/************************************************************
		 * 
		 * Bindings
		 *
		 ************************************************************/
		getStylesheets().add("/dad/javaspace/HUD/hud.css");
		
		hpBar.progressProperty().bind(model.hpProperty());
		shieldBar.progressProperty().bind(model.shieldProperty());
		Bindings.bindBidirectional(speedLabel.textProperty(), model.speedProperty(), new NumberStringConverter());
		nombreJugador.textProperty().bind(model.nombreJugadorProperty());
		thrustIndicator.progressProperty().bind(model.thrustProperty());
			
	}

	public HUDModel getModel() {
		return model;
	}
	
	public void epezarAnimacion() {
		task.playFromStart();
	}
}
