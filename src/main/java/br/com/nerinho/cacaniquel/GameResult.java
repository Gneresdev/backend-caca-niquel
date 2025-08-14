// Pacote: br.com.nerinho.cacaniquel
package br.com.nerinho.cacaniquel;

import java.util.List;

public class GameResult {
    private final String[][] grid;
    private final int totalPrize;
    private final List<WinningLine> winningLines;

    public GameResult(String[][] grid, int totalPrize, List<WinningLine> winningLines) {
        this.grid = grid;
        this.totalPrize = totalPrize;
        this.winningLines = winningLines;
    }

    // Getters
    public String[][] getGrid() { return grid; }
    public int getTotalPrize() { return totalPrize; }
    public List<WinningLine> getWinningLines() { return winningLines; }
}