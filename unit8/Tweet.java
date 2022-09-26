public class Tweet {
    private String message;
    private int retweets, likes;

    public Tweet(String message, int retweets, int likes) {
        this.message = message;
        this.retweets = retweets;
        this.likes = likes;
    }

    public void addLikes(int likes) {
        this.likes += likes;
    }

    public void addRetweets(int retweets) {
        this.retweets += retweets;
    }

    public boolean notLiked() {
        return likes < 10;
    }

    public boolean kindaLiked() {
        return likes > retweets;
    }

    public boolean isTrending() {
        return likes + retweets > 75;
    }

    @Override
    public String toString() {
        return "message=\"" + message + "\", retweets=" + retweets + ", likes=" + likes;
    }
}
