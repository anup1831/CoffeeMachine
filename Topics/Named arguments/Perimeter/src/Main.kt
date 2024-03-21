fun perimeter(x1: Double = 0.0, y1: Double = 0.0, x2: Double = 0.0, y2: Double = 0.0, 
    x3: Double = 0.0, y3: Double = 0.0, x4: Double = x1, y4: Double = y1): 
    Double {
    return Math.hypot(x2 - x1,y2 - y1) + Math.hypot(x3 - x2,y3 - y2) + Math.hypot(x4 - x3,y4 - y3) + Math.hypot(x1 - x4,y1 - y4)
} 
