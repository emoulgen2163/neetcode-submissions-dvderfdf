class Solution {
    fun exist(board: Array<CharArray>, word: String): Boolean {
        val row = board.size
        val col = board[0].size
        
        for(i in 0 until row){
            for (j in 0 until col) {
                if(backtrack(board, word, i, j, 0)){
                    return true
                }
            }
        }

        return false
    }

    fun backtrack(board: Array<CharArray>, word: String, row: Int, col: Int, index: Int): Boolean{
        if(index == word.length){
            return true
        }
        val outOfBounds = row < 0 || row >= board.size || col < 0 || col >= board[0].size

        if(outOfBounds || word[index] != board[row][col]){
            return false
        }

        val c = board[row][col]
        board[row][col] = '#'
        

        val result = backtrack(board, word, row - 1, col, index + 1) ||
            backtrack(board, word, row + 1, col, index + 1) ||
            backtrack(board, word, row, col - 1, index + 1) ||
            backtrack(board, word, row, col + 1, index + 1)
        
        board[row][col] = c

        return result
    }
}
