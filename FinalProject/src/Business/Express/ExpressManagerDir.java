/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Express;

import java.util.ArrayList;

/**
 *
 * @author jiaohongmei
 */
public class ExpressManagerDir {
    private ArrayList<ExpressManager>ExpressManagerList;

    public  ExpressManagerDir() {
        ExpressManagerList = new ArrayList();
    }

    public ArrayList<ExpressManager> getExpressManagerList() {
        return ExpressManagerList;
    }
}
