package mephi.b23902.Model.GearFactory.Mordor;

import mephi.b23902.Model.GearFactory.Banner;
import mephi.b23902.Model.GearFactory.BannerType;

import static mephi.b23902.Model.GearFactory.BannerType.RED_EYE_BANNER;

public class MordorBanner implements Banner {
    BannerType banner;

    public MordorBanner() {
        banner = RED_EYE_BANNER;
    }

    @Override
    public String toString() {
        return banner.getBanner();
    }
}
