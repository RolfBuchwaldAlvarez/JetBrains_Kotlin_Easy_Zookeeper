    val lambda: (Long, Long) -> Long = { leftBorder, rightBorder ->
        var value = 1L
        for (i in leftBorder..rightBorder) value *= i
        value
    }