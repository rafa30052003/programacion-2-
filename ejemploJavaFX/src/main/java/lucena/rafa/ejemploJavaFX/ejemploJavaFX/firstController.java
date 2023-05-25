package lucena.rafa.ejemploJavaFX.ejemploJavaFX;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class firstController {
	@FXML private Button btm_home;
   
	
	@FXML
	private void btmHomeValidate()throws IOException {
		btm_home.setText("Hola");
	}
	
	
}
