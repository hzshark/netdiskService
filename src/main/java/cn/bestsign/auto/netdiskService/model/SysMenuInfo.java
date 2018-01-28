package cn.bestsign.auto.netdiskService.model;

public class SysMenuInfo {

    private String menuId;

    private String menuName;

    private String menuEngname;

    private String menuUri;

    private Integer menuNo;

    private String imageSrc;

    private Integer menuLevel;

    private String levelUnit;

    private Integer isAction;

    private String menuSign;

    private String menuMsg;

    private String menuPages;

    private String nextChildCode;

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuEngname() {
        return menuEngname;
    }

    public void setMenuEngname(String menuEngname) {
        this.menuEngname = menuEngname;
    }

    public String getMenuUri() {
        return menuUri;
    }

    public void setMenuUri(String menuUri) {
        this.menuUri = menuUri;
    }

    public Integer getMenuNo() {
        return menuNo;
    }

    public void setMenuNo(Integer menuNo) {
        this.menuNo = menuNo;
    }

    public String getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc;
    }

    public Integer getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(Integer menuLevel) {
        this.menuLevel = menuLevel;
    }

    public String getLevelUnit() {
        return levelUnit;
    }

    public void setLevelUnit(String levelUnit) {
        this.levelUnit = levelUnit;
    }

    public Integer getIsAction() {
        return isAction;
    }

    public void setIsAction(Integer isAction) {
        this.isAction = isAction;
    }

    public String getMenuSign() {
        return menuSign;
    }

    public void setMenuSign(String menuSign) {
        this.menuSign = menuSign;
    }

    public String getMenuMsg() {
        return menuMsg;
    }

    public void setMenuMsg(String menuMsg) {
        this.menuMsg = menuMsg;
    }

    public String getMenuPages() {
        return menuPages;
    }

    public void setMenuPages(String menuPages) {
        this.menuPages = menuPages;
    }

    public String getNextChildCode() {
        return nextChildCode;
    }

    public void setNextChildCode(String nextChildCode) {
        this.nextChildCode = nextChildCode;
    }

    @Override
    public boolean equals(Object anObject) {
        if (this == null) {
            return false;
        }
        if (anObject == null) {
            return false;
        }
        if (this == anObject) {
            return true;
        }
        if (anObject instanceof SysMenuInfo) {
            SysMenuInfo menu = (SysMenuInfo)anObject;
            if (menu.getMenuId().equals(this.getMenuId())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((menuId == null) ? 0 : menuId.hashCode());
        result = prime * result + ((menuEngname == null) ? 0 : menuEngname.hashCode());
        return result;
    }
}