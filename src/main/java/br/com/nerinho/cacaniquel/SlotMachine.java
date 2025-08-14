// Pacote: br.com.nerinho.cacaniquel
package br.com.nerinho.cacaniquel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SlotMachine {

    private static final int JACKPOT_PRIZE = 100;
    private static final int PAIR_PRIZE = 20;

    private final List<String> symbols = Arrays.asList("🍒", "🍋", "🍊", "🔔", "💰", "💎", "🍀");
    private final Random randomGenerator = new Random();

    /**
     * Gera uma grade 3x3 e verifica todas as 3 linhas para vitórias.
     * @return Um GameResult contendo a grade, o prêmio total e as linhas vencedoras.
     */
    public GameResult spin() {
        String[][] grid = generateGrid();

        int totalPrize = 0;
        List<WinningLine> winningLines = new ArrayList<>();

        // Itera sobre cada uma das 3 linhas horizontais
        for (int i = 0; i < 3; i++) {
            String s1 = grid[i][0]; // Coluna 1
            String s2 = grid[i][1]; // Coluna 2
            String s3 = grid[i][2]; // Coluna 3

            if (s1.equals(s2) && s2.equals(s3)) {
                totalPrize += JACKPOT_PRIZE;
                winningLines.add(new WinningLine(i, 3)); // Linha 'i' ganhou com 3 símbolos
            } else if (s1.equals(s2)) {
                totalPrize += PAIR_PRIZE;
                winningLines.add(new WinningLine(i, 2)); // Linha 'i' ganhou com 2 símbolos
            }
        }

        return new GameResult(grid, totalPrize, winningLines);
    }

    /**
     * Gera uma grade 3x3 de símbolos aleatórios.
     */
    private String[][] generateGrid() {
        String[][] grid = new String[3][3];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                grid[row][col] = symbols.get(randomGenerator.nextInt(symbols.size()));
            }
        }
        return grid;
    }
}