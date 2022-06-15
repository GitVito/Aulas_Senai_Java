package application;
	
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {									//try vai fazer o c�digo e vai parar se der algum B.O.
			
			GridPane grid = new GridPane(); //Criamos o grid e montamos do jeito que a gente queria
			grid.setHgap(5.0); //define tamanho horizontal do grid
			grid.setVgap(7.0); //define tamanho vertical do grid
			
			grid.add(new Label("Nome"), 0, 0);  //Adicionamos o texto dentro do grid
			TextField txtNome = new TextField(); //Criou mas ainda n�o vinculou na sua tela //TextField � o input
			grid.add(txtNome, 1, 0);
			
			
			grid.add(new Label("Sexo"), 0, 1);
			RadioButton btnMasc = new RadioButton("Masculino");
			RadioButton btnFemin = new RadioButton("Feminino");
			RadioButton btnNao = new RadioButton("N�o declarado");
			btnNao.setSelected(true);
			
			ToggleGroup group = new ToggleGroup(); //Disse que eles pertencem ao mesmo grupo, quando voc� aperta em um, o outro n�o poder� ser marcado
			btnFemin.setToggleGroup(group);
			btnMasc.setToggleGroup(group);
			btnNao.setToggleGroup(group);
			
			HBox radioBox = new HBox(5.0, btnFemin, btnMasc, btnNao);
			grid.add(radioBox, 1, 1);
			
			ChoiceBox<String> chcEstados = new ChoiceBox<>();
			
			ObservableList<String> estados = FXCollections.observableArrayList("S�o Paulo", "Rio de Janeiro", "Amaz�nia", "Minas Gerais");
			
			chcEstados.setItems(estados);
			
			grid.add(new Label("Estados"), 0, 3); 
			grid.add(chcEstados, 1, 3);
			
			
			Label lblTeste = new Label();
			
			Button btnTeste = new Button("Teste");
			btnTeste.setOnAction(event -> lblTeste.setText(txtNome.getText())); //"Quando eu acionar ele, vai gerar um evento" O texto do label ir� aparecer
			btnTeste.setOnMouseEntered(event -> lblTeste.setText("Hola")); //Quando passar o mouse encima
			btnTeste.setOnMouseExited(event -> lblTeste.setText("Adi�s")); //Quando o mouse sai da regi�o do bot�o
			
			
			grid.add(lblTeste, 1, 6);
			grid.add(btnTeste, 1, 5);
			
			
			
			BorderPane root = new BorderPane(); //Classe que vai montar um painel, e deu o nome de root
			Scene scene = new Scene(root,400,400); //Denomina o tamanho da tela
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm()); //Vai definir o estilo da cena
			
			root.setCenter(grid);
			
			primaryStage.setScene(scene); //Pode ter vari�s telas, sendo at� uma encima da outra
			primaryStage.show(); //abre a primeira tela
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private Object showDialog(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
