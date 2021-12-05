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
    private ArrayList<ExpressManager>ExpressCompanyList;

    public  ExpressManagerDir() {
        ExpressCompanyList = new ArrayList();
    }

    public ArrayList<ExpressManager> getExpressCompanyList() {
        return ExpressCompanyList;
    }
}
