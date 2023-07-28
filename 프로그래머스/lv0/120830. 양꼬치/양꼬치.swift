import Foundation

func solution(_ n:Int, _ k:Int) -> Int {
    var ggochi = n*12000
    var drink = k*2000
    
    if n >= 10{
        return ggochi+drink-((n/10)*2000)
    }else{
        return ggochi+drink
    }
}