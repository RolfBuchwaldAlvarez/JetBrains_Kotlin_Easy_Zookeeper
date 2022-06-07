fun compose(g: (Int) -> Int, h: (Int) -> Int): (Int) -> Int = { g(h(it)) }
// Could also be written as:
// fun compose(g: (Int) -> Int, h: (Int) -> Int): (Int) -> Int = { i -> g(h(i)) }