package cn.bestsign.auto.netdiskService.common;


import cn.bestsign.auto.netdiskService.model.SysMenuInfo;
import cn.bestsign.auto.netdiskService.util.Utils;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class CaseInsensitiveComparator implements Comparator {

    public int compare(Object arg0, Object arg1) {
        SysMenuInfo method1 = (SysMenuInfo) arg0;
        SysMenuInfo method2 = (SysMenuInfo) arg1;
        if (!Utils.isEmpty(method1.getMenuNo()) && !Utils.isEmpty(method2.getMenuNo()) && !method1.getMenuNo().equals(method2.getMenuNo())) {
            int m1 = method1.getMenuNo();
            int m2 = method2.getMenuNo();
            if (m1 < m2) {
                return -1;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }
}