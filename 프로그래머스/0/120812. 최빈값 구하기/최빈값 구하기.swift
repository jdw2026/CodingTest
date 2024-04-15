import Foundation

func solution(_ array:[Int]) -> Int {
    
    var dic: [Int: Int] = [:]
    var key = 0
    var count = 0
    
    for i in array {
        if dic.contains {$0.key == i} {
            dic[i]! += 1
        } else {
            dic[i] = 1
        }
    }
    
    for (i, j) in dic {
        if j == dic.values.max() {
            count += 1
            key = i
        }
    }
    
    return count == 1 ? key : -1
}