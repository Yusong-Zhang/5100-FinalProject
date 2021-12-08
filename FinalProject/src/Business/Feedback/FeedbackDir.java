/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Feedback;

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
        return feedbacklist;
    }

    public void setFeedbacklist(ArrayList<Feedback> feedbacklist) {
        this.feedbacklist = feedbacklist;
    }
    
}
