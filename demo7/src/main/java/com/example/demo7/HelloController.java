/**
 * Форма авторизации.
 * @autor Команда трех добрых Молодцев
 * @version 2.1
 * @See HelloApplication.java
 */
package com.example.demo7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    /** Поле вывода информации */
    @FXML
    Label label_ans;
    /** Кнопка */
    @FXML
    Button button;
    /** Текстовое поле для ввода логина */
    @FXML
    TextField login;
    /** Поле для ввода пароля */
    @FXML
    PasswordField pass;
    /** Метод обработки нажатия на кнопку и проверки ввода
     * На вход подаются даные из строк login и password */
    @FXML
    public void authorization() {
        if (login.getText().equals("admin") & (pass.getText().equals("admin"))) {
            label_ans.setText("Авторизация прошла успешно");
        }
        else {
            label_ans.setText("Данные введены неверно");
        }
    }
}