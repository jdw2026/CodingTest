import Foundation

func solution(_ n:Int) -> Int
{
    var answer:Int = 0
    var strNum = String(n)
    
    for i in strNum {
        answer += Int(String(i))!
    }
    
    
    return answer
}