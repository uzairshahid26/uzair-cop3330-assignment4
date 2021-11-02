/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Muhammad Uzair
 */


package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;


public class AppController implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        datePicker.setValue(LocalDate.now());
    }

    @FXML
    Button addButton;

    @FXML
    TextArea descriptionTextField;

    @FXML
    DatePicker datePicker;


    @FXML
    ListView<LocalEvent> eventList;

   ObservableList<LocalEvent> list = FXCollections.observableArrayList();

   @FXML
    private void addEvent(Event e){
        list.add(new LocalEvent(datePicker.getValue(), descriptionTextField.getText()));
        eventList.setItems(list);
    refresh();
    }

    private void refresh(){
       datePicker.setValue(LocalDate.now());
       descriptionTextField.setText(null);
    }



}
