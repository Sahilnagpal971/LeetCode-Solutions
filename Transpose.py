from typing import List
class Solution:
    def transpose(self, matrix: List[List[int]]) -> List[List[int]]:

        arr=[[0] * len(matrix) for _ in range(len(matrix[0]))]
        
        
        for i in range(len(matrix)):
            
          

            for j in range(len(matrix[0])):
                
                arr[j][i]=matrix[i][j]
                

           
        
        return arr

Sol=Solution()    

matrix = [[1,2,3],[4,5,6],[7,8,9]]

print(Sol.transpose(matrix))



