// Pacote: br.com.nerinho.cacaniquel
package br.com.nerinho.cacaniquel; // Mude para o seu pacote

import com.google.gson.Gson;
import spark.Request;
import spark.Response;

public class SlotMachineController {

    private final SlotMachine slotMachine;
    private final Gson gson;

    public SlotMachineController() {
        this.slotMachine = new SlotMachine();
        this.gson = new Gson();
    }

    /**
     * Manipula a requisição GET /girar, executa um spin e retorna o resultado como JSON.
     */
    public String handleSpinRequest(Request request, Response response) {
        GameResult result = slotMachine.spin();

        response.type("application/json");
        return gson.toJson(result);
    }
}