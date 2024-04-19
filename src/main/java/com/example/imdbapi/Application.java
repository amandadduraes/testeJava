package com.example.imdbapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        testarConexaoBancoDados();
    }
    
    @Controller
    public class HomeController {
    
        @GetMapping("/")
        public String home() {
            return "index";
        }
    }
    
    private static void testarConexaoBancoDados() {
        final String URL = "jdbc:postgresql://localhost:5432/Imdb";
        final String USERNAME = "postgres";
        final String PASSWORD = "ema147";
        
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Conexão bem-sucedida ao banco de dados PostgreSQL!");
            connection.close(); 
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados PostgreSQL:");
            e.printStackTrace();
        }
    }
}
