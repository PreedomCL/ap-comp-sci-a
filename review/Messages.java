public class Messages
{
    public static void main(String[] args)
    {
        Comment jakeComment = new Comment("Jake", "You have nice toes", "2/14/23");
        Comment billComment = new Comment("Bill", "I don't say much", "2/14/23");

        System.out.println(jakeComment);
        System.out.println(billComment);
        System.out.println(jakeComment.getComment());
    }
}

class Comment
{
    private String poster;
    private String comment;
    private String date;

    public Comment(String personPosting, String message, String commentDate)
    {
        poster = personPosting;
        comment = message;
        date = commentDate;
    }

    public String getPoster() {
        return poster;
    }

    public String getComment() {
        return comment;
    }

    public String getDate() {
        return date;
    }

    public String toString()
    {
        return comment + "\n--" + poster + "(" + date + ")";
    }
}