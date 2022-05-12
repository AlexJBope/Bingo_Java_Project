package com.example.bingoboard;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import javax.swing.text.View;
import javax.swing.text.html.ImageView;
import java.util.Random;



public class BingoBoardController {
    //creates the labels for the bingo card
    @FXML
    private Label box1;
    @FXML
    private Label box2;
    @FXML
    private Label box3;
    @FXML
    private Label box4;
    @FXML
    private Label box5;
    @FXML
    private Label box6;
    @FXML
    private Label box7;
    @FXML
    private Label box8;
    @FXML
    private Label box9;
    @FXML
    private Label box10;
    @FXML
    private Label box11;
    @FXML
    private Label box12;
    @FXML
    private Label box13;
    @FXML
    private Label box14;
    @FXML
    private Label box15;
    @FXML
    private Label box16;
    @FXML
    private Label box17;
    @FXML
    private Label box18;
    @FXML
    private Label box19;
    @FXML
    private Label box20;
    @FXML
    private Label box21;
    @FXML
    private Label box22;
    @FXML
    private Label box23;
    @FXML
    private Label box24;
    @FXML
    private Label rollshow;
    @FXML
    private Label winshow;
    @FXML
    private Label boxBingo;
    @FXML
    private ImageView HotBingo;

    //creates the instance of the Bingo object. i.e. the data behind the bingo board
    BingoBoard alex = new BingoBoard("alex");
    BingoNumber BingoCage = new BingoNumber();

