package mephi.b23902.Model.GearFactory.Dolguldur;

import mephi.b23902.Model.GearFactory.Banner;
import mephi.b23902.Model.GearFactory.BannerType;

import static mephi.b23902.Model.GearFactory.BannerType.*;

public class DolguldurBanner implements Banner {
    BannerType banner;

    public DolguldurBanner() {
        banner = SPIDER_BANNER;
    }

    @Override
    public String toString() {
        return banner.getBanner();
    }
}
