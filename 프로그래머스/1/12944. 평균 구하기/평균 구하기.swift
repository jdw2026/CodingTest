func solution(_ arr:[Int]) -> Double {
    var sum: Double = 0.0
    for i in arr {
        sum += Double(i)
    }
    return sum/Double(arr.count)
}