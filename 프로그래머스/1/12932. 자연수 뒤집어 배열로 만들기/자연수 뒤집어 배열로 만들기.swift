func solution(_ n:Int64) -> [Int] {
    
    var arr: [Int] = []
    var strNum: String = String(n)
    var reversStr: String = String(strNum.reversed())
    
    for i in reversStr {
        arr.append(Int(String(i))!)
    }
    
    return arr
}