package cn.bestsign.auto.netdiskService.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 * @author wenbo
 * @company 杭州尚尚签网络科技有限公司
 * @date 2016/9/12
 * @since 3.0
 */
public class ParameterRequestWrapper extends HttpServletRequestWrapper {

    public ParameterRequestWrapper(HttpServletRequest request) {
        super(request);
    }

    @Override
    public String getParameter(String name) {
        return trim(super.getParameter(name));
    }

    @Override
    public String[] getParameterValues(String name) {
        String[] values = super.getParameterValues(name);
        if (values != null) {
            String[] newValues = new String[values.length];

            for (int i = 0; i < values.length; i++) {
                newValues[i] = trim(values[i]);
            }
            return newValues;
        }
        return super.getParameterValues(name);
    }

    private String trim(String value) {
        if (value != null) {
            return value.trim();
        }
        return value;
    }
}
