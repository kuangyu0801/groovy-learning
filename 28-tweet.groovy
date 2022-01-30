@groovy.transform.ToString
class Tweet {
    String username
    String text
    String retweets
    Integer favorites
    Date createdOn

    public Tweet(String user, String tweet) {
        username = user
        text = tweet
        retweets = 0;
        favorites = 0;
        createdOn = new Date()
    }

    void addToRetweets() {
        retweets += 1
    }

    void addToFavorites() {
        favorites += 1
    }
}

def tweet = new Tweet("llll", "Hello, Twitter")
println tweet