    //creates a random number generator to simulate the bingo cage
    @FXML
    public void checknumber() {
        int rng = BingoCage.NewNumber();
        alex.AddMarker(rng);
        rollshow.setText(Integer.toString(rng));
        if(alex.marks[12]){
            boxBingo.setFont(Font.font(90));
            boxBingo.setText("X");
            boxBingo.setTextFill(Color.color(.9, .2, .3));

        }
        if(alex.marks[0]){
            box1.setFont(Font.font(90));
            box1.setText("X");
            box1.setTextFill(Color.color(.9, .2, .3));
        }
        if(alex.marks[1]){
            box2.setFont(Font.font(90));
            box2.setText("X");
            box2.setTextFill(Color.color(.9, .2, .3));
        }
        if(alex.marks[2]){
            box3.setFont(Font.font(90));
            box3.setText("X");
            box3.setTextFill(Color.color(.9, .2, .3));
        }
        if(alex.marks[3]){
            box4.setFont(Font.font(90));
            box4.setText("X");
            box4.setTextFill(Color.color(.9, .2, .3));
        }
        if(alex.marks[4]){
            box5.setFont(Font.font(90));
            box5.setText("X");
            box5.setTextFill(Color.color(.9, .2, .3));
        }
        if(alex.marks[5]){
            box6.setFont(Font.font(90));
            box6.setText("X");
            box6.setTextFill(Color.color(.9, .2, .3));
        }
        if(alex.marks[6]){
            box7.setFont(Font.font(90));
            box7.setText("X");
            box7.setTextFill(Color.color(.9, .2, .3));
        }
        if(alex.marks[7]){
            box8.setFont(Font.font(90));
            box8.setText("X");
            box8.setTextFill(Color.color(.9, .2, .3));
        }
        if(alex.marks[8]){
            box9.setFont(Font.font(90));
            box9.setText("X");
            box9.setTextFill(Color.color(.9, .2, .3));
        }
        if(alex.marks[9]){
            box10.setFont(Font.font(90));
            box10.setText("X");
            box10.setTextFill(Color.color(.9, .2, .3));
        }
        if(alex.marks[10]){
            box11.setFont(Font.font(90));
            box11.setText("X");
            box11.setTextFill(Color.color(.9, .2, .3));
        }
        if(alex.marks[11]){
            box12.setFont(Font.font(90));
            box12.setText("X");
            box12.setTextFill(Color.color(.9, .2, .3));
        }
        if(alex.marks[13]){
            box13.setFont(Font.font(90));
            box13.setText("X");
            box13.setTextFill(Color.color(.9, .2, .3));
        }
        if(alex.marks[14]){
            box14.setFont(Font.font(90));
            box14.setText("X");
            box14.setTextFill(Color.color(.9, .2, .3));
        }
        if(alex.marks[15]){
            box15.setFont(Font.font(90));
            box15.setText("X");
            box15.setTextFill(Color.color(.9, .2, .3));
        }
        if(alex.marks[16]){
            box16.setFont(Font.font(90));
            box16.setText("X");
            box16.setTextFill(Color.color(.9, .2, .3));
        }
        if(alex.marks[17]){
            box17.setFont(Font.font(90));
            box17.setText("X");
            box17.setTextFill(Color.color(.9, .2, .3));
        }
        if(alex.marks[18]){
            box18.setFont(Font.font(90));
            box18.setText("X");
            box18.setTextFill(Color.color(.9, .2, .3));
        }

        if(alex.marks[19]){
            box19.setFont(Font.font(90));
            box19.setText("X");
            box19.setTextFill(Color.color(.9, .2, .3));
        }
        if(alex.marks[20]){
            box20.setFont(Font.font(90));
            box20.setText("X");
            box20.setTextFill(Color.color(.9, .2, .3));
        }
        if(alex.marks[21]){
            box21.setFont(Font.font(90));
            box21.setText("X");
            box21.setTextFill(Color.color(.9, .2, .3));
        }
        if(alex.marks[22]){
            box22.setFont(Font.font(90));
            box22.setText("X");
            box22.setTextFill(Color.color(.9, .2, .3));
        }
        if(alex.marks[23]){
            box23.setFont(Font.font(90));
            box23.setText("X");
            box23.setTextFill(Color.color(.9, .2, .3));
        }
        if(alex.marks[24]){
            box24.setFont(Font.font(90));
            box24.setText("X");
            box24.setTextFill(Color.color(.9, .2, .3));
        }

    }
    //checks to see if the BINGO has been completed or not
    @FXML
    protected void onHelloButtonClick() {
        if(alex.WinCheck()){
            winshow.setText("BINGO!");
            winshow.setFont(Font.font(200));
            winshow.setTextFill(Color.color(.92, .34,.8));
        }
        else if(alex.WinCheck() != true){
            winshow.setText("KEEP GOING!");
        }

    }
    // sets the numerical value of each box to later be added to the board via FXML files
    public void initialize() {
        box1.setText(String.valueOf(alex.numbs[0]));
        box2.setText(String.valueOf(alex.numbs[1]));
        box3.setText(String.valueOf(alex.numbs[2]));
        box4.setText(String.valueOf(alex.numbs[3]));
        box5.setText(String.valueOf(alex.numbs[4]));
        box6.setText(String.valueOf(alex.numbs[5]));
        box7.setText(String.valueOf(alex.numbs[6]));
        box8.setText(String.valueOf(alex.numbs[7]));
        box9.setText(String.valueOf(alex.numbs[8]));
        box10.setText(String.valueOf(alex.numbs[9]));
        box11.setText(String.valueOf(alex.numbs[10]));
        box12.setText(String.valueOf(alex.numbs[11]));
        box13.setText(String.valueOf(alex.numbs[13]));
        box14.setText(String.valueOf(alex.numbs[14]));
        box15.setText(String.valueOf(alex.numbs[15]));
        box16.setText(String.valueOf(alex.numbs[16]));
        box17.setText(String.valueOf(alex.numbs[17]));
        box18.setText(String.valueOf(alex.numbs[18]));
        box19.setText(String.valueOf(alex.numbs[19]));
        box20.setText(String.valueOf(alex.numbs[20]));
        box21.setText(String.valueOf(alex.numbs[21]));
        box22.setText(String.valueOf(alex.numbs[22]));
        box23.setText(String.valueOf(alex.numbs[23]));
        box24.setText(String.valueOf(alex.numbs[24]));

        box1.setFont(Font.font(40));
        box2.setFont(Font.font(40));
        box3.setFont(Font.font(40));
        box4.setFont(Font.font(40));
        box5.setFont(Font.font(40));
        box6.setFont(Font.font(40));
        box7.setFont(Font.font(40));
        box8.setFont(Font.font(40));
        box9.setFont(Font.font(40));
        box10.setFont(Font.font(40));
        box11.setFont(Font.font(40));
        box12.setFont(Font.font(40));
        box13.setFont(Font.font(40));
        box14.setFont(Font.font(40));
        box15.setFont(Font.font(40));
        box16.setFont(Font.font(40));
        box17.setFont(Font.font(40));
        box18.setFont(Font.font(40));
        box19.setFont(Font.font(40));
        box20.setFont(Font.font(40));
        box21.setFont(Font.font(40));
        box22.setFont(Font.font(40));
        box23.setFont(Font.font(40));
        box24.setFont(Font.font(40));

        boxBingo.setFont(Font.font(20));
        winshow.setFont(Font.font(40));
        rollshow.setFont(Font.font(40));
    }


}