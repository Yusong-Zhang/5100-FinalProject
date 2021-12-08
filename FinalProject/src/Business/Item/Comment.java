/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Item;


/**
 *
 * @author TT1
 */
public class Comment {
    private int score;//打分(0-10)
    private String word;
    private String buyer;
    private String date;
    private Boolean Refund;
    public Boolean getRefund() {
        return Refund;
    }

    public void setRefund(Boolean Refund) {
        this.Refund = Refund;
    }
    

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
}
