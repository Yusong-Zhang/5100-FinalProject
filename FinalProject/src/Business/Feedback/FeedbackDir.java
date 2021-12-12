
package Business.Feedback;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author austinliu
 */
public class FeedbackDir {
    private ArrayList<Feedback> feedbacklist;

    public FeedbackDir() {
        feedbacklist = new ArrayList<>();
    }

    public ArrayList<Feedback> getFeedbacklist() {
       if(feedbacklist == null){
            feedbacklist = new ArrayList<Feedback>();
        }
        return feedbacklist;
    }
    public Feedback createFeedback( String Name,String phone,UserAccount useraccount){
        Feedback c = new Feedback(Name,phone,useraccount);

        feedbacklist.add(c);
        return c;
    }
    public void setFeedbacklist(ArrayList<Feedback> feedbacklist) {
        this.feedbacklist = feedbacklist;
    }
    
}
