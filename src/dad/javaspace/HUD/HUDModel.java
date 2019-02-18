package dad.javaspace.HUD;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class HUDModel {
	private DoubleProperty speedProperty;
	private DoubleProperty shieldProperty;
	private DoubleProperty hpProperty;

	public HUDModel() {
		speedProperty = new SimpleDoubleProperty(this, "speedProperty", 0.0);
		shieldProperty = new SimpleDoubleProperty(this, "shieldProperty", 1.0);
		hpProperty = new SimpleDoubleProperty(this, "hpProperty", 1.0);
	}

	public final DoubleProperty speedPropertyProperty() {
		return this.speedProperty;
	}

	public final double getSpeedProperty() {
		return this.speedPropertyProperty().get();
	}

	public final void setSpeedProperty(final double speedProperty) {
		this.speedPropertyProperty().set(speedProperty);
	}

	public final DoubleProperty shieldPropertyProperty() {
		return this.shieldProperty;
	}

	public final double getShieldProperty() {
		return this.shieldPropertyProperty().get();
	}

	public final void setShieldProperty(final double shieldProperty) {
		this.shieldPropertyProperty().set(shieldProperty);
	}

	public final DoubleProperty hpPropertyProperty() {
		return this.hpProperty;
	}

	public final double getHpProperty() {
		return this.hpPropertyProperty().get();
	}

	public final void setHpProperty(final double hpProperty) {
		this.hpPropertyProperty().set(hpProperty);
	}

}
