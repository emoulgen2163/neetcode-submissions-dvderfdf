class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val visitedNumbers = hashSetOf<String>()

        for(row in board.indices){
            for(col in board[0].indices){
                val cell = board[row][col]

                if(cell != '.'){
                    if(
                        !visitedNumbers.add("$cell found at row $row") ||
                        !visitedNumbers.add("$cell found at col $col") ||
                        !visitedNumbers.add("$cell found at box ${row / 3}, ${col / 3}")
                    ){
                        return false
                    }
                }         
            }
        }

        return true
    }
}
