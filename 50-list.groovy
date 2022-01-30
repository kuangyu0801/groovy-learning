def days = ["SUNDAY", "MONDAY", "TUESDAY", "WENDSDAY", "THRUSDAY", "FRIDAY", "SATURDAY"]

def map = [:]
int i = 1;
for (d in days) {
    map.put(i, d);
    i += 1;
}

println map