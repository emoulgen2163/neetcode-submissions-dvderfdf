class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        var row = board.size
        var col = board[0].size
        val visited = hashSetOf<String>()
        

        for(i in 0 until row){
            
            for(j in 0 until col){
                
                val currentCell = board[i][j]

                if(currentCell != '.'){
                    if(!visited.add("$currentCell at row $i") ||
                     !visited.add("$currentCell at col $j") ||
                      !visited.add("$currentCell at box ${i / 3} , ${j / 3}")
                    ){
                        return false
                    }
                }
            }     
        }

        return true
    }
}
