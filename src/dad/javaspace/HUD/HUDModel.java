package dad.javaspace.HUD;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class HUDModel {
	private DoubleProperty speed;
	private DoubleProperty shield;
	private DoubleProperty hp;
	private StringProperty nombreJugador;

	public HUDModel() {
		speed = new SimpleDoubleProperty(this, "speed", 0.0);
		shield = new SimpleDoubleProperty(this, "shield", 1.0);
		hp = new SimpleDoubleProperty(this, "hp", 1.0);
		nombreJugador = new SimpleStringProperty(this, "nombreJugador");
	}

	public final DoubleProperty speedProperty() {
		return this.speed;
	}

	public final double getSpeed() {
		return this.speedProperty().get();
	}

	public final void setSpeed(final double speed) {
		this.speedProperty().set(speed);
	}

	public final DoubleProperty shieldProperty() {
		return this.shield;
	}

	public final double getShield() {
		return this.shieldProperty().get();
	}

	public final void setShield(final double shield) {
		this.shieldProperty().set(shield);
	}

	public final DoubleProperty hpProperty() {
		return this.hp;
	}

	public final double getHp() {
		return this.hpProperty().get();
	}

	public final void setHp(final double hp) {
		this.hpProperty().set(hp);
	}

	public final StringProperty nombreJugadorProperty() {
		return this.nombreJugador;
	}

	public final String getNombreJugador() {
		return this.nombreJugadorProperty().get();
	}

	public final void setNombreJugador(final String nombreJugador) {
		this.nombreJugadorProperty().set(nombreJugador);
	}


}
