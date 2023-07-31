import Foundation

func solution(_ n:Int) -> [Int] {
    var result : [Int] = []
    for i in 1...n where i%2 != 0{
        result.append(i)
    }
    
    return result
}