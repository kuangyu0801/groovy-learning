enum Days {
    SUNDAY, MONDAY, TUESDAY, WENDSDAY, THRUSDAY, FRIDAY, SATURDAY
}

def dayRange = Days.SUNDAY..Days.SATURDAY

for (day in dayRange) {
    println day
}

dayRange.each {
    day -> println day
}