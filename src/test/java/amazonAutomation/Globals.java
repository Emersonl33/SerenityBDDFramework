package amazonAutomation;

import org.apache.commons.lang3.StringUtils;

public class Globals {

    public static String PARAM_VAR_USER = System.getProperty("amazonUser", StringUtils.EMPTY);
    public static String PARAM_VAR_PASSWORD = System.getProperty("amazonPassword", StringUtils.EMPTY);
}
