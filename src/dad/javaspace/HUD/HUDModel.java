package dad.javaspace.HUD;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class HUDModel {
	private IntegerProperty speed;
	private DoubleProperty thrust;
	private DoubleProperty shield;
	private DoubleProperty hp;
	private DoubleProperty regenerador;
	private StringProperty nombreJugador;

	public HUDModel() {
		speed = new SimpleIntegerProperty(this, "speed", 0);
		thrust = new SimpleDoubleProperty(this, "thrust", 0.0);
		shield = new SimpleDoubleProperty(this, "shield", 1.0);
		hp = new SimpleDoubleProperty(this, "hp", 1.0);
		regenerador = new SimpleDoubleProperty(this, "regenerador", 0.0);
		nombreJugador = new SimpleStringProperty(this, "nombreJugador");
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

	public final IntegerProperty speedProperty() {
		return this.speed;
	}

	public final int getSpeed() {
		return this.speedProperty().get();
	}

	public final void setSpeed(final int speed) {
		this.speedProperty().set(speed);
	}

	public final DoubleProperty thrustProperty() {
		return this.thrust;
	}

	public final double getThrust() {
		return this.thrustProperty().get();
	}

	public final void setThrust(final double thrust) {
		this.thrustProperty().set(thrust);
	}

	public final DoubleProperty regeneradorProperty() {
		return this.regenerador;
	}

	public final double getRegenerador() {
		return this.regeneradorProperty().get();
	}

	public final void setRegenerador(final double regenerador) {
		this.regeneradorProperty().set(regenerador);
	}

}
