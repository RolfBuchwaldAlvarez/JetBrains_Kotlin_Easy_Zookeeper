    val lambda: (Int) -> Int = { a * it * it + b * it + c }
    // Can also be written as:
    // val lambda: (Int) -> Int = { x -> a * x * x + b * x + c }
    // or
    // val lambda: (Int) -> Int = { (a * it + b) * it + c }
    // or
    // val lambda: (Int) -> Int = { x -> (a * x + b) * x + c }