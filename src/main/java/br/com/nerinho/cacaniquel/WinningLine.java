// Pacote: br.com.nerinho.cacaniquel
package br.com.nerinho.cacaniquel;

public class WinningLine {
    private final int rowIndex;
    private final int combinationLength;

    public WinningLine(int rowIndex, int combinationLength) {
        this.rowIndex = rowIndex;
        this.combinationLength = combinationLength;
    }

    // Getters são necessários para o Gson
    public int getRowIndex() { return rowIndex; }
    public int getCombinationLength() { return combinationLength; }
}