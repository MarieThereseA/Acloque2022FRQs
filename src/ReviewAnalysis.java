import java.util.ArrayList;

public class ReviewAnalysis {
    private Review[] allReviews;

    // CODE ADDED TO ENABLE TESTING; IMPLEMENTATION NOT SHOWN IN ORIGINAL FRQ
    public ReviewAnalysis(Review[] reviews) {
        allReviews = reviews;
    }

    public double getAverageRating() {
        double avg = 0;
        int count = 0;
        for (Review r: allReviews){
            count++;
            avg += r.getRating();
        }
        return avg / count;
    }

    public ArrayList<String> collectComments() {
        ArrayList<String> comments = new ArrayList<>();
        for (int i = 0; i < allReviews.length; i++){
            Review r = allReviews[i];
            String comment = r.getComment();
            if (comment.indexOf("!") != -1){
                String comm = i + "-" + comment;
                if (!comment.substring(comment.length() - 1).equals(".") && !comment.substring(comment.length() - 1).equals("!") ){
                    comm += ".";
                }
                comments.add(comm);
            }
        }
        return comments;
    }
}
