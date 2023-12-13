import Foundation

func solution(_ s:String) -> Bool
{
    var ans:Bool = false
    var alphabetP = 0
    var alphabetY = 0
    
    for i in s {
        if i == "p" || i == "P" {
            alphabetP += 1
        }else if i == "y" || i == "Y" {
            alphabetY += 1
        }
    }

    if alphabetP == alphabetY {
        ans = true
    }else {
        ans = false
    }
    
    return ans
}