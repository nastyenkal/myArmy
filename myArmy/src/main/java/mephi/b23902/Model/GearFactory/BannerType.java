package mephi.b23902.Model.GearFactory;

public enum BannerType {
    RED_EYE_BANNER("Знамя с Красным Оком"),
    SPIDER_BANNER("Знамя с Пауком"),
    MOON_BANNER("Знамя с Луной");

    private String bannerName;

    BannerType(String bannerName) {
        this.bannerName = bannerName;
    }

    public String getBanner() {
        return bannerName;
    }

}
