/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */

public class WorkQueue {
    
    private  ArrayList<WorkRequest> RequestList;

    public WorkQueue() {
        RequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getRequestList() {
        return RequestList;
    }

}