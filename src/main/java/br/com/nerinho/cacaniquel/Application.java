// Pacote: br.com.nerinho.cacaniquel
package br.com.nerinho.cacaniquel; // Mude para o seu pacote

import static spark.Spark.*;

public class Application {

    public static void main(String[] args) {
        // --- 1. CONFIGURAÇÃO DO SERVIDOR ---
        port(4567);

        // Filtro CORS para permitir que o frontend acesse o backend
        after((request, response) -> {
            response.header("Access-Control-Allow-Origin", "*");
            response.header("Access-Control-Allow-Methods", "GET");
        });

        // --- 2. INICIALIZAÇÃO DOS COMPONENTES ---
        br.com.nerinho.cacaniquel.SlotMachineController controller = new br.com.nerinho.cacaniquel.SlotMachineController();

        // --- 3. DEFINIÇÃO DAS ROTAS ---
        get("/girar", controller::handleSpinRequest);

        System.out.println("✅ Servidor do Caça-Níquel iniciado em http://localhost:4567");
    }
}