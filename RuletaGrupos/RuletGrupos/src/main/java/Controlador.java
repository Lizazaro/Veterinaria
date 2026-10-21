
import javafx.util.Duration;
import java.util.Random;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.scene.control.Alert;





public class Controlador {

    @FXML
    private Pane Palanca;

    @FXML
    private Button girar;

    @FXML
    private Label rodillo1;

    @FXML
    private Label rodillo2;

    @FXML
    private Label rodillo3;
    
    private final Random random = new Random();
    
    private int grupoAlAzar() {
    return random.nextInt(10) + 1;
}
    
    private int grupoAnterior = 0;
     private Timeline animacion;
     
     
     private final String[][] estudiantes = {
        {"Ana", "Luis"},             // los del Grupo 1
        {"Camila", "Mateo"},         // los del Grupo 2
        {"Falta Añadir"},           // los del Grupo 3
        {"Falta Añadir"},           // los del Grupo 4
        {"Falta Añadir"},           // los del Grupo 5
        {"Falta Añadir"},           // los del Grupo 6
        {"Falta Añadir"},           // los del Grupo 7
        {"Falta Añadir"},           // los del Grupo 8
        {"Falta Añadir"},           // los del Grupo 9
        {"Falta Añadir"}           // los del Grupo 10
     };
    

  
   private void mostrarResultado(int grupo) {
    Alert alerta = new Alert(Alert.AlertType.INFORMATION);
    alerta.setTitle("Resultado");
    alerta.setHeaderText("Le tocó al GRUPO " + grupo );
    alerta.setContentText("Estudiantes: " + String.join(",",estudiantes[grupo - 1]));
    alerta.show();
    System.out.println("Entró a mostrarResultado: " + grupo);
} 
    
    public void girar() {
    
    animacion = new Timeline(
                new KeyFrame(Duration.millis(100), evento -> {
                rodillo1.setText("Grupo" + (grupoAlAzar()));
                rodillo2.setText("Grupo" + (grupoAlAzar()));
                rodillo3.setText("Grupo" + (grupoAlAzar()));
            })
        );
    
            animacion.setCycleCount(30);
            
            
            animacion.setOnFinished(evento -> {
            int grupoElegido;
                    do{ grupoElegido = grupoAlAzar();}
                    while (grupoElegido == grupoAnterior); 
                    
                    grupoAnterior = grupoElegido;
                    
                    String resultado = "Grupo" + grupoElegido;
                    
                    rodillo1.setText(resultado);
                    rodillo2.setText(resultado);
                    rodillo3.setText(resultado);
                    
                    mostrarResultado(grupoElegido);
                 });
            
            animacion.play();
            
        

    }

}
