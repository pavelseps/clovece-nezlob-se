/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clovecefx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Pavel
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button red1;
    @FXML
    private Button red2;
    @FXML
    private Button red3;
    @FXML
    private Button red4;
    @FXML
    private Button blue1;
    @FXML
    private Button blue2;
    @FXML
    private Button blue3;
    @FXML
    private Button blue4;
    @FXML
    private Button yellow1;
    @FXML
    private Button yellow2;
    @FXML
    private Button yellow3;
    @FXML
    private Button yellow4;
    @FXML
    private Button green1;
    @FXML
    private Button green2;
    @FXML
    private Button green3;
    @FXML
    private Button green4;
    @FXML
    private Button dice;
    @FXML
    private Button nextPlayer;
    
    private Field gameField;
    private Dice diceClass;
    private Game game;
    private Figurine red1Fig = new Figurine();
    private Figurine red2Fig = new Figurine();
    private Figurine red3Fig = new Figurine();
    private Figurine red4Fig = new Figurine();
    private Figurine blue1Fig = new Figurine();
    private Figurine blue2Fig = new Figurine();
    private Figurine blue3Fig = new Figurine();
    private Figurine blue4Fig = new Figurine();
    private Figurine yellow1Fig = new Figurine();
    private Figurine yellow2Fig = new Figurine();
    private Figurine yellow3Fig = new Figurine();
    private Figurine yellow4Fig = new Figurine();
    private Figurine green1Fig = new Figurine();
    private Figurine green2Fig = new Figurine();
    private Figurine green3Fig = new Figurine();
    private Figurine green4Fig = new Figurine();
    
    @FXML
    private void actionRed1(ActionEvent event) {
        
        this.changePositionUI(red1, "red", 1);
    }
    
    @FXML
    private void actionRed2(ActionEvent event) {
        
        this.changePositionUI(red2, "red", 2);
    }
    
    @FXML
    private void actionRed3(ActionEvent event) {
        
        this.changePositionUI(red3, "red", 3);
    }
    
    @FXML
    private void actionRed4(ActionEvent event) {
        
        this.changePositionUI(red4, "red", 4);
    }
    
    @FXML
    private void actionBlue1(ActionEvent event) {
        
        this.changePositionUI(blue1, "blue", 1);
    }
    
    @FXML
    private void actionBlue2(ActionEvent event) {
        
        this.changePositionUI(blue2, "blue", 2);
    }
    
    @FXML
    private void actionBlue3(ActionEvent event) {
        
        this.changePositionUI(blue3, "blue", 3);
    }
    
    @FXML
    private void actionBlue4(ActionEvent event) {
        
        this.changePositionUI(blue4, "blue", 4);
    }
    
    @FXML
    private void actionYellow1(ActionEvent event) {
        
        this.changePositionUI(yellow1, "yellow", 1);
    }
    
    @FXML
    private void actionYellow2(ActionEvent event) {
        
        this.changePositionUI(yellow2, "yellow", 2);
    }
    
    @FXML
    private void actionYellow3(ActionEvent event) {
        
        this.changePositionUI(yellow3, "yellow", 3);
    }
    
    @FXML
    private void actionYellow4(ActionEvent event) {
        
        this.changePositionUI(yellow4, "yellow", 4);
    }
    
    @FXML
    private void actionGreen1(ActionEvent event) {
        
        this.changePositionUI(green1, "green", 1);
    }
    
    @FXML
    private void actionGreen2(ActionEvent event) {
        
        this.changePositionUI(green2, "green", 2);
    }
    
    @FXML
    private void actionGreen3(ActionEvent event) {
        
        this.changePositionUI(green3, "green", 3);
    }
    
    @FXML
    private void actionGreen4(ActionEvent event) {
        
        this.changePositionUI(green4, "green", 4);
    }
    
    private boolean checkForThreeThrow(){
        switch (game.getNamePlayer()) {
                case "red":
                        if(gameField.checkStart(0, 3)){
                            return true;
                        }
                    break;
                case "blue":
                        if(gameField.checkStart(4, 7)){
                            return true;
                        }
                    break;
                case "yellow":
                        if(gameField.checkStart(8, 11)){
                            return true;
                        }
                    break;
                case "green":
                        if(gameField.checkStart(12, 15)){
                            return true;
                        }
                    break;
                default:
                    System.err.println("FAIL in checkForThreeThrow()");
                break;
            }
        return false;
    }
    
    private void UIDiceRoll(){
        dice.getStyleClass().remove("throwed-"+diceClass.getEasyRoll());
        diceClass.diceRoll();
        dice.getStyleClass().add("throwed-"+diceClass.getEasyRoll());
    }
    
    private int throwIterator = 0;
    
    @FXML
    private void dice(ActionEvent event) throws InterruptedException {
        if(game.getMoveWithFigurine() == false){
            if(checkForThreeThrow()){
                changeLabel("Kostkou hází "+game.getNiceNamePlayer()+" hráč.");
                if(throwIterator<2){
                    UIDiceRoll();
                    throwIterator++;
                    if(diceClass.getEasyRoll() == 6){
                        changeLabel(game.getNiceNamePlayer()+", nasaď figurku.");
                        game.setMoveWithFigurine(true);
                        throwIterator = 0;
                    }
                }else{
                    game.actualPlayer();
                    changeLabel("Kostkou hází "+game.getNiceNamePlayer()+" hráč.");
                    throwIterator = 0;
                }
            }else{
                UIDiceRoll();
                changeLabel(game.getNiceNamePlayer()+", nyní pohni figurkou.");
                game.setMoveWithFigurine(true);
            }
        }else{
            changeLabel("Ne, "+game.getNiceNamePlayer()+" má pohybovat figurkou.");
        }
    } 
    
    @FXML
    private void nextPlayer(ActionEvent event){
        nextPlayer();
        nextPlayer.setVisible(false);
    }
    
    private void changeLabel(String text){
        label.setText(text);
    }
    
    
    private void restartGame(){
        homeIndex = 0;
        this.setStartUI(this.red1, red1Fig);
        this.setStartUI(this.red2, red2Fig);
        this.setStartUI(this.red3, red3Fig);
        this.setStartUI(this.red4, red4Fig);
        this.setStartUI(this.blue1, blue1Fig);
        this.setStartUI(this.blue2, blue2Fig);
        this.setStartUI(this.blue3, blue3Fig);
        this.setStartUI(this.blue4, blue4Fig);
        this.setStartUI(this.yellow1, yellow1Fig);
        this.setStartUI(this.yellow2, yellow2Fig);
        this.setStartUI(this.yellow3, yellow3Fig);
        this.setStartUI(this.yellow4, yellow4Fig);
        this.setStartUI(this.green1, green1Fig);
        this.setStartUI(this.green2, green2Fig);
        this.setStartUI(this.green3, green3Fig);
        this.setStartUI(this.green4, green4Fig);
        nextPlayer.setVisible(false);
        game.resetNamePlayer();
        gameField.nullPositionForResetGame();
        game.setMoveWithFigurine(false);
        this.changeLabel("Restatoval jsi hru a nařadě je červený hráč.");
    }
    
    private void hideButton(Button btn){
        btn.setVisible(false);
    }
    
    @FXML
    private void newGame2(ActionEvent event) {
        //red blue
        restartGame();
        this.hideButton(this.yellow1);
        this.hideButton(this.yellow2);
        this.hideButton(this.yellow3);
        this.hideButton(this.yellow4);
        for(int i = 8; i<12; i++){
            gameField.nullStart(i);
        }  
        this.hideButton(this.green1);
        this.hideButton(this.green2);
        this.hideButton(this.green3);
        this.hideButton(this.green4);
        for(int i = 12; i<16; i++){
            gameField.nullStart(i);
        }   
        
        game.setNumberOfPlayert(2);
        System.out.println("Nová hra pro 2 hráče");
    }
    
    @FXML
    private void newGame3(ActionEvent event) {
        //red blue yellow
        restartGame();
        this.hideButton(this.green1);
        this.hideButton(this.green2);
        this.hideButton(this.green3);
        this.hideButton(this.green4);
        for(int i = 12; i<16; i++){
            gameField.nullStart(i);
        }
        
        game.setNumberOfPlayert(3);
        System.out.println("Nová hra pro 3 hráče");
    } 
    
    @FXML
    private void newGame4(ActionEvent event) {
        //red blue yellow 
        restartGame();
        game.setNumberOfPlayert(4);
        System.out.println("Nová hra pro 4 hráče");
    }
    
    @FXML
    private void help(ActionEvent event) {
        System.out.println("Vypíše pomoc");
        Alert help = new Alert(Alert.AlertType.INFORMATION);
        help.setTitle("Pomoc");
        help.setHeaderText("Pomoc");
        help.setContentText("Tady je detailněji popsaná pomoc....");
        help.showAndWait();
    }
    
    @FXML
    private void about(ActionEvent event) {
        System.out.println("Vypíše info o programu");
        Alert about = new Alert(Alert.AlertType.INFORMATION);
        about.setTitle("O programu");
        about.setHeaderText("O programu");
        about.setContentText("Autor: Pavel Šeps\nInfo: Program vytvořen jako semestrální projekt.");
        about.showAndWait();
    }
    
    @FXML
    private void exit(ActionEvent event) {
        System.out.println("Konec programu pomocí exit");
        System.exit(0);
    }
    
    public void repaintStartFields(){
        Button throwAwayButton = red1;
        Figurine throwAwayFig = red1Fig;
        for(int i = 0; i<gameField.getStartField().length; i++){
            if(gameField.getStart(i) != null){
                switch (gameField.getStart(i).getColor()) {
                case "red":
                    switch (gameField.getStart(i).getIndex()) {
                        case 1:
                            throwAwayButton = red1;
                            throwAwayFig = red1Fig;
                        break;
                        case 2:
                            throwAwayButton = red2;
                            throwAwayFig = red2Fig;
                        break;
                        case 3:
                            throwAwayButton = red3;
                            throwAwayFig = red3Fig;
                        break;
                        case 4:
                            throwAwayButton = red4;
                            throwAwayFig = red4Fig;
                        break;
                    }
                break;
                case "blue":
                    switch (gameField.getStart(i).getIndex()) {
                        case 1:
                            throwAwayButton = blue1;
                            throwAwayFig = blue1Fig;
                        break;
                        case 2:
                            throwAwayButton = blue2;
                            throwAwayFig = blue2Fig;
                        break;
                        case 3:
                            throwAwayButton = blue3;
                            throwAwayFig = blue3Fig;
                        break;
                        case 4:
                            throwAwayButton = blue4;
                            throwAwayFig = blue4Fig;
                        break;
                    }
                break;
                case "yellow":
                    switch (gameField.getStart(i).getIndex()) {
                        case 1:
                            throwAwayButton = yellow1;
                            throwAwayFig = yellow1Fig;
                        break;
                        case 2:
                            throwAwayButton = yellow2;
                            throwAwayFig = yellow2Fig;
                        break;
                        case 3:
                            throwAwayButton = yellow3;
                            throwAwayFig = yellow3Fig;
                        break;
                        case 4:
                            throwAwayButton = yellow4;
                            throwAwayFig = yellow4Fig;
                        break;
                    }
                break;
                case "green":
                    switch (gameField.getStart(i).getIndex()) {
                        case 1:
                            throwAwayButton = green1;
                            throwAwayFig = green1Fig;
                        break;
                        case 2:
                            throwAwayButton = green2;
                            throwAwayFig = green2Fig;
                        break;
                        case 3:
                            throwAwayButton = green3;
                            throwAwayFig = green3Fig;
                        break;
                        case 4:
                            throwAwayButton = green4;
                            throwAwayFig = green4Fig;
                        break;
                    }
                break;
                default:
                    System.err.println("FAIL in repaintStartFields()");
                break;
                }
                throwAwayButton.setLayoutX(gameField.getPositionSX(i));
                throwAwayButton.setLayoutY(gameField.getPositionSY(i));
                throwAwayFig.setCanGoHome(false);
            }
        }
    }
    
    private void repaintMovedFig(Button btn, int newP){
        btn.setLayoutX(gameField.getPositionX(newP));
        btn.setLayoutY(gameField.getPositionY(newP));
    }
    
    private boolean setFigurineToHome(int start, int nextPosition, Button btn, String color, int index, int offSet){
        int oldPos = gameField.findFigurine(color, index);
        if(oldPos > 0 && oldPos < start && !(gameField.getPosition(oldPos).getCanGoHome())){
            gameField.getPosition(oldPos).setCanGoHome(true);
        }
        if(nextPosition >= start && gameField.getPosition(oldPos).getCanGoHome()){
            nextPosition = nextPosition - start;
            if(nextPosition>3){
                System.err.println("MOVE WITH ANOTHER FIGURINE, HOME IS TOO SMALL");
                blindWay();
                return false;
            }else{ 
                nextPosition = nextPosition + offSet;
                if(gameField.goHome(oldPos, nextPosition)){
                    btn.setLayoutX(gameField.getPositionHX(nextPosition));
                    btn.setLayoutY(gameField.getPositionHY(nextPosition));
                    btn.setDisable(true);
                    nextPlayer();
                    System.err.println("YOU MOVED YOUR FIGURINE TO HOME");
                }else{
                    System.err.println("YOU HAVE FIGURINE ON THIS HOME FIELD");
                    blindWay();
                }
                return false;
            }
        }
        return true;
    }
    
    private void blindWay(){
        nextPlayer.setVisible(true);
        changeLabel("Pokud se nemůžeš hnout, nech hrát dalšího hráče");
    }
    
    private void changePositionUI(Button btn, String color, int index){
        if(game.getMoveWithFigurine() == true){
            boolean haveFigOnStart = false;
            int startPos;
            int newP = diceClass.getEasyRoll()+gameField.findFigurine(color, index);
            if(newP>39){
                newP = newP - 40;
            }
            System.out.println("=====================================");

            switch (color) {
                case "red":
                    if(!this.setFigurineToHome(22, newP, btn, color, index, 0)){
                        return;
                    }
                    break;
                case "blue":
                    int oldPos = gameField.findFigurine(color, index);
                    if(oldPos == -1){
                        break;
                    }
                    if(oldPos > 20 && !(gameField.getPosition(oldPos).getCanGoHome())){
                        gameField.getPosition(oldPos).setCanGoHome(true);
                    }
                    if(newP >= 2 && newP < 10 && gameField.getPosition(oldPos).getCanGoHome()){
                        newP = newP - 2;
                        if(newP>3){
                            System.err.println("MOVE WITH ANOTHER FIGURINE, HOME IS TOO SMALL");
                            blindWay();
                            return;
                        }else{ 
                            newP = newP + 4;
                            if(gameField.goHome(oldPos, newP)){
                                btn.setLayoutX(gameField.getPositionHX(newP));
                                btn.setLayoutY(gameField.getPositionHY(newP));
                                btn.setDisable(true);
                                nextPlayer();
                            }else{
                                System.err.println("YOU HAVE FIGURINE ON THIS HOME FIELD");
                                blindWay();
                                return;
                            }
                        }
                    }
                    break;
                case "yellow":
                    if(!this.setFigurineToHome(32, newP, btn, color, index, 8)){
                        return;
                    }
                    break;
                case "green":
                    if(!this.setFigurineToHome(12, newP, btn, color, index, 12)){
                        return;
                    }
                    break;
                default:
                    System.err.println("FAIL in changePositionUI(), go with figurine to home");
                break;
            }

            if(gameField.isFigurineOnStart(color, index) == -1){    //Check if you have moving with figurine on start
                //If not on start

                int throwedFigure = gameField.changePosition(gameField.findFigurine(color, index), newP, color);
                if(throwedFigure==1){    //Check if you have any figurine on move
                    //If yes, thow away enemy figurine and move your figurine
                    this.repaintStartFields();
                    this.repaintMovedFig(btn, newP);
                    System.err.println("THROW AWAY ENEMY FIGURE");    
                }else if(throwedFigure==-1){
                    changeLabel("Pohni s jinačí figurkou");
                    blindWay();
                    return;
                }else{
                    //Normal move with figurine
                    this.repaintMovedFig(btn, newP);
                    System.err.println("NORMAL MOVE");
                }
            }else{
                //If is on start
                if(diceClass.getEasyRoll() != 6){
                    changeLabel("Pro nasazení, musíš za 6. Jdi s jinačí figurkou.");
                    return;
                }
                
                switch (color) {
                case "red":
                    startPos = 22;
                    haveFigOnStart = gameField.testForPlaceFigure(startPos);
                    break;
                case "blue":
                    startPos = 2;
                    haveFigOnStart = gameField.testForPlaceFigure(startPos);
                    break;
                case "yellow":
                    startPos = 32;
                    haveFigOnStart = gameField.testForPlaceFigure(startPos);
                    break;
                case "green":
                    startPos = 12;
                    haveFigOnStart = gameField.testForPlaceFigure(startPos);
                    break;
                default:
                    startPos = 0;
                    System.err.println("FAIL in changePositionUI()");
                break;
                }

                if(haveFigOnStart == false){   //Check if you have figurine on your start field
                    
                    //If yes
                    if(gameField.getPosition(startPos).getColor().equals(color)){
                        //You have your own figurine on start
                        changeLabel("Nemůžeš nasadit, pohni s jinačí figurkou.");
                        blindWay();
                        return;
                    }else{
                        //You throw away enemy figurine and set up your figurine
                        System.err.println("YOU THROWED ENEMY FIGURINE FROM YOUR START");
                        switch (gameField.getPosition(startPos).getColor()) {
                            case "red":
                                for(int i = 0; i < 4; i++){
                                    if(gameField.getStart(i) == null){
                                        gameField.goStart(startPos, i);
                                    }
                                } 
                                break;
                            case "blue":
                                for(int i = 4; i<8; i++){
                                    if(gameField.getStart(i) == null){
                                        gameField.goStart(startPos, i);
                                    }
                                }   
                                break;
                            case "yellow":
                                for(int i = 8; i<12; i++){
                                    if(gameField.getStart(i) == null){
                                        gameField.goStart(startPos, i);
                                    }
                                }  
                                break;
                            case "green":
                                for(int i = 12; i<16; i++){
                                    if(gameField.getStart(i) == null){
                                        gameField.goStart(startPos, i);
                                    }
                                }   
                                break;
                            default:
                                System.err.println("FAIL in Conttroller.changePositionUI() //Throw enemy figine, when you set up your figurine");
                            break;
                        }
                        repaintStartFields();
                        setFigurineOnStartPos(btn, color, index, startPos);
                    }
                }else{
                    //If not, set figutine on start field
                    setFigurineOnStartPos(btn, color, index, startPos);
                    System.err.println("SET START");
                }
            }
            
            if(diceClass.getThrewSix() == true){
                changeLabel(game.getNiceNamePlayer()+" hodil 6, házíš znovu");
                game.setMoveWithFigurine(false);
            }else{
                nextPlayer();
            }
        }else{   
            if(!color.equals(game.getNamePlayer())){
            changeLabel("Jdeš se špatnou figurkou.");
                return;
            }
            changeLabel("Ne, "+game.getNiceNamePlayer()+" má házet kostkou.");
        }
        
        nextPlayer.setVisible(false);
        checkEndOfGame();
        //gameField.giveMeAllCycle();
    }
    
    private void nextPlayer(){
        game.actualPlayer();
        changeLabel("Kostkou hází "+game.getNiceNamePlayer()+" hráč.");
        game.setMoveWithFigurine(false);
    }
    
    private void checkEndOfGame(){
        String winner = game.getNiceNamePlayer();
        boolean win = false;
        if(gameField.checkHome(0, 4)){
            win = true;
        }
        if(gameField.checkHome(5, 8)){
            win = true;
        }
        if(gameField.checkHome(9, 12)){
            win = true;
        }
        if(gameField.checkHome(13, 16)){
            win = true;
        }
        
        if(win == true){
            changeLabel("Vyhrál hráč konec hry.");   
            Alert winnerA = new Alert(Alert.AlertType.INFORMATION);
            winnerA.setTitle("Konec hry");
            winnerA.setHeaderText(null);
            winnerA.setContentText("Vítězem se stal: "+ winner);
            winnerA.showAndWait();
            restartGame();
            game.setNumberOfPlayert(4);
        }
    }
    
    private void setFigurineOnStartPos(Button btn, String color, int index, int startPos){
        gameField.formStarToStartField(gameField.isFigurineOnStart(color, index), startPos);
        btn.setLayoutX(gameField.getPositionX(startPos));
        btn.setLayoutY(gameField.getPositionY(startPos));
    }
        
    
    private int homeIndex = 0;
    private void setStartUI(Button btn, Figurine figurine, String color, int index){
        btn.setLayoutX(gameField.getPositionSX(homeIndex));
        btn.setLayoutY(gameField.getPositionSY(homeIndex));
        gameField.setStart(homeIndex, figurine);
        figurine.setUp(color, index);
        homeIndex++;
    }
    
    private void setStartUI(Button btn, Figurine figurine){
        btn.setLayoutX(gameField.getPositionSX(homeIndex));
        btn.setLayoutY(gameField.getPositionSY(homeIndex));
        gameField.setStart(homeIndex, figurine);
        figurine.setCanGoHome(false);
        btn.setVisible(true);
        btn.setDisable(false);
        homeIndex++;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        game = new Game();
        gameField = new Field();
        diceClass = new Dice();
        homeIndex = 0;
        nextPlayer.setVisible(false);
        game.resetNamePlayer();
        this.setStartUI(this.red1, red1Fig, "red", 1);
        this.setStartUI(this.red2, red2Fig, "red", 2);
        this.setStartUI(this.red3, red3Fig, "red", 3);
        this.setStartUI(this.red4, red4Fig, "red", 4);
        this.setStartUI(this.blue1, blue1Fig, "blue", 1);
        this.setStartUI(this.blue2, blue2Fig, "blue", 2);
        this.setStartUI(this.blue3, blue3Fig, "blue", 3);
        this.setStartUI(this.blue4, blue4Fig, "blue", 4);
        this.setStartUI(this.yellow1, yellow1Fig, "yellow", 1);
        this.setStartUI(this.yellow2, yellow2Fig, "yellow", 2);
        this.setStartUI(this.yellow3, yellow3Fig, "yellow", 3);
        this.setStartUI(this.yellow4, yellow4Fig, "yellow", 4);
        this.setStartUI(this.green1, green1Fig, "green", 1);
        this.setStartUI(this.green2, green2Fig, "green", 2);
        this.setStartUI(this.green3, green3Fig, "green", 3);
        this.setStartUI(this.green4, green4Fig, "green", 4);
    }    
    
}
