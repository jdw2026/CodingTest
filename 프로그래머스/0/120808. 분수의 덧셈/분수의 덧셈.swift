import Foundation

func solution(_ numer1:Int, _ denom1:Int, _ numer2:Int, _ denom2:Int) -> [Int] {
    
    var array: [Int] = []
    var numer3 = 0
    var denom3 = 0
    
    if denom1 != denom2 {
        numer3 = (numer1 * denom2) + (numer2 * denom1)
        denom3 = denom1 * denom2
    } else {
        numer3 = numer1 + numer2
        denom3 = denom1
    }
    
    
    func recursive(_ num1: Int, _ num2: Int) -> Int {   
        if num2 == 0 {
            return num1
        }else {
            return recursive(num2, num1%num2)
        }
    }
    
    var divisor = recursive(numer3, denom3)
    numer3 = numer3/divisor
    denom3 = denom3/divisor
    
    array.append(numer3)
    array.append(denom3)
    
    return array
}