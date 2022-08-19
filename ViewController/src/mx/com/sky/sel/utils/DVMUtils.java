package mx.com.sky.sel.utils;
import java.io.Serializable;

import oracle.tip.dvm.entity.DVMRTObject;

public class DVMUtils implements Serializable{
    @SuppressWarnings("compatibility:-3371763434559662147")
    private static final long serialVersionUID = 981800843611473087L;

    public DVMUtils() {
        super();
    }
    public static String lookupValue(String dvmLoc, String srcColumnName, String srcValue, String tgtColumnName, String defaultValue) throws Exception

    {
            DVMLocatorUtil util = new DVMLocatorUtil();
            DVMRTObject rtObject= util.getDVMRTObject(dvmLoc);

            String lookedUpValue = rtObject.getValue(srcColumnName, srcValue, tgtColumnName);
            
            if ((lookedUpValue == null) || (lookedUpValue.trim().length() == 0)) 
            {
                if (defaultValue == null)
                {
                  defaultValue = "";
                }
              lookedUpValue = defaultValue;
            }
            
            
            
            return lookedUpValue;
            
        } 
}
