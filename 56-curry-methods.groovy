// defining new clusure from existing one
def log = {
    String type, Date createOn, String msg ->
    println "$createOn [$type] - $msg"
}

log("Debug", new Date(), "This is my first debug message")

// by default curry replace input from the left
def debugLog = log.curry("Debug")
debugLog(new Date(), "This is my second msg")

def infoLog = log.curry("Info")
infoLog(new Date(), "This is my first info msg")


def todayInfoLog = log.curry("Info", new Date())
todayInfoLog("This is second info msg")

// rcurry: right curry replace from the right
def sameMsgLog = log.rcurry("*** Default msg ***")
sameMsgLog("Warn", new Date())